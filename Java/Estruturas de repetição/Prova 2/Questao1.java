import java.util.Scanner;

public class Questao1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int voto;
		int user   = 1;
		int cadu   = 0;
		int joao   = 0;
		int marina = 0;
		int bruno  = 0;
		int nulo   = 0;
		int branco = 0;
		
		System.out.println("Registre o seu voto:");
		System.out.println("1 - Cadu");
		System.out.println("2 - João");
		System.out.println("3 - Marina");
		System.out.println("4 - Bruno");
		System.out.println("5 - Voto nulo");
		System.out.println("6 - Voto em branco");
		System.out.println("0 - Encerrar votação\n");

		do {
			
			System.out.printf("Usuário %d: ", user);
			voto = input.nextInt();

			if (voto == 1) {
				cadu++;
			} else if (voto == 2) {
				joao++;
			} else if (voto == 3) {
				marina++;
			} else if (voto == 4) {
				bruno++;
			} else if (voto == 5) {
				nulo++;
			} else if (voto == 6) {
				branco++;
			} else if (voto == 0) {
				System.out.println("Votação encerrada!");
			} else {
				System.out.println("Número inválido, tente novamente:");
				user--;
			}
			user++;

		} while (voto != 0);

		System.out.println("\nResultados:");
		System.out.printf("\nCadu: %d votos!", cadu);
		System.out.printf("\nJoão: %d votos!", joao);
		System.out.printf("\nMarina: %d votos!", marina);
		System.out.printf("\nBruno: %d votos!", bruno);
		System.out.printf("\nVotos nulos: %d votos!", nulo);
		System.out.printf("\nVotos em branco: %d votos!", branco);

		input.close();
	}
}