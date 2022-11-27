package modelos.menu;

import modelos.apartamento.Apartamento;
import modelos.pessoa.Inquilino;
import modelos.pessoa.Pessoa;
import modelos.pessoa.Proprietario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuEditarDadosDoApartamento extends MenuConsultarDadosDoApartamento {


    public void opcoesDoMenu(Apartamento apartamento, Proprietario proprietario, Inquilino inquilino,List<Apartamento> lista,List<Proprietario> listaDeProprietarios,List<Inquilino> listaDeInquilinos) {
        List<String> listaDeOpcoes = new ArrayList<>();
        listaDeOpcoes.add("Situação do apartamento");
        listaDeOpcoes.add("Responsável pelo apartamento");
        listaDeOpcoes.add("Nome do proprietário");
        listaDeOpcoes.add("Celular do priprietário");
        listaDeOpcoes.add("Email do proprietário");

        if(proprietario.isPossuiInquilino()){
            listaDeOpcoes.add("Nome do inquilino");
            listaDeOpcoes.add("Celular do inquilino");
            listaDeOpcoes.add("Email do inquilino");
        }
        separador();

        do {
            limparTela();
            textoAmarelo("Selecione qual dado do APARTAMENTO " + apartamento.getNumero() + " deseja atualizar: ");
            imprimirListaDeOpcoes(listaDeOpcoes);
        } while (validarEscolha(enumerarOpcoes(listaDeOpcoes)));

        switch (getEscolha()){
            case "1":
                do {
                    opcoesEditarSituacaoApartamento(apartamento);
                }while (validarEscolha(opcaoSimNao()));
                if (getEscolha().equals("n") || getEscolha().equals("N")){
                    System.out.println("Nenhuma alteração foi feita.");
                } else {
                    apartamento.editarSituacaoDoApartamento(apartamento);
                    System.out.println("Alteração salva com sucesso!");
                }
                break;
            case "2":
                do {
                    opcoesEditarPossuiInquilino(proprietario);
                }while (validarEscolha(opcaoSimNao()));
                if (getEscolha().equals("n") || getEscolha().equals("N")){
                    System.out.println("Nenhuma alteração foi feita.");
                } else {
                   proprietario.editarPossuiInquilino(proprietario);
                    System.out.println("Alteração salva com sucesso!");
                }
                break;
            case "3":
                System.out.println("Informe um novo nome para proprietário: ");
                editarNome(proprietario);
                break;
            case "4":
                System.out.println("Informe um novo número de contato para proprietário: ");
                editarNumero(proprietario);
                break;
            case "5":
                System.out.println("Informe um novo email para proprietário: ");
                editarEmail(proprietario);
                break;
            case"6":
                System.out.println("Informe um novo nome para inquilino: ");
                editarNome(inquilino);
                break;
            case "7":
                System.out.println("Informe um novo número de contato para inquilino: ");
                editarNumero(inquilino);
                break;
            case "8":
                System.out.println("Informe um novo email para inquilino: ");
                editarEmail(inquilino);
                break;
        }
        continuarEditando(apartamento,proprietario,inquilino,lista,listaDeProprietarios,listaDeInquilinos);
    }

    public void continuarEditando(Apartamento apartamento, Proprietario proprietario, Inquilino inquilino,List<Apartamento> lista,List<Proprietario> listaDeProprietarios,List<Inquilino> listaDeInquilinos){
        Scanner sc = new Scanner(System.in);
        textoAmarelo("Insira 'c' para continuar editando ou qualquer outro digito para sair do modo de edição.");
        String escolha = sc.next();
        if ("c".equals(escolha) || "C".equals(escolha)) {
            opcoesDoMenu(apartamento,proprietario,inquilino,lista,listaDeProprietarios,listaDeInquilinos);
        } else {
            limparTela();
            exibirDadosDoApartamento(apartamento,listaDeProprietarios,lista,listaDeInquilinos);
        }
    }


    public void opcoesEditarSituacaoApartamento(Apartamento apartamento){
        boolean possuiMedidor = apartamento.isPossuiMedidorDeGas();
        if (possuiMedidor){
            System.out.println("Deseja mudar a situação do apartamento para 'Não possui medidor de gás'? (s/n)");
        }else {
            System.out.println("Deseja mudar a situação do apartamento para 'Possui medidor de gás'? (s/n)");
        }
    }

    public void opcoesEditarPossuiInquilino(Proprietario proprietario){
        boolean possuiInquilino = proprietario.isPossuiInquilino();
        if (possuiInquilino){
            System.out.println("Deseja mudar o responsável do imóvel para 'Proprietário'? (s/n)");
        }else {
            System.out.println("Deseja mudar o responsável do imóvel para 'Inquilino'? (s/n)");
        }
    }

    public void editarNome(Pessoa pessoa){
        String nome;
        Scanner sc = new Scanner(System.in);
        nome = sc.next();
        do {
            System.out.println("Confirma a alteração de " + pessoa.getNome() + " para " + nome + "? (s/n)");
        } while (validarEscolha(opcaoSimNao()));

        if (getEscolha().equals("N")|| getEscolha().equals("n")){
            System.out.println("Ok! Nenhuma alteração será feita.");
        } else if (getEscolha().equals("S")|| getEscolha().equals("s")){
            pessoa.setNome(nome);
            System.out.println("Nome alterado com sucesso!");
        }
    }

    public void editarNumero(Pessoa pessoa){
        String numero;
        Scanner sc = new Scanner(System.in);
        numero = sc.next();
        do {
            System.out.println("Confirma a alteração de " + pessoa.getNumeroDeContato() + " para " + numero + "? (s/n)");
        } while (validarEscolha(opcaoSimNao()));

        if (getEscolha().equals("N")|| getEscolha().equals("n")){
            System.out.println("Ok! Nenhuma alteração será feita.");
        } else if (getEscolha().equals("S")|| getEscolha().equals("s")){
            pessoa.setNumeroDeContato(numero);
            System.out.println("Número de contato alterado com sucesso!");
        }
    }

    public void editarEmail(Pessoa pessoa){
        String email;
        Scanner sc = new Scanner(System.in);
        email = sc.next();
        do {
            System.out.println("Confirma a alteração de " + pessoa.getEmail() + " para " + email + "? (s/n)");
        } while (validarEscolha(opcaoSimNao()));

        if (getEscolha().equals("N")|| getEscolha().equals("n")){
            System.out.println("Ok! Nenhuma alteração será feita.");
        } else if (getEscolha().equals("S")|| getEscolha().equals("s")){
            pessoa.setEmail(email);
            System.out.println("Email alterado com sucesso!");
        }
    }
}
