import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Q5_PedroMatos{
	public static void main(String[] args) {
        String nomeArquivo = "arquivo.txt";
        List<String> palavrasComLink = lerArquivoTexto(nomeArquivo);
        System.out.println(palavrasComLink);
    }

    public static List<String> lerArquivoTexto(String nomeArquivo) {
        List<String> palavrasComLink = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] palavras = linha.split("\\s+"); // separa as palavras na linha
                for (String palavra : palavras) {
                    if (palavra.contains("link")) { // verifica se a palavra contém a subcadeia "link"
                        palavrasComLink.add(palavra);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo: " + e.getMessage());
        }
        return palavrasComLink;
    }
}