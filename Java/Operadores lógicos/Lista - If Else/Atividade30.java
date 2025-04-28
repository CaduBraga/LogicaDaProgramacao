import java.util.Scanner; 
public class Atividade30 {
	public static void main (String [] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Digite o valor em R$");
		int valor = input.nextInt();
		
		int cem = valor / 100;
		int restoCem = valor % 100;;
		int cinquenta = restoCem / 50;
		int restoCinquenta = restoCem % 50;
		int vinte = restoCinquenta / 20;
		int restoVinte = restoCinquenta % 20;
		int dez = restoVinte / 10;
		int restoDez = restoVinte % 10;
		int cinco = restoDez / 5;
		int restoCinco = restoDez % 5;
		int dois = restoCinco / 2;
		int restoDois = restoCinco % 2;
		int um = restoDois % 2;
		
		System.out.printf("Valor informado: R$%d\nCédulas de 100: %d\nCédulas de 50: %d\nCédulas de 20: %d\nCédulas de 10: %d\nCédulas de 5: %d\nCédulas de 2: %d\nCédulas de 1: %d", valor, cem, cinquenta, vinte, dez, cinco, dois, um);
		
		input.close();
	}
}