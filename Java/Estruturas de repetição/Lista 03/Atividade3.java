import java.util.Scanner;

class Atividade3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Digite um número maior que 25, menor que 80 e difirente de 40: ");
		double numero = input.nextDouble();

		if (numero > 80) {
			System.out.print("ERRO! O número é maior que 80.");
		} else if (numero < 25) {
			System.out.print("ERRO! O número é menor que 25.");
		} else if (numero == 40) {
			System.out.print("ERRO! O número é igual a 40.");
		} else {
			System.out.print("O número está no intervalo aceito.");
		}
		
		input.close();
	}
}