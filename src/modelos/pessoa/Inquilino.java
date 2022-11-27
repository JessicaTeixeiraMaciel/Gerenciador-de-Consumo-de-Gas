package modelos.pessoa;

import interfaces.ResponsavelPeloApartamento;

public class Inquilino extends Pessoa
        implements ResponsavelPeloApartamento {

    public Inquilino(String numeroDoApartamento) {
        super(numeroDoApartamento);
    }


}
