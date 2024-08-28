package Service;
import Exceptions.ConsultaJaExisteException;
import Exceptions.ConsultaNaoExisteException;
import Models.Consulta;
import Repositories.ConsultaRepository;

public class ConsultaService {
    private final ConsultaRepository consultaRepository;

    public ConsultaService(ConsultaRepository consultaRepository) {
        this.consultaRepository = consultaRepository;
    }

    public Consulta salvar(Consulta consulta) throws ConsultaJaExisteException{
        if(consultaRepository.existe(consulta.getId())){
            throw new ConsultaJaExisteException("Consulta já existe sob o id " + consulta.getId());
        }else{
            if(consulta.getId() != 0 && consulta.getDescricao() != null){
                return consultaRepository.criar(consulta);
            }
        }
        return consulta;
    }
    public Consulta buscar(int id) throws ConsultaNaoExisteException {
        Consulta consulta = consultaRepository.buscar(id);

        if (consulta == null) {
            throw new ConsultaNaoExisteException("A consulta não existe");
        } else {
            return consulta;
        }
    }

    public void deletar(int id) throws ConsultaNaoExisteException {
        if (consultaRepository.existe(id)) {
            consultaRepository.deletar(id);
        } else {
            throw new ConsultaNaoExisteException("O agendamento não existe");
        }
    }

    public Consulta atualizar(Consulta consulta) throws  ConsultaNaoExisteException {
        if (consultaRepository.existe(consulta.getId())) {
            return consultaRepository.atualizar(consulta);
        } else {
            throw new ConsultaNaoExisteException("A consulta não existe");
        }
    }

}
