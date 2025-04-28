import java.util.Scanner;

public class Questao2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		boolean continuar = true;
		int contador = 1;
		int naoPerecivel = 0;
		int perecivel = 0;
		int vestuario = 0;
		int higiene = 0;
		int limpeza = 0;

		do {
			System.out.printf("Digite o código do %dº produto (1 - 15). Ou digite 0 para encerrar a operação: ", contador);
			int codigo = input.nextInt();

			if (codigo == 0) {
				System.out.println("\nOperação encerrada!");
				continuar = false;
			} else if (codigo == 1) {
				naoPerecivel++;
			} else if (codigo >= 2 && codigo <= 4) {
				perecivel++;
			} else if (codigo == 5 || codigo == 6) {
				vestuario++;
			} else if (codigo == 7) {
				higiene++;
			} else if (codigo >= 8 && codigo <= 15) {
				limpeza++;
			} else {
				System.out.println("Código inválido. Digite um número de 1 a 15, ou 0 para encerrar a operação!");
				contador--;
			}
			
			contador++;
		} while (continuar == true);

		contador -=2;
		
		System.out.println("\nTotal de produtos por categoria:\n");
		System.out.println("Categoria:            Quantidade:");
		System.out.println("Alimentos não perecíveis:       " + naoPerecivel);
		System.out.println("Alimentos perecíveis:           " + perecivel);
		System.out.println("Vestuário:                      " + vestuario);
		System.out.println("Higiene pessoal:                " + higiene);
		System.out.println("Limpeza e utensílios domésticos:" + limpeza);
		System.out.println("Total de produtos:              " + contador);

		input.close();
	}
}