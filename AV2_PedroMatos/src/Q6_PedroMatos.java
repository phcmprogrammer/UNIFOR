import java.util.Random;

public class Q6_PedroMatos{
	 public static void main(String[] args) {
	        int[][] matriz1 = gerarRandomMatriz(2, 3);             //gerarRandomMatriz(linhas, colunas)
	        int[][] matriz2 = gerarRandomMatriz(3, 4);

	        int[][] result = multiplicaMatrizes(matriz1, matriz2);     //método para multiplicar matrizes

	        System.out.println("Matriz 1:");
	        printMatriz(matriz1);                                    //método para printar matrizes

	        System.out.println("Matriz 2:");
	        printMatriz(matriz2);

	        System.out.println("Resultado:");
	        printMatriz(result);
	        
	    }

	    public static int[][] gerarRandomMatriz(int linhas, int colunas) {
	        int[][] matriz = new int[linhas][colunas];
	        Random random = new Random();

	        for (int i = 0; i < linhas; i++) {
	            for (int j = 0; j < colunas; j++) {                  //for para preencher matriz aleatoriamente
	                matriz[i][j] = random.nextInt(10);
	            }
	        }

	        return matriz;
	    }

	    public static int[][] multiplicaMatrizes(int[][] a, int[][] b) {
	        int linhasA = a.length; 
	        int colunasA = a[0].length;
	        int linhasB = b.length;
	        int colunasB = b[0].length;

	        if (colunasA != linhasB) {
	            throw new RuntimeException("Dimensões matriciais inválidas para multiplicação");
	        }

	        int[][] resultado = new int[linhasA][colunasB];

	        for (int i = 0; i < linhasA; i++) {
	            for (int j = 0; j < colunasB; j++) {
	                for (int k = 0; k < colunasA; k++) {
	                    resultado[i][j] += a[i][k] * b[k][j];
	                }
	            }
	        }

	        return resultado;
	    }

	    public static void printMatriz(int[][] matriz) {
	        for (int i = 0; i < matriz.length; i++) {
	            for (int j = 0; j < matriz[0].length; j++) {
	                System.out.print(matriz[i][j] + " ");
	            }
	            System.out.println();
	        }
	        System.out.println();
	    }
}