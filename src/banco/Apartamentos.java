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


    public List<Apartamento> listaDeApartamentos(){
        List<Apartamento> listaDeApartamentos = new ArrayList<>();

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

    public List<Proprietario> listaDeProprietarios(){
        atualizacaoDeDados();
        return listaDeProprietarios;
    }

    public List<Inquilino> listaDeInquilinos(){
        atualizarDadosInquilino();
        return listaDeInquilinos;
    }

    public void adicionarResponsaveis(List<Apartamento> listaDeApartamentos){
        for (Apartamento apartamento : listaDeApartamentos) {
            listaDeProprietarios.add(new Proprietario(apartamento.getNumero()));
            listaDeInquilinos.add(new Inquilino(apartamento.getNumero()));
        }
    }

    public void atualizacaoDeDados(){
        adicionarResponsaveis(listaDeApartamentos());

        editarListaDeProprietarios(listaDeProprietarios.get(0),"Amanda","(71) 00000-0000","amanda@email.com",false);
        editarListaDeProprietarios(listaDeProprietarios.get(1),"Beatriz","(71) 11111-1111","beatriz@email.com",true);
        editarListaDeProprietarios(listaDeProprietarios.get(2),"Carlos","(71) 22222-2222", "carlos@email.com",false);
        editarListaDeProprietarios(listaDeProprietarios.get(3),"Daniel","(71) 33333-3333","daniel@email.com",false);
        editarListaDeProprietarios(listaDeProprietarios.get(4),"Ester","(71) 44444-4444","ester@email.com",true);
        editarListaDeProprietarios(listaDeProprietarios.get(5),"Fernando","(71) 55555-5555","fernando@email.com",true);
        editarListaDeProprietarios(listaDeProprietarios.get(6),"Graça","(71) 66666-6666","graca@email.com",false);
        editarListaDeProprietarios(listaDeProprietarios.get(7),"Hugo","(71) 77777-7777","hugo@email.com",false);
        editarListaDeProprietarios(listaDeProprietarios.get(8),"Igor","(71) 88888-8888","igor@email.com",false);
        editarListaDeProprietarios(listaDeProprietarios.get(9),"Júlia","(71) 99999-9999","julia@email.com",false);
    }

    public void atualizarDadosInquilino(){
        editarListaDeInquilinos(listaDeInquilinos.get(1),"Fulano","(71) 10101-1010","fulana@email.com");
        editarListaDeInquilinos(listaDeInquilinos.get(4),"Cicrana","(71) 20202-2020","cicrana@email.com");
        editarListaDeInquilinos(listaDeInquilinos.get(5),"Beltrano","(71) 20202-2020","beltrano@email.com");
    }

    public void editarListaDeProprietarios(Proprietario proprietario, String nome, String numero, String email,boolean possuiInquilino){
        proprietario.setNome(nome);
        proprietario.setNumeroDeContato(numero);
        proprietario.setEmail(email);
        proprietario.setPossuiInquilino(possuiInquilino);
    }

    public void editarListaDeInquilinos(Inquilino inquilino, String nome, String numero, String email){
        inquilino.setNome(nome);
        inquilino.setNumeroDeContato(numero);
        inquilino.setEmail(email);
    }
}
