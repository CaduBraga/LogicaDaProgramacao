import java.util.Scanner;

public class Questao5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Digite o valor de i: ");
		int i = input.nextInt();
		System.out.print("Digite o valor de a");
		double a = input.nextDouble();
		System.out.print("Digite o valor de b");
		double b = input.nextDouble();
		System.out.print("Digite o valor de c");
		double c = input.nextDouble();

		switch (i) {
		case 1:
			if (a >= b && b >= c) {
				System.out.print("" + c + " " + b + " " + "" + a);
			} else if (b >= a && a >= c) {
				System.out.print("" + c + " " + a + " " + "" + b);
			} else if (c >= b && b >= a) {
				System.out.print("" + a + " " + b + " " + "" + c);
			} else if (a >= c && c >= b) {
				System.out.print("" + b + " " + c + " " + "" + a);
			} else if (b >= c && c >= a) {
				System.out.print("" + a + " " + c + " " + "" + b);
			} else if (c >= a && a >= b) {
				System.out.print("" + b + " " + a + " " + "" + c);
			}
			break;
		case 2:
			if (a >= b && b >= c) {
				System.out.print("" + a + " " + b + " " + "" + c);
			} else if (b >= a && a >= c) {
				System.out.print("" + b + " " + a + " " + "" + c);
			} else if (c >= b && b >= a) {
				System.out.print("" + c + " " + b + " " + "" + a);
			} else if (a >= c && c >= b) {
				System.out.print("" + a + " " + c + " " + "" + b);
			} else if (b >= c && c >= a) {
				System.out.print("" + b + " " + c + " " + "" + a);
			} else if (c >= a && a >= b) {
				System.out.print("" + c + " " + a + " " + "" + b);
			}
			break;
		case 3:
			if (a >= b && b >= c) {
				System.out.print("" + b + " " + a + " " + "" + c);
			} else if (b >= a && a >= c) {
				System.out.print("" + a + " " + b + " " + "" + c);
			} else if (c >= b && b >= a) {
				System.out.print("" + b + " " + c + " " + "" + a);
			} else if (a >= c && c >= b) {
				System.out.print("" + c + " " + a + " " + "" + b);
			} else if (b >= c && c >= a) {
				System.out.print("" + c + " " + b + " " + "" + a);
			} else if (c >= a && a >= b) {
				System.out.print("" + a + " " + c + " " + "" + b);
			}
			break;
		default:
			System.out.print("Código invalido\nEscolha 1, 2 ou 3.");

			input.close();
		}
	}
}