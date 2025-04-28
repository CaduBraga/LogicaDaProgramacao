import java.util.Scanner;
public class Atividade2{
	public static void main (String[]args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		double a = input.nextDouble();

		if (a<0) {
			System.out.print("O número é negativo.");
		} else { 
			System.out.print("O número é positivo.");
		}

		input.close();
	}
}