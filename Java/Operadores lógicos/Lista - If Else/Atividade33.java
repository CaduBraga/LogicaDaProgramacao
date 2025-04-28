import java.util.Scanner; 
public class Atividade33 {
	public static void main (String [] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Digite o código da peça 1: ");
		int codigo1 = input.nextInt();
		System.out.print("Digite o valor unitário da peça 1: R$");
		double valor1 = input.nextDouble();
		System.out.print("Digite a quantidadede peças 1: ");
		int quantidade1 = input.nextInt();
		
		System.out.print("Digite o código da peça 2: ");
		int codigo2 = input.nextInt();
		System.out.print("Digite o valor unitário da peça 2: R$");
		double valor2 = input.nextDouble();
		System.out.print("Digite a quantidade de peças 2: ");
		int quantidade2 = input.nextInt();
		System.out.print("Digite o valor do IPI em porcentagem: ");
		double ipi = input.nextDouble();
		
		double valorFinal = (valor1 * quantidade1 + valor2 * quantidade2)*(ipi / 100 + 1);

		System.out.print("O valor final é R$" + valorFinal);
		
		input.close();
	}
}