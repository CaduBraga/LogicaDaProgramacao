import java.util.Scanner;

class Atividade6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int i = 0;
		int totalHomens = 0;
		int totalMulheres = 0;
		int totalLoiros = 0;
		int totalOlhosVerdes = 0;
		int totalAmbos = 0;
		double somaIdade = 0;
		double somaPeso = 0;
		double somaAltura = 0;
		boolean continuar = true;

		do {
			i++;

			System.out.print("Usuário " + i + ", digite seu sexo (M ou F): ");
			char sexo = Character.toLowerCase(input.next().charAt(0));

			input.nextLine();

			if (sexo != 'm' && sexo != 'f') {
				System.out.println("Sexo inválido! Pesquisa encerrada.");

				break;
			}

			System.out.print("Usuário " + i + ", deseja continuar com a pesquisa (true ou false)? ");
			continuar = input.nextBoolean();

			input.nextLine();

			if (continuar == false) {
				System.out.println("Pesquisa encerrada!");

				break;
			}

			System.out.print("Usuário " + i + ", digite a cor do seu olho (azul, verde ou castanho): ");
			String olho = input.nextLine().toLowerCase();

			if (!olho.equals("azul") && !olho.equals("verde") && !olho.equals("castanho")) {
				System.out.println("Cor de olho inválida! Pesquisa encerrada.");

				break;
			}

			System.out.print("Usuário " + i + ", deseja continuar com a pesquisa (true ou false)? ");
			continuar = input.nextBoolean();

			input.nextLine();

			if (continuar == false) {
				System.out.println("Pesquisa encerrada!");

				break;
			}

			System.out.print("Usuário " + i + ", digite a cor do seu cabelo (loiro, castanho ou preto): ");
			String cabelo = input.nextLine().toLowerCase();

			if (!cabelo.equals("loiro") && !cabelo.equals("castanho") && !cabelo.equals("preto")) {
				System.out.println("Cor de cabelo inválida! Pesquisa encerrada.");

				break;
			}

			System.out.print("Usuário " + i + ", deseja continuar com a pesquisa (true ou false)? ");
			continuar = input.nextBoolean();

			input.nextLine();

			if (continuar == false) {
				System.out.println("Pesquisa encerrada!");

				break;
			}

			System.out.print("Usuário " + i + ", digite a sua idade: ");
			int idade = input.nextInt();

			input.nextLine();

			System.out.print("Usuário " + i + ", deseja continuar com a pesquisa (true ou false)? ");
			continuar = input.nextBoolean();

			input.nextLine();

			if (continuar == false) {
				System.out.println("Pesquisa encerrada!");

				break;
			}

			System.out.print("Usuário " + i + ", digite a sua altura em centímetros: ");
			int altura = input.nextInt();

			System.out.print("Usuário " + i + ", deseja continuar com a pesquisa (true ou false)? ");
			continuar = input.nextBoolean();

			input.nextLine();

			if (continuar == false) {
				System.out.println("Pesquisa encerrada!");

				break;
			}

			System.out.print("Usuário " + i + ", digite o seu peso em quilogramas: ");
			double peso = input.nextDouble();

			input.nextLine();

			System.out.print("Usuário " + i + ", deseja continuar com a pesquisa (true ou false)? ");
			continuar = input.nextBoolean();

			input.nextLine();

			if (continuar == false) {
				System.out.println("Pesquisa encerrada!");

				break;
			}

			if (sexo == 'm') {
				totalHomens++;

			} else {
				totalMulheres++;
			}
			if (cabelo.equals("loiro")) {
				totalLoiros++;
			}
			if (olho.equals("verde")) {
				totalOlhosVerdes++;
			}
			if (cabelo.equals("loiro") && olho.equals("verde")) {
				totalAmbos++;
			}

			somaIdade += idade;
			somaAltura += altura;
			somaPeso += peso;

		} while (continuar);

		int totalPessoas = totalHomens + totalMulheres;

		double mediaIdade = somaIdade / totalPessoas;
		double mediaPeso = somaPeso / totalPessoas;
		double mediaAltura = somaAltura / totalPessoas;

		double porcentagemHomens = (double) totalHomens / totalPessoas * 100;
		double porcentagemMulheres = (double) totalMulheres / totalPessoas * 100;

		System.out.println("Média de idade: " + mediaIdade);
		System.out.println("Média de peso: " + mediaPeso);
		System.out.println("Média de altura: " + mediaAltura);
		System.out.println("Porcentagem de homens: " + porcentagemHomens + "%");
		System.out.println("Porcentagem de mulheres: " + porcentagemMulheres + "%");
		System.out.println("Número de pessoas com cabelo loiro: " + totalLoiros);
		System.out.println("Número de pessoas com olhos verdes: " + totalOlhosVerdes);
		System.out.println("Número de pessoas com cabelo loiro e olhos verdes: " + totalAmbos);

		/*
		 Professor, sei que o senhor não nos explicou sobre lowercase, porém aprendi
		 com a internet e decidi implementar no meu código.
		 */

		input.close();
	}
}