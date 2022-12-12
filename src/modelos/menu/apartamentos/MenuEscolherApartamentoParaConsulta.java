package modelos.menu.apartamentos;

import modelos.apartamento.Apartamento;
import modelos.cilindro.Cilindro;
import modelos.menu.MenuInicial;
import modelos.pessoa.Inquilino;
import modelos.pessoa.Proprietario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuEscolherApartamentoParaConsulta extends MenuInicial {


    public void opcoesDoMenu(List<Apartamento> lista,List<Proprietario> listaDeProprietarios,List<Inquilino> listaDeInquilinos,List<Cilindro> listaDeCilindros) {
        limparTela();
        List<String> numerosDosApartamentos = new ArrayList<>();

        lista.forEach(e -> numerosDosApartamentos.add(e.getNumero()));

        do {
            textoAmarelo("CONSULTAR DADOS DOS APARTAMENTOS");
            System.out.print("Insira o número do apartamento que deseja consultar (");
            System.out.println(numerosDosApartamentos.toString().replace("[","").replace("]","") + ")");
            System.out.println("Ou digite 'v' para voltar ao menu anterior.");
        } while (validarEscolha(numerosDosApartamentos));
        irParaOpcaoSelecionada(lista,listaDeProprietarios,listaDeInquilinos, listaDeCilindros);
    }

    @Override
    public boolean validarEscolha(List<String> listaDeOpcoes) {
        listaDeOpcoes.add("V");
        listaDeOpcoes.add("v");
        Scanner sc = new Scanner(System.in);
        textoCiano("Informe sua opção aqui:" );
        setEscolha(sc.next());
        if (!listaDeOpcoes.contains(getEscolha())){
            textoVermelho("Entrada inválida! Tente Novamente.\n");
        }
        return !listaDeOpcoes.contains(getEscolha());
    }


    public void irParaOpcaoSelecionada(List<Apartamento> listaDeApartamentos, List<Proprietario> listaDeProprietarios, List<Inquilino> listaDeInquilinos,List<Cilindro> listaDeCilindros) {

        if (getEscolha().equals("V") || getEscolha().equals("v")){
            MenuInicial menuInicial = new MenuInicial();
            menuInicial.opcoesDoMenu(listaDeApartamentos,listaDeProprietarios,listaDeInquilinos,listaDeCilindros);
        } else {
            limparTela();

            Apartamento apartamentoSelecionado = listaDeApartamentos.stream().filter(e -> e.getNumero().equals(getEscolha())).findFirst().orElse(null);

            MenuConsultarDadosDoApartamento menuConsultarDadosDoApartamento = new MenuConsultarDadosDoApartamento();
            menuConsultarDadosDoApartamento.exibirDadosDoApartamento(apartamentoSelecionado, listaDeProprietarios,listaDeApartamentos,listaDeInquilinos,listaDeCilindros);
        }
    }
}
