package Repositories;

import Models.Consulta;
import Models.PetShop;

public interface PetShopRepository {
    PetShop criar(PetShop petShop);
    PetShop buscar(String cnpj);
    void deletar(String cnpj);
    PetShop atualizar(PetShop petShop);
    boolean existe(String cnpj);

}

