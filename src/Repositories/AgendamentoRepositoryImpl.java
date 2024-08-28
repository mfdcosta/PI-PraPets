package Repositories;

import Models.Agendamento;

public class AgendamentoRepositoryImpl implements AgendamentoRepository{
    @Override
    public  Agendamento criar(Agendamento agendamento) {
        return agendamento;
    }

    @Override
    public  Agendamento buscar(int id) {
        return null;
    }

    @Override
    public void deletar(int id) {

    }

    @Override
    public  Agendamento atualizar(Agendamento agendamento) {
        return null;
    }

    @Override
    public boolean existe(int id) {
        return false;
    }
}

