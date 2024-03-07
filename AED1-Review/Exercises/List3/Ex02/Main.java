package List3.Ex02;

public class Main {
    public static double divisao(int a, int b) {
        if(b == 0) {
            throw new ArithmeticException("Divisão por 0!");
        }
        return (double) a / b;
    }
    public static void main(String[] args) {
        try {
            double d = divisao(4,0);
            System.out.println(d);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}
