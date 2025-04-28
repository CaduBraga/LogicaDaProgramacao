import java.util.Scanner;

class Atividade1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int quantidade = 0;

		for (int i = 1; i <= 80; i++) {

			System.out.print("Digite o " + i + "º número: ");
			int numero = input.nextInt();

			if (numero >= 10 && numero <= 150) {
				quantidade++;
			}
		}
		System.out.print("Dentre os números digitados, " + quantidade + " estão no intervalo entre 10 e 150.");
		input.close();
	}
}