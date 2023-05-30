package sistemadegestaohoteleira;
import java.io.*;
public class Validacao {
    
    public int validarInt(int min, int max, String msg)throws IOException{
        BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
        int resposta;
        do{
            resposta = Integer.parseInt(x.readLine());
            
        }while(resposta < min || resposta > max);
        return resposta;
    }
    
    public void validarFloat(float min, float max, String msg)throws IOException{
        BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
        float resposta;
        do{
            resposta = Float.parseFloat(x.readLine());
        }while(resposta < min || resposta > max);
    }
    
    public String validarString(String msg)throws IOException{
        BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
        String resp;
        resp = x.readLine();
        return resp;
    }
    public char validarChar(String msg)throws IOException{
        BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
        char resp;
        resp = x.readLine().charAt(0);
        return resp;
    }
}
