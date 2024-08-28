import Exceptions.PetShopNaoExisteException;
import Models.PetShop;
import Repositories.PetShopRepository;
import Repositories.PetShopRepositoryImpl;
import Service.PetShopService;

public class Main {
    public static void main(String[] args) {

        PetShop petshop = new PetShop("12.345.678/0001-90", "Meu Petshop",
                "Rua dos Pets", "Minha Cidade", "Meu Estado",
                "Nordeste", "12345-678");

        // Exemplo de uso dos getters

        System.out.println("Nome do petshop: " + petshop.getNome());
        System.out.println("CNPJ do petshop: " + petshop.getCnpj());
        System.out.println("Endereço: " + petshop.getRua() + ", " + petshop.getCidade() +
                " - " + petshop.getEstado() + ", " + petshop.getCep());

        // Exemplo de uso dos setters para modificar o nome do petshop

        petshop.setNome("Novo Nome do Petshop");

        System.out.println("Novo nome do petshop: " + petshop.getNome());

        PetShopRepository petShopRepository = new PetShopRepositoryImpl() {
            @Override
            public PetShop buscar(String cnpj) {
                return null;
            }

            @Override
            public void deletar(String cnpj) {

            }
        };
        // Suponha que você tenha implementado este repository
        PetShopService petShopService = new PetShopService(petShopRepository);

        String cnpjParaDeletar = "12.345.678/0001-90"; // CNPJ do PetShop que você deseja deletar

        try {
            petShopService.deletar(cnpjParaDeletar);
            System.out.println("PetShop deletado com sucesso!");
        } catch (PetShopNaoExisteException e) {
            System.out.println(e.getMessage());
        }
    }
}





