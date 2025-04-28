import java.util.Scanner;

public class Questao5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double precoTotal = 0;
		int eficiente = 0;
		int padrao = 0;
		int ineficiente = 0;

		System.out.print("Digite a quantidade de motores comprados: ");
		int quantidade = input.nextInt();

		for (int contador = 1; contador <= quantidade; contador++) {

			System.out.printf("\nDigite o consumo do %dº motor em kWh: ", contador);
			double kWh = input.nextDouble();

			System.out.printf("Digite o preço do %dº motor R$:", contador);
			double preco = input.nextDouble();

			if (kWh <= 100) {
				preco *= 0.85;
				eficiente++;
			} else if (kWh <= 150) {
				preco *= 0.95;
				padrao++;
			} else {
				ineficiente++;
			}
			precoTotal += preco;
		}

		System.out.printf("\nValor total da compra: R$%.2f\n\n", precoTotal);
		System.out.println("Dos motores comprados, " + eficiente
				+ " são considerados eficientes (>=100kWh) e contam com 15% de desconto");
		System.out.println("Dos motores comprados, " + padrao
				+ " são considerados padrões (>=150kWh e <100kWh) e contam com 5% de desconto");
		System.out.printf(
				"Dos motores comprados, %d são considerados ineficientes (>1500kWh) e não contam com descontos",
				ineficiente);

		input.close();
	}
}