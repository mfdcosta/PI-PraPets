package Models;

public class PetShop {
    private static String cnpj;
    private String nome;
    private static String descricao;
    private String rua;
    private String cidade;
    private String estado;
    private String cep;

    public PetShop(String cnpj, String nome, String descricao,
                   String rua, String cidade, String estado, String cep) {
        this.cnpj = cnpj;
        this.nome = nome;
        this.descricao = descricao;
        this.rua = rua;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }

    public static String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        PetShop.descricao = descricao;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}

