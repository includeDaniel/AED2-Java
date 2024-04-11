package List5;

public class Ex09 {
    public static void main(String[] args) {

        int[] vet = {2,0,4,5,1};

        System.out.println(MinValue(vet, vet.length, vet[vet.length-1]));

    }

    public static int MinValue(int[] vet, int length, int mV) {
        if(length-1 < 0) return mV;
          if(vet[length - 1] < mV) {
              mV = vet[length-1];
          }
        return MinValue(vet,length -1, mV);
    }
    }

