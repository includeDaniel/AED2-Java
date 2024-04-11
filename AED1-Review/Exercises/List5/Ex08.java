package List5;

public class Ex08 {
    public static void main(String[] args) {
        System.out.println(MathPow(2, 8));
    }

    public static double MathPow(double n, double toThePowerOf) {
        if(toThePowerOf == 1) return n;

        return n * MathPow(n, toThePowerOf -1);
    }
}
