package sistemadegestaohoteleira;
public class Cliente extends Pessoa {
    private int codigo;
    private String contacto;
    private String email;
    private boolean activo;
    
    public Cliente(String nome,int codigo, int idade, char sexo, int nuit,String email,String contacto, 
            String Nacionalidade, String BI){
        super(nome,idade,sexo,nuit,Nacionalidade,BI);
        this.codigo = codigo;
        this.email = email;
        this.contacto = contacto;
        this.activo = true;
    }
    public int getCodigo() {
        return codigo;
    }

    public String getContacto() {
        return contacto;
    }

    public String getEmail() {
        return email;
    }

    public boolean getActivo() {
        return activo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
    
    
    
    
}
