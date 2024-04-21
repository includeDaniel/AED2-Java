package List5;

public class Ex10 {
    public static void main(String[] args) {

        System.out.println(T(8));

    }

    public static int T(int n) {
        if(n == 0) return 1;
        if(n == 1) return 2;

        return T(n-1) * T(n-2) - T(n-1);
    }
}
