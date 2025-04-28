import java.util.Scanner;

public class Questao1 {
	public static void main (String[]args) {
		Scanner input = new Scanner(System.in);
		
		double joao = 1.5;
		double ze = 1.1;
		int anos = 0;
		
		do {
			joao += 0.02;
			ze += 0.03;
			anos ++;
		} while (ze <= joao);

		System.out.printf("em %d anos. Então Zé tera %.2f metros e João terá %.2f metros", anos, ze, joao);
		
		input.close();
	}
}