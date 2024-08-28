package Service;


import Exceptions.VacinaJaExisteException;
import Exceptions.VacinaNaoExisteException;
import Models.Vacina;
import Repositories.VacinaRepository;

public class VacinaService {
    private VacinaRepository vacinaRepository;

    public VacinaService(VacinaRepository vacinaRepository) {
        this.vacinaRepository = vacinaRepository;
    }

    public Vacina salvar(Vacina vacina) throws VacinaJaExisteException {
        if (vacinaRepository.existe(vacina.getId())) {
            throw new VacinaJaExisteException("Vacina já existe sob o id " + vacina.getId());
        } else {
            if (vacina.getId() != 0 && vacina.getNome() != null) {
                return vacinaRepository.criar(vacina);
            }
        }
        return vacina;
    }

    public Vacina buscar(int id) throws VacinaNaoExisteException {
        Vacina vacina = vacinaRepository.buscar(id);

        if (vacina == null) {
            throw new VacinaNaoExisteException("A vacina não existe");
        } else {
            return vacina;
        }
    }
    public void deletar(int id) throws VacinaNaoExisteException{
        if (vacinaRepository.existe(id)) {
            vacinaRepository.deletar(id);
        } else {
            throw new VacinaNaoExisteException("A vacina não existe");
        }
    }

    public Vacina atualizar(Vacina vacina) throws VacinaNaoExisteException {
        if (vacinaRepository.existe(vacina.getId())) {
            return vacinaRepository.atualizar(vacina);
        } else {
            throw new VacinaNaoExisteException("A vacina não existe");
        }
    }
}


