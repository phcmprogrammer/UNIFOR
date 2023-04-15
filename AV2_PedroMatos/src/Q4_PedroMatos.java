import java.util.Scanner;

public class Q4_PedroMatos {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("Digite uma string: ");
		String str = s.nextLine();
		String[] tokens = str.split(" ");

		System.out.print("Tokens que comecam com a letra 's': ");
		for (String token : tokens) {
			if (token.startsWith("s") || token.startsWith("S")) {
				System.out.print(token + " ");
			}
		}

	}
}