package banco;

import modelos.apartamento.Apartamento;

import java.util.ArrayList;
import java.util.List;

public class DadosApartamentos {

    public List<Apartamento> listaDeApartamentos(){
    List<Apartamento> listaDeApartamentos = new ArrayList<>();

    listaDeApartamentos.add(new Apartamento("2","Amanda","(71) 00000-0000","amanda@email.com",false,true));
    listaDeApartamentos.add(new Apartamento("3","Beatriz","(71) 11111-1111","beatriz@email.com",false,true));
    listaDeApartamentos.add(new Apartamento("101","Carlos","(71) 22222-2222", "carlos@email.com",false,true));
    listaDeApartamentos.add(new Apartamento("102","Daniel","(71) 33333-3333","daniel@email.com",false,true));
    listaDeApartamentos.add(new Apartamento("103","Ester","(71) 44444-4444","ester@email.com",true,true));
    listaDeApartamentos.add(new Apartamento("104","Fernando","(71) 55555-5555","fernando@email.com",true,true));
    listaDeApartamentos.add(new Apartamento("201","Graça","(71) 66666-6666","graca@email.com",false,false));
    listaDeApartamentos.add(new Apartamento("202","Hugo","(71) 77777-7777","hugo@email.com",false,true));
    listaDeApartamentos.add(new Apartamento("203","Igor","(71) 88888-8888","igor@email.com",false,true));
    listaDeApartamentos.add(new Apartamento("204","Júlia","(71) 99999-9999","julia@email.com",true,true));

    return listaDeApartamentos;
    }
}
