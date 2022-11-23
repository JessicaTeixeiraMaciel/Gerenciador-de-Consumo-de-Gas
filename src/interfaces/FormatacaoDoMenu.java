package interfaces;

import modelos.apartamento.Apartamento;

import java.util.List;

public interface FormatacaoDoMenu {
    void opcoesDoMenu();
    boolean validarEscolha(List<String> listaDeOpcoes);
    void irParaOpcaoSelecionada();
}
