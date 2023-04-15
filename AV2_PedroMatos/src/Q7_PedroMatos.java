import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Q7_PedroMatos{
	public static void main(String[] args) {
        // especifica o caminho do arquivo
        String filePath = "/path_do_arquivo.txt";
        
        // cria um objeto File com o caminho especificado
        File file = new File(filePath);
        
        try {
            // cria um scanner para ler o conteúdo do arquivo
            Scanner leitor = new Scanner(file);
            
            int soma = 0;
            
            // lê cada número do arquivo e adiciona à variável soma
            while (leitor.hasNextInt()) {
                int numero = leitor.nextInt();
                soma += numero;
            }
            
            // exibe a soma dos números
            System.out.println("A soma dos números é: " + soma);
            
            // fecha o scanner
            leitor.close();
            
        } catch (IOException e) {
            // trata o erro caso o arquivo não seja encontrado
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
        
    }
}