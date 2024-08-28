package Models;

import java.time.LocalDateTime;

public class Agendamento {
    private int id;
    private Pet pet;
    private Servico servico;
    private LocalDateTime dataAgendamento;
    private PetShop petShop;

    public Agendamento(int id, Pet pet, Servico serviço,
                       LocalDateTime dataAgendamento, PetShop petShop) {
        this.id = id;
        this.pet = pet;
        this.servico = servico;
        this.dataAgendamento = dataAgendamento;
        this.petShop = petShop;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServiço(Servico serviço) {
        this.servico = serviço;
    }

    public LocalDateTime getDataAgendamento() {
        return dataAgendamento;
    }

    public void setDataAgendamento(LocalDateTime dataAgendamento) {
        this.dataAgendamento = dataAgendamento;
    }

    public PetShop getPetShop() {
        return petShop;
    }

    public void setPetShop(PetShop petShop) {
        this.petShop = petShop;
    }
}






