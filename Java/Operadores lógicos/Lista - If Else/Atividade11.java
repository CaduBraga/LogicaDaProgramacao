import java.util.Scanner;
public class Atividade11{
	public static void main (String[]args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite a hora de início: ");
		int inicio = input.nextInt();
		System.out.print("Digite o segundo término: ");
		int termino = input.nextInt();

		int diasIguais = termino - inicio;
		int diasDiferentes = 24-inicio +termino;

		if (termino > inicio){
			System.out.printf("O jogo durou %d horas", diasIguais);	
		} else if (termino < inicio){
			System.out.printf("O jogo durou %d horas", diasDiferentes);	
		} else {
			System.out.print("O jogo durou 24 horas");
		}
		
		input.close();
	}
}