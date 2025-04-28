import java.util.Scanner;
public class Atividade13{
	public static void main (String[]args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite a primeira nota: ");
		double nota1 = input.nextDouble();
		System.out.print("Digite a segunda nota: ");
		double nota2 = input.nextDouble();
		System.out.print("Digite a terceira nota: ");
		double nota3 = input.nextDouble();

		double media = nota1 * 0.2 + nota2 * 0.3 + nota3 * 0.5;

		if (media >= 6) {
			System.out.printf("Média ponderada: %.2f\nO aluno está aprovado!", media);
		} else {
			System.out.printf("Média ponderada: %.2f\nO aluno está reprovado!", media);
		}
		
		input.close();
	}
}