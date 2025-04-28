public class Atividade2 {
	public static void main(String[] args) {

		int a = 2, v[] = new int[7];
		while (a < 6) {
			v[a] = a * 10;
			System.out.printf("Valor A: %d \nValor v[a]: %d", a, v[a]);
			System.out.println("\n");
			a += 1;
		}
		System.out.printf("Valor A: %d \nValor v[a]: %d", a, v[a]);
	}
}