import java.util.Scanner;

class Atividade5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int idadeSoma = 0;
        int regular = 0;
        int bom = 0;
        int otimo = 0;

        for (int i = 1; i <= 15; i++) {
            System.out.print("Espectador " + i + ", digite sua idade: ");
            int idade = input.nextInt();
            System.out.print("Espectador " + i + ", avalie o filme (1 = regular, 2 = bom, 3 = ótimo): ");
            int voto = input.nextInt();

            if (voto == 1) {
                regular++;
            } else if (voto == 2) {
                bom++;
            } else if (voto == 3) {
            	otimo++;
                idadeSoma += idade;
            }
        }

        double media = idadeSoma / otimo; 
        double porcentagem = (bom / 15) * 100;
        
        System.out.println("Média das idades de quem votou ótimo: " + media);
        System.out.println("Número de votos regulares: " + regular);
        System.out.println("Porcentagem de votos bons: " + porcentagem + "%");

        input.close();
    }
}
