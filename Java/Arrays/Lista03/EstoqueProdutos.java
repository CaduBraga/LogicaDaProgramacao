import java.util.Scanner;
import java.text.Normalizer;

public class EstoqueProdutos {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String[] produtos = new String[5];
		int[] quantidades = new int[5];

		while (true) {

			System.out.println("Escolha uma opção:");
			System.out.println("1 - Cadastro de Produto");
			System.out.println("2 - Pesquisa de Produto");
			System.out.println("3 - Remoção de Produto");
			System.out.println("4 - Sair");

			int opcao = input.nextInt();
			input.nextLine();

			if (opcao == 1) {
				for (int i = 0; i < 5; i++) {

					System.out.print("Digite o nome do produto: ");
					produtos[i] = normalizarTexto(input.nextLine());

					System.out.print("Digite a quantidade: ");
					quantidades[i] = input.nextInt();
					input.nextLine();
					break;
				}
			} else if (opcao == 2) {

				System.out.print("Digite o nome do produto para pesquisa: ");
				String produtoPesquisa = normalizarTexto(input.nextLine());

				boolean encontrado = false;
				for (int i = 0; i < 5; i++) {

					if (produtos[i] != null && produtos[i].equalsIgnoreCase(produtoPesquisa)) {
						System.out.println("Produto encontrado. Quantidade: " + quantidades[i]);
						encontrado = true;
						break;
					}
				}
				if (!encontrado) {
					System.out.println("Produto não encontrado.");
				}
			} else if (opcao == 3) {

				System.out.print("Digite o nome do produto para remover: ");
				String produtoRemover = normalizarTexto(input.nextLine());

				boolean encontrado = false;

				for (int i = 0; i < 5; i++) {
					if (produtos[i] != null && produtos[i].equalsIgnoreCase(produtoRemover)) {

						produtos[i] = null;
						quantidades[i] = 0;
						System.out.println("Produto removido com sucesso!");
						encontrado = true;
						break;
					}
				}
				if (!encontrado) {
					System.out.println("Produto não encontrado.");
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