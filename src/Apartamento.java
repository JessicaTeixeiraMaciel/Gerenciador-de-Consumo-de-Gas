import java.util.Date;

public class Apartamento {
    private final int numeroApartamento;
    private String nomeProprietario;
    private int numeroContatoProprietario;
    private String emailProprietario;
    private Date dataEntradaProprietario;
    private boolean possuiMedidor;
    private boolean possuiInquilino;
    private String nomeInquilino;
    private int numeroContatoInquilino;
    private String emailInquilino;
    private Date dataEntradaInquilino;

    public Apartamento(int numeroApartamento, String nomeProprietario, int numeroContatoProprietario,
                       String emailProprietario, Date dataEntradaProprietario, boolean possuiMedidor,
                       boolean possuiInquilino) {
        this.numeroApartamento = numeroApartamento;
        this.nomeProprietario = nomeProprietario;
        this.numeroContatoProprietario = numeroContatoProprietario;
        this.emailProprietario = emailProprietario;
        this.dataEntradaProprietario = dataEntradaProprietario;
        this.possuiMedidor = possuiMedidor;
        this.possuiInquilino = possuiInquilino;
    }

    public Apartamento(int numeroApartamento, String nomeProprietario, int numeroContatoProprietario,
                       String emailProprietario, Date dataEntradaProprietario, boolean possuiMedidor,
                       boolean possuiInquilino, String nomeInquilino, int numeroContatoInquilino,
                       String emailInquilino, Date dataEntradaInquilino) {
        this.numeroApartamento = numeroApartamento;
        this.nomeProprietario = nomeProprietario;
        this.numeroContatoProprietario = numeroContatoProprietario;
        this.emailProprietario = emailProprietario;
        this.dataEntradaProprietario = dataEntradaProprietario;
        this.possuiMedidor = possuiMedidor;
        this.possuiInquilino = possuiInquilino;
        this.nomeInquilino = nomeInquilino;
        this.numeroContatoInquilino = numeroContatoInquilino;
        this.emailInquilino = emailInquilino;
        this.dataEntradaInquilino = dataEntradaInquilino;
    }

    public int getNumeroApartamento() {
        return numeroApartamento;
    }

    public String getNomeProprietario() {
        return nomeProprietario;
    }

    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }

    public int getNumeroContatoProprietario() {
        return numeroContatoProprietario;
    }

    public void setNumeroContatoProprietario(int numeroContatoProprietario) {
        this.numeroContatoProprietario = numeroContatoProprietario;
    }

    public String getEmailProprietario() {
        return emailProprietario;
    }

    public void setEmailProprietario(String emailProprietario) {
        this.emailProprietario = emailProprietario;
    }

    public Date getDataEntradaProprietario() {
        return dataEntradaProprietario;
    }

    public void setDataEntradaProprietario(Date dataEntradaProprietario) {
        this.dataEntradaProprietario = dataEntradaProprietario;
    }

    public boolean isPossuiMedidor() {
        return possuiMedidor;
    }

    public void setPossuiMedidor(boolean possuiMedidor) {
        this.possuiMedidor = possuiMedidor;
    }

    public boolean isPossuiInquilino() {
        return possuiInquilino;
    }

    public void setPossuiInquilino(boolean possuiInquilino) {
        this.possuiInquilino = possuiInquilino;
    }

    public String getNomeInquilino() {
        return nomeInquilino;
    }

    public void setNomeInquilino(String nomeInquilino) {
        this.nomeInquilino = nomeInquilino;
    }

    public int getNumeroContatoInquilino() {
        return numeroContatoInquilino;
    }

    public void setNumeroContatoInquilino(int numeroContatoInquilino) {
        this.numeroContatoInquilino = numeroContatoInquilino;
    }

    public String getEmailInquilino() {
        return emailInquilino;
    }

    public void setEmailInquilino(String emailInquilino) {
        this.emailInquilino = emailInquilino;
    }

    public Date getDataEntradaInquilino() {
        return dataEntradaInquilino;
    }

    public void setDataEntradaInquilino(Date dataEntradaInquilino) {
        this.dataEntradaInquilino = dataEntradaInquilino;
    }

    @Override
    public String toString() {
        return "Apartamento{" +
                "numeroApartamento=" + numeroApartamento +
                ", nomeProprietario='" + nomeProprietario + '\'' +
                ", numeroContatoProprietario=" + numeroContatoProprietario +
                ", emailProprietario='" + emailProprietario + '\'' +
                ", dataEntradaProprietario=" + dataEntradaProprietario +
                ", possuiMedidor=" + possuiMedidor +
                ", possuiInquilino=" + possuiInquilino +
                ", nomeInquilino='" + nomeInquilino + '\'' +
                ", numeroContatoInquilino=" + numeroContatoInquilino +
                ", emailInquilino='" + emailInquilino + '\'' +
                ", dataEntradaInquilino=" + dataEntradaInquilino +
                '}';
    }
}

