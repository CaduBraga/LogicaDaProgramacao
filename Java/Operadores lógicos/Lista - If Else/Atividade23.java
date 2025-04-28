import java.util.Scanner; 
public class Atividade23 {
	public static void main (String [] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Digite o código do item: ");
		int codigo = input.nextInt();
		System.out.print("Digite a quantidade comprada: ");
		int quantidade = input.nextInt();
		

	
		if (codigo == 100) {
			System.out.print("Valor:" + quantidade * 2.2);
		} else if (codigo == 101) {
			System.out.print("Valor:" + quantidade * 3.3);
		} else if (codigo == 102) {
			System.out.print("Valor:" + quantidade * 3.5);
		} else if (codigo == 103) {
			System.out.print("Valor:" + quantidade * 5.2);
		} else if (codigo == 104) {
			System.out.print("Valor:" + quantidade * 7.3);
		} else if (codigo == 105) {
			System.out.print("Valor:" + quantidade * 2);
		} else {
			System.out.print("Insira um valor válido para o código do item");
		}
		
		input.close();
	}
}