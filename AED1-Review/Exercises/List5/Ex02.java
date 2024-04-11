package List5;

public class Ex02 {
    public static void main(String[] args) {

        int A = 10;
        int B = 2;

        System.out.println(Divide(A,B));
    }

    public static int Divide(int A, int B) {
        if (A < B) return 0;
        return 1 + Divide(A-B, B);
    }
}
