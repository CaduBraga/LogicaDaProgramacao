public class Atividade8 {
	public static void main(String[] args) {
		int m = 2, n = 4, x = 0, arrayMat[][] = new int[m][n];

		System.out.print("Índices:  ");
		for (int j = 0; j < n; j++) {
			System.out.print(j + " ");
		}
		System.out.println("\n------------------");

		for (int i = 0; i < m; i++) {
			System.out.print(i + "       | ");

			for (int j = 0; j < n; j++) {
				x += j;
				arrayMat[i][j] = x;
				System.out.print(arrayMat[i][j] + " ");
			}
			System.out.println();
		}
	}
}
