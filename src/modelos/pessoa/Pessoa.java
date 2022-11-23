package modelos.pessoa;

public class Pessoa {
    private String nome;
    private String numeroDeContato;
    private String email;
    String numeroDoApartamento;


    public Pessoa(String nome, String numeroDeContato, String email, String numeroDoApartamento) {
        this.nome = nome;
        this.numeroDeContato = numeroDeContato;
        this.email = email;
        this.numeroDoApartamento = numeroDoApartamento;
    }


    public Pessoa() {
    }

    public Pessoa(String numeroDoApartamento) {
        this.numeroDoApartamento = numeroDoApartamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumeroDeContato() {
        return numeroDeContato;
    }

    public void setNumeroDeContato(String numeroDeContato) {
        this.numeroDeContato = numeroDeContato;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumeroDoApartamento() {
        return numeroDoApartamento;
    }

    public void setNumeroDoApartamento(String numeroDoApartamento) {
        this.numeroDoApartamento = numeroDoApartamento;
    }
}
