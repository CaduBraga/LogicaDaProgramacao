import java.util.Scanner;

public class Questao6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int total     = 0;
		int positivas = 0;
		int neutras   = 0;
		int negativas = 0;

		System.out.println("Seja bem vindo(a) ao sistema de avaliação do setor da recepção da WEG!");
		System.out.println("Avalie-nos:");
		System.out.println("1 - Muito insatisfeito");
		System.out.println("2 - Insatisfeito");
		System.out.println("3 - Neutro");
		System.out.println("4 - Satisfeito");
		System.out.println("5 - Muito satisfeito");

		System.out.print("\nDigite a quantidade de usuários que irão avaliar a recepção: ");
		int quantidade = input.nextInt();

		for (int i = 1; i <= quantidade; i++) {

			System.out.printf("\nUsuário %d, digite a nota da sua avaliacao: ", i);
			int avaliacao = input.nextInt();

			total += avaliacao;

			if (avaliacao == 1 || avaliacao == 2) {
				negativas++;
			} else if (avaliacao == 3) {
				neutras++;
			} else if (avaliacao == 4 || avaliacao == 5) {
				positivas++;
			} else {
				System.out.print("O número digitado é inválido! Digite uma nota entre 1 e 5.");
				i--;
				total -= avaliacao;
			}

		}

		double media = (double) total / quantidade;

		System.out.printf("\nMédia das avaliações: %.2f",         media);
		System.out.printf("\nNúmero de avaliações positivas: %d", positivas);
		System.out.printf("\nNúmero de avaliações positivas: %d", neutras);
		System.out.printf("\nNúmero de avaliações negativas: %d", negativas);

		input.close();
	}
}