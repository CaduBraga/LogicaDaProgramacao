import java.util.Scanner;
import java.text.Normalizer;

public class CadastroLivros {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String[] livros = new String[5];
		String[] autores = new String[5];
		int[] anos = new int[5];

		for (int i = 0; i < 5; i++) {

			System.out.println("Cadastro do livro " + (i + 1));

			System.out.print("Digite o título do livro: ");
			livros[i] = normalizarTexto(input.nextLine());

			System.out.print("Digite o autor do livro: ");
			autores[i] = normalizarTexto(input.nextLine());

			System.out.print("Digite o ano de publicação: ");
			anos[i] = input.nextInt();
			input.nextLine();
		}
		System.out.println("Livros cadastrados com sucesso!");
		input.close();
	}

	private static String normalizarTexto(String str) {
		return Normalizer.normalize(str, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "").replaceAll("\\s+", "")
				.toLowerCase();
	}
}
