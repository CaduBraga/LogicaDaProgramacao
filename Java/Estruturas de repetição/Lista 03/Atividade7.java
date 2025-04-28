import java.util.Scanner;

class Atividade7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double somaPesoTotal = 0;
		int somaIdadeTotal = 0;

		for (int i = 1; i <= 32; i++) {

			double somaPesosTimes = 0;
			int somaIdadesTimes = 0;

			for (int a = 1; a <= 26; a++) {

				System.out.printf("\n%dª seleção, digite o peso do %dº atleta: ", i, a);
				double peso = input.nextDouble();

				somaPesosTimes += peso;
				somaPesoTotal += peso;

				System.out.printf("%dª seleção, digite a idade do %dº atleta: ", i, a);
				int idade = input.nextInt();

				somaIdadesTimes += idade;
				somaIdadeTotal += idade;
			}
			double mediaPesoTime = somaPesosTimes / 26;
			double mediaIdadeTime = (double) somaIdadesTimes / 26;

			System.out.printf("\nMédia de Peso: %.2f kg\nMédia de Idade: %.2f anos\n", mediaPesoTime, mediaIdadeTime);
		}
		double mediaPesoGeral = somaPesoTotal / (32 * 26);
		double mediaIdadeGeral = (double) somaIdadeTotal / (32 * 26);

		System.out.printf("\nMédia geral - Peso: %.2f kg | Idade: %.2f anos\n", mediaPesoGeral, mediaIdadeGeral);

		input.close();
	}
}