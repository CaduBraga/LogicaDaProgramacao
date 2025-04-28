import java.util.Scanner;

public class Atividade8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um número negativo: ");
		int numero = input.nextInt();
		do {
			System.out.println("Digite um negativo: ");
			numero = input.nextInt();
		} while (numero >=90);
		input.close();
	}
}