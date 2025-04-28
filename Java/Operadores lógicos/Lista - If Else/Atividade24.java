import java.util.Scanner; 
public class Atividade24 {
	public static void main (String [] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Qual o número do mês que você deseja saber? ");
		int mes = input.nextInt();
	
		if (mes < 2 && mes > 0 || mes == 12) {
			System.out.print("Verão!");
		} else if (mes <= 5 && mes > 0) {
			System.out.print("Outono!");
		}  else if (mes <= 8 && mes > 0) {
			System.out.print("Inverno!");
		}  else if (mes <= 8 && mes > 0) {
			System.out.print("Primavera!");
		} else {
			System.out.print("Selecione um valor válido para o mês (entre 1 e 12)");
		}
		
		input.close();
	}
}