import java.util.Scanner; 
public class Atividade22 {
	public static void main (String [] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Digite o código da matrícula: ");
		int codigo = input.nextInt();
		System.out.print("Digite a primeira nota: ");
		double nota1 = input.nextDouble();
		System.out.print("Digite a segunda nota: ");
		double nota2 = input.nextDouble();
		System.out.print("Digite a terceira nota: ");
		double nota3 = input.nextDouble();
		
		double media1 = nota1 * 0.4 + (nota2 + nota3) * 0.3;
		double media2 = nota2 * 0.4 + (nota1 + nota3) * 0.3;
		double media3 = nota3 * 0.4 + (nota1 + nota2) * 0.3;
		
		if (nota1 > nota2 && nota1 > nota3) {
			System.out.printf("\nAluno: %d\nNota 1: %.2f\nNota 2: %.2f\nNota 3: %.2f\nMédia ponderada: %.2f", codigo, nota1, nota2, nota3, media1);
		} else if (nota2 > nota1 && nota2 > nota3) {
			System.out.printf("\nAluno:\nNota 1: %.2f\nNota 2: %.2f\nNota 3: %.2f\nMédia ponderada: %.2f", codigo, nota1, nota2, nota3, media2);
		} else if (nota3 > nota1 && nota3 > nota2) {
			System.out.printf("\nAluno: %d\nNota 1: %.2f\nNota 2: %.2f\nNota 3: %.2f\nMédia ponderada: %.2f", codigo, nota1, nota2, nota3, media3);
		} else if (nota1 == nota3 && nota1 == nota2) {
			System.out.printf("\nAluno: %d\nNota 1: %.2f\nNota 2: %.2f\nNota 3: %.2f\nMédia ponderada: %.2f", codigo, nota1, nota2, nota3, media3);
		} else if (nota1 == nota2 && nota1 > nota3) {
			System.out.printf("\nAluno: %d\nNota 1: %.2f\nNota 2: %.2f\nNota 3: %.2f\nMédia ponderada: %.2f", codigo, nota1, nota2, nota3, media1);
		} else if (nota1 == nota3 && nota1 > nota2) {
			System.out.printf("\nAluno: %d\nNota 1: %.2f\nNota 2: %.2f\nNota 3: %.2f\nMédia ponderada: %.2f", codigo, nota1, nota2, nota3, media1);
		} else if (nota2 == nota3 && nota2 > nota1) {
			System.out.printf("\nAluno: %d\nNota 1: %.2f\nNota 2: %.2f\nNota 3: %.2f\nMédia ponderada: %.2f", codigo, nota1, nota2, nota3, media2);
		}
		System.out.print("\nConceito: ");
		
		if (media1 >= 90 || media2 >= 90 || media3 >= 90) {
			System.out.print("A");
		} else if (media1 >= 75 || media2 >= 75 || media3 >= 75) {
			System.out.print("B");
		} else if (media1 >= 60 || media2 >= 60 || media3 >= 60) {
			System.out.print("C");
		} else {
			System.out.print ("Reprovado!");
		}
		
		input.close();
	}
}
