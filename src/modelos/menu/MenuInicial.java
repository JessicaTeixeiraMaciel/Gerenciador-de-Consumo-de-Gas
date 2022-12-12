package modelos.menu;

import banco.Cilindros;
import interfaces.FormatacaoDoMenu;
import modelos.apartamento.Apartamento;
import modelos.cilindro.Cilindro;
import modelos.fornecedor.Fornecedor;
import modelos.menu.apartamentos.MenuEscolherApartamentoParaConsulta;
import modelos.menu.cilindros.MenuConsultarCilindros;
import modelos.pessoa.Inquilino;
import modelos.pessoa.Proprietario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuInicial extends Menu {
    List<String> listaDeOpcoes = new ArrayList<>();;


    public MenuInicial() {
    }

    public void boasVindas(){
        limparTela();
        System.out.println("Seja bem vindo ao gerenciador de consumo de gás do condomínio");
        textoCiano("  ____                           _                                               _                \n" +
                " |  _ \\    ___   ___            | |   __ _    ___    __ _   _ __    ___    ___  (_)   ___    __ _ \n" +
                " | |_) |  / _ \\ / __|        _  | |  / _` |  / __|  / _` | | '__|  / _ \\  / __| | |  / __|  / _` |\n" +
                " |  _ <  |  __/ \\__ \\  _    | |_| | | (_| | | (__  | (_| | | |    |  __/ | (__  | | | (__  | (_| |\n" +
                " |_| \\_\\  \\___| |___/ (_)    \\___/   \\__,_|  \\___|  \\__,_| |_|     \\___|  \\___| |_|  \\___|  \\__,_|\n\n");
    }



    public void opcoesDoMenu(List<Apartamento> lista, List<Proprietario> listaDeProprietarios, List<Inquilino> listaDeInquilinos,List<Cilindro> listaDeCilindros){

        listaDeOpcoes.add("Consultar dados dos apartamentos");
        listaDeOpcoes.add("Consultar trocas de cilindros");
        listaDeOpcoes.add("Consultar Lista de Fornecedores");
        listaDeOpcoes.add("Sair");
        boasVindas();
        do {
            System.out.println("O que deseja fazer?");
            imprimirListaDeOpcoes(listaDeOpcoes);
        } while (validarEscolha(enumerarOpcoes(listaDeOpcoes)));
        irParaOpcaoSelecionada(lista, listaDeProprietarios, listaDeInquilinos,listaDeCilindros);
    }


    public boolean validarEscolha(List<String> listaDeOpcoes){
        Scanner sc = new Scanner(System.in);
        textoCiano("Informe sua opção aqui:" );
        setEscolha(sc.next());
        if (!listaDeOpcoes.contains(getEscolha())){
            textoVermelho("Entrada inválida! Tente Novamente.\n");
        }
        return !listaDeOpcoes.contains(getEscolha());
    }


    public void irParaOpcaoSelecionada(List<Apartamento> lista, List<Proprietario> listaDeProprietarios, List<Inquilino> listaDeInquilinos,List<Cilindro> listaDeCilindros) {
        switch (getEscolha().toLowerCase()){
            case "1":
                MenuEscolherApartamentoParaConsulta menuConsultarDadosDosApartamento = new MenuEscolherApartamentoParaConsulta();
                menuConsultarDadosDosApartamento.opcoesDoMenu(lista,listaDeProprietarios,listaDeInquilinos,listaDeCilindros);
                break;
            case "2":
                limparTela();
                MenuConsultarCilindros menuConsultarCilindros = new MenuConsultarCilindros();
                menuConsultarCilindros.opcoesDoMenu(listaDeCilindros);
                break;
            case "4":
                sairDoSistema();
                break;
        }
    }
}
