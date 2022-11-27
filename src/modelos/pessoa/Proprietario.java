package modelos.pessoa;

import interfaces.ResponsavelPeloApartamento;
import modelos.apartamento.Apartamento;

import java.util.Scanner;

public class Proprietario extends Pessoa
        implements ResponsavelPeloApartamento {

    boolean possuiInquilino;

    public Proprietario(String nome, String numeroDeContato, String email, String numeroDoApartamento, boolean possuiInquilino) {
        super(nome, numeroDeContato, email, numeroDoApartamento);
        this.possuiInquilino = possuiInquilino;
    }

    public Proprietario(boolean possuiInquilino) {
        this.possuiInquilino = possuiInquilino;
    }

    public void editarPossuiInquilino(Proprietario proprietario){
        proprietario.setPossuiInquilino(!proprietario.isPossuiInquilino());
    }

    public Proprietario(String numeroDoApartamento) {
        super(numeroDoApartamento);
    }

    public Proprietario() {
    }

    public boolean isPossuiInquilino() {
        return possuiInquilino;
    }

    public void setPossuiInquilino(boolean possuiInquilino) {
        this.possuiInquilino = possuiInquilino;
    }
}
