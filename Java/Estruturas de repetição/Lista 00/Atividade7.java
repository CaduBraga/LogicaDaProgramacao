import java.util.Scanner;

public class Atividade7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um número entre 1 e 5: ");
		int numero = input.nextInt();
		do {
			System.out.println("Digite um entre 1 e 5: ");
			numero = input.nextInt();
		} while (numero < 1 || numero > 5);
		input.close();
	}
}