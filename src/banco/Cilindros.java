package banco;

import modelos.cilindro.Cilindro;
import modelos.fornecedor.Fornecedor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Cilindros {
    public List<Fornecedor> listaDeFornecedores(){
        List<Fornecedor> listaDeFornecedores = new ArrayList<>();
        listaDeFornecedores.add(new Fornecedor("Brasil Gás","(71) 3333-3333","Rua do gás, 250"));
        listaDeFornecedores.add(new Fornecedor("Nacional Gás","(71) 4444-4444","Rua do botijão, 45"));
        return listaDeFornecedores;
    }

    public List<Cilindro> listaDeCilindros(){
        List<Cilindro> listaDeCilindros = new ArrayList<>();
        listaDeCilindros.add(new Cilindro("Esquerdo",listaDeFornecedores().get(0).getNome(), LocalDate.of(2022,8,25),BigDecimal.valueOf(490.00),"Vazio",LocalDate.of(2022,9,5),LocalDate.of(2022,11,20),true,true));
        listaDeCilindros.add(new Cilindro("Direito",listaDeFornecedores().get(1).getNome(), LocalDate.of(2022,10,30),BigDecimal.valueOf(510.00),"Em uso",LocalDate.of(2022,11,20),null,true,false));
        return listaDeCilindros;
    }
}
