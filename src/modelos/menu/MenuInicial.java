package modelos.menu;

import modelos.apartamento.Apartamento;
import modelos.cilindro.Cilindro;
import modelos.menu.apartamentos.MenuEscolherApartamentoParaConsulta;
import modelos.menu.cilindros.MenuConsultarCilindros;
import modelos.pessoa.Inquilino;
import modelos.pessoa.Proprietario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuInicial {
    private String escolha;
    String ANSI_AMARELO = "\u001B[33m";
    String ANSI_RESET = "\u001B[0m";
    String ANSI_CINZA = "\u001B[37m";
    String ANSI_VERMELHO = "\u001B[31m";
    String ANSI_CIANO = "\u001B[36m";
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



    public void limparTela(){
        for (int i = 0; i < 50; i++){
            System.out.println("\n");
        }
    }
    public void textoAmarelo(String texto){
        System.out.println(ANSI_AMARELO + texto + ANSI_RESET);
    }

    public void textoCiano(String texto){
        System.out.println(ANSI_CIANO + texto + ANSI_RESET);
    }

    public void textoVermelho(String texto){
        System.out.println(ANSI_VERMELHO + texto + ANSI_RESET);
    }

    public void separador(){
        System.out.print(ANSI_CINZA);
        for (int i = 0; i < 100; i++){
            System.out.print("-");
        }
        System.out.println(ANSI_RESET);
    }

    public void imprimirListaDeOpcoes (List<String> listaDeOpcoes){
        int i = 1;
        for (String opcao : listaDeOpcoes){
            System.out.println(i + " - " + opcao);
            i++;
        }
    }

    public List<String> enumerarOpcoes(List<String> listaDeOpcoes){
        List<String> enumeracao = new ArrayList<>();
        int i = 1;
        for (String ignored : listaDeOpcoes){
            enumeracao.add(String.valueOf(i));
            i++;
        }
        return enumeracao;
    }

    public List<String> opcaoSimNao (){
        List<String> listaDeOpcoes = new ArrayList<>();
        listaDeOpcoes.add("s");
        listaDeOpcoes.add("S");
        listaDeOpcoes.add("n");
        listaDeOpcoes.add("N");
        return listaDeOpcoes;
    }


    public void sairDoSistema (){
        System.out.println("Tchau! Até a próxima! :)");
    }

    public String getEscolha() {
        return escolha;
    }

    public void setEscolha(String escolha) {
        this.escolha = escolha;
    }

}
