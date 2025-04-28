import java.util.Scanner;
import java.text.Normalizer;

public class BibliotecaLivros {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String[] livros = new String[5];
		String[] autores = new String[5];
		int[] anos = new int[5];

		while (true) {

			System.out.println("Escolha uma opção:");
			System.out.println("1 - Cadastro de Livro");
			System.out.println("2 - Pesquisa de Livro");
			System.out.println("3 - Remoção de Livro");
			System.out.println("4 - Sair");

			int opcao = input.nextInt();
			input.nextLine();

			if (opcao == 1) {
				for (int i = 0; i < 5; i++) {

					System.out.print("Digite o título do livro: ");
					livros[i] = normalizarTexto(input.nextLine());

					System.out.print("Digite o autor do livro: ");
					autores[i] = normalizarTexto(input.nextLine());

					System.out.print("Digite o ano de publicação: ");
					anos[i] = input.nextInt();
					input.nextLine();
					break;
				}
			} else if (opcao == 2) {
				System.out.print("Digite o título do livro para pesquisa: ");
				String livroPesquisa = normalizarTexto(input.nextLine());
				boolean encontrado = false;

				for (int i = 0; i < 5; i++) {

					if (livros[i] != null && livros[i].equalsIgnoreCase(livroPesquisa)) {
						System.out.println("Livro encontrado. Autor: " + autores[i] + ", Ano: " + anos[i]);
						encontrado = true;
						break;
					}
				}

				if (!encontrado) {
					System.out.println("Livro não encontrado.");
				}
			} else if (opcao == 3) {
				System.out.print("Digite o título do livro para remover: ");
				String livroRemover = normalizarTexto(input.nextLine());
				boolean encontrado = false;

				for (int i = 0; i < 5; i++) {

					if (livros[i] != null && livros[i].equalsIgnoreCase(livroRemover)) {
						livros[i] = null;
						autores[i] = null;
						anos[i] = 0;
						System.out.println("Livro removido com sucesso!");
						encontrado = true;
						break;
					}
				}
				if (!encontrado) {
					System.out.println("Livro não encontrado.");
				}
			} else if (opcao == 4) {
				break;
			}
		}
		input.close();
	}

	private static String normalizarTexto(String str) {
		return Normalizer.normalize(str, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "").replaceAll("\\s+", "")
				.toLowerCase();
	}
}