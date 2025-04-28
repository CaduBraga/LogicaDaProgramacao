import java.util.Scanner;
import java.text.Normalizer;

public class RemocaoUsuario {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String[] usuarios = { "joao123", "maria456", "pedro789" };

		System.out.print("Digite o nome de usuário para remover: ");
		String usuarioRemover = normalizarTexto(input.nextLine());

		boolean encontrado = false;

		for (int i = 0; i < usuarios.length; i++) {

			if (usuarios[i].equals(usuarioRemover)) {
				usuarios[i] = null;
				encontrado = true;
				break;
			}
		}
		if (encontrado) {
			System.out.println("Usuário removido com sucesso!");
		} else {
			System.out.println("Usuário não encontrado.");
		}
		input.close();
	}

	private static String normalizarTexto(String str) {
		return Normalizer.normalize(str, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "").replaceAll("\\s+", "")
				.toLowerCase();
	}

}