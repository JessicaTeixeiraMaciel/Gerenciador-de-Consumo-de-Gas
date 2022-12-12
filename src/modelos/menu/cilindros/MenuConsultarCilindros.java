package modelos.menu.cilindros;

import modelos.apartamento.Apartamento;
import modelos.cilindro.Cilindro;
import modelos.menu.MenuInicial;
import modelos.pessoa.Inquilino;
import modelos.pessoa.Proprietario;

import java.text.NumberFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class MenuConsultarCilindros extends MenuInicial {
    DateTimeFormatter formatarData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    NumberFormat formatarValor = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));


    public void opcoesDoMenu(List<Cilindro> listaDeCilindros) {
        limparTela();
        imiprimirListaDeCilindros(listaDeCilindros);
    }

    public void imiprimirListaDeCilindros(List<Cilindro> listaDeCilindros){
        int i = listaDeCilindros.size();
        MenuConsultarCilindros menuConsultarCilindros = new MenuConsultarCilindros();
        menuConsultarCilindros.exibirDadosDosCilindro(listaDeCilindros.get(i-1));
        menuConsultarCilindros.exibirDadosDosCilindro(listaDeCilindros.get(i-2));
    }

    public void exibirDadosDosCilindro(Cilindro cilindro){
        textoAmarelo("Cilindro " + cilindro.getIdentificao());
        System.out.println("- Fornecedor: " + cilindro.getFornecedor());
        System.out.println("- Data da compra: " + cilindro.getDataDaCompra().format(formatarData));
        System.out.println("- Valor: " + formatarValor.format(cilindro.getValor())) ;
        System.out.println("- Status: " + cilindro.getStatus());
        if (cilindro.isFoiAberto()){
            System.out.println("- Data de abertura do cilindro: " + cilindro.getDataDeAbertura().format(formatarData));
            if (cilindro.isEstaVazio()){
                System.out.println("- Data de esgotamento: " + cilindro.getDataDeEsgotamento().format(formatarData));
            }
        }
        separador();
    }
}
