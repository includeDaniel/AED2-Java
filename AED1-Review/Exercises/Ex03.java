import java.util.Scanner;
public class Ex03 {
    public static void main(String[] args) {
        int n;
        double s = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite n: ");
        n = teclado.nextInt();

        for(double i = 1; i <= n; i++) {
            s += 1 / i;
        }
        System.out.println(s);
        teclado.close();
    }
}
