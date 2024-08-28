package Service;

import Exceptions.AgendamentoJaExisteException;
import Exceptions.AgendamentoNaoExisteException;
import Models.Agendamento;
import Repositories.AgendamentoRepository;

public class AgendamentoService {
    private  AgendamentoRepository agendamentoRepository;

    public AgendamentoService(AgendamentoRepository agendamentoRepository) {
        this.agendamentoRepository = agendamentoRepository;
    }
    public Agendamento salvar(Agendamento agendamento) throws AgendamentoJaExisteException {
        if (agendamentoRepository.existe(agendamento.getId())) {
            throw new AgendamentoJaExisteException("Agendamento já existe sob o id " + agendamento.getId());
        } else {
            if (agendamento.getId() != 0 && agendamento.getServico() != null) {
                return agendamentoRepository.criar(agendamento);
            }
        }
        return agendamento;
    }

    public Agendamento buscar(int id) throws AgendamentoNaoExisteException {
        Agendamento agendamento = agendamentoRepository.buscar(id);

        if (agendamento == null) {
            throw new AgendamentoNaoExisteException("O agendamento não existe");
        } else {
            return agendamento;
        }
    }

    public void deletar(int id) throws AgendamentoNaoExisteException {
        if (agendamentoRepository.existe(id)) {
            agendamentoRepository.deletar(id);
        } else {
            throw new AgendamentoNaoExisteException("O agendamento não existe");
        }
    }

    public Agendamento atualizar(Agendamento agendamento) throws AgendamentoNaoExisteException {
        if (agendamentoRepository.existe(agendamento.getId())) {
            return agendamentoRepository.atualizar(agendamento);
        } else {
            throw new AgendamentoNaoExisteException("O agendamento não existe");
        }
    }
}

