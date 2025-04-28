import java.util.Scanner;
public class Atividade15{
	public static void main (String[]args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		int a = input.nextInt();
		System.out.print("Digite o segundo número: ");
		int b = input.nextInt();

		int c = a%b;
		int d = b%a;


		if (c == 0 || d == 0){
			System.out.print("São múltiplos");
		} else {
			System.out.print("Não são múltiplos");
		}
		
		input.close();
	}
}