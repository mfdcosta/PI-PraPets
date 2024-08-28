package Repositories;


import Models.Pet;

public interface PetRepository {
    Pet criar(Pet pet);
    Pet buscar(int id);
    void deletar(int id);
    Pet atualizar(Pet pet);
    boolean existe(int id);

}
