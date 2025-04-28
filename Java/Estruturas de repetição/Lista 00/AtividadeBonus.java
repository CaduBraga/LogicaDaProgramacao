import java.util.Scanner;
public class AtividadeBonus {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       String item1 = "Hambúrguer", item2 = "Cachorro-Quente", item3 = "Suco", item4 = "Refrigerante";
       double preco1 = 20.00, preco2 = 15.00, preco3 = 7.00, preco4 = 6.00;
       boolean continuar = true;
       double total = 0;
       while (continuar) {
           System.out.printf("1 - %s (R$ %.2f)\n", item1, preco1);
           System.out.printf("2 - %s (R$ %.2f)\n", item2, preco2);
           System.out.printf("3 - %s (R$ %.2f)\n", item3, preco3);
           System.out.printf("4 - %s (R$ %.2f)\n", item4, preco4);
           System.out.println("0 - Finalizar pedido");
           System.out.print("\nDigite o item desejado: ");
           int opcao = input.nextInt();
           switch (opcao) {
               case 0:
                   continuar = false;
                   break;
               case 1:
                   total += preco1;
                   System.out.printf("Você adicionou %s ao pedido. (R$ %.2f)\n", item1, preco1);
                   break;
               case 2:
                   total += preco2;
                   System.out.printf("Você adicionou %s ao pedido. (R$ %.2f)\n", item2, preco2);
                   break;
               case 3:
                   total += preco3;
                   System.out.printf("Você adicionou %s ao pedido. (R$ %.2f)\n", item3, preco3);
                   break;
               case 4:
                   total += preco4;
                   System.out.printf("Você adicionou %s ao pedido. (R$ %.2f)\n", item4, preco4);
                   break;
               default:
                   System.out.println("Opção inválida. Tente novamente.");
           }
           if (continuar) {
               System.out.printf("\nTotal parcial: R$ %.2f\n", total);
           }
       }
       System.out.printf("Total do pedido: R$ %.2f\n", total);
       input.close();
   }
}
