import java.util.Date;

public class Medidor {
    private int numeroApartamento;
    private Date dataMedicao;
    private double valorMedicao;

    public Medidor(int numeroApartamento, Date dataMedicao, double valorMedicao) {
        this.numeroApartamento = numeroApartamento;
        this.dataMedicao = dataMedicao;
        this.valorMedicao = valorMedicao;
    }

    public int getNumeroApartamento() {
        return numeroApartamento;
    }

    public void setNumeroApartamento(int numeroApartamento) {
        this.numeroApartamento = numeroApartamento;
    }

    public Date getDataMedicao() {
        return dataMedicao;
    }

    public void setDataMedicao(Date dataMedicao) {
        this.dataMedicao = dataMedicao;
    }

    public double getValorMedicao() {
        return valorMedicao;
    }

    public void setValorMedicao(double valorMedicao) {
        this.valorMedicao = valorMedicao;
    }

    @Override
    public String toString() {
        return "Medidor{" +
                "numeroApartamento=" + numeroApartamento +
                ", dataMedicao=" + dataMedicao +
                ", valorMedicao=" + valorMedicao +
                '}';
    }
}
