package Repositories;

import Models.PetShop;
import Models.Servico;

public interface ServicoRepository {
    Servico criar(Servico servico);
    Servico buscar(int id);
    void deletar(int id);
    Servico atualizar(Servico servico);
    boolean existe(int id);

}
