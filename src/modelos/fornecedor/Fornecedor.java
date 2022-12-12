package modelos.fornecedor;

public class Fornecedor{
    private String nome;
    private String numeroContato;
    private String endereco;

    public Fornecedor(String nome, String numeroContato, String endereco) {
        this.nome = nome;
        this.numeroContato = numeroContato;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumeroContato() {
        return numeroContato;
    }

    public void setNumeroContato(String numeroContato) {
        this.numeroContato = numeroContato;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
