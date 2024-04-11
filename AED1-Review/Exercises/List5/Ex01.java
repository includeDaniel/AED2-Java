package List5;

public class Ex01 {
    public static void main(String[] args) {
        int[] vet = {1,2,3,4,5};
        ReverseArray(vet, vet.length);
    }

    public static void ReverseArray(int[] vet, int length) {
        if(length-1 < 0) return;
        System.out.print(vet[length-1] + " ");

        ReverseArray(vet, length -1);
    }
}
