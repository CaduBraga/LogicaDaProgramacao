public class Anotacoes3 {
	public static void main(String[] args) {

		System.out.println("\nArray A:");
		int tamanhoA = 10;
		int arrayA[] = new int[tamanhoA];
		arrayA[3] = 10;
		System.out.println("Índice 3: " + arrayA[3]);

		System.out.println("\nArray B:");
		int arrayB[] = new int[5];
		for (int i = 0; i < arrayB.length; i++) {
			arrayB[i] = i + 10;
			System.out.println("Indíce " + i + ": " + arrayB[i]);
		}

		System.out.println("\nArray C:");
		String arrayC[] = new String[8];
		arrayC[1] = "Maria";
		System.out.println("Índice 1: " + arrayC[1]);
	}
}