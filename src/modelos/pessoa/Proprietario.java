package modelos.pessoa;

public class Proprietario extends Pessoa {

    boolean possuiInquilino;

    public void editarPossuiInquilino(Proprietario proprietario){
        proprietario.setPossuiInquilino(!proprietario.isPossuiInquilino());
    }

    public Proprietario(String numeroDoApartamento) {
        super(numeroDoApartamento);
    }

    public boolean isPossuiInquilino() {
        return possuiInquilino;
    }

    public void setPossuiInquilino(boolean possuiInquilino) {
        this.possuiInquilino = possuiInquilino;
    }
}
