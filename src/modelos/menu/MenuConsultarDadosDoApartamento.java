package modelos.menu;

import interfaces.FormatacaoDoMenu;
import modelos.apartamento.Apartamento;
import modelos.pessoa.Inquilino;
import modelos.pessoa.Pessoa;
import modelos.pessoa.Proprietario;

import java.util.ArrayList;
import java.util.List;

public class MenuConsultarDadosDoApartamento extends MenuEscolherApartamentoParaConsulta {

    Proprietario proprietarioSelecionado;
    Inquilino inquilinoSelecionado;



    public void exibirDadosDoApartamento(Apartamento apartamento, List<Proprietario> listaDeProprietarios,List<Apartamento> lista,List<Inquilino> listaDeInquilinos){

        for (Proprietario proprietario : listaDeProprietarios){
            if (proprietario.getNumeroDoApartamento().equals(apartamento.getNumero())){
                proprietarioSelecionado = proprietario;
            }
        }

        for (Inquilino inquilino : listaDeInquilinos){
            if (inquilino.getNumeroDoApartamento().equals(apartamento.getNumero())){
                inquilinoSelecionado = inquilino;
            }
        }

        textoAmarelo("Apartamento " + apartamento.getNumero());
        System.out.print("Situação do apartamento: ");

        if(apartamento.isPossuiMedidorDeGas()){
            System.out.println("Possui medidor de gás");
        }else {
            System.out.println("Não possui medidor de gás");
        }
        System.out.print("Responsável pelo apartamento: ");

        if(proprietarioSelecionado.isPossuiInquilino()){
            System.out.println("Inquilino");
        }else {
            System.out.println("Proprietário");
        }
        separador();
        textoAmarelo("Dados do Proprietário");
        imprimirDados(proprietarioSelecionado);
        separador();
        if (proprietarioSelecionado.isPossuiInquilino()){
            textoAmarelo("Dados do Inquilino");
            imprimirDados(inquilinoSelecionado);
        }
        opcoesDoMenu(apartamento,lista,listaDeProprietarios,listaDeInquilinos);
    }

    public void imprimirDados(Pessoa pessoa){
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Contato: " + pessoa.getNumeroDeContato());
        System.out.println("Email: " + pessoa.getEmail());
    }


    public void opcoesDoMenu(Apartamento apartamento,List<Apartamento> lista,List<Proprietario> listaDeProprietarios,List<Inquilino> listaDeInquilinos) {
        List<String> listaDeOpcoes = new ArrayList<>();
        do {
            textoAmarelo("Insira 'e' para editar os dados ou 'v' para voltar ao menu anterior.");
            listaDeOpcoes.add("v");
            listaDeOpcoes.add("V");
            listaDeOpcoes.add("e");
            listaDeOpcoes.add("E");
        } while (validarEscolha(listaDeOpcoes));
        switch (getEscolha().toLowerCase()){
            case "v":
                MenuEscolherApartamentoParaConsulta menuEscolherApartamentoParaConsulta = new MenuEscolherApartamentoParaConsulta();
                menuEscolherApartamentoParaConsulta.opcoesDoMenu(lista,listaDeProprietarios,listaDeInquilinos);
                break;
            case "e":
                MenuEditarDadosDoApartamento menuEditarDadosDoApartamento = new MenuEditarDadosDoApartamento();
                menuEditarDadosDoApartamento.opcoesDeEdicao(apartamento,proprietarioSelecionado,inquilinoSelecionado,lista,listaDeProprietarios,listaDeInquilinos);
                break;
        }
    }
}
