package banco;

import modelos.apartamento.Apartamento;
import modelos.pessoa.Inquilino;
import modelos.pessoa.Pessoa;
import modelos.pessoa.Proprietario;

import java.util.ArrayList;
import java.util.List;

public class Apartamentos {

    List<Proprietario> listaDeProprietarios = new ArrayList<>();
    List<Inquilino> listaDeInquilinos = new ArrayList<>();
    List<Apartamento> listaDeApartamentos = new ArrayList<>();


    public List<Apartamento> listaDeApartamentos(){

        listaDeApartamentos.add(new Apartamento("2", true));
        listaDeApartamentos.add(new Apartamento("3", true));
        listaDeApartamentos.add(new Apartamento("101", true));
        listaDeApartamentos.add(new Apartamento("102", true));
        listaDeApartamentos.add(new Apartamento("103", true));
        listaDeApartamentos.add(new Apartamento("104", true));
        listaDeApartamentos.add(new Apartamento("201", false));
        listaDeApartamentos.add(new Apartamento("202", true));
        listaDeApartamentos.add(new Apartamento("203", true));
        listaDeApartamentos.add(new Apartamento("204", true));
    return listaDeApartamentos;
    }

    public void adicionarResponsaveis(){
        for (Apartamento ignored : listaDeApartamentos()) {
            listaDeProprietarios.add(new Proprietario());
            listaDeInquilinos.add(new Inquilino());
        }
    }

    public void editarListaDeProprietarios(String numeroDoApartamento,Pessoa proprietario, String nome, String numero, String email){
        proprietario.setNumeroDoApartamento(numeroDoApartamento);
        proprietario.setNome(nome);
        proprietario.setNumeroDeContato(numero);
        proprietario.setEmail(email);
    }
    public void listaDeProprietariosAtualizada(){Apartamentos apartamentos = new Apartamentos();
        adicionarResponsaveis();

        editarListaDeProprietarios(listaDeApartamentos.get(0).getNumero(),listaDeProprietarios.get(0),"Amanda","(71) 00000-0000","amanda@email.com");
        editarListaDeProprietarios(listaDeApartamentos.get(1).getNumero(),listaDeProprietarios.get(1),"Beatriz","(71) 11111-1111","beatriz@email.com");
        editarListaDeProprietarios(listaDeApartamentos.get(2).getNumero(),listaDeProprietarios.get(2),"Carlos","(71) 22222-2222", "carlos@email.com");
        editarListaDeProprietarios(listaDeApartamentos.get(3).getNumero(),listaDeProprietarios.get(3),"Daniel","(71) 33333-3333","daniel@email.com");
        editarListaDeProprietarios(listaDeApartamentos.get(4).getNumero(),listaDeProprietarios.get(4),"Ester","(71) 44444-4444","ester@email.com");
        editarListaDeProprietarios(listaDeApartamentos.get(5).getNumero(),listaDeProprietarios.get(5),"Fernando","(71) 55555-5555","fernando@email.com");
        editarListaDeProprietarios(listaDeApartamentos.get(6).getNumero(),listaDeProprietarios.get(6),"Graça","(71) 66666-6666","graca@email.com");
        editarListaDeProprietarios(listaDeApartamentos.get(7).getNumero(),listaDeProprietarios.get(7),"Hugo","(71) 77777-7777","hugo@email.com");
        editarListaDeProprietarios(listaDeApartamentos.get(8).getNumero(),listaDeProprietarios.get(8),"Igor","(71) 88888-8888","igor@email.com");
        editarListaDeProprietarios(listaDeApartamentos.get(9).getNumero(),listaDeProprietarios.get(9),"Júlia","(71) 99999-9999","julia@email.com");
    }
}
