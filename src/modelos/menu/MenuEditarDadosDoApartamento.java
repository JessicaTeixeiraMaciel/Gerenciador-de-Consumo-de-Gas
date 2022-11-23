package modelos.menu;

import interfaces.FormatacaoDoMenu;

import java.util.List;

public class MenuEditarDadosDoApartamento extends MenuConsultarDadosDoApartamento
        implements FormatacaoDoMenu {

    @Override
    public void opcoesDoMenu() {

    }

    @Override
    public boolean validarEscolha(List<String> listaDeOpcoes) {
        return false;
    }

    @Override
    public void irParaOpcaoSelecionada() {

    }
}
