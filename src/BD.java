
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Victor Soares Vilela
 */
public class BD {

    public static String LerBD(String Caminho) {
        String conteudo = "";
        try {
            FileReader arquivo = new FileReader(Caminho);
            BufferedReader lerArquivo = new BufferedReader(arquivo);
            String linha = "";
            try {
                linha = lerArquivo.readLine();
                while (linha != null) {
                    conteudo += linha;
                    linha = lerArquivo.readLine();
                }
                arquivo.close();

            } catch (IOException ex) {
                conteudo = "Erro: Não foi possível ler o banco de dados";
            }
        } catch (FileNotFoundException ex) {
            conteudo = "Erro: Banco de Dados não encontrado!";
        }
        if (conteudo.contains("Erro")) {
            return "";
        } else {
            return conteudo;
        }
    }
    
    public static boolean EnviarBD(String Caminho, String Texto){
        try {
            FileWriter arquivo = new FileWriter(Caminho);
            PrintWriter gravarArquivo = new PrintWriter(arquivo);
            gravarArquivo.println(Texto);
            gravarArquivo.close();
            return true;
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return false;
        }
        
    }
    

}
