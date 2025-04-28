import java.util.Scanner;
import java.text.Normalizer;

public class CadastroFuncionarios {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String[] nomes = new String[3];
		String[] cargos = new String[3];
		double[] salarios = new double[3];

		for (int i = 0; i < 3; i++) {

			System.out.println("Cadastro do funcionário " + (i + 1));

			System.out.print("Digite o nome do funcionário: ");
			nomes[i] = normalizarTexto(input.nextLine());

			System.out.print("Digite o cargo do funcionário: ");
			cargos[i] = normalizarTexto(input.nextLine());

			System.out.print("Digite o salário do funcionário: ");
			salarios[i] = input.nextDouble();
			input.nextLine();
		}
		System.out.println("Funcionários cadastrados com sucesso!");
		input.close();
	}

	private static String normalizarTexto(String str) {
		return Normalizer.normalize(str, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "").replaceAll("\\s+", "")
				.toLowerCase();
	}
}