import java.util.Scanner;
import java.text.Normalizer;

public class Ativ1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Escreva uma frase: ");
		String frase = input.nextLine();
		frase = removerAcentos(frase);
		frase = frase.toLowerCase();
		frase = frase.replace(" ", "");
		int vogais = 0;

		for (int contador = 0; contador < frase.length(); contador++) {
			char letra = frase.charAt(contador);
			if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
				vogais++;
			}
		}
		int consoantes = frase.length() - vogais;
		System.out.println("Total de vogais: " + vogais);
		System.out.println("Total de consoantes: " + consoantes);

		input.close();
	}

	private static String removerAcentos(String str) {
		String normalizado = Normalizer.normalize(str, Normalizer.Form.NFD);
		return normalizado.replaceAll("[^\\p{ASCII}]", "");
	}
}