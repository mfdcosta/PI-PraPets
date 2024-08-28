package Service;


import Exceptions.PetJaExisteException;
import Exceptions.PetNaoExisteException;
import Models.Pet;
import Repositories.PetRepository;

public class PetService {
    private PetRepository petRepository;

    public PetService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    public Pet salvar(Pet pet) throws PetJaExisteException {
        if (petRepository.existe(pet.getId())) {
            throw new PetJaExisteException("Pet já existe sob o id " + pet.getId());
        } else {
            if (pet.getId() != 0 && pet.getNome() != null) {
                return petRepository.criar(pet);
            }
        }
        return pet;
    }

    public Pet buscar(int id) throws PetNaoExisteException {
        Pet pet = petRepository.buscar(id);

        if (pet == null) {
            throw new PetNaoExisteException("O pet não existe");
        } else {
            return pet;
        }
    }

    public void deletar(int id) throws PetNaoExisteException {
        if (petRepository.existe(id)) {
            petRepository.deletar(id);
        } else {
            throw new PetNaoExisteException("O pet não existe");
        }
    }

    public Pet atualizar(Pet pet) throws PetNaoExisteException {
        if (petRepository.existe(pet.getId())) {
            return petRepository.atualizar(pet);
        } else {
            throw new PetNaoExisteException("O pet não existe");
        }
    }
}



