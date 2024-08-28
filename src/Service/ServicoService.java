package Service;


import Exceptions.ServicoJaExisteException;
import Exceptions.ServicoNaoExisteException;
import Models.Servico;
import Repositories.ServicoRepository;

public class ServicoService {
    private ServicoRepository servicoRepository;
    public ServicoService(ServicoRepository servicoRepository) {
        this.servicoRepository = servicoRepository;
    }
    public Servico salvar(Servico servico) throws ServicoJaExisteException {
        if (servicoRepository.existe(servico.getId())) {
            throw new ServicoJaExisteException("Serviço já existe sob o id " + servico.getId());
        } else {
            if (servico.getId() != 0 && servico.getDescricao() != null) {
                return servicoRepository.criar(servico);
            }
        }
        return servico;
    }

    public Servico buscar(int id) throws ServicoNaoExisteException {
        Servico servico = servicoRepository.buscar(id);

        if (servico == null) {
            throw new ServicoNaoExisteException("O serviço não existe");
        } else {
            return servico;
        }
    }
    public void deletar(int id) throws ServicoNaoExisteException{
        if (servicoRepository.existe(id)) {
            servicoRepository.deletar(id);
        }else{
            throw new ServicoNaoExisteException("O serviço não existe");
        }
    }

    public Servico atualizar(Servico servico) throws ServicoNaoExisteException {
        if (servicoRepository.existe(servico.getId())) {
            return servicoRepository.atualizar(servico);
        } else {
            throw new ServicoNaoExisteException("O serviço não existe");
        }
    }
}
