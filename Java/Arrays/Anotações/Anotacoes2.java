public class Anotacoes2 {
	public static void main(String[] args) {

		System.out.println("Array 1:");
		int nomeArray1[] = new int[5];
		nomeArray1[0] = 1;
		nomeArray1[2] = 3;
		nomeArray1[1] = 3;
		nomeArray1[3] = 4;
		nomeArray1[4] = 5;
		System.out.println("Indíce 0: " + nomeArray1[0]);
		System.out.println("Indíce 1: " + nomeArray1[1]);
		System.out.println("Indíce 2: " + nomeArray1[2]);
		System.out.println("Indíce 3: " + nomeArray1[3]);
		System.out.println("Indíce 4: " + nomeArray1[4]);

		System.out.println("\nArray 2:");
		String nomeArray2[] = { "Maçã", "Banana", "Abacaxi", "Pêra", "Uva" };
		System.out.println("Indíce 0: " + nomeArray2[0]);
		System.out.println("Indíce 1: " + nomeArray2[1]);
		System.out.println("Indíce 2: " + nomeArray2[2]);
		System.out.println("Indíce 3: " + nomeArray2[3]);
		System.out.println("Indíce 4: " + nomeArray2[4]);
		int tamanhoArray = 5, nomeArray3[] = new int[tamanhoArray];
		nomeArray3[0] = 0;
		nomeArray3[1] = 20;
		nomeArray3[2] = 20;
		nomeArray3[3] = 30;
		nomeArray3[4] = 40;

		System.out.println("\nArray 3:");
		for (int indice = 0; indice < tamanhoArray; indice++) {
			System.out.println("Indíce " + indice + " :" + nomeArray3[indice]);
		}
		
		System.out.println("\nArray teste:");
		int contador = 0;
		int arrayTeste[] = new int[10];
		for (int indice = 0; indice < arrayTeste.length; indice++) {
			contador++;
		}
		System.out.println("Tamanho: " +contador);
	}
}