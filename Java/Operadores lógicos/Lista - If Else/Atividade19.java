import java.util.Scanner;

public class Atividade19 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite sua matricula: ");
		int matricula = leia.nextInt();

		System.out.println("Digite sua primeira nota: ");
		int nota1 = leia.nextInt();

		System.out.println("Digite sua segunda nota: ");
		int nota2 = leia.nextInt();

		System.out.println("Digite sua terceira nota: ");
		int nota3 = leia.nextInt();

		double media1 = nota1 * 0.4 + (nota2 * 0.3 + nota3 * 0.3);

		double media2 = nota2 * 0.4 + (nota1 * 0.3 + nota3 * 0.3);

		double media3 = nota3 * 0.4 + (nota1 * 0.3 + nota2 * 0.3);

		if (nota1 > nota2 && nota1 > nota3) {
			System.out.printf("Matricula: %d \nMedia ponderada: %.2f", matricula, media1);
		}
		if (nota2 > nota2 && nota2 > nota3) {
			System.out.printf("Matricula: %d \nMedia ponderada: %.2f", matricula, media2);
		}
		if (nota3 > nota2 && nota3 > nota3) {
			System.out.printf("Matricula: %d \nMedia ponderada: %.2f", matricula, media3);
		}
		if (media1 >= 5.0 || media2 >= 5.0 || media3 >= 5.0) {
			System.out.printf("Aprovado");
		} else {
			System.out.printf("Reprovado");
		}

		leia.close();
	}
}