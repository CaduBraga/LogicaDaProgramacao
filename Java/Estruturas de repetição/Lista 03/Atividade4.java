import java.util.Scanner;

class Atividade4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double aVista = 0;
		double aPrazo = 0;

		for (int i = 1; i <= 15; i++) {
			System.out.print("Digite o valor da " + i + "ª transação: ");
			double valor = input.nextDouble();

			int metodo = 0;
			do {
				System.out.print("Digite o método de pagamento (1 - À vista e 2 - À prazo): ");
				metodo = input.nextInt();

				if (metodo != 1 && metodo != 2) {
					System.out.println("Método inválido! Por favor, escolha 1 para à vista ou 2 para à prazo.");
				}
			} while (metodo != 1 && metodo != 2);

			if (metodo == 1) {
				aVista += valor;
			} else if (metodo == 2) {
				aPrazo += valor;
			}
		}

		double total = aVista + aPrazo;
		double parcela = aPrazo / 3;

		System.out.printf(
				"Total das compras à vista: R$%.2f\nTotal das compras à prazo: R$%.2f\nTotal: R$%.2f\nPrimeira prestação: R$%.2f",
				aVista, aPrazo, total, parcela);
		input.close();
	}
}