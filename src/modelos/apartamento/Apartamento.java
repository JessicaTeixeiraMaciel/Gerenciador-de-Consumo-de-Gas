package modelos.apartamento;

public class Apartamento {
    private String numero;
    private boolean possuiMedidorDeGas;

    public Apartamento(String numero, boolean possuiMedidorDeGas) {
        this.numero = numero;
        this.possuiMedidorDeGas = possuiMedidorDeGas;
    }

    public Apartamento() {
    }

    public void editarSituacaoDoApartamento(Apartamento apartamento){
        apartamento.setPossuiMedidorDeGas(!apartamento.isPossuiMedidorDeGas());
    }

    @Override
    public String toString() {
        return "Apartamento{" +
                "numero='" + numero + '\'' +
                ", possuiMedidorDeGas=" + possuiMedidorDeGas +
                '}';
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public boolean isPossuiMedidorDeGas() {
        return possuiMedidorDeGas;
    }

    public void setPossuiMedidorDeGas(boolean possuiMedidorDeGas) {
        this.possuiMedidorDeGas = possuiMedidorDeGas;
    }
}
