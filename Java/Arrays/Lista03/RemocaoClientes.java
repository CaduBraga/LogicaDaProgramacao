import java.util.Scanner;
import java.text.Normalizer;

public class RemocaoClientes {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String[] clientes = { "12345", "67890", "11223" };
		System.out.print("Digite o número da conta para remover: ");
		String contaRemover = normalizarTexto(input.nextLine());
		boolean encontrado = false;

		for (int i = 0; i < clientes.length; i++) {

			if (clientes[i].equals(contaRemover)) {
				clientes[i] = null;
				encontrado = true;
				break;
			}
		}
		if (encontrado) {
			System.out.println("Cliente removido com sucesso!");
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