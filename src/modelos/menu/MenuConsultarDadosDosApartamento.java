package modelos.menu;

import interfaces.FormatacaoDoMenu;
import modelos.apartamento.Apartamento;

import java.util.ArrayList;
import java.util.List;

public class MenuConsultarDadosDosApartamento extends MenuInicial
        implements FormatacaoDoMenu {

    @Override
    public void opcoesDoMenu() {
        limparTela();
        List<String> apartamentos = new ArrayList<>();
        for (Apartamento apartamento : listaDeApartamentos){
            apartamentos.add(apartamento.getIdentificacaoDoApartamento());
        }
        do {
            System.out.println(ANSI_AMARELO + "CONSULTAR DADOS DOS APARTAMENTOS" + ANSI_RESET);
            System.out.print("Insira o número do apartamento que deseja consultar (");
            System.out.println(apartamentos.toString().replace("[","").replace("]","") + ")");
            System.out.println("Ou digite 'v' para voltar ao menu anterior.");
        } while (validarEscolha(apartamentos));
    }

    @Override
    public void irParaOpcaoSelecionada() {
        if (getEscolha().equals("V") || getEscolha().equals("v")){
            MenuInicial menuInicial = new MenuInicial();
            menuInicial.opcoesDoMenu();
        } else {
            limparTela();
            Apartamento apartamentoSelecionado = null;

            for (Apartamento apartamento : listaDeApartamentos){
                if (apartamento.getIdentificacaoDoApartamento().equals(getEscolha())){
                    apartamentoSelecionado = apartamento;
                }
            }
            assert apartamentoSelecionado != null;
            apartamento = apartamentoSelecionado;
            MenuEditarDadosDoApartamento menuEditarDadosDoApartamento = new MenuEditarDadosDoApartamento();
            menuEditarDadosDoApartamento.opcoesDoMenu();
        }
    }
}
