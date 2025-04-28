import java.util.Scanner;
public class Atividade6{
	public static void main (String[]args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int numero = input.nextInt();
		int par = numero%2;

		if (par == 0 && numero != 0){
			System.out.print("O número é par");
		} else if (numero == 0){ 
			System.out.print("O número é nulo (0)");
		} else {
			System.out.print("O número é par");
		}

		input.close();
	}
}