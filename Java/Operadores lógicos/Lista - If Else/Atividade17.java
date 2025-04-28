import java.util.Scanner;

public class Atividade17{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("aX² + bX + c\nDigite o valor de a: ");
		double a = input.nextDouble();
		System.out.print("Digite o valor de b: ");
		double b = input.nextDouble();
		System.out.print("Digite o valor de c: ");
		double c = input.nextDouble();

		double delta = (b * b) - 4 * a * c;
		double raizDelta = Math.sqrt(delta);
		double bNegativo = b - (b * 2);
		double bhaskaraMenos = (bNegativo - raizDelta) / 2 * a;
		double bhaskaraMais = (bNegativo + raizDelta) / 2 * a;

		if (delta == 0) {
			System.out.printf("Os valor de X é: %.2f", bhaskaraMenos);
		} 
		if (delta < 0) {
			System.out.print("Não existe solução real");
		} 
		if (delta > 0) {
			System.out.printf("Os valores de X são %.2f e %.2f", bhaskaraMenos, bhaskaraMais);
		}

		input.close();
	}
}