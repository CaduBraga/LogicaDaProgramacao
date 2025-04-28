public class Atividade6 {
	public static void main(String[] args) {

		int v[] = new int[7], w[] = new int[7];
		v[0] = 2;
		for (int d = 1; d < 4; d++) {
			v[d] = v[d - 1] * 2;
			w[d] = v[d] * 10;
			System.out.printf("v[%d] = %d | w[%d] = %d%n", d, v[d], d, w[d]);
		}
	}
}