import banco.BancoInicial;
import modelos.apartamento.Apartamento;
import modelos.menu.MenuInicial;
import modelos.pessoa.Inquilino;
import modelos.pessoa.Proprietario;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Apartamento> listaDeApartamentos;
        List<Proprietario> listaDeProprietarios;
        List<Inquilino> listaDeInquilinos;

        BancoInicial bancoInicial = new BancoInicial();
        listaDeApartamentos = bancoInicial.criarApartamentos();
        listaDeProprietarios = bancoInicial.adicionarProprietarios(listaDeApartamentos);
        listaDeInquilinos = bancoInicial.adicionarInquilinos(listaDeApartamentos);
        bancoInicial.atualizacaoDeProprietarios(listaDeProprietarios);
        bancoInicial.atualizacaoDeInquilinos(listaDeInquilinos);

        MenuInicial menuInicial = new MenuInicial();
        menuInicial.opcoesDoMenu(listaDeApartamentos,listaDeProprietarios,listaDeInquilinos);
    }
}
