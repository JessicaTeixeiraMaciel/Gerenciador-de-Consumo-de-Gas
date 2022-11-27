package modelos.menu;

import interfaces.FormatacaoDoMenu;
import modelos.apartamento.Apartamento;
import modelos.pessoa.Inquilino;
import modelos.pessoa.Proprietario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuEscolherApartamentoParaConsulta extends MenuInicial implements FormatacaoDoMenu {

    @Override
    public void opcoesDoMenu(List<Apartamento> lista,List<Proprietario> listaDeProprietarios,List<Inquilino> listaDeInquilinos) {
        limparTela();
        List<String> numerosDosApartamentos = new ArrayList<>();
        for (Apartamento apartamento : lista){
            numerosDosApartamentos.add(apartamento.getNumero());
        }
        do {
            System.out.println(ANSI_AMARELO + "CONSULTAR DADOS DOS APARTAMENTOS" + ANSI_RESET);
            System.out.print("Insira o número do apartamento que deseja consultar (");
            System.out.println(numerosDosApartamentos.toString().replace("[","").replace("]","") + ")");
            System.out.println("Ou digite 'v' para voltar ao menu anterior.");
        } while (validarEscolha(numerosDosApartamentos));
        irParaOpcaoSelecionada(lista,listaDeProprietarios,listaDeInquilinos);
    }

    @Override
    public boolean validarEscolha(List<String> listaDeOpcoes) {
        listaDeOpcoes.add("V");
        listaDeOpcoes.add("v");
        Scanner sc = new Scanner(System.in);
        textoCiano("Informe sua opção aqui:" );
        setEscolha(sc.next());
        if (!listaDeOpcoes.contains(getEscolha())){
            textoVermelho("Entrada inválida! Tente Novamente.\n");
        }
        return !listaDeOpcoes.contains(getEscolha());
    }


    public void irParaOpcaoSelecionada(List<Apartamento> listaDeApartamentos, List<Proprietario> listaDeProprietarios,List<Inquilino> listaDeInquilinos) {
        Apartamento apartamentoSelecionado = null;
        if (getEscolha().equals("V") || getEscolha().equals("v")){
            MenuInicial menuInicial = new MenuInicial();
            menuInicial.opcoesDoMenu(listaDeApartamentos,listaDeProprietarios,listaDeInquilinos);
        } else {
            limparTela();

            for (Apartamento apartamento :listaDeApartamentos){
                if (apartamento.getNumero().equals(getEscolha())){
                    apartamentoSelecionado = apartamento;
                }
            }
            MenuConsultarDadosDoApartamento menuConsultarDadosDoApartamento = new MenuConsultarDadosDoApartamento();
            menuConsultarDadosDoApartamento.exibirDadosDoApartamento(apartamentoSelecionado, listaDeProprietarios,listaDeApartamentos,listaDeInquilinos);
        }
    }
}
