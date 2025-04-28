public class TesteDeMesa {
	public static void main(String[] args) {

		int a = 1;
		int b = 2;

		do {

			a++;
			b += 2;
			System.out.println("A: " + a + " B: " + b);

		} while (a < 5);

		System.out.print("Encerrado!");

	}
}