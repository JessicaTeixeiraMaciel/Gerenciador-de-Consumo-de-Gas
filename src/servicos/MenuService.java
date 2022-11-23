package servicos;

import banco.DadosApartamentos;
import modelos.apartamento.Apartamento;
import modelos.pessoa.Inquilino;
import modelos.pessoa.Proprietario;

import java.util.*;

public class MenuService {

    DadosApartamentos dadosApartamentos = new DadosApartamentos();
    ApartamentoService apartamentoService = new ApartamentoService();
    Proprietario proprietario = new Proprietario();
    Inquilino inquilino = new Inquilino();
    List<Apartamento> listaDeApartamentos = new ArrayList<>(dadosApartamentos.listaDeApartamentos());
    String escolha;
    Apartamento apartamento;
    String ANSI_RESET = "\u001B[0m";
    String ANSI_VERMELHO = "\u001B[31m";
    String ANSI_CIANO = "\u001B[36m";
    String ANSI_AMARELO = "\u001B[33m";
    String ANSI_CINZA = "\u001B[37m";


    public static void limparTela(){
        for (int i = 0; i < 50; i++){
            System.out.println("\n");
        }
    }

    public void boasVindas(){
        limparTela();
        System.out.println("Seja bem vindo ao gerenciador de consumo de gás do condomínio \n" + ANSI_CIANO +
                "  ____                           _                                               _                \n" +
                " |  _ \\    ___   ___            | |   __ _    ___    __ _   _ __    ___    ___  (_)   ___    __ _ \n" +
                " | |_) |  / _ \\ / __|        _  | |  / _` |  / __|  / _` | | '__|  / _ \\  / __| | |  / __|  / _` |\n" +
                " |  _ <  |  __/ \\__ \\  _    | |_| | | (_| | | (__  | (_| | | |    |  __/ | (__  | | | (__  | (_| |\n" +
                " |_| \\_\\  \\___| |___/ (_)    \\___/   \\__,_|  \\___|  \\__,_| |_|     \\___|  \\___| |_|  \\___|  \\__,_|\n\n" + ANSI_RESET);
    }

    public void menuInicial(){
        List<String> listaDeOpcoes = new ArrayList<>();
        listaDeOpcoes.add("Consultar dados dos apartamentos");
        listaDeOpcoes.add("Consultar trocas de cilindros");
        listaDeOpcoes.add("Consultar Lista de Fornecedores");
        listaDeOpcoes.add("Sair");
        boasVindas();
        do {
            System.out.println("O que deseja fazer?");
            imprimirListaDeOpcoes(listaDeOpcoes);

        } while (validarEscolha(opcaoEnumerada(listaDeOpcoes)));

        switch (escolha.toLowerCase()){
            case "1":
                menuApartamento();
                break;
            case "2":
            case "3":
            case "4":
                sairDoSistema();
                break;
        }
    }

    public void menuApartamento(){
        limparTela();
        List<String> apartamentos = new ArrayList<>();
        for (Apartamento apartamento : listaDeApartamentos){
            apartamentos.add(apartamento.getIdentificacaoDoApartamento());
        }
        do {
            System.out.println(ANSI_AMARELO + "CONSULTAR DADOS DOS APARTAMENTOS" + ANSI_RESET);
            System.out.print("Insira o número do apartamento que deseja consultar (");
            System.out.println(apartamentos.toString().replace("[","").replace("]","") + ")");
            System.out.println("Ou digite 'v' para voltar ao menu anterior.");
        } while (validarEscolha(apartamentos));

        if (escolha.equals("V") || escolha.equals("v")){
            menuInicial();
        } else {
            limparTela();
            Apartamento apartamentoSelecionado = null;

            for (Apartamento apartamento : listaDeApartamentos){
                if (apartamento.getIdentificacaoDoApartamento().equals(escolha)){
                    apartamentoSelecionado = apartamento;
                }
            }
            assert apartamentoSelecionado != null;
            apartamento = apartamentoSelecionado;
            menuEditarApartamento();


        }
    }

    public void menuEditarApartamento (){
        apartamentoService.dadosApartamento(apartamento);
        opcoesEditarVoltarMenuApartamento();
    }

    public boolean validarEscolha (List<String> listaDeOpcoes){
        System.out.println(ANSI_CIANO + "Informe sua opção aqui:" + ANSI_RESET);
        Scanner sc = new Scanner(System.in);
        escolha = sc.next();
        if (!listaDeOpcoes.contains(escolha)){
            System.out.println(ANSI_VERMELHO + "Entrada inválida! Tente Novamente.\n" + ANSI_RESET);
        }
        return !listaDeOpcoes.contains(escolha);
    }

    public boolean entradaInvalida (List<String> listaDeOpcoes){
        System.out.println(ANSI_CIANO + "Informe sua opção aqui:" + ANSI_RESET);
        Scanner sc = new Scanner(System.in);
        escolha = sc.next();
        if (!listaDeOpcoes.contains(escolha)){
            System.out.println(ANSI_VERMELHO + "Entrada inválida! Tente Novamente.\n" + ANSI_RESET);
        }
        return !listaDeOpcoes.contains(escolha);
    }

    public void imprimirListaDeOpcoes (List<String> listaDeOpcoes){
        int i = 1;
        for (String opcao : listaDeOpcoes){
            System.out.println(i + " - " + opcao);
            i++;
        }
    }

    public List<String> opcaoEnumerada (List<String> listaDeOpcoes){
        List<String> enumeracao = new ArrayList<>();
        int i = 1;
        for (String ignored : listaDeOpcoes){
            enumeracao.add(String.valueOf(i));
            i++;
        }
        return enumeracao;
    }

    public void sairDoSistema (){
        System.out.println("Tchau! Até a próxima! :)");
    }

    public void opcoesEditarVoltarMenuApartamento(){
        System.out.println(ANSI_AMARELO + "Insira 'e' para editar os dados ou qualquer outro digito para voltar ao menu anterior." + ANSI_RESET);
        List<String> listaDeOpcoes = new ArrayList<>();
        listaDeOpcoes.add("v");
        listaDeOpcoes.add("V");
        listaDeOpcoes.add("e");
        listaDeOpcoes.add("E");
        validarEscolha(listaDeOpcoes);
        switch (escolha.toLowerCase()){
            case "v":
                menuApartamento();
                break;
            case "e":
                editarDadosApartamento(apartamento);
                break;
        }
    }

    public void editarDadosApartamento(Apartamento apartamento){
        List<String> listaDeOpcoes = new ArrayList<>();
        listaDeOpcoes.add("Situação do apartamento");
        listaDeOpcoes.add("Responsável pelo apartamento");
        listaDeOpcoes.add("Nome do proprietário");
        listaDeOpcoes.add("Celular do priprietário");
        listaDeOpcoes.add("Email do proprietário");

        if (apartamento.isPossuiInquilino()){
            listaDeOpcoes.add("Nome do inquilino");
            listaDeOpcoes.add("Celular do inquilino");
            listaDeOpcoes.add("Email do inquilino");
        }

        separador();
        do {
            limparTela();
            System.out.println(ANSI_AMARELO + "Selecione qual dado do APARTAMENTO " + apartamento.getIdentificacaoDoApartamento() + " deseja atualizar: " + ANSI_RESET);
            imprimirListaDeOpcoes(listaDeOpcoes);
        } while (validarEscolha(opcaoEnumerada(listaDeOpcoes)));

        switch (escolha){
            case "1":
                do {
                    menuSituacaoApartamento();
                }while (validarEscolha(opcaoSimNao()));
                if (escolha.equals("n") || escolha.equals("N")){
                    System.out.println("Nenhuma alteração foi feita.");
                } else {
                    apartamento.editarSituacaoDoApartamento(apartamento);
                    System.out.println("Alteração salva com sucesso!");
                }
                break;
            case "2":
                do {
                    menuPossuiInquilino();
                }while (validarEscolha(opcaoSimNao()));
                if (escolha.equals("n") || escolha.equals("N")){
                    System.out.println("Nenhuma alteração foi feita.");
                } else {
                    apartamento.editarResponsavelPeloApartamento(apartamento);
                    System.out.println("Alteração salva com sucesso!");
                }
                break;
            case "3":
                proprietario.editarNome(apartamento);
                break;
            case "4":
                proprietario.editarNumeroContato(apartamento);
                break;
            case "5":
                proprietario.editarEmail(apartamento);
                break;
            case"6":
                inquilino.editarNome(apartamento);
                break;
            case "7":
                inquilino.editarNumeroContato(apartamento);
                break;
            case "8":
                inquilino.editarEmail(apartamento);
                break;
        }
        menuContinuarEditando();
    }

    public List<String> opcaoSimNao (){
        List<String> listaDeOpcoes = new ArrayList<>();
        listaDeOpcoes.add("s");
        listaDeOpcoes.add("S");
        listaDeOpcoes.add("n");
        listaDeOpcoes.add("N");
        return listaDeOpcoes;
    }

    public void menuSituacaoApartamento(){
        boolean possuiMedidor = apartamento.isPossuiMedidorDeGas();
        if (possuiMedidor){
            System.out.println("Deseja mudar a situação do apartamento para 'Não possui medidor de gás'? (s/n)");
        }else {
            System.out.println("Deseja mudar a situação do apartamento para 'Possui medidor de gás'? (s/n)");
        }
    }

    public void menuPossuiInquilino(){
        boolean possuiInquilino = apartamento.isPossuiInquilino();
        if (possuiInquilino){
            System.out.println("Deseja mudar o responsável do imóvel para 'Proprietário'? (s/n)");
        }else {
            System.out.println("Deseja mudar o responsável do imóvel para 'Inquilino'? (s/n)");
        }
    }

    public void menuContinuarEditando (){
        Scanner sc = new Scanner(System.in);
        System.out.println(ANSI_AMARELO + "Insira 'c' para continuar editando ou qualquer outro digito para sair do modo de edição." + ANSI_RESET);
        escolha = sc.next();
        if ("c".equals(escolha) || "C".equals(escolha)) {
            editarDadosApartamento(apartamento);
        } else {
            limparTela();
            menuEditarApartamento();
        }

    }

    public void separador(){
        System.out.println(ANSI_CINZA + "---------------------------------------------------------------------------" + ANSI_RESET);
    }

}
