package List5;

public class Ex07 {
    public static void main(String[] args) {

        int[] vet = {1,1,4,4,3,2,6,9};

        System.out.println(Find(vet, vet.length, 2));

    }

    public static int Find(int[] vet, int length,double k) {
        if(length-1 == 0 && k != vet[0]) return -1;
        if(k == vet[length-1]) return length-1;

        return Find(vet, length-1, k);
    }
}
