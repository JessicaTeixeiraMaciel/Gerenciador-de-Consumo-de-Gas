package modelos.pessoa;

import modelos.apartamento.Apartamento;
import modelos.menu.Menu;
import modelos.menu.MenuInicial;

import java.util.Scanner;

public class Pessoa {
    private String nome;
    private String numeroDeContato;
    private String email;
    String numeroDoApartamento;

    public Pessoa(String nome, String numeroDeContato, String email, String numeroDoApartamento) {
        this.nome = nome;
        this.numeroDeContato = numeroDeContato;
        this.email = email;
        this.numeroDoApartamento = numeroDoApartamento;
    }

    public Pessoa(String numeroDoApartamento) {
        this.numeroDoApartamento = numeroDoApartamento;
    }

    public Pessoa() {
    }

    public void editarNome(Pessoa pessoa){
//        Scanner sc = new Scanner(System.in);
//        String nome = sc.next();
//        System.out.println("Confirma a alteração do nome para " + nome + "?");
//        Menu menu = new Menu();
//        menuInicial.validarEscolha(menu.opcaoSimNao());
//        if (menuInicial.getEscolha().equals("N")|| menuInicial.getEscolha().equals("n")){
//            System.out.println("Ok! Nenhuma alteração será feita.");
//        } else {
//            pessoa.setNome(nome);
//        }
    }

    public void editarNumero(Pessoa pessoa){
//        Scanner sc = new Scanner(System.in);
//        String numero = sc.next();
//        System.out.println("Confirma a alteração do número de contato para " + numero + "?");
//        menuInicial.validarEscolha(menuInicial.opcaoSimNao());
//        if (menuInicial.getEscolha().equals("N")|| menuInicial.getEscolha().equals("n")){
//            System.out.println("Ok! Nenhuma alteração será feita.");
//        } else {
//            pessoa.setNumeroDeContato(numero);
//        }
    }

    public void editarEmail(Pessoa pessoa){
//        Scanner sc = new Scanner(System.in);
//        String email = sc.next();
//        System.out.println("Confirma a alteração do email para " + email + "?");
//        Menu menu = new Menu();
//        menuInicial.validarEscolha(menu.opcaoSimNao());
//        if (menuInicial.getEscolha().equals("N")|| menuInicial.getEscolha().equals("n")){
//            System.out.println("Ok! Nenhuma alteração será feita.");
//        } else {
//            pessoa.setNumeroDeContato(email);
//        }
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumeroDeContato() {
        return numeroDeContato;
    }

    public void setNumeroDeContato(String numeroDeContato) {
        this.numeroDeContato = numeroDeContato;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumeroDoApartamento() {
        return numeroDoApartamento;
    }

    public void setNumeroDoApartamento(String numeroDoApartamento) {
        this.numeroDoApartamento = numeroDoApartamento;
    }
}
