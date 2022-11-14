import Conexoes.ConexaoSQLite;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Servico {
    ConexaoSQLite conexaoSQLite = new ConexaoSQLite();
    Scanner sc = new Scanner(System.in);


    public void limpaTela(){
        for (int i = 0; i < 50; i++){
            System.out.println("\n");
        }
    }
    public void boasVindas(){
        limpaTela();
        System.out.println("Bem vindo(a) ao gerenciador de consumo de gás do Condomínio Residencial Jacarecica!\n");
        System.out.println("O que deseja consultar?\n" +
                "1 - Dados dos apartamentos\n" +
                "2 - Registro de trocas de Cilindros\n" +
                "3 - Lista de fornecedores");
        System.out.println("Insira sua opção aqui:");
        int opcaoEscolhida = sc.nextInt();
        switch (opcaoEscolhida){
            case 1: numerosApartamentos();
            return;
        }
    }
    //hilhlkhjklhjlkjkhg
    public void numerosApartamentos(){
        limpaTela();
        System.out.println("Informe o número do apartamento que deseja consultar:");
        sc.nextInt();
    }
}
