import java.util.Scanner;

class Atividade2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int homens = 0;
		int mulheres = 0;

		for (int total = 0; total < 56;) {

			System.out.print("Digite o seu nome: ");
			String nome = input.nextLine();

			System.out.print("Digite o seu sexo (M ou F): ");
			char sexo = input.next().charAt(0);

			input.nextLine();

			if (sexo == 'M') {
				homens++;
			} else if (sexo == 'F') {
				mulheres++;
			} else {
				System.out.println("Sexo inválido. Digite M ou F!");
			}
			total = homens + mulheres;
		}
		System.out.print("Total de homens: " + homens + "\nTotal de mulheres: " + mulheres);
		input.close();
	}
}