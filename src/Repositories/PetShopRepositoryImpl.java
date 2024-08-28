package Repositories;

import Models.PetShop;

public abstract class PetShopRepositoryImpl implements PetShopRepository{
    public PetShopRepositoryImpl() {
        super();
    }

    @Override
    public PetShop criar(PetShop petShop) {
        return null;
    }

    @Override
    public PetShop buscar(String cnpj) {
        return null;
    }

    @Override
    public void deletar(String cnpj) {

    }

    @Override
    public PetShop atualizar(PetShop petShop) {
        return null;
    }

    @Override
    public boolean existe(String cnpj) {
        return false;
    }
}
