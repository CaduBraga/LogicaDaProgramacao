import java.util.Scanner;

public class Questao3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Digite o código do item: ");
		int codigo = input.nextInt();
		System.out.print("Digite a quantidade comprada: ");
		int quantidade = input.nextInt();

		switch (codigo) {
		case 1001:
			System.out.print("Valor:" + quantidade * 5.32);
			break;
		case 1324:
			System.out.print("Valor:" + quantidade * 6.45);
			break;
		case 6548:
			System.out.print("Valor:" + quantidade * 2.37);
			break;
		case 987:
			System.out.print("Valor:" + quantidade * 5.32);
			break;
		case 7623:
			System.out.print("Valor:" + quantidade * 6.45);
			break;
		default:
			System.out.print("Insira um valor válido para o código do item");
			break;
		}
		input.close();
	}
}