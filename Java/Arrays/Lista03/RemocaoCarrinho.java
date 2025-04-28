import java.util.Scanner;
import java.text.Normalizer;

public class RemocaoCarrinho {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Digite o nome do produto que deseja remover: ");
		String produtoRemover = normalizarTexto(input.nextLine());
		String[] carrinho = { "Arroz", "Feijão", "Macarrão", "Leite", "Açúcar" };
		boolean encontrado = false;

		for (int i = 0; i < carrinho.length; i++) {
			if (carrinho[i].equalsIgnoreCase(produtoRemover)) {

				carrinho[i] = null;
				encontrado = true;
				break;
			}
		}
		if (encontrado) {
			System.out.println("Produto removido com sucesso!");
		} else {
			System.out.println("Produto não encontrado.");
		}
		input.close();
	}

	private static String normalizarTexto(String str) {
		return Normalizer.normalize(str, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "").replaceAll("\\s+", "")
				.toLowerCase();
	}
}