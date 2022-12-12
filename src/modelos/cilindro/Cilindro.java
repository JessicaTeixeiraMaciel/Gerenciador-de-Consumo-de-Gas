package modelos.cilindro;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Cilindro {
    public String identificao;
    private String fornecedor;
    private LocalDate dataDaCompra;
    private BigDecimal valor;
    private String status;
    private LocalDate dataDeAbertura;
    private LocalDate dataDeEsgotamento;
    private boolean foiAberto;
    private boolean estaVazio;

    public Cilindro(String identificao, String fornecedor, LocalDate dataDaCompra, BigDecimal valor, String status, LocalDate dataDeAbertura, LocalDate dataDeEsgotamento, boolean foiAberto, boolean estaVazio) {
        this.identificao = identificao;
        this.fornecedor = fornecedor;
        this.dataDaCompra = dataDaCompra;
        this.valor = valor;
        this.status = status;
        this.dataDeAbertura = dataDeAbertura;
        this.dataDeEsgotamento = dataDeEsgotamento;
        this.foiAberto = foiAberto;
        this.estaVazio = estaVazio;
    }

    public String getIdentificao() {
        return identificao;
    }

    public void setIdentificao(String identificao) {
        this.identificao = identificao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public LocalDate getDataDaCompra() {
        return dataDaCompra;
    }

    public void setDataDaCompra(LocalDate dataDaCompra) {
        this.dataDaCompra = dataDaCompra;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public LocalDate getDataDeAbertura() {
        return dataDeAbertura;
    }

    public void setDataDeAbertura(LocalDate dataDeAbertura) {
        this.dataDeAbertura = dataDeAbertura;
    }

    public LocalDate getDataDeEsgotamento() {
        return dataDeEsgotamento;
    }

    public void setDataDeEsgotamento(LocalDate dataDeEsgotamento) {
        this.dataDeEsgotamento = dataDeEsgotamento;
    }

    public boolean isFoiAberto() {
        return foiAberto;
    }

    public void setFoiAberto(boolean estaVazio) {
        this.foiAberto = estaVazio;
    }

    public boolean isEstaVazio() {
        return estaVazio;
    }

    public void setEstaVazio(boolean estaVazio) {
        this.estaVazio = estaVazio;
    }
}
