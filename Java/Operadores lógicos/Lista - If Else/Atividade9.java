import java.util.Scanner;
public class Atividade9{
	public static void main (String[]args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		int a = input.nextInt();
		System.out.print("Digite o segundo número: ");
		int b = input.nextInt();
		
		int aPar = a%2;
		int bPar = b%2;

		if (a == 0 && b == 0){
			System.out.print("O números são nulos (0)");
		} else if (aPar == 0 && bPar == 0){ 
			System.out.print("Os números são pares");
		} else if (aPar == 0 || bPar == 0){
			System.out.print("Um dos números é par");	
		} else {
			System.out.print("Os números são ímpares");
		}
		
		input.close();
	}
}