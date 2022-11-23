package modelos.pessoa;

import interfaces.ResponsavelPeloApartamento;
import modelos.apartamento.Apartamento;

import java.util.Scanner;

public class Inquilino extends Pessoa
        implements ResponsavelPeloApartamento {

    public Inquilino(String nome, String numeroDeContato, String email) {
        super(nome, numeroDeContato, email);
    }

    public Inquilino() {
        super();
    }

    @Override
    public void imprimirDadoDoResponsavel(Apartamento apartamento) {
        System.out.println(">>>>>> Dados do Inquilino <<<<<<");
        System.out.println("Nome do inquilino: " + apartamento.getNomeDoInquilino());
        System.out.println("Celular do inquilino: " + apartamento.getNumeroDoInquilino());
        System.out.println("Email do inquilino: " + apartamento.getEmailDoInquilino());
    }

    @Override
    public void editarNome(Apartamento apartamento) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o nome do inquilino: ");
        String nome = sc.next();
        apartamento.setNomeDoInquilino(nome);
        System.out.println("Nome do inquilino alterado com sucesso!");
    }

    @Override
    public void editarNumeroContato(Apartamento apartamento) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o número do inquilino: ");
        String numero = sc.next();
        apartamento.setNumeroDoInquilino(numero);
        System.out.println("Número do inquilino alterado com sucesso!");
    }

    @Override
    public void editarEmail(Apartamento apartamento) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o email do inquilino: ");
        String email = sc.next();
        apartamento.setEmailDoInquilino(email);
        System.out.println("Email do inquilino alterado com sucesso!");
    }
}
