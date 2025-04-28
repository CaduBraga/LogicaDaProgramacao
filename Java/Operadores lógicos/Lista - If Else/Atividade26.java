import java.util.Scanner; 
public class Atividade26 {
	public static void main (String [] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Digite o código do item: ");
		int codigo = input.nextInt();
		System.out.print("Digite a quantidade comprada: ");
		int quantidade = input.nextInt();
		

	
		if (codigo == 1001) {
			System.out.print("Valor:" + quantidade * 5.32);
		} else if (codigo == 1324) {
			System.out.print("Valor:" + quantidade * 6.45);
		} else if (codigo == 6548) {
			System.out.print("Valor:" + quantidade * 2.37);
		} else if (codigo == 987) { 
			System.out.print("Valor:" + quantidade * 5.32);
		} else if (codigo == 7623) {
			System.out.print("Valor:" + quantidade * 6.45);
		} else {
			System.out.print("Insira um valor válido para o código do item");
		}
		
		input.close();
	}
}