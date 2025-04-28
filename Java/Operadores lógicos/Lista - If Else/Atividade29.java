import java.util.Scanner; 
public class Atividade29 {
	public static void main (String [] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Digite o valor de i: ");
		int i = input.nextInt();
		System.out.print("Digite o valor de a");
		double a = input.nextDouble();
		System.out.print("Digite o valor de b");
		double b = input.nextDouble();
		System.out.print("Digite o valor de c");
		double c = input.nextDouble();
	
		if (i == 1 && a >= b && b >= c) {
			System.out.print("" + c + " " + b + " " + "" + a);
		} else if (i == 1 && b >= a && a >= c) {
			System.out.print("" + c + " " + a + " " + "" + b);
		} else if (i == 1 && c >= b && b >= a) {
			System.out.print("" + a + " " + b + " " + "" + c);
		} else if (i == 1 && a >= c && c >= b) {
			System.out.print("" + b + " " + c + " " + "" + a);
		} else if (i == 1 && b >= c && c >= a) {
			System.out.print("" + a + " " + c + " " + "" + b);
		} else if (i == 1 && c >= a && a >= b) {
			System.out.print("" + b + " " + a + " " + "" + c);
		}
		
		if (i == 2 && a >= b && b >= c) {
			System.out.print("" + a + " " + b + " " + "" + c);
		} else if (i == 2 && b >= a && a >= c) {
			System.out.print("" + b + " " + a + " " + "" + c);
		} else if (i == 2 && c >= b && b >= a) {
			System.out.print("" + c + " " + b + " " + "" + a);
		} else if (i == 2 && a >= c && c >= b) {
			System.out.print("" + a + " " + c + " " + "" + b);
		} else if (i == 2 && b >= c && c >= a) {
			System.out.print("" + b + " " + c + " " + "" + a);
		} else if (i == 2 && c >= a && a >= b) {
			System.out.print("" + c + " " + a + " " + "" + b);
		}
	
		
		if (i == 3 && a >= b && b >= c) {
			System.out.print("" + b + " " + a + " " + "" + c);
		} else if (i == 3 && b >= a && a >= c) {
			System.out.print("" + a + " " + b + " " + "" + c);
		} else if (i == 3 && c >= b && b >= a) {
			System.out.print("" + b + " " + c + " " + "" + a);
		} else if (i == 3 && a >= c && c >= b) {
			System.out.print("" + c + " " + a + " " + "" + b);
		} else if (i == 3 && b >= c && c >= a) {
			System.out.print("" + c + " " + b + " " + "" + a);		
		} else if (i == 3 && c >= a && a >= b) {
			System.out.print("" + a + " " + c + " " + "" + b);
		}
		
		input.close();
	}
}