package Repositories;

import Models.Veterinario;

public interface VeterinarioRepository {
    Veterinario criar(Veterinario veterinario);
    Veterinario buscar(int id);
    void deletar(int id);
    boolean existe(int id);
    Veterinario atualizar(Veterinario veterinario);
}
