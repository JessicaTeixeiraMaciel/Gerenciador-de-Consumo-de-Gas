package modelos.menu;

import interfaces.FormatacaoDoMenu;
import modelos.apartamento.Apartamento;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuInicial extends Menu
        implements FormatacaoDoMenu {

    Apartamento apartamento;

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


    @Override
    public void opcoesDoMenu(){
        List<String> listaDeOpcoes = new ArrayList<>();
        listaDeOpcoes.add("Consultar dados dos apartamentos");
        listaDeOpcoes.add("Consultar trocas de cilindros");
        listaDeOpcoes.add("Consultar Lista de Fornecedores");
        listaDeOpcoes.add("Sair");
        boasVindas();
        do {
            System.out.println("O que deseja fazer?");
            imprimirListaDeOpcoes(listaDeOpcoes);
        } while (validarEscolha(enumerarOpcoes(listaDeOpcoes)));
        irParaOpcaoSelecionada();
    }
    @Override
    public boolean validarEscolha(List<String> listaDeOpcoes){
        Scanner sc = new Scanner(System.in);
        textoCiano("Informe sua opção aqui:" );
        setEscolha(sc.next());
        if (!listaDeOpcoes.contains(getEscolha())){
            textoVermelho("Entrada inválida! Tente Novamente.\n");
        }
        return !listaDeOpcoes.contains(getEscolha());
    }

    @Override
    public void irParaOpcaoSelecionada() {
        switch (getEscolha().toLowerCase()){
            case "1":
                MenuEscolherApartamentoParaConsulta consultarDadosDosApartamento = new MenuEscolherApartamentoParaConsulta();
                consultarDadosDosApartamento.opcoesDoMenu();
                break;
            case "2":
            case "3":
            case "4":
                sairDoSistema();
                break;
        }
    }


    public Apartamento getApartamento() {
        return apartamento;
    }

    public void setApartamento(Apartamento apartamento) {
        this.apartamento = apartamento;
    }
}
