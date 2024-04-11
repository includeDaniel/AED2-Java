package List5;

public class Ex04 {
    public static void main(String[] args) {
        System.out.println(SumOfDigits(111));
    }

    public static int SumOfDigits(int n) {
        if(n < 10) return n;

        return n % 10 + SumOfDigits(n/10);
    }
}
