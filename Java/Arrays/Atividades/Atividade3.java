public class Atividade3 {
    public static void main(String[] args) {
        int a = 7, b = a - 6, v[] = new int[7];

        while (b < a) {
            v[b] = b * a;
            System.out.printf("Valor de b: %d | v[%d] = %d%n", b, b, v[b]);
            b += 2;
        }
    }
}