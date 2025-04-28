	import java.util.Scanner;
public class Atividade3 {

		public static void main (String[]args) {
			Scanner input = new Scanner(System.in);
			
			System.out.print("Digite a primeira nota: ");
			double a = input.nextDouble();
			System.out.print("Digite a segunda nota: ");
			double b = input.nextDouble();
			System.out.print("Digite a terceira nota: ");
			double c = input.nextDouble();
			System.out.print("Digite a quarta nota: ");
			double d = input.nextDouble();
			System.out.print("Digite a quinta nota: ");
			double e = input.nextDouble();
			double qtd = 0;
			
			if (a>60) {
				qtd = qtd + 1;
			}if (b>60) {
				qtd = qtd + 1;
			}if (c>60) {
				qtd = qtd + 1;
			}if (d>60) {
				qtd = qtd + 1;
			}if (e>60) {
				qtd = qtd + 1;
			}
			 
				System.out.print("Notas maiores que 60:" + qtd);

			input.close();
	}
}