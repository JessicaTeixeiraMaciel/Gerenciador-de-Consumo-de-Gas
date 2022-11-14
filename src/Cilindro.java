import java.util.Date;

public class Cilindro {
    private Date dataDaCompra;
    private double precoCilindro;
    private String fornecedor;
    private boolean emUso;
    private enum ladoDaIntalacao {esquerda, direita}
    private Date dataAbertura;
    private Date dataEsvaziamento;

    public Cilindro(Date dataDaCompra, double precoCilindro, String fornecedor, boolean emUso) {
        this.dataDaCompra = dataDaCompra;
        this.precoCilindro = precoCilindro;
        this.fornecedor = fornecedor;
        this.emUso = emUso;
    }

    public Cilindro(Date dataDaCompra, double precoCilindro, String fornecedor, boolean emUso, Date dataAbertura, Date dataEsvaziamento) {
        this.dataDaCompra = dataDaCompra;
        this.precoCilindro = precoCilindro;
        this.fornecedor = fornecedor;
        this.emUso = emUso;
        this.dataAbertura = dataAbertura;
        this.dataEsvaziamento = dataEsvaziamento;
    }

    public Date getDataDaCompra() {
        return dataDaCompra;
    }

    public void setDataDaCompra(Date dataDaCompra) {
        this.dataDaCompra = dataDaCompra;
    }

    public double getPrecoCilindro() {
        return precoCilindro;
    }

    public void setPrecoCilindro(double precoCilindro) {
        this.precoCilindro = precoCilindro;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public boolean isEmUso() {
        return emUso;
    }

    public void setEmUso(boolean emUso) {
        this.emUso = emUso;
    }

    public Date getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(Date dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public Date getDataEsvaziamento() {
        return dataEsvaziamento;
    }

    public void setDataEsvaziamento(Date dataEsvaziamento) {
        this.dataEsvaziamento = dataEsvaziamento;
    }

    @Override
    public String toString() {
        return "Cilindro{" +
                "dataDaCompra=" + dataDaCompra +
                ", precoCilindro=" + precoCilindro +
                ", fornecedor='" + fornecedor + '\'' +
                ", emUso=" + emUso +
                ", dataAbertura=" + dataAbertura +
                ", dataEsvaziamento=" + dataEsvaziamento +
                '}';
    }
}
