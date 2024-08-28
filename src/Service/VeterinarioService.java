package Service;


import Exceptions.VeterinarioJaExisteException;
import Exceptions.VeterinarioNaoExisteException;
import Models.Veterinario;
import Repositories.VeterinarioRepository;

public class VeterinarioService {
    private VeterinarioRepository veterinarioRepository;

    public VeterinarioService(VeterinarioRepository veterinarioRepository) {
        this.veterinarioRepository = veterinarioRepository;
    }

    public Veterinario salvar(Veterinario veterinario) throws VeterinarioJaExisteException {
        if (veterinarioRepository.existe(veterinario.getId())) {
            throw new VeterinarioJaExisteException("Veterinário já existe sob o id " + veterinario.getId());
        } else {
            if (veterinario.getId() != 0 && veterinario.getNome() != null) {
                return veterinarioRepository.criar(veterinario);
            }
        }
        return veterinario;
    }

    public Veterinario buscar(int id) throws VeterinarioNaoExisteException {
        Veterinario veterinario = veterinarioRepository.buscar(id);

        if (veterinario == null) {
            throw new VeterinarioNaoExisteException("O veterinário não existe");
        } else {
            return veterinario;
        }
    }

    public void deletar(int id) throws VeterinarioNaoExisteException {
        if (veterinarioRepository.existe(id)) {
            veterinarioRepository.deletar(id);
        } else {
            throw new VeterinarioNaoExisteException("O veterinário não existe");
        }
    }

    public Veterinario atualizar(Veterinario veterinario) throws VeterinarioNaoExisteException {
        if (veterinarioRepository.existe(veterinario.getId())) {
            return veterinarioRepository.atualizar(veterinario);
        } else {
            throw new VeterinarioNaoExisteException("O veterinário não existe");
        }
    }
}


