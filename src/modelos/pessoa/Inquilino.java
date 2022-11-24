package modelos.pessoa;

import interfaces.ResponsavelPeloApartamento;
import modelos.apartamento.Apartamento;

import java.util.Scanner;

public class Inquilino extends Pessoa
        implements ResponsavelPeloApartamento {


    public Inquilino(String nome, String numeroDeContato, String email, String numeroDoApartamento) {
        super(nome, numeroDeContato, email, numeroDoApartamento);
    }


    public Inquilino(String numeroDoApartamento) {
        super(numeroDoApartamento);
    }

    public Inquilino() {
    }

}
