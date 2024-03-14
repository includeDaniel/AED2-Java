package List1.Ex07;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class index {
    public static void main(String[] args) throws IOException {
        EscreveNumerosTxt();
        SomaDosNumeros();
    }

    @SuppressWarnings("resource")
    public static void EscreveNumerosTxt() {
        Scanner teclado = new Scanner(System.in);
        PrintWriter ps;
        double numero = 1;
        try {
            ps = new PrintWriter("List1/Ex07/texto.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        while (numero > 0) {
            System.out.println("Digite um número: (digite 0 para parar de digitar)");
            numero = teclado.nextDouble();
            if (numero != 0)
                ps.println(numero);
            teclado.nextLine();
        }

        ps.close();
        teclado.close();
    }

    public static void SomaDosNumeros() throws IOException {
        Scanner in = new Scanner(new FileReader("List1/Ex07/texto.txt"));
        double numero = 0;

        if (!in.hasNextLine()) {
            System.out.println("Não há números no txt");
        } else {
            System.out.println("Estes são os números que estão no txt:");
            while (in.hasNextLine()) {
                String line = in.nextLine();
                System.out.println(line);
                numero += Double.parseDouble(line);
            }
            System.out.printf("A soma dos números do txt é: %.2f", numero);
            in.close();
        }
    }
}
