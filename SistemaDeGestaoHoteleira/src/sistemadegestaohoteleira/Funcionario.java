package sistemadegestaohoteleira;
import java.util.ArrayList;
public class Funcionario extends Pessoa {
    private int codigo;
    private String contacto;
    private String senha;
    private String endereco;
    private String cargo;
    
    public Funcionario(String nome,String senha,int codigo,String cargo,String contacto,String BI,String Nacionalidade,char sexo, 
             String endereco
    ,int idade, int nuit){
        super(nome,idade,sexo,nuit,Nacionalidade,BI);
        this.codigo = codigo;
        this.senha = senha;
        this.cargo = cargo;
        this.contacto = contacto;
        this.endereco = endereco;
    
    } 
    public int getCodigo() {
        return codigo;
    }

    public String getContacto() {
        return contacto;
    }

    public String getSenha() {
        return senha;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    
    
}
