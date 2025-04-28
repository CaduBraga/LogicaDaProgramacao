public class ExemploDoWhile {
	public static void main(String[] args) {
		int i = 1;
		//Começamos com 1, pois é onde começa a contagem
		do {
			System.out.println(i);
			i++;
			// A cada etapa devemos adicionar um (até chegar no valor final, que é 4)
		} while (i <= 4);
		//Verificação de que o valor printado nãp passará de 4
		System.out.print("O loop do-while terminou.");
		//Mensagem de término.
	}
}
