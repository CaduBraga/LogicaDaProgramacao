import java.util.Scanner;

public class Questao2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		boolean continuar        = true;
		double  salarioTotal     = 0;
		double  maiorSalario     = Double.MIN_VALUE;
		int     user             = 1;
		int     salariosMenor100 = 0;
		int     totalFilhos      = 0;

		System.out.println("Bem vindo a pesquisa a de coleta de dados da prefeitura! Reponda as perguntas a seguir: ");

		do {
			System.out.printf("\nCidadão %d, digite o seu salário (números negativos encerrarão a pesquisa): ", user);
			double salarioDigitado = input.nextDouble();

			if (salarioDigitado < 0) {
				continuar = false;

			} else {
				salarioTotal += salarioDigitado;

				if (salarioDigitado > maiorSalario) {
					maiorSalario = salarioDigitado;
				}
				if (salarioDigitado <= 100) {
					salariosMenor100++;
				}
				System.out.printf("Cidadão %d, digite quantos filhos você tem: ", user);
				int filhosDigitado = input.nextInt();

				totalFilhos += (double) filhosDigitado;
				user++;
			}
		} while (continuar == true);

		user--;

		double mediaSalario = salarioTotal / (double) user;
		double mediaFilhos = (double) totalFilhos / (double) user;
		double percentualSalariosMenor100 = 100 * (double) salariosMenor100 / (double) user;

		System.out.printf("\nMédia do salário da população: R$%.2f",                        mediaSalario);
		System.out.printf("\nMédia de filhos da população: %.2f",                           mediaFilhos);
		System.out.printf("\nMaior salário: R$%.2f",                                        maiorSalario);
		System.out.println("\nPercentual de pessoas que ganham até R$100,00 de salário: " + percentualSalariosMenor100 + "%");

		input.close();
	}
}