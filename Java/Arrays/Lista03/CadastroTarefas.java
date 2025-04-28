import java.util.Scanner;
import java.text.Normalizer;

public class CadastroTarefas {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String[] tarefas = new String[5];
		String[] prazos = new String[5];

		for (int i = 0; i < 5; i++) {

			System.out.println("Cadastro da tarefa " + (i + 1));
			System.out.print("Digite o nome da tarefa: ");
			tarefas[i] = normalizarTexto(input.nextLine());
			System.out.print("Digite o prazo de conclusão (formato dd/mm/aaaa): ");
			prazos[i] = normalizarTexto(input.nextLine());
		}
		System.out.println("Tarefas cadastradas com sucesso!");
		input.close();
	}

	private static String normalizarTexto(String str) {
		return Normalizer.normalize(str, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "").replaceAll("\\s+", "")
				.toLowerCase();
	}
}