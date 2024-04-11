package List5;

public class Ex03 {
    public static void main(String[] args) {
        System.out.println(NumberOfDigits(5));
    }

    public static int NumberOfDigits(int n) {
        if(n == 0) return 0;
        return 1 + NumberOfDigits(n / 10);
    }

}
