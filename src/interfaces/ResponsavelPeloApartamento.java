package interfaces;

import modelos.apartamento.Apartamento;

public interface ResponsavelPeloApartamento {
    void imprimirDadoDoResponsavel(Apartamento apartamento);
    void editarNome(Apartamento apartamento);
    void editarNumeroContato(Apartamento apartamento);
    void editarEmail(Apartamento apartamento);
}
