package Service;


import Exceptions.UsuarioJaExisteException;
import Exceptions.UsuarioNaoExisteException;
import Models.Usuario;
import Repositories.UsuarioRepository;

public class UsuarioService {
    private  UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public Usuario salvar(Usuario usuario) throws UsuarioJaExisteException {
        if (usuarioRepository.existe(usuario.getId()))
            throw new UsuarioJaExisteException("Usuário já existe sob o id " + usuario.getId());
        else {
            if (usuario.getId() != 0 && usuario.getNome() != null) {


                return usuarioRepository.criar(usuario);
            }
        }
        return usuario;
    }

    public Usuario buscar(int id) throws UsuarioNaoExisteException {
        Usuario usuario = usuarioRepository.buscar(id);

        if (usuario == null) {
            throw new UsuarioNaoExisteException("O usuário não existe");
        } else {
            return usuario;
        }
    }

    public void deletar(int id) throws UsuarioNaoExisteException {
        if (usuarioRepository.existe(id)) {
            usuarioRepository.deletar(id);
        } else {
            throw new UsuarioNaoExisteException("O pet não existe");
        }
    }

    public Usuario atualizar(Usuario usuario) throws UsuarioNaoExisteException {
        if (!usuarioRepository.existe(usuario.getId())) {
            throw new UsuarioNaoExisteException("O usuário não existe");
        } else {
            return usuarioRepository.atualizar(usuario.getId());
        }
    }
}


