import java.util.Scanner;

public class Atividade14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o número que você deseja conhecer a tabuada: ");
		int numero = input.nextInt();
		for (int i = 0; i <= 10; i++) {
			int a = numero * i;
			System.out.println(a);
		}
		input.close();
	}
}