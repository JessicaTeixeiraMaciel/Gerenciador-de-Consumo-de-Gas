package modelos.pessoa;

import interfaces.ResponsavelPeloApartamento;
import modelos.apartamento.Apartamento;

import java.util.Scanner;

public class Inquilino extends Pessoa
        implements ResponsavelPeloApartamento {


    public Inquilino(String numeroDoApartamento) {
        super(numeroDoApartamento);
    }

    public Inquilino() {
    }
}
