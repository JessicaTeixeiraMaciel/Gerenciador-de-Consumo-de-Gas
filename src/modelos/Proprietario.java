package modelos;

import interfaces.ResponsaveisPeloApartamento;

import java.util.Scanner;

public class Proprietario implements ResponsaveisPeloApartamento {
    @Override
    public void imprimirDadoDoResponsavel(Apartamento apartamento) {
        System.out.println("Dados do Proprietário");
        System.out.println("Nome do proprietário: " + apartamento.getNomeDoProprietario());
        System.out.println("Celular do proprietário: " + apartamento.getNumeroDoProprietario());
        System.out.println("Email do proprietário: " + apartamento.getEmailDoProprietario());
    }

    @Override
    public void editarNome(Apartamento apartamento) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o nome do proprietário: ");
        String nome = sc.next();
        apartamento.setNomeDoProprietario(nome);
    }

    @Override
    public void editarNumeroContato(Apartamento apartamento) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o número do proprietário: ");
        String numero = sc.next();
        apartamento.setNumeroDoProprietario(numero);
    }

    @Override
    public void editarEmail(Apartamento apartamento) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o email do proprietário: ");
        String email = sc.next();
        apartamento.setEmailDoProprietario(email);
    }
}
