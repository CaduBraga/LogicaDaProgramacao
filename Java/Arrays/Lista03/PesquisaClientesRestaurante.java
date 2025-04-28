import java.util.Scanner;
import java.text.Normalizer;

public class PesquisaClientesRestaurante {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Digite o nome do cliente para pesquisa: ");
		String clientePesquisa = normalizarTexto(input.nextLine());
		String[] clientes = { "João Silva", "Maria Oliveira", "Pedro Costa" };
		boolean encontrado = false;

		for (String cliente : clientes) {
			if (cliente.equalsIgnoreCase(clientePesquisa)) {
				encontrado = true;
				break;
			}
		}
		if (encontrado) {
			System.out.println("Cliente encontrado!");
		} else {
			System.out.println("Cliente não encontrado.");
		}
		input.close();
	}

	private static String normalizarTexto(String str) {
		return Normalizer.normalize(str, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "").replaceAll("\\s+", "")
				.toLowerCase();
	}
}