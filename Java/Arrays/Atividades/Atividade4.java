public class Atividade4 {
	public static void main(String[] args) {

		int v[] = new int[7], w[] = new int[7];
		for (int a = 0; a < 3; a++) {
			v[a] = 5;
			w[a] = a;
			System.out.printf("v[%d] = %d | w[%d] = %d%n", a, v[a], a, w[a]);
		}
	}
}