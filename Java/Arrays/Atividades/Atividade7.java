public class Atividade7 {
	public static void main(String[] args) {
		int n = 3, arrayMat[][] = new int[n][n];

		System.out.print("Índices:   ");
		for (int j = 0; j < n; j++) {
			System.out.print(j + " ");
		}
		System.out.println("\n-----------------");

		for (int i = 0; i < n; i++) {
			System.out.print(i + "       |  ");

			for (int j = 0; j < n; j++) {
				arrayMat[i][j] = 1 + i + j;
				System.out.print(arrayMat[i][j] + " ");
			}
			System.out.println();
		}
	}
}