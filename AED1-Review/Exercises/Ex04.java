import java.util.Scanner;
public class Ex04 {
    public static void main(String[] args) {
        double[][] matriz = CriaMatriz();
        double[][] transposta = TranspoeMatriz(matriz);

        System.out.println("Impressão da matriz: ");
        ImprimeMatriz(matriz);
        System.out.println();
        System.out.println("Impressão da transposta da matriz: ");
        ImprimeMatriz(transposta);
    }

    public static void ImprimeMatriz(double[][] matriz) {
        for (double[] doubles : matriz) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(doubles[j] + " ");
            }
            System.out.println();
        }
    }

    public static double[][] TranspoeMatriz(double[][] mat) {
        double[][] matriz = new double[mat[0].length][mat.length];
        for(int i = 0; i < mat[0].length; i++) {
            for (int j = 0; j < mat.length; j++) {
                matriz[i][j] = mat[j][i];
            }
        }
        return matriz;
    }
    public static double[][] CriaMatriz() {
        int l, c;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o número de linhas: ");
        l = teclado.nextInt();
        System.out.print("Digite o número de colunas: ");
        c = teclado.nextInt();
        double[][] matriz = new double[l][c];

        for(int i = 0; i < l; i++) {
            for(int j = 0; j < c; j++) {
                System.out.printf("Posição [%d][%d]:\n", i, j);
                matriz[i][j] = teclado.nextDouble();
            }
        }
        teclado.close();
        return matriz;
    }
}
