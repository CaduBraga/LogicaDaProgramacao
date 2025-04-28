import java.util.Scanner;

public class Questao2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Qual o número do dia que você deseja saber? ");
		int dia = input.nextInt();
	
		switch (dia) {
		case 1:
			System.out.print("Domingo");
			break;
		case 2:
			System.out.print("Segunda-feira");
			break;
		case 3:
			System.out.print("Terça-feira");
			break;
		case 4:
			System.out.print("Quarta-feira");
			break;
		case 5:
			System.out.print("Quinta-feira");
			break;
		case 6:
			System.out.print("Sexta-feira");
			break;
		case 7:
			System.out.print("Sábado");
			break;
		default:
			System.out.print("Dia da semana inválido");
	break;
		}
		input.close();
	}
}