package Repositories;

import Models.Agendamento;
import Models.Pet;

public interface AgendamentoRepository {
    Agendamento criar(Agendamento agendamento);
    Agendamento buscar(int id);
    void deletar(int id);
    Agendamento atualizar(Agendamento agendamento);
    boolean existe(int id);
}
