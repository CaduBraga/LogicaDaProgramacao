import java.util.Scanner;

public class Questao3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Digite o seu CPF: ");
		long cpf = input.nextLong();
		System.out.print("Digite o número de dependentes: ");
		int dependentes = input.nextInt();
		System.out.print("Digite a renda mensal: ");
		double renda = input.nextDouble();
		System.out.print("Digite o valor do salário mínimo atual: ");
		double salarioMinimo = input.nextDouble();

		double faixa1 = salarioMinimo * 2;
		double faixa2 = salarioMinimo * 3;
		double faixa3 = salarioMinimo * 5;
		double faixa4 = salarioMinimo * 7;

		double imposto1 = renda * 0.05;
		double imposto2 = renda * 0.1;
		double imposto3 = renda * 0.15;
		double imposto4 = renda * 0.2;

		double desconto1 = salarioMinimo * 0.05;
		double desconto2 = salarioMinimo * 0.1;
		double desconto3 = salarioMinimo * 0.15;

		if (renda < faixa1 && dependentes == 1) {
			System.out.print("Isento!");
		} else if (renda < faixa2 && dependentes == 1) {
			System.out.print("Valor do imposto de renda: R$");
			System.out.print(imposto1 - desconto1);
		} else if (renda < faixa3 && dependentes == 1) {
			System.out.print("Valor do imposto de renda: R$");
			System.out.print(imposto2 - desconto1);
		} else if (renda < faixa4 && dependentes == 1) {
			System.out.print("Valor do imposto de renda: R$");
			System.out.print(imposto3 - desconto1);
		} else if (renda > faixa4 && dependentes == 1) {
			System.out.print("Valor do imposto de renda: R$");
			System.out.print(imposto4 - desconto1);
		}

		if (renda < faixa1 && dependentes == 2) {
			System.out.print("Isento!");
		} else if (renda < faixa2 && dependentes == 2) {
			System.out.print("Valor do imposto de renda: R$");
			System.out.print(imposto1 - desconto2);
		} else if (renda < faixa3 && dependentes == 2) {
			System.out.print("Valor do imposto de renda: R$");
			System.out.print(imposto2 - desconto2);
		} else if (renda < faixa4 && dependentes == 2) {
			System.out.print("Valor do imposto de renda: R$");
			System.out.print(imposto3 - desconto2);
		} else if (renda > faixa4 && dependentes == 2) {
			System.out.print("Valor do imposto de renda: R$");
			System.out.print(imposto4 - desconto2);
		}

		if (renda < faixa1 && dependentes >= 3) {
			System.out.print("Isento!");
		} else if (renda < faixa2 && dependentes >= 3) {
			System.out.print("Valor do imposto de renda: R$");
			System.out.print(imposto1 - desconto3);
		} else if (renda < faixa3 && dependentes >= 3) {
			System.out.print("Valor do imposto de renda: R$");
			System.out.print(imposto2 - desconto3);
		} else if (renda < faixa4 && dependentes >= 3) {
			System.out.print("Valor do imposto de renda: R$");
			System.out.print(imposto3 - desconto3);
		} else if (renda > faixa4 && dependentes >= 3) {
			System.out.print("Valor do imposto de renda: R$");
			System.out.print(imposto4 - desconto3);
		}

		if (renda < faixa1 && dependentes == 0) {
			System.out.print("Isento!");
		} else if (renda < faixa2 && dependentes == 0) {
			System.out.print("Valor do imposto de renda: R$" + imposto1);
		} else if (renda < faixa3 && dependentes == 0) {
			System.out.print("Valor do imposto de renda: R$" + imposto2);
		} else if (renda < faixa4 && dependentes == 0) {
			System.out.print("Valor do imposto de renda: R$" + imposto3);
		} else if (renda > faixa4 && dependentes == 0) {
			System.out.print("Valor do imposto de renda: R$" + imposto4);
		}

		input.close();
	}
}