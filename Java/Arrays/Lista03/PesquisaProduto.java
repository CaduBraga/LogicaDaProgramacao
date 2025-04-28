import java.util.Scanner;

public class PesquisaProduto {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String[] produtos = { "Arroz", "Feijão", "Macarrão", "Óleo", "Açúcar" };

		System.out.print("Digite o nome do produto que deseja pesquisar: ");
		String produtoPesquisa = input.nextLine();

		boolean encontrado = false;
		for (String produto : produtos) {
			if (produto.equalsIgnoreCase(produtoPesquisa)) {
				encontrado = true;
				break;
			}
		}

		if (encontrado) {
			System.out.println("Produto encontrado em estoque!");
		} else {
			System.out.println("Produto não encontrado em estoque.");
		}
		input.close();
	}
}