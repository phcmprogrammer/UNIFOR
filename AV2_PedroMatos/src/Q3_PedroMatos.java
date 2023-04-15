import java.util.Scanner;

public class Q3_PedroMatos {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int soma = 0;
		for (int i = 1; i <= n; i++) {
			soma = soma + i;
		}
		s.close();
		System.out.println(soma);
	}
}