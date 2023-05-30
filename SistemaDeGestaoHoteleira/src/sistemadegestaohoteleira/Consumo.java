package sistemadegestaohoteleira;
import java.util.ArrayList;
public class Consumo {
    private Produto produto;
    private Reserva reserva;
    private int quantidade;

    public Consumo(Produto produto, Reserva reserva, int quantidade) {
        this.produto = produto;
        this.reserva = reserva;
        this.quantidade = quantidade;
    }
    
    
    public Produto getProduto() {
        return produto;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    
}
