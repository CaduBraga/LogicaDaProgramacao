import java.util.Scanner;
public class Atividade1{
	public static void main (String[]args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número (A): ");
		int a = input.nextInt();
		System.out.print("Digite o primeiro número (B): ");
		int b = input.nextInt();
		int c = a;
		int d = b;
		
		if (a>b) {
			c = a;
			d = b;
			a = d;
					b = c;
		}
		
		System.out.printf("A: %d\nB: %d", a, b);
		input.close();
	}
}