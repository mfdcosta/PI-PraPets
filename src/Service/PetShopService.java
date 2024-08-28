package Service;


import Exceptions.PetShopJaExisteException;
import Exceptions.PetShopNaoExisteException;
import Models.PetShop;
import Repositories.PetShopRepository;

public class PetShopService {
    private PetShopRepository petShopRepository;

    public PetShopService(PetShopRepository petShopRepository) {
        this.petShopRepository = petShopRepository;
    }

    public PetShop salvar(PetShop petShop) throws PetShopJaExisteException {
        if (petShopRepository.existe(PetShop.getCnpj())) {
            throw new PetShopJaExisteException("Petshop já existe sob o id " + PetShop.getCnpj());
        } else {
        }
        return petShop;
    }

    public PetShop buscar(String cnpj) throws PetShopNaoExisteException {
        PetShop petShop = petShopRepository.buscar(cnpj);

        if (petShop == null) {
            throw new PetShopNaoExisteException("O petshop não existe");
        } else {
            return petShop;
        }
    }

    public void deletar(String cnpj) throws PetShopNaoExisteException {
        if (petShopRepository.existe(cnpj)) {
            petShopRepository.deletar(cnpj);
        } else {
            throw new PetShopNaoExisteException("O petshop não existe");
        }
    }

    public PetShop atualizar(PetShop petShop) throws PetShopNaoExisteException {
        if (petShopRepository.existe(PetShop.getCnpj()))
            return petShopRepository.atualizar(petShop);
        else {
            throw new PetShopNaoExisteException("O petshop não existe");
        }
    }
}

