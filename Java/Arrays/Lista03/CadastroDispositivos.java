import java.util.Scanner;
import java.text.Normalizer;

public class CadastroDispositivos {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String[] nomes = new String[3];
		String[] marcas = new String[3];
		double[] precos = new double[3];

		for (int i = 0; i < 3; i++) {

			System.out.println("Cadastro do dispositivo " + (i + 1));

			System.out.print("Digite o nome do dispositivo: ");
			nomes[i] = normalizarTexto(input.nextLine());

			System.out.print("Digite a marca do dispositivo: ");
			marcas[i] = normalizarTexto(input.nextLine());

			System.out.print("Digite o preço do dispositivo: ");
			precos[i] = input.nextDouble();
			input.nextLine();
		}

		System.out.println("Dispositivos cadastrados com sucesso!");
		input.close();
	}

	private static String normalizarTexto(String str) {
		return Normalizer.normalize(str, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "").replaceAll("\\s+", "")
				.toLowerCase();
	}
}