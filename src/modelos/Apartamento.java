package modelos;

import java.time.LocalDate;
import java.util.Scanner;

public class Apartamento {

    private String identificacaoDoApartamento;
    private String nomeDoProprietario;
    private String numeroDoProprietario;
    private String emailDoProprietario;
    private boolean possuiInquilino;
    private boolean possuiMedidorDeGas;
    private String nomeDoInquilino;
    private String numeroDoInquilino;
    private String emailDoInquilino;
    private LocalDate dataDeEntradaInquilino;

    public Apartamento( String identificacaoDoApartamento, String nomeDoProprietario, String numeroDoProprietario, String emailDoProprietario, boolean possuiInquilino, boolean possuiMedidorDeGas) {
        this.identificacaoDoApartamento = identificacaoDoApartamento;
        this.nomeDoProprietario = nomeDoProprietario;
        this.numeroDoProprietario = numeroDoProprietario;
        this.emailDoProprietario = emailDoProprietario;
        this.possuiInquilino = possuiInquilino;
        this.possuiMedidorDeGas = possuiMedidorDeGas;
    }

    public Apartamento(String identificacaoDoApartamento, String nomeDoProprietario, String numeroDoProprietario, String emailDoProprietario, boolean possuiInquilino, boolean possuiMedidorDeGas, String nomeDoInquilino, String numeroDoInquilino, String emailDoInquilino, LocalDate dataDeEntradaInquilino) {
        this.identificacaoDoApartamento = identificacaoDoApartamento;
        this.nomeDoProprietario = nomeDoProprietario;
        this.numeroDoProprietario = numeroDoProprietario;
        this.emailDoProprietario = emailDoProprietario;
        this.possuiInquilino = possuiInquilino;
        this.possuiMedidorDeGas = possuiMedidorDeGas;
        this.nomeDoInquilino = nomeDoInquilino;
        this.numeroDoInquilino = numeroDoInquilino;
        this.emailDoInquilino = emailDoInquilino;
        this.dataDeEntradaInquilino = dataDeEntradaInquilino;
    }

    @Override
    public String toString() {
        return "Apartamento{" +
                "numeroDoApartamento=" + identificacaoDoApartamento +
                ", nomeDoProprietario='" + nomeDoProprietario + '\'' +
                ", numeroDoProprietario='" + numeroDoProprietario + '\'' +
                ", emailDoProprietario='" + emailDoProprietario + '\'' +
                ", possuiInquilino=" + possuiInquilino +
                ", possuiMedidorDeGas=" + possuiMedidorDeGas +
                ", nomeDoInquilino='" + nomeDoInquilino + '\'' +
                ", numeroDoInquilino='" + numeroDoInquilino + '\'' +
                ", emailDoInquilino='" + emailDoInquilino + '\'' +
                ", dataDeEntradaInquilino=" + dataDeEntradaInquilino +
                '}';
    }

    public void editarSituacaoDoApartamento(Apartamento apartamento){
        boolean possuiMedidor = isPossuiMedidorDeGas();
        apartamento.setPossuiMedidorDeGas(!possuiMedidor);
    }

    public void editarResponsavelPeloApartamento(Apartamento apartamento){
        boolean reponsavel = isPossuiInquilino();
        apartamento.setPossuiInquilino(!reponsavel);
    }
    public String getIdentificacaoDoApartamento() {
        return identificacaoDoApartamento;
    }

    public void setIdentificacaoDoApartamento(String identificacaoDoApartamento) {
        this.identificacaoDoApartamento = identificacaoDoApartamento;
    }

    public String getNomeDoProprietario() {
        return nomeDoProprietario;
    }

    public void setNomeDoProprietario(String nomeDoProprietario) {
        this.nomeDoProprietario = nomeDoProprietario;
    }

    public String getNumeroDoProprietario() {
        return numeroDoProprietario;
    }

    public void setNumeroDoProprietario(String numeroDoProprietario) {
        this.numeroDoProprietario = numeroDoProprietario;
    }

    public String getEmailDoProprietario() {
        return emailDoProprietario;
    }

    public void setEmailDoProprietario(String emailDoProprietario) {
        this.emailDoProprietario = emailDoProprietario;
    }

    public boolean isPossuiInquilino() {
        return possuiInquilino;
    }

    public void setPossuiInquilino(boolean possuiInquilino) {
        this.possuiInquilino = possuiInquilino;
    }

    public boolean isPossuiMedidorDeGas() {
        return possuiMedidorDeGas;
    }

    public void setPossuiMedidorDeGas(boolean possuiMedidorDeGas) {
        this.possuiMedidorDeGas = possuiMedidorDeGas;
    }

    public String getNomeDoInquilino() {
        return nomeDoInquilino;
    }

    public void setNomeDoInquilino(String nomeDoInquilino) {
        this.nomeDoInquilino = nomeDoInquilino;
    }

    public String getNumeroDoInquilino() {
        return numeroDoInquilino;
    }

    public void setNumeroDoInquilino(String numeroDoInquilino) {
        this.numeroDoInquilino = numeroDoInquilino;
    }

    public String getEmailDoInquilino() {
        return emailDoInquilino;
    }

    public void setEmailDoInquilino(String emailDoInquilino) {
        this.emailDoInquilino = emailDoInquilino;
    }

    public LocalDate getDataDeEntradaInquilino() {
        return dataDeEntradaInquilino;
    }

    public void setDataDeEntradaInquilino(LocalDate dataDeEntradaInquilino) {
        this.dataDeEntradaInquilino = dataDeEntradaInquilino;
    }
}
