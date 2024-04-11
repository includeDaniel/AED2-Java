package List5;

public class Ex06 {
    public static void main(String[] args) {
        System.out.println(GP(2, 2, 8));
    }

    public static double GP(double initial, double reason, int n) {
        if(n == 0) return 1;

        return reason * GP(initial, reason, n -1);
    }
}
