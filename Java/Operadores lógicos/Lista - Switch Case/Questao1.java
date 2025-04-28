import java.util.Scanner;

public class Questao1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Digite a primeira nota: ");
		double nota1 = input.nextDouble();
		System.out.print("Digite a segunda nota: ");
		double nota2 = input.nextDouble();
		System.out.print("Digite a terceira nota: ");
		double nota3 = input.nextDouble();
		System.out.print("Digite o tipo de média que você quer:\n1 - Aritmética\n2 - Ponderada\n3 - Harmônica");
		int tipoMedia = input.nextInt();

		double mediaAritmetica = (nota1 + nota2 + nota3) / 3;
		double mediaPonderada = (nota1 + nota2) * 0.3 + nota3 * 0.4;
		double mediaHarmonica = 3 / (1 / nota1 + 1 / nota2 + 1 / nota3);

		switch (tipoMedia) {
		case 1:
			System.out.print(mediaAritmetica);
			break;
		case 2:
			System.out.print(mediaPonderada);
			break;
		case 3:
			System.out.print(mediaHarmonica);
			break;
		default:
			System.out.print("Selecione um valor válido para a média: 1, 2 ou 3");
			break;
		}
		input.close();
	}
}