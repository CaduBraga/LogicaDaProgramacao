import java.util.Scanner;
public class Atividade4{
	public static void main (String[]args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite sua idade: ");
		int idade = input.nextInt();

		if (idade>=18) {
			System.out.print("Você está apto a tirar a carteira de motorista");
		} else { 
			System.out.print("Você não está apto a tirar a carteira de motorista");
		}

		input.close();
	}
}