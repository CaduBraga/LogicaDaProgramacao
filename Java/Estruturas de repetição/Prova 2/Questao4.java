import java.util.Scanner;

public class Questao4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Intervalos:");
		System.out.println("1 - [0 -25]");
		System.out.println("2 - [26 -50]");
		System.out.println("3 - [51 -75]");
		System.out.println("4 - [76 -100]");
		System.out.println("Ou digite um número negativo para mostrar os resultados.\n");
		
		int numero;
		int user          = 1;
		int intervalo1    = 0;
		int intervalo2    = 0;
		int intervalo3    = 0;
		int intervalo4    = 0;
		int intervaloNulo = 0;

		do {
			System.out.printf("Usuário %d, digite um número: ", user);
			numero = input.nextInt();

			if (numero < 0) {
				System.out.println("Operação encerrada!");
				break;
				
			} else if (numero <= 25) {
				intervalo1++;
			} else if (numero <= 50) {
				intervalo2++;
			} else if (numero <= 75) {
				intervalo3++;
			} else if (numero <= 100) {
				intervalo4++;
			} else {
				intervaloNulo++;
			}

			user++;

		} while (numero >= 0);

		System.out.printf("\nTotal de números no intervalo 1: %d", intervalo1);
		System.out.printf("\nTotal de números no intervalo 2: %d", intervalo2);
		System.out.printf("\nTotal de números no intervalo 3: %d", intervalo3);
		System.out.printf("\nTotal de números no intervalo 4: %d", intervalo4);
		System.out.printf("\nTotal de números fora dos intervalos (maiores que 100): %d", intervaloNulo);

		input.close();
	}
}