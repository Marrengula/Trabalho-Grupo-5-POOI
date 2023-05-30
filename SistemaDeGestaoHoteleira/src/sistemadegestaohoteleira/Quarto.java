package sistemadegestaohoteleira;
import java.util.ArrayList;
public class Quarto {
    private int codQuarto;
    private String TipoQuarto;
    private float preco;
    private boolean disponivel;
    private int numeroQuarto;

    public Quarto(int codQuarto, String TipoQuarto, float preco, boolean disponivel, int numeroQuarto) {
        this.codQuarto = codQuarto;
        this.TipoQuarto = TipoQuarto;
        this.preco = preco;
        this.disponivel = disponivel;
        this.numeroQuarto = numeroQuarto;
    }
    
    
    public int getCodQuarto() {
        return codQuarto;
    }

    public String getTipoQuarto() {
        return TipoQuarto;
    }

    public float getPreco() {
        return preco;
    }

    public boolean getDisponivel() {
        return disponivel;
    }

    public int getNumeroQuarto() {
        return numeroQuarto;
    }

    public void setCodQuarto(int codQuarto) {
        this.codQuarto = codQuarto;
    }

    public void setTipoQuarto(String TipoQuarto) {
        this.TipoQuarto = TipoQuarto;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void setNumeroQuarto(int numeroQuarto) {
        this.numeroQuarto = numeroQuarto;
    }
    
    
    
    
}
