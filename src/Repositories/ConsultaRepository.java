package Repositories;

import Models.Agendamento;
import Models.Consulta;

public interface ConsultaRepository {
    Consulta criar(Consulta consulta);
    Consulta buscar(int id);
    void deletar(int id);
    Consulta atualizar(Consulta consulta);
    boolean existe(int id);

}
