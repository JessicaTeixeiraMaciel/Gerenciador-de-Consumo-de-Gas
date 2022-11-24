package modelos.menu;

import interfaces.FormatacaoDoMenu;
import modelos.apartamento.Apartamento;
import modelos.pessoa.Inquilino;
import modelos.pessoa.Pessoa;
import modelos.pessoa.Proprietario;

import java.util.ArrayList;
import java.util.List;

public class MenuConsultarDadosDoApartamento extends MenuEscolherApartamentoParaConsulta
        implements FormatacaoDoMenu {

    Proprietario proprietarioSelecionado;
    Inquilino inquilinoSelecionado;



    public void exibirDadosDoApartamento(Apartamento apartamento){

        for (Proprietario proprietario : apartamentos.listaDeProprietarios()){
            if (proprietario.getNumeroDoApartamento().equals(apartamento.getNumero())){
                proprietarioSelecionado = proprietario;
            }
        }

        for (Inquilino inquilino : apartamentos.listaDeInquilinos()){
            if (inquilino.getNumeroDoApartamento().equals(apartamento.getNumero())){
                inquilinoSelecionado = inquilino;
            }
        }

        textoAmarelo("Apartamento " + apartamento.getNumero());
        System.out.print("Situação do apartamento: ");

        if(apartamento.isPossuiMedidorDeGas()){
            System.out.println("Possi meididor de gás");
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
        opcoesDoMenu();
    }

    public void imprimirDados(Pessoa pessoa){
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Contato: " + pessoa.getNumeroDeContato());
        System.out.println("Email: " + pessoa.getEmail());
    }

    @Override
    public void opcoesDoMenu() {
        textoAmarelo("Insira 'e' para editar os dados ou qualquer outro digito para voltar ao menu anterior.");
        List<String> listaDeOpcoes = new ArrayList<>();
        listaDeOpcoes.add("v");
        listaDeOpcoes.add("V");
        listaDeOpcoes.add("e");
        listaDeOpcoes.add("E");
        validarEscolha(listaDeOpcoes);
        switch (getEscolha().toLowerCase()){
            case "v":
                MenuEscolherApartamentoParaConsulta menuEscolherApartamentoParaConsulta = new MenuEscolherApartamentoParaConsulta();
                menuEscolherApartamentoParaConsulta.opcoesDoMenu();
                break;
            case "e":
                MenuEditarDadosDoApartamento menuEditarDadosDoApartamento = new MenuEditarDadosDoApartamento();
                menuEditarDadosDoApartamento.opcoesDoMenu(proprietarioSelecionado,inquilinoSelecionado);
                break;
        }
    }
}
