import java.util.Scanner; 
public class Atividade21 {
	public static void main (String [] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Digite seu peso em quilogramas: ");
		double peso = input.nextDouble();
		System.out.print("Digite sua altura em metros: ");
		double altura = input.nextDouble();
		double alturaQuadrada = altura * altura;
		double imc = peso / alturaQuadrada;
		double pesoMinimo = 18.5 * alturaQuadrada;
		double pesoMaximo = 24.99 * alturaQuadrada;
		double ganhar = pesoMinimo - peso;
		double perder = peso - pesoMaximo;	

		if (imc < 16) {
			System.out.print("Magreza grave");
		} else if (imc < 17) {
			System.out.print("Magreza moderada");
		} else if (imc < 18.5) {
			System.out.print("Magreza leve");
		} else if (imc < 25) {
			System.out.print("Saudável");
		} else if (imc < 30) {
			System.out.print("Sobrepeso");
		} else if (imc < 35) {
			System.out.print("Obesidade grau 1");
		} else if (imc < 40) {
			System.out.print("Obesidade grau 2 (severa)");
		} else {
			System.out.print("Obesidade grau 3 (mórbida)");
		}
		System.out.println("");
		
		if (imc < 18.5) {
			System.out.printf("Para atingir seu peso ideal você deve ganhar %.2f kg", ganhar);
		} else if (imc >= 25 ) {
			System.out.printf("Para atingir seu peso ideal você deve perder %.2f kg", perder);
		} else {
			System.out.print("Você está com um peso saudável");
		}
		
		input.close();
	}
}