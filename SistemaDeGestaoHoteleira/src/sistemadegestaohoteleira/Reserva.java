package sistemadegestaohoteleira;
import java.util.Date;
import java.util.ArrayList;
public class Reserva {
    private int codReserva;
    private Cliente cliente;
    private Quarto quarto;
    private Date dataEntrda;
    private Date dataSaida;

    public Reserva(int codReserva, Cliente cliente, Quarto quarto, Date dataEntrda, Date dataSaida) {
        this.codReserva = codReserva;
        this.cliente = cliente;
        this.quarto = quarto;
        this.dataEntrda = dataEntrda;
        this.dataSaida = dataSaida;
    }

   
    public int getCodReserva() {
        return codReserva;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public Date getDataEntrda() {
        return dataEntrda;
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public void setCodReserva(int codReserva) {
        this.codReserva = codReserva;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    public void setDataEntrda(Date dataEntrda) {
        this.dataEntrda = dataEntrda;
    }

    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }
    
    
    
    
}
