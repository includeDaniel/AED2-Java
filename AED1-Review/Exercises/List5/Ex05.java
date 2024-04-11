package List5;

public class Ex05 {
    public static void main(String[] args) {
        System.out.println(Multiply(25,5));
    }

    public static int Multiply(int A, int B) {
        if (B == 0) return 0;

        return A + Multiply(A, B-1);
    }
}
