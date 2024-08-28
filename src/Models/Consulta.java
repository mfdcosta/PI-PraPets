package Models;

import java.time.LocalDateTime;

public class Consulta {
    private int id;
    private Pet pet;
    private Veterinario veterinario;
    private LocalDateTime dataConsulta;
    private String descricao;

    public Consulta(int id, String descricao, LocalDateTime dataConsulta, Veterinario veterinario, Pet pet) {
        this.id = id;
        this.descricao = descricao;
        this.dataConsulta = dataConsulta;
        this.veterinario = veterinario;
        this.pet = pet;
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

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    public LocalDateTime getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(LocalDateTime dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}

