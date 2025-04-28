import java.util.Scanner;
import java.text.Normalizer;

public class CadastroAlunos {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String[] nomes = new String[3];
		int[] idades = new int[3];

		for (int i = 0; i < 3; i++) {

			System.out.println("Cadastro do aluno " + (i + 1));
			System.out.print("Digite o nome do aluno: ");
			nomes[i] = normalizarTexto(input.nextLine());

			System.out.print("Digite a idade do aluno: ");
			idades[i] = input.nextInt();
			input.nextLine();
		}
		System.out.println("Alunos cadastrados com sucesso!");
		input.close();
	}

	private static String normalizarTexto(String str) {
		return Normalizer.normalize(str, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "").replaceAll("\\s+", "")
				.toLowerCase();
	}
}