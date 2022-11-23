package modelos.menu;

import banco.Apartamentos;
import interfaces.FormatacaoDoMenu;
import modelos.apartamento.Apartamento;
import modelos.pessoa.Inquilino;
import modelos.pessoa.Pessoa;
import modelos.pessoa.Proprietario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuEscolherApartamentoParaConsulta extends MenuInicial
        implements FormatacaoDoMenu {

    Apartamento apartamentoSelecionado;



    @Override
    public void opcoesDoMenu() {
        limparTela();
        List<String> numerosDosApartamentos = new ArrayList<>();
        for (Apartamento apartamento : apartamentos.listaDeApartamentos()){
            numerosDosApartamentos.add(apartamento.getNumero());
        }
        do {
            System.out.println(ANSI_AMARELO + "CONSULTAR DADOS DOS APARTAMENTOS" + ANSI_RESET);
            System.out.print("Insira o número do apartamento que deseja consultar (");
            System.out.println(numerosDosApartamentos.toString().replace("[","").replace("]","") + ")");
            System.out.println("Ou digite 'v' para voltar ao menu anterior.");
        } while (validarEscolha(numerosDosApartamentos));
        irParaOpcaoSelecionada();
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

    @Override
    public void irParaOpcaoSelecionada() {
        if (getEscolha().equals("V") || getEscolha().equals("v")){
            MenuInicial menuInicial = new MenuInicial();
            menuInicial.opcoesDoMenu();
        } else {
            limparTela();

            for (Apartamento apartamento : apartamentos.listaDeApartamentos()){
                if (apartamento.getNumero().equals(getEscolha())){
                    apartamentoSelecionado = apartamento;
                }
            }
            MenuConsultarDadosDoApartamento menuConsultarDadosDoApartamento = new MenuConsultarDadosDoApartamento();
            menuConsultarDadosDoApartamento.exibirDadosDoApartamento(apartamentoSelecionado);
        }
    }
}
