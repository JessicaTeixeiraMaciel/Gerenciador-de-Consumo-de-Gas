package modelos.menu;

import interfaces.FormatacaoDoMenu;
import modelos.apartamento.Apartamento;
import modelos.pessoa.Inquilino;
import modelos.pessoa.Pessoa;
import modelos.pessoa.Proprietario;

import java.util.ArrayList;
import java.util.List;

public class MenuEditarDadosDoApartamento extends MenuConsultarDadosDoApartamento {



    public void opcoesDoMenu(Apartamento apartamento, Proprietario proprietario, Inquilino inquilino) {
        Pessoa pessoa = new Pessoa();
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
            textoAmarelo("Selecione qual dado do APARTAMENTO " + " deseja atualizar: ");
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
                pessoa.editarNome(proprietario);
                break;
            case "4":
                System.out.println("Informe um novo número de contato para proprietário: ");
                pessoa.editarNumero(proprietario);
                break;
            case "5":
                System.out.println("Informe um novo email para proprietário: ");
                pessoa.editarEmail(proprietario);
                break;
            case"6":
                System.out.println("Informe um novo nome para inquilino: ");
                pessoa.editarNome(inquilino);
                break;
            case "7":
                System.out.println("Informe um novo número de contato para inquilino: ");
                pessoa.editarNumero(inquilino);
                break;
            case "8":
                System.out.println("Informe um novo email para inwuilino: ");
                pessoa.editarEmail(inquilino);
                break;
        }
        Menu menu = new Menu();
        menu.continuarEditando();
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

}
