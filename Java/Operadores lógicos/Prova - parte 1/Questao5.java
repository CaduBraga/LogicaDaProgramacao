import java.util.Scanner;

public class Questao5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Digite o seu nome: ");
		String nome = input.nextLine();
		System.out.print("Digite a sua idade: ");
		int idade = input.nextInt();
		System.out.print("Você tem título de eleitor? \nDigite 1 para SIM ou 2 para NÃO\n");
		int titulo = input.nextInt();
		System.out.print("Digite o número do seu título de eleitor (4 dígitos). \nCaso não tenha digite 0000: \n");
		int numeroTitulo = input.nextInt();

		if (idade < 16) {
			System.out.print("Você ainda não atingiu a idade mínima para votar.");
		}

		if (idade == 16 && titulo == 1 && numeroTitulo > 1787) {
			System.out.print("Você está apto a votar, mas seu voto é opcional. \nSua zona eleitoral é: A");
		}
		if (idade == 16 && titulo == 1 && numeroTitulo < 1787) {
			System.out.print("Você está apto a votar, mas seu voto é opcional. \nSua zona eleitoral é: B");
		}
		if (idade == 16 && titulo == 1 && numeroTitulo == 1787) {
			System.out.print("Você está apto a votar, mas seu voto é opcional. \nTítulo inválido");
		}
		if (idade == 16 && titulo == 1 && numeroTitulo == 0000) {
			System.out.print("Você está apto a votar, mas seu voto é opcional. \nTítulo inválido");
		}
		if (idade == 16 && titulo == 2) {
			System.out.print(
					"Seu voto é opcional. \nPara obter seu título e saber mais sobre como votar, dirija-se à uma junta eleitoral mais próxima.");
		}

		if (idade == 17 && titulo == 1 && numeroTitulo > 1787) {
			System.out.print("Você está apto a votar, mas seu voto é opcional. \nSua zona eleitoral é: A");
		}
		if (idade == 17 && titulo == 1 && numeroTitulo < 1787) {
			System.out.print("Você está apto a votar, mas seu voto é opcional. \nSua zona eleitoral é: B");
		}
		if (idade == 17 && titulo == 1 && numeroTitulo == 1787) {
			System.out.print("Você está apto a votar, mas seu voto é opcional. \nTítulo inválido");
		}
		if (idade == 17 && titulo == 1 && numeroTitulo == 0000) {
			System.out.print("Você está apto a votar, mas seu voto é opcional. \nTítulo inválido");
		}
		if (idade == 17 && titulo == 2) {
			System.out.print(
					"Seu voto é opcional. \nPara obter seu título e saber mais sobre como votar, dirija-se à uma junta eleitoral mais próxima.");
		}

		if (idade >= 18 && titulo == 1 && numeroTitulo > 1787 && numeroTitulo < 2077) {
			System.out.print(
					"Você já está registrado para votar. \nSua zona eleitoral é: A \nA próxima eleição acontecerá no Sesi Senai (rua Isidoro Pedri, 256) no dia 29/11");
		}
		if (idade >= 18 && titulo == 1 && numeroTitulo < 1787 && numeroTitulo > 1220) {
			System.out.print(
					"Você já está registrado para votar. \nSua zona eleitoral é: B \nA próxima eleição acontecerá no Sesi Senai (rua Isidoro Pedri, 256) no dia 29/11");
		}
		if (idade >= 18 && titulo == 1 && numeroTitulo <= 1220) {
			System.out.print(
					"Você já está registrado para votar. \nTítulo inválido \nA próxima eleição acontecerá no Sesi Senai (rua Isidoro Pedri, 256) no dia 29/11");
		}
		if (idade >= 18 && titulo == 1 && numeroTitulo >= 2077) {
			System.out.print(
					"Você já está registrado para votar. \nTítulo inválido \nA próxima eleição acontecerá no Sesi Senai (rua Isidoro Pedri, 256) no dia 29/11");
		}
		if (idade >= 18 && titulo == 1 && numeroTitulo == 1787) {
			System.out.print(
					"Você já está registrado para votar. \nTítulo inválido \nA próxima eleição acontecerá no Sesi Senai (rua Isidoro Pedri, 256) no dia 29/11");
		}
		if (idade >= 18 && titulo == 2) {
			System.out.print(
					"Você deve se registrar para votar, pois o registro eleitoral é obrigatório para todos os cidadãos com 18 anos ou mais. \nPara se registrar e obter seu título de eleitor, dirija-se à junta eleitoral mais próxima.");
		}
	}
}