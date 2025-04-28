import java.util.Scanner;

public class Questao3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		int par = 0;
		int impar = 0;

		for (int contador = 1; contador <= 10; contador++) {
			
			System.out.printf("Digite o %dº número inteiro: ", contador);
			int numero = input.nextInt();

			double verificacao = numero % 2;

			if (verificacao == 0) {
				par++;
			} else {
				impar++;
			}

			if (numero > maior) {
				maior = numero;
			}

			if (numero < menor) {
				menor = numero;
			}

		}
		
		System.out.printf("Dentre os números digitados, %d são pares", par);
		System.out.printf("Dentre os números digitados, %d são ímpares", impar);
		System.out.printf("Dentre os números digitados, %d é o maior", maior);
		System.out.printf("Dentre os números digitados, %d é o menor", menor);

		input.close();
	}
}