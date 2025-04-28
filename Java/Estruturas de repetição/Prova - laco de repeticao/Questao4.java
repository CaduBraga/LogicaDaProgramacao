import java.util.Scanner;

public class Questao4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		boolean continuar = true;
		int codigoMaior = 0;
		int codigoMenor = 0;
		int total = 0;
		double valor = 0;
		double maior = Double.MIN_VALUE;
		double menor = Double.MAX_VALUE;
		double totalIndustrial = 0;
		double totalComercial = 0;
		double totalResidencial = 0;

		System.out.print("Digite o preço do kWh para os clientes do tipo 'Residencial': ");
		double residencial = input.nextDouble();
		System.out.print("Digite o preço do kWh para os clientes do tipo 'Industrial': ");
		double industrial = input.nextDouble();
		System.out.print("Digite o preço do kWh para os clientes do tipo 'Comercial': ");
		double comercial = input.nextDouble();

		do {
			System.out.print("\nDigite o número do consumidor (digite 0 para encerrar a operação): ");
			int numero = input.nextInt();

			if (numero == 0) {
				System.out.println("Operação encerrada!");
				continuar = false;
				break;

			} else {

				System.out.print("Digite a quantidade de kWh consumidos durante o mês: ");
				double quantidade = input.nextDouble();

				System.out.print("Digite o tipo do consumidor (R = Residencial, I = Industrial, C = Comercial): ");
				char tipo = input.next().charAt(0);

				if (tipo == 'R' || tipo == 'r') {
					valor = quantidade * residencial;
					totalResidencial += quantidade;

				} else if (tipo == 'I' || tipo == 'i') {
					valor = quantidade * industrial;
					totalIndustrial += quantidade;

				} else if (tipo == 'C' || tipo == 'c') {
					valor = quantidade * comercial;
					totalComercial += quantidade;

				} else {
					System.out.print("Erro! Caracter inválido (são aceitos somente: C, R ou I).");
					break;
				}

				if (quantidade > maior) {
					maior = quantidade;
					codigoMaior = numero;
				}
				if (quantidade < menor) {
					menor = quantidade;
					codigoMenor = numero;
				}
			}

			System.out.printf("\nCliente número %d, o total a ser pago é: R$%.2f\n", numero, valor);
			total++;

		} while (continuar == true);

		double media = (totalIndustrial + totalResidencial + totalComercial) / (double) total;

		System.out.printf(
				"\nEntre os dados registrados acima, o maior consumo é de %.2fkWh e pertence ao cliente número %d",
				maior, codigoMaior);
		System.out.printf(
				"\nEntre os dados registrados acima, o menor consumo é de %.2fkWh e pertence ao cliente número %d",
				menor, codigoMenor);
		System.out.println("\nConsumo total (em kWh) gerado por residências: " + totalResidencial);
		System.out.println("\nConsumo total (em kWh) gerado por indústrias: " + totalIndustrial);
		System.out.println("\nConsumo total (em kWh) gerado por comércios: " + totalComercial);
		System.out.println("\nMédia de consumo por consumidor (em kWh):" + media);

		input.close();
	}
}