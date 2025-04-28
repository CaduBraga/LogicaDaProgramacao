import java.util.Scanner;
import java.text.Normalizer;

public class CadastroProdutos {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String[] nomes = new String[5];
		double[] precos = new double[5];
		int[] quantidades = new int[5];

		for (int i = 0; i < 5; i++) {

			System.out.println("Cadastro do produto " + (i + 1));
			System.out.print("Digite o nome do produto: ");
			nomes[i] = normalizarTexto(input.nextLine());

			System.out.print("Digite o preço do produto: ");
			precos[i] = input.nextDouble();

			System.out.print("Digite a quantidade em estoque: ");
			quantidades[i] = input.nextInt();
			input.nextLine();
		}
		System.out.println("Produtos cadastrados com sucesso!");
		input.close();
	}

	private static String normalizarTexto(String str) {
		return Normalizer.normalize(str, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "").replaceAll("\\s+", "")
				.toLowerCase();
	}
}