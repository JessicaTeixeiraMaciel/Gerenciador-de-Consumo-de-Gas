package interfaces;

import modelos.apartamento.Apartamento;
import modelos.pessoa.Inquilino;
import modelos.pessoa.Proprietario;

import java.util.List;

public interface FormatacaoDoMenu {

    boolean validarEscolha(List<String> listaDeOpcoes);
    void irParaOpcaoSelecionada(List<Apartamento> lista, List<Proprietario> listaDeProprietarios, List<Inquilino> listaDeInquilinos);

}