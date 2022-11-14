public class Fornecedor {
    private String nomeFornecedor;
    private int numeroFornecedor;
    private String enderecoFornecedor;

    public Fornecedor(String nomeFornecedor, int numeroFornecedor, String enderecoFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
        this.numeroFornecedor = numeroFornecedor;
        this.enderecoFornecedor = enderecoFornecedor;
    }

    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
    }

    public int getNumeroFornecedor() {
        return numeroFornecedor;
    }

    public void setNumeroFornecedor(int numeroFornecedor) {
        this.numeroFornecedor = numeroFornecedor;
    }

    public String getEnderecoFornecedor() {
        return enderecoFornecedor;
    }

    public void setEnderecoFornecedor(String enderecoFornecedor) {
        this.enderecoFornecedor = enderecoFornecedor;
    }

    @Override
    public String toString() {
        return "Fornecedor{" +
                "nomeFornecedor='" + nomeFornecedor + '\'' +
                ", numeroFornecedor=" + numeroFornecedor +
                ", enderecoFornecedor='" + enderecoFornecedor + '\'' +
                '}';
    }
}
