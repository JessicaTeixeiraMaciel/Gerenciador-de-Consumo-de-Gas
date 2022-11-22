import banco.DadosApartamentos;
import servicos.ApartamentoService;
import servicos.MenuService;

public class Main {

    public static void main(String[] args) {
        MenuService menuService = new MenuService();

        menuService.menuInicial();
    }
}
