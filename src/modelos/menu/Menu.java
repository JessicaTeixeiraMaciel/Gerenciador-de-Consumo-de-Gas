package modelos.menu;

import banco.DadosApartamentos;
import modelos.apartamento.Apartamento;
import modelos.pessoa.Inquilino;
import modelos.pessoa.Proprietario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    private String escolha;
    DadosApartamentos dadosApartamentos = new DadosApartamentos();
    List<Apartamento> listaDeApartamentos = new ArrayList<>(dadosApartamentos.listaDeApartamentos());
    Proprietario proprietario = new Proprietario();
    Inquilino inquilino = new Inquilino();
    Scanner sc = new Scanner(System.in);
    String ANSI_AMARELO = "\u001B[33m";
    String ANSI_RESET = "\u001B[0m";
    String ANSI_CINZA = "\u001B[37m";
    String ANSI_VERMELHO = "\u001B[31m";
    String ANSI_CIANO = "\u001B[36m";

    public Menu() {
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
        System.out.println(ANSI_CINZA);
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

    public void continuarEditando(){
        Scanner sc = new Scanner(System.in);
        textoAmarelo("Insira 'c' para continuar editando ou qualquer outro digito para sair do modo de edição.");
        escolha = sc.next();
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