import java.util.Scanner; 
public class Atividade27 {
	public static void main (String [] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Digite o seu saldo total do último ano: ");
		double saldoAnual = input.nextDouble();
		
		double saldoMedio = saldoAnual / 12;
	
		if (saldoMedio <= 200) {
			System.out.print("Você não tem crédito");
		} else if (saldoMedio <= 400) {
			System.out.print("O seu crédito é de R$" + saldoMedio * 0.2);
		} else if (saldoMedio <= 600) {
			System.out.print("O seu crédito é de R$" + saldoMedio * 0.3);
		} else {
			System.out.print("O seu crédito é de R$" + saldoMedio * 0.3);
		}
		
		input.close();
	}
}