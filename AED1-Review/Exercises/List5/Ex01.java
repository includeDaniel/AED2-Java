package List5;

public class Ex01 {
    public static void main(String[] args) {
        int[] vet = {1,2,3,4,5};
        ArrayAoContrario(vet, vet.length);
    }

    public static void ArrayAoContrario(int[] vet, int length) {
        if(length-1 < 0) return;
        System.out.print(vet[length-1] + " ");

        ArrayAoContrario(vet, length -1);
    }
}
