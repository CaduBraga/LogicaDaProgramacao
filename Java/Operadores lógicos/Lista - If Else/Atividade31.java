import java.util.Scanner; 
public class Atividade31 {
	public static void main (String [] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Digite o consumo Kw: ");
		double consumo = input.nextDouble();
		
		double consumoA = consumo * 1.5 + consumo * 0.2 + consumo;
		double consumoB = consumo * 1.2 + consumo * 0.2 + consumo;
		double consumoC = consumo * 0.75 + consumo * 0.2 + consumo;
		double consumoD = consumo * 0.5 + consumo * 0.2 + consumo;
		
		if (consumo > 250) {
			System.out.print("Custo: R$" + consumoA);
		} else if (consumo > 200) {
			System.out.print("Custo: R$" + consumoB);
		} else if (consumo > 100) {
			System.out.print("Custo: R$" + consumoC);
		} else if (consumo > 0) {
			System.out.print("Custo: R$" + consumoD);
		} else {
			System.out.print("O consumo deve ser positivo!");
		}
		input.close();
	}
}