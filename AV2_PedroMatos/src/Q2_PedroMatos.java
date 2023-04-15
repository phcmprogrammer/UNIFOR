import java.util.Scanner;

public class Q2_PedroMatos{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int soma = 0;
		for ( int i = 0; i<n; i++) {
			int novoNumero = s.nextInt();
			soma= soma + novoNumero;
		}
		s.close();
		System.out.println(soma);
	}
}