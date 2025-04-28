import java.util.Scanner;
public class Atividade14{
	public static void main (String[]args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		double a = input.nextDouble();
		System.out.print("Digite o segundo número: ");
		double b = input.nextDouble();
		System.out.print("Digite o terceiro número: ");
		double c = input.nextDouble();


		if (a > b && a > c) {
			System.out.printf("Valor A: %.2f\nValor B: %.2f\nValor C: %.2f\nO maior é: %.2f", a, b, c, a);
		}
		if (b > a && b > c) {
			System.out.printf("Valor A: %.2f\nValor B: %.2f\nValor C: %.2f\nO maior é: %.2f", a, b, c, b);
		}
		if (c > a && c > b) {
			System.out.printf("Valor A: %.2f\nValor B: %.2f\nValor C: %.2f\nO maior é: %.2f", a, b, c, c);
		}
		if (a == c && a > b) {
			System.out.print("Os valores são iguais");
		}
		if (a == b && a > c) {
			System.out.printf("Valor A: %.2f\nValor B: %.2f\nValor C: %.2f\nO maior é: %.2f", a, b, c, a);
		}
		if (a == c && a > b) {
			System.out.printf("Valor A: %.2f\nValor B: %.2f\nValor C: %.2f\nO maior é: %.2f", a, b, c, a);
		}
		if (b == c && b > a) {
			System.out.printf("Valor A: %.2f\nValor B: %.2f\nValor C: %.2f\nO maior é: %.2f", a, b, c, b);
		}
		
		input.close();
	}
}