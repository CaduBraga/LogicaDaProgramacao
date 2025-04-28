public class Anotacoes5 {
	public static void main(String[] args) {

		int a = 5;
		int b = 5;
		a += ++b;
		System.out.println("A:" + a);
		System.out.println("B:" + b);

		System.out.println("");

		a = 5;
		b = 5;
		a += b++;
		System.out.println("A:" + a);
		System.out.print("B:" + b);
	}
}