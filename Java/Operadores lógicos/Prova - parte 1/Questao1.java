import java.util.Scanner;

public class Questao1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Digite o valor total da compra: ");
		double valor = input.nextDouble();
		System.out.print(
				"Digite a forma de pagamento: \n 1 - À vista \n 2 - Cheque pré datado para 30 dias \n 3 - Parcelado\n");
		int formaPagamento = input.nextInt();
		System.out.print("Digite o número de parcelas (1 caso seja à vista ou cheque): ");
		int parcelas = input.nextInt();

		double aVista = valor - (valor * 0.15);
		double cheque = valor - (valor * 0.1);
		double parcelaDesconto = valor - (valor * 0.05);
		double parcelaAcrescimo = valor * 1.08;

		double diferencaAVista = valor - aVista;
		double diferencaCheque = valor - cheque;
		double diferencaParcelas = valor - parcelaDesconto;
		double jurosParcelas = parcelaAcrescimo - valor;

		double valorParcelaDesconto = parcelaDesconto / parcelas;
		double valorParcelaJuros = parcelaAcrescimo / parcelas;

		if (formaPagamento == 1) {
			System.out.printf(
					"\n Valor total: R$%.2f \n Valor final: R$%.2f \n Desconto: R$%.2f \n Número de parcelas: %d \n Valor da parcela: R$%.2f",
					valor, aVista, diferencaAVista, parcelas, aVista);
		} else if (formaPagamento == 2) {
			System.out.printf(
					"\n Valor total: R$%.2f \n Valor final: R$%.2f \n Desconto: R$%.2f \n Número de parcelas: %d \n Valor da parcela: R$%.2f",
					valor, cheque, diferencaCheque, parcelas, cheque);
		} else if (formaPagamento == 3 && parcelas <= 3) {
			System.out.printf(
					"\n Valor total: R$%.2f \n Valor final: R$%.2f \n Desconto: R$%.2f \n Número de parcelas: %d \n Valor das parcelas: R$%.2f",
					valor, parcelaDesconto, diferencaParcelas, parcelas, valorParcelaDesconto);
		} else if (formaPagamento == 3 && parcelas <= 12) {
			System.out.printf(
					"\n Valor total: R$%.2f \n Valor final: R$%.2f \n Juros: R$%.2f \n Número de parcelas: %d \n Valor das parcelas: R$%.2f",
					valor, parcelaAcrescimo, jurosParcelas, parcelas, valorParcelaJuros);
		} else {
			System.out.print(
					"Insira um valor válido para a forma de pagamento (1 a 3) ou para o número de parcelas (no máximo 12).");
		}
		input.close();
	}
}