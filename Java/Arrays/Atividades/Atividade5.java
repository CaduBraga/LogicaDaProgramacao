public class Atividade5 {
	public static void main(String[] args) {

		int a = 2, b = 5, v[] = new int[7], w[] = new int[7];
		for (int c = 0; c < 3; c++) {
			v[c] = a;
			w[c] = c * v[c];
			System.out.printf("v[%d] = %d | w[%d] = %d%n", c, v[c], c, w[c]);
		}
	}
}