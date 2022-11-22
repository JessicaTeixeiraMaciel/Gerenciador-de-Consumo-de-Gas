package interfaces;

import modelos.Apartamento;

public interface ResponsaveisPeloApartamento {
    void imprimirDadoDoResponsavel(Apartamento apartamento);
    void editarNome(Apartamento apartamento);
    void editarNumeroContato(Apartamento apartamento);
    void editarEmail(Apartamento apartamento);
}
