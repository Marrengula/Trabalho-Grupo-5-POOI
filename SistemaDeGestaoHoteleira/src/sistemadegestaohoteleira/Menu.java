package sistemadegestaohoteleira;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.io.*;
import java.text.DateFormat;
public class Menu {
    private Login login;
    private ArrayList <Cliente> clientes;
    private ArrayList<Produto> produto;
    private ArrayList<Reserva> reserva;
    private ArrayList<Consumo> consumo;
    private ArrayList<Quarto> quarto;
    private ArrayList<Funcionario> funcionario;
    private Validacao validacao;
    
    public void Menu(){
        clientes = new ArrayList<>();
        produto = new ArrayList<>();
        reserva = new ArrayList<>();
        consumo = new ArrayList<>();
        quarto = new ArrayList<>();
        funcionario = new ArrayList<>();
    }
    public void exibibirMenu()throws IOException{
        BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Seja Bem vindo ao sistema de gestao hoteleira");
         login = new Login();
         // Pedir credenciais para o login
         while(true){
             String nome = new Validacao().validarString("Digite o nome");
             String senha = new Validacao().validarString("Digite o nome");
             
             // Verificar credenciais do usuario
             if(!login.fazerLogin(nome, senha)){
                 System.out.println("Usuario ou senha inavalidas. Tente novamente");
                 continue;
             }
             System.out.println("Login bem sucedido");
             break;
         }
         
         int opcao = -1;
         
         while(opcao != 0){
             System.out.println(" =======Menu=======");
             System.out.println("1 - Cadastrar Cliente");
             System.out.println("2 - Fazer reserva ");
             System.out.println("3 - Consltar status do cliente");
             System.out.println("4 - Alterar Cliente");
             System.out.println("5 - Excluir cliente");
             opcao = Integer.parseInt(x.readLine());
             
             switch(opcao){
                 case 1: 
                     registarCliente();
                     break;
                 case 2:
                     fazerReserva();
                     break;
                 case 3: 
                     consultarStatusCliente();
                     break;
                 case 4:
                     alterarCliente();
                     break;
                 case 5:
                     ExcluirCliente();
                     break;
                 default: System.out.println("Opcao nao valida");
             }
         }
    }
    
    public void registarCliente()throws IOException{
        BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Quantos clientes deseja cadastrar?");
        int q = Integer.parseInt(x.readLine());
        try(FileWriter writer = new FileWriter("BD.txt", true)){
        for(int i = 0; i < q; i++){
            System.out.println("-------- Cadastro de Cliente" + (i + 1)+ " --------");
            String nome = new Validacao().validarString("Digite o nome");
            int codigo = new Validacao().validarInt(1000, 10000,"Digite o codigo");
            int idade = new Validacao().validarInt(18, 99 , "Digite a idade");
            char sexo = new Validacao().validarChar("Digite o sexo");
            int nuit = new Validacao().validarInt(1, 2222, "Digite o numero de nuit");
            String email = new Validacao().validarString("Digite o email");
            String contacto = new Validacao().validarString("Digite o contacto");
            String Nacionalidade = new Validacao().validarString("Digite a nacionalidae");
            String BI = new Validacao().validarString("Digite o numero de BI");
            
            Cliente cliente = new Cliente(nome,codigo,idade,sexo,nuit,email,contacto,Nacionalidade,BI);
            clientes.add(cliente);
            
            writer.write(cliente.getNome()+ "\n");
            writer.write(cliente.getCodigo()+ "\n");
            writer.write(cliente.getIdade()+ "\n");
            writer.write(cliente.getSexo()+ "\n");
            writer.write(contacto);
            writer.write(Nacionalidade);
            writer.write(cliente.getBI()+ "\n");//Separador entre registros
            System.out.println("Cliente registrado com sucesso");
        }
    }catch(IOException e){
                System.out.println("Erro");
        }
    }
    public void fazerReserva()throws IOException{
        BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
        //Selecionar Cliente
        System.out.println("----- Fazer Reserva -----");
        System.out.println("Clientes Disponiveis ");
        for(int i = 0; i < clientes.size(); i++){
            System.out.println((i + 1)+ ". " + clientes.get(i).getNome());
        }
        System.out.println("Selecione o cliente");
        int clienteIndex = new Validacao().validarInt(1,100,"Selecione o cliente");
        Cliente cliente = clientes.get(clienteIndex - 1);
        //Selecionar quarto
        System.out.println("Quaros disponiveis");
        for(int i = 0; i < quarto.size(); i++){
            System.out.println((i + 1)+". " + quarto.get(i).getNumeroQuarto());
        }
        //Selecionar Quarto
        int quartoIndex = new Validacao().validarInt(1, 100, "Selecione o quarto");
        Quarto quartos = quarto.get(quartoIndex - 1);
        //Criar a reserva
        int codReserva = new Validacao().validarInt(1, 2222,"Digite o codigo da reserva");
        String dataCheckin = new Validacao().validarString("Data de Checkin (dd/mm/aaaa)");
        String dataCheckout = new Validacao().validarString("Data de Checkout (dd/mm/aaaa)");
        DateFormat formatoData = new SimpleDateFormat("dd/MM/aaaa");
        Date dataCheckini;
        Date dataCheckouti;
        try{
            dataCheckini = formatoData.parse(dataCheckin);
            dataCheckouti = formatoData.parse(dataCheckout);
            Reserva reserva = new Reserva(codReserva, cliente, quartos, dataCheckini, dataCheckouti);
            System.out.println("Resrva efectuada com sucesso");
        }catch(ParseException e){
            System.out.println("Erro ao coverter a data " + e.getMessage());
        }
    }
    public void consultarStatusCliente()throws IOException{
        BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
        //Selecionar cliente
        System.out.println("Cliente");
        System.out.println("Clientes disponiveis");
        for(int i = 0; i < clientes.size(); i++){
            System.out.println((i + 1)+". " + quarto.get(i).getNumeroQuarto());
        }
        System.out.println("Selecione o cliente");
        int clienteIndex = new Validacao().validarInt(1,100,"Selecione o cliente");
        Cliente cliente = clientes.get(clienteIndex - 1);
        //Satus do cliente
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Status reserrva: " + cliente.getActivo());
        System.out.println("Idade :" + cliente.getIdade());
        System.out.println("Sexo: " + cliente.getSexo());
        System.out.println("Codigo: " + cliente.getCodigo());
    }
    public void alterarCliente()throws IOException{
        BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
         //Selecionar cliente
        System.out.println("Cliente");
        System.out.println("Clientes disponiveis");
        for(int i = 0; i < clientes.size(); i++){
            System.out.println((i + 1)+". " + quarto.get(i).getNumeroQuarto());
        }
        System.out.println("Selecione o cliente");
        int clienteIndex = new Validacao().validarInt(1,100,"Selecione o cliente");
        Cliente cliente = clientes.get(clienteIndex - 1);
        //Obter novos dados do cliente
        String nome1 = new Validacao().validarString("Digite o nome");
            int codigo1 = new Validacao().validarInt(1000, 10000,"Digite o codigo");
            int idade1 = new Validacao().validarInt(18, 99 , "Digite a idade");
            char sexo1 = new Validacao().validarChar("Digite o sexo");
            int nuit1 = new Validacao().validarInt(1, 2222, "Digite o numero de nuit");
            String email1 = new Validacao().validarString("Digite o email");
            String contacto1 = new Validacao().validarString("Digite o contacto");
            String Nacionalidade1 = new Validacao().validarString("Digite a nacionalidae");
            String BI1 = new Validacao().validarString("Digite o numero de BI");
            //Actualizar dados do cliente
            cliente.setNome(nome1);
            cliente.setCodigo(codigo1);
            cliente.setIdade(idade1);
            cliente.setSexo(sexo1);
            cliente.setBI(BI1);
            cliente.setEmail(email1);
            
        
    }
    public void ExcluirCliente()throws IOException{
         BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
         //Selecionar cliente
        System.out.println("Cliente");
        System.out.println("Clientes disponiveis");
        for(int i = 0; i < clientes.size(); i++){
            System.out.println((i + 1)+". " + quarto.get(i).getNumeroQuarto());
        }
        System.out.println("Selecione o cliente");
        int clienteIndex = new Validacao().validarInt(1,100,"Selecione o cliente");
        Cliente cliente = clientes.get(clienteIndex - 1);
        // Remover cliente da lista
        clientes.remove(cliente);
        System.out.println("Cliente removido com sucesso");
    }
}
