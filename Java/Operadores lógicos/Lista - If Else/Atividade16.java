import java.util.Scanner;
public class Atividade16{
	public static void main (String[]args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite a idade do(a) nadador(a): ");
		int idade = input.nextInt();

		if (idade < 5){
			System.out.print("O nadador ainda não pode competir");
		} if (idade <= 7){
			System.out.print("O(A) nadador(a) está na categoria Intantil A");
		} if (idade <= 10){
			System.out.print("O(A) nadador(a) está na categoria Intantil B");
		} if (idade <= 13){
			System.out.print("O(A) nadador(a) está na categoria Juvenil A");
		} if (idade <= 17){
			System.out.print("O(A) nadador(a) está na categoria Juvenil B");
		} if (idade >= 18){
			System.out.print("O(A) nadador(a) está na categoria Adulto");
		}
		
		input.close();
	}
}