package List3.Ex03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static int fatorial(int numero) throws EntradaInvalida {
        if(numero > 20) {
            throw new EntradaInvalida("Entrada inválida, o número digitado é maior que 20 \n digite novamente:");
        }
        int fat = 1;
        int n = 1;
        while (++n <= numero) {
            fat += n;
        }
        return fat;
    }
    public static void main(String[] args) throws EntradaInvalida {
        Scanner console = new Scanner(System.in);
        Integer n = null;

        System.out.println("Digite um número para obter o seu fatorial: ");
        do {
            try {
                n = console.nextInt();
                System.out.println(fatorial(n));
            } catch (EntradaInvalida e) {
                System.out.println(e);
            }
        } while (n > 20);

    }
}
