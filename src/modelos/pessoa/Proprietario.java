package modelos.pessoa;

import interfaces.ResponsavelPeloApartamento;
import modelos.apartamento.Apartamento;

import java.util.Scanner;

public class Proprietario extends Pessoa
        implements ResponsavelPeloApartamento {

    public Proprietario(String nome, String numeroDeContato, String email) {
        super(nome, numeroDeContato, email);
    }

    public Proprietario() {
    }

    @Override
    public void imprimirDadoDoResponsavel(Apartamento apartamento) {
        System.out.println(">>>>>> Dados do Proprietário <<<<<<");
        System.out.println("Nome do proprietário: " + apartamento.getNomeDoProprietario());
        System.out.println("Celular do proprietário: " + apartamento.getNumeroDoProprietario());
        System.out.println("Email do proprietário: " + apartamento.getEmailDoProprietario());
    }

    @Override
    public void editarNome(Apartamento apartamento) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o novo nome do proprietário: ");
        String nome = sc.next();
        apartamento.setNomeDoProprietario(nome);
        System.out.println("Nome do proprietário alterado com sucesso!");
    }

    @Override
    public void editarNumeroContato(Apartamento apartamento) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o número do proprietário: ");
        String numero = sc.next();
        apartamento.setNumeroDoProprietario(numero);
        System.out.println("Número do proprietário alterado com sucesso!");
    }

    @Override
    public void editarEmail(Apartamento apartamento) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o email do proprietário: ");
        String email = sc.next();
        apartamento.setEmailDoProprietario(email);
        System.out.println("Email do proprietário alterado com sucesso!");

    }
}
