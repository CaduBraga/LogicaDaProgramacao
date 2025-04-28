import java.util.Scanner;
public class Atividade32 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Digite o índice de poluição: ");
		double indicePoluicao = input.nextDouble();

		if (indicePoluicao < 0.3) {
			System.out.print("Índices aceitáveis.\nNenhuma atividade precisa ser suspendida!");
		} else if (indicePoluicao >= 0.3) {
			System.out.print("Atenção Indústrias do grupo 1.\nSuspendam imediatamente suas atividades!");
		} else if (indicePoluicao >= 0.4) {
			System.out.print("Atenção Indústrias dos grupos 1 e 2.\nSuspendam imediatamente suas atividades!");
		} else if (indicePoluicao >= 0.5) {
			System.out.print("Atenção Indústrias dos grupos 1, 2 e 3.\nSuspendam imediatamente suas atividades!");
		}
		input.close();
	}
}