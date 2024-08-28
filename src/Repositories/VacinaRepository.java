package Repositories;

import Models.Vacina;

public interface VacinaRepository {
    Vacina criar(Vacina vacina);
    Vacina buscar(int id);
    void deletar(int id);
    Vacina atualizar(Vacina vacina);
    boolean existe(int id);
}
