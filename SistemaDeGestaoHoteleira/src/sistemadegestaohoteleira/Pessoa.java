package sistemadegestaohoteleira;
public class Pessoa {
    private String nome;
    private int idade;
    private char sexo;
    private String nacionalidade;
    private String BI;

    public Pessoa (String nome,int idade, char sexo, int nuit, String Nacionalidade,String BI){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.nacionalidade = Nacionalidade;
        this.BI = BI;
    }
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public char getSexo() {
        return sexo;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public String getBI() {
        return BI;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public void setBI(String BI) {
        this.BI = BI;
    }
    
    
    
}
