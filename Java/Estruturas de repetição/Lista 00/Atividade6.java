import java.util.Scanner;

public class Atividade6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um número maior ou igual a 10: ");
		int numero = input.nextInt();
		do {
			System.out.println("Digite um número maior ou igual a 10: ");
			numero = input.nextInt();
		} while (numero < 10);
		input.close();
	}
}