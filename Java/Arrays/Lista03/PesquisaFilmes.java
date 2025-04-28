import java.util.Scanner;
import java.text.Normalizer;

public class PesquisaFilmes {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String[] filmes = { "O Poderoso Chefão", "Titanic", "Vingadores", "Harry Potter", "Matrix" };

		System.out.print("Digite o nome do filme que deseja pesquisar: ");
		String filmePesquisa = normalizarTexto(input.nextLine());
		boolean encontrado = false;

		for (String filme : filmes) {

			if (filme.equalsIgnoreCase(filmePesquisa)) {
				encontrado = true;
				break;
			}
		}

		if (encontrado) {
			System.out.println("Filme encontrado!");
		} else {
			System.out.println("Filme não encontrado.");
		}
		input.close();
	}

	private static String normalizarTexto(String str) {
		return Normalizer.normalize(str, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "").replaceAll("\\s+", "")
				.toLowerCase();
	}
}