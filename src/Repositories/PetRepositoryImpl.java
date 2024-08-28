package Repositories;

import Models.Pet;


public class PetRepositoryImpl implements PetRepository {
        @Override
        public Pet criar(Pet pet) {
            return pet;
        }

        @Override
        public  Pet buscar(int id) {
            return null;
        }

        @Override
        public void deletar(int id) {

        }

        @Override
        public Pet atualizar(Pet pet) {
            return null;
        }

        @Override
        public boolean existe(int id) {
            return false;
        }
    }

