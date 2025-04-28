import java.util.Scanner;
public class Atividade5{
	public static void main (String[]args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite sua idade: ");
		int idade = input.nextInt();
		int falta = 18 - idade;

		if (idade>=18) {
			System.out.print("Você está apto a tirar a carteira de motorista");
		} else { 
			System.out.printf("Faltam %d anos para você poder trar a carteira de motorista", falta);
		}

		input.close();
	}
}