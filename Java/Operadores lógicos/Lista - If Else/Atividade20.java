import java.util.Scanner; 
public class Atividade20 {
	public static void main (String [] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Digite a primeira nota: ");
		double nota1 = input.nextDouble();
		System.out.print("Digite a segunda nota: ");
		double nota2 = input.nextDouble();
		System.out.print("Digite a terceira nota: ");
		double nota3 = input.nextDouble();
		System.out.print("Digite o tipo de média que você quer:\n1 - Aritmética\n2 - Ponderada\n3 - Harmônica");
		int tipoMedia = input.nextInt();
		
		double mediaAritmetica = (nota1  + nota2 + nota3) / 3;
		double mediaPonderada = (nota1  + nota2) * 0.3 + nota3 * 0.4;
		double mediaHarmonica = 3 / (1 / nota1 + 1 / nota2 + 1 / nota3);
	
		if (tipoMedia == 1) {
			System.out.print(mediaAritmetica);
		} else if (tipoMedia == 2) {
			System.out.print(mediaPonderada);
		} else if (tipoMedia == 3) {
			System.out.print(mediaHarmonica);
		} else {
			System.out.print("Selecione um valor válido para a média: 1, 2 ou 3");
		}
		
		input.close();
	}
}