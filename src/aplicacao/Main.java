package aplicacao;

import banco.Apartamentos;
import banco.Cilindros;
import modelos.apartamento.Apartamento;
import modelos.cilindro.Cilindro;
import modelos.menu.MenuInicial;
import modelos.pessoa.Inquilino;
import modelos.pessoa.Proprietario;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Apartamento> listaDeApartamentos;
        List<Proprietario> listaDeProprietarios;
        List<Inquilino> listaDeInquilinos;
        List<Cilindro> listaDeCilindros;


        Apartamentos apartamentos = new Apartamentos();
        listaDeApartamentos = apartamentos.criarApartamentos();
        listaDeProprietarios = apartamentos.adicionarProprietarios(listaDeApartamentos);
        listaDeInquilinos = apartamentos.adicionarInquilinos(listaDeApartamentos);
        apartamentos.atualizacaoDeProprietarios(listaDeProprietarios);
        apartamentos.atualizacaoDeInquilinos(listaDeInquilinos);


        Cilindros cilindros = new Cilindros();
        listaDeCilindros = cilindros.listaDeCilindros();
        int i = listaDeCilindros.size();


        MenuInicial menuInicial = new MenuInicial();
        menuInicial.opcoesDoMenu(listaDeApartamentos,listaDeProprietarios,listaDeInquilinos,listaDeCilindros);
    }
}
