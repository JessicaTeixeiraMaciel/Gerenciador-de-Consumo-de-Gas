package modelos.pessoa;

public class Pessoa {
    private String nome;
    private String numeroDeContato;
    private String email;

    public Pessoa(String nome, String numeroDeContato, String email) {
        this.nome = nome;
        this.numeroDeContato = numeroDeContato;
        this.email = email;
    }

    public Pessoa() {
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
}
