package sistemadegestaohoteleira;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
public class Login {
        private List<Funcionario> funcionarios;
        private Funcionario f;
        
        public Login()throws IOException{
          // Cria uma lista vazia para armazenar os funcionarios
          this.funcionarios = new ArrayList<>();
          
          //Abre o arquivo de texto com as informações do funcionario
          FileReader fw = new FileReader("Funcionarios.txt");
          BufferedReader bw = new BufferedReader(fw);
          int i = 0;
          //Le as linhas do arquivo
          String linha;
          while((linha = bw.readLine()) != null){
              //Separa as informacoes do funionario
              StringTokenizer token = new StringTokenizer(linha,";");
              String nome = token.nextToken();
              String senha = token.nextToken();
              int codigo = Integer.parseInt(token.nextToken());
              String cargo = token.nextToken();
              String contacto = token.nextToken();
              String BI = token.nextToken();
              String Nacionalidade = token.nextToken();
              char sexo = token.nextToken().charAt(0);
              String endereco = token.nextToken();
              int idade = Integer.parseInt(token.nextToken());
              int nuit = Integer.parseInt(token.nextToken());
              f = new Funcionario(nome, senha,codigo,cargo,contacto,BI,Nacionalidade, sexo, endereco, idade,nuit);
              funcionarios.add(f);
          }
          bw.close();
          fw.close();
        }
        
        public boolean fazerLogin(String nome, String senha){
            //Loop para verificar se o nome e a senha informados existem na lista de funcionarios
            for(Funcionario funcionario : funcionarios){
                if(funcionario.getNome().equals(nome) && funcionario.getSenha().equals(senha)){
                    System.out.println("Login efectuado com sucesso");
                    return true;
                }
                
            }
            System.out.println("Usuario ou senha invalidas");
                return false; 
        }
    
}
