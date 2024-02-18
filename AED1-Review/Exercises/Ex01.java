import java.util.Scanner;
public class Ex01 {
    public static void main(String[] args) {
        int n, m, contador = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um número positivo maior que 1: ");
        n = teclado.nextInt();
        System.out.print("Digite o número de repetições: ");
        m = teclado.nextInt();

        for (int i = 0; i < m; i++) {
            if (contador % 2 == 0) {
                for (int j = 0; j <= n; j++) {
                    System.out.print(j);
                }
            } else {
                for (int j = n; j >= 0; j--) {
                    System.out.print(j);
                }
            }
            contador++;
            System.out.println();
        }
        teclado.close();
    }
}