package Repositories;

import Models.Usuario;

public interface UsuarioRepository {
    Usuario criar(Usuario usuario);
    Usuario buscar(int id);
    void deletar(int id);
    Usuario atualizar(int id);
    boolean existe(int id);

}

