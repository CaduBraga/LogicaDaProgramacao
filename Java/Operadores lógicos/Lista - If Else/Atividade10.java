import java.util.Scanner;
public class Atividade10{
	public static void main (String[]args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o primeiro ângulo: ");
		int a = input.nextInt();
		System.out.print("Digite o segundo ângulo: ");
		int b = input.nextInt();
		System.out.print("Digite o terceiro ângulo: ");
		int c = input.nextInt();
		
		int soma = a + b + c;

		if (soma == 180){
			System.out.print("Esse triângulo é válido");	
		} else {
			System.out.print("Esse triângulo é inválido");
		}
		
		input.close();
	}
}