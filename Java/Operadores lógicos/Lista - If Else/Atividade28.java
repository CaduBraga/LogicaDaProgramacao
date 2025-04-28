import java.util.Scanner; 
public class Atividade28 {
	public static void main (String [] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Digite o código do cargo: ");
		int codigo = input.nextInt();
		System.out.print("Digite o valor do salário\nR$: ");
		double salario = input.nextDouble();
		
		double aumentoGerente = salario + salario * 0.1;
		double aumentoEngenheiro = salario + salario * 0.2;
		double aumentoTecnico = salario + salario * 0.3;
		double aumentoOutro = salario + salario * 0.4;
		double diferencaGerente = salario * 0.1;
		double diferencaEngenheiro = salario * 0.2;
		double diferencaTecnico = salario * 0.3;
		double diferencaOutro = salario * 0.4;
	
		if (codigo == 101) {
			System.out.printf("Você é um gerente!\nSeu salário antigo era de R$%.2f\nSeu novo salário é R$%.2f\nTotalizando uma diferença de R$%.2f", salario, aumentoGerente, diferencaGerente);
		} else if (codigo == 102) {
			System.out.printf("Você é um engenheiro!\nSeu salário antigo era de R$%.2f\nSeu novo salário é R$%.2f\nTotalizando uma diferença de R$%.2f", salario, aumentoEngenheiro, diferencaEngenheiro);
		} else if (codigo == 103) {
			System.out.printf("Você é um técnico!\nSeu salário antigo era de R$%.2f\nSeu novo salário é R$%.2f\nTotalizando uma diferença de R$%.2f", salario, aumentoTecnico, diferencaTecnico);
		} else {
			System.out.printf("Seu salário antigo era de R$%.2f\nSeu novo salário é R$%.2f\nTotalizando uma diferença de R$%.2f", salario, aumentoOutro, diferencaOutro);
		}
		
		input.close();
	}
}