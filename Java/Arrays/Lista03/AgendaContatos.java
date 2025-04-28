import java.util.Scanner;
import java.text.Normalizer;

public class AgendaContatos {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String[] nomes = new String[5];
		String[] telefones = new String[5];
		String[] emails = new String[5];

		while (true) {
			System.out.println("Escolha uma opção:");
			System.out.println("1 - Cadastrar Contato");
			System.out.println("2 - Pesquisar Contato");
			System.out.println("3 - Remover Contato");
			System.out.println("4 - Sair");

			int opcao = input.nextInt();
			input.nextLine();

			if (opcao == 1) {
				for (int i = 0; i < 5; i++) {

					System.out.print("Digite o nome do contato: ");
					nomes[i] = normalizarTexto(input.nextLine());
					System.out.print("Digite o telefone do contato: ");
					telefones[i] = normalizarTexto(input.nextLine());
					System.out.print("Digite o e-mail do contato: ");
					emails[i] = normalizarTexto(input.nextLine());
					break;
				}
			} else if (opcao == 2) {

				System.out.print("Digite o nome do contato para pesquisa: ");
				String nomePesquisa = normalizarTexto(input.nextLine());
				boolean encontrado = false;

				for (int i = 0; i < 5; i++) {

					if (nomes[i] != null && nomes[i].equalsIgnoreCase(nomePesquisa)) {
						System.out.println("Contato encontrado! Telefone: " + telefones[i] + ", E-mail: " + emails[i]);
						encontrado = true;
						break;
					}
				}

				if (!encontrado) {
					System.out.println("Contato não encontrado.");
				}
			} else if (opcao == 3) {
				System.out.print("Digite o nome do contato para remover: ");
				String nomeRemover = normalizarTexto(input.nextLine());

				boolean encontrado = false;
				for (int i = 0; i < 5; i++) {
					if (nomes[i] != null && nomes[i].equalsIgnoreCase(nomeRemover)) {
						nomes[i] = null;
						telefones[i] = null;
						emails[i] = null;
						System.out.println("Contato removido com sucesso!");
						encontrado = true;
						break;
					}
				}
				if (!encontrado) {
					System.out.println("Contato não encontrado.");
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