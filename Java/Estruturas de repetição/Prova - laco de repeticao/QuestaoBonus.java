import java.util.Scanner;

public class QuestaoBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o número de avaliações a serem coletadas: ");
        int n = input.nextInt();
        input.nextLine();

        int somaNotas = 0;
        int positivas = 0;
        int negativas = 0;
        int neutras = 0;

        StringBuilder comentariosPositivos = new StringBuilder();
        StringBuilder comentariosNegativos = new StringBuilder();
        StringBuilder comentariosNeutros = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            System.out.printf("\nAvaliação %d:\n", i);
            int nota;
            while (true) {
                System.out.print("Nota (1 a 5): ");
                nota = input.nextInt();
                input.nextLine();
                if (nota >= 1 && nota <= 5) 
                break;
                System.out.println("Nota inválida! Digite um valor entre 1 e 5.");
            }
            somaNotas += nota;

            System.out.print("Comentário (opcional): ");
            String comentario = input.nextLine().trim();

            if (nota == 4 || nota == 5) {
                positivas++;
                if (!comentario.isEmpty()) {
                    comentariosPositivos.append("- ").append(comentario).append("\n");
                }
            } else if (nota == 1 || nota == 2) {
                negativas++;
                if (!comentario.isEmpty()) {
                    comentariosNegativos.append("- ").append(comentario).append("\n");
                }
            } else if (nota == 3) {
                neutras++;
                if (!comentario.isEmpty()) {
                    comentariosNeutros.append("- ").append(comentario).append("\n");
                }
            }
        }

        double media = (double) somaNotas / n;
        System.out.printf("\nMédia de Satisfação: %.1f\n", media);
        System.out.println("Número de avaliações Positivas: " + positivas);
        System.out.println("Número de avaliações Negativas: " + negativas);
        System.out.println("Número de avaliações Neutras: " + neutras);
        System.out.println("Total de avaliações: " + n);

        if (comentariosPositivos.length() > 0) {
            System.out.println("\nComentários Positivos:");
            System.out.print(comentariosPositivos);
        }
        if (comentariosNegativos.length() > 0) {
            System.out.println("\nComentários Negativos:");
            System.out.print(comentariosNegativos);
        }
        if (comentariosNeutros.length() > 0) {
            System.out.println("\nComentários Neutros:");
            System.out.print(comentariosNeutros);
        }

        input.close();
    }
} 