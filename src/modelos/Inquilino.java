package modelos;

import interfaces.ResponsaveisPeloApartamento;

import java.util.Scanner;

public class Inquilino implements ResponsaveisPeloApartamento {
    @Override
    public void imprimirDadoDoResponsavel(Apartamento apartamento) {
        System.out.println("Dados do Inquilino");
        System.out.println("Nome do inquilino: " + apartamento.getNomeDoInquilino());
        System.out.println("Celular do inquilino: " + apartamento.getNumeroDoInquilino());
        System.out.println("Email do inquilino: " + apartamento.getEmailDoInquilino());
        System.out.println("Data de entrada do inquilino: " + apartamento.getDataDeEntradaInquilino());
    }

    @Override
    public void editarNome(Apartamento apartamento) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o nome do inquilino: ");
        String nome = sc.next();
        apartamento.setNomeDoInquilino(nome);
    }

    @Override
    public void editarNumeroContato(Apartamento apartamento) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o número do inquilino: ");
        String numero = sc.next();
        apartamento.setNumeroDoInquilino(numero);
    }

    @Override
    public void editarEmail(Apartamento apartamento) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o email do inquilino: ");
        String email = sc.next();
        apartamento.setEmailDoInquilino(email);
    }
}
