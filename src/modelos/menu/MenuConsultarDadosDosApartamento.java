package modelos.menu;

import banco.Apartamentos;
import interfaces.FormatacaoDoMenu;
import modelos.apartamento.Apartamento;

import java.util.ArrayList;
import java.util.List;

public class MenuConsultarDadosDosApartamento extends MenuInicial
        implements FormatacaoDoMenu {



    @Override
    public void opcoesDoMenu() {
        Apartamentos apartamentos = new Apartamentos();
        List<Apartamento> listaDeApartamentos = new ArrayList<>(apartamentos.listaDeApartamentos());
        limparTela();
        List<String> numerosDosApartamentos = new ArrayList<>();
        for (Apartamento apartamento : listaDeApartamentos){
            numerosDosApartamentos.add(apartamento.getNumero());
        }
        do {
            System.out.println(ANSI_AMARELO + "CONSULTAR DADOS DOS APARTAMENTOS" + ANSI_RESET);
            System.out.print("Insira o número do apartamento que deseja consultar (");
            System.out.println(numerosDosApartamentos.toString().replace("[","").replace("]","") + ")");
            System.out.println("Ou digite 'v' para voltar ao menu anterior.");
        } while (validarEscolha(numerosDosApartamentos));
        irParaOpcaoSelecionada(listaDeApartamentos);
    }


    public void irParaOpcaoSelecionada(List<Apartamento> listaDeApartamentos) {
        if (getEscolha().equals("V") || getEscolha().equals("v")){
            MenuInicial menuInicial = new MenuInicial();
            menuInicial.opcoesDoMenu();
        } else {
            limparTela();
            Apartamento apartamentoSelecionado = null;

            for (Apartamento apartamento : listaDeApartamentos){
                if (apartamento.getNumero().equals(getEscolha())){
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
