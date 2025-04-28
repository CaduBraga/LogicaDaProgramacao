import java.util.Scanner;

public class Atividade18
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Digite a sua altura em metros: ");
		double altura = input.nextDouble();
		System.out.print("Digite seu sexo (M/F): ");
		char sexo = input.next().charAt(0);

		double pesoHomem = (72.7 * altura) - 58;
		double pesoMulher = (62.1 * altura) - 44.7;
		

		if (sexo == 'M') {
			System.out.printf("O seu peso ideal é de %.2f kg", pesoHomem);
		} else if (sexo == 'F') {
		System.out.printf("O seu peso ideal é de %.2f kg", pesoMulher);
		} else {
			System.out.print("O valor do 'sexo' inserido é inválido. Digite 'M' ou 'F'");
		}

		input.close();
	}
}