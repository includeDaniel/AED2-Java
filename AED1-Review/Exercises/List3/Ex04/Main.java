package List3.Ex04;

public class Main {
    public static void main(String[] args) throws TrianguloInvalidoError {
        try {
            Triangulo A = new Triangulo(3, 3, 3);
            System.out.println(A.determinarTipo());
            Triangulo B = new Triangulo(3, 3, 5);
            System.out.println(B.determinarTipo());
            Triangulo C = new Triangulo(3, 4, 5);
            System.out.println(C.determinarTipo());
            Triangulo D = new Triangulo(0, 3, 3);
            System.out.println(D.determinarTipo());
        } catch (TrianguloInvalidoError e) {
            System.out.println(e);
        }
    }
}
