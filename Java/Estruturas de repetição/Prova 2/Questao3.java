import java.util.Scanner;

public class Questao3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double indiceMenor    = Double.MAX_VALUE;
		double indiceMaior    = Double.MIN_VALUE;
		int    maisAcidentes  = Integer.MIN_VALUE;
		int    menosAcidentes = Integer.MAX_VALUE;
		int    totalVeiculos  = 0;
		int    totalAcidentes = 0;
		int    codigoMaior    = 0;
		int    codigoMenor    = 0;
		int    acidenteMenor  = 0;
		int    acidenteMaior  = 0;
		int    contador       = 0;

		for (int cidade = 1; cidade <= 5; cidade++) {

			System.out.printf("Digite o código da cidade %d: ", cidade);
			int codigo = input.nextInt();

			System.out.printf("Digite a quantidade de veículos de passeio da cidade %d (em 1999): ", cidade);
			int veiculos = input.nextInt();

			totalVeiculos += veiculos;

			System.out.printf("Digite a quantidade de acidentes de trânsito com vítimas da cidade %d (em 1999): ", cidade);
			int acidentes = input.nextInt();

			if (acidentes > maisAcidentes) {
				maisAcidentes = acidentes;
				acidenteMaior = codigo;
			}
			
			if (acidentes < menosAcidentes) {
				menosAcidentes = acidentes;
				acidenteMenor = codigo;
			}
			
			System.out.println("");

			if (veiculos <= 2000) {
				totalAcidentes += acidentes;
				contador++;
			}

			double indiceAcidentes = 100 * acidentes / veiculos;

			if (indiceAcidentes > indiceMaior) {
				indiceMaior = indiceAcidentes;
				codigoMaior = codigo;
			}
			if (indiceAcidentes < indiceMenor) {
				indiceMenor = indiceAcidentes;
				codigoMenor = codigo;
			}
		}

		double mediaAcidentes = totalAcidentes / contador;
		double mediaVeiculos = totalVeiculos / 5;

		System.out.println("\nO menor índice de acidentes é de "   + indiceMenor + "% e pertece a cidade "       + codigoMenor);
		System.out.println("O maior índice de acidentes é de "     + indiceMaior + "% e pertece a cidade "       + codigoMaior);
		System.out.println("Média de veículos das cinco cidades: " + mediaVeiculos);
		System.out.println("Média de acidentes de trânsito nas cidades com menos de 2.000 veículos de passeio: " + mediaAcidentes);
		System.out.println("O maior número de acidentes é "        + maisAcidentes + " e pertece a cidade "      + acidenteMaior);
		System.out.println("O menor número de acidentes é "        + menosAcidentes + " e pertece a cidade "     + acidenteMenor);

		input.close();
	}
}