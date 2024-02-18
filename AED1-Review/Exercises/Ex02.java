import java.util.Scanner;
public class Ex02 {
    public static void main(String[] args) {
        int n, termoTemp1 = 0, termoTemp2 = 1, fibonacci;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a quantidade de números da sequência fibonacci: ");
        n = teclado.nextInt();

        for(int i = 1; i <= n; i++) {
            fibonacci  = termoTemp1 + termoTemp2;
            System.out.print(fibonacci + " ");
            termoTemp2 = termoTemp1;
            termoTemp1 = fibonacci;
        }
    }
}
