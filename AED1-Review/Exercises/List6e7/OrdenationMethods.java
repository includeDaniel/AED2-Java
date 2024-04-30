package List6e7;
import java.util.Random;

public class OrdenationMethods {
    public static double[] BubbleSort( double[] vet ){
        double aux;
        int n= vet.length;
        for ( int i = n-1; i>0; i-- ){
            for ( int j = n-1; j >n-i-1; j-- ){
                if( vet[ j ] < vet[ j-1 ] ){
                    aux = vet[ j ];
                    vet[ j ] = vet[ j -1 ];
                    vet[ j-1 ] = aux;
                }
            }
        }
        return( vet );
    }
    public static double[] SelectionSort(double[] vet){
        int menor;
        for(int fixo = 0; fixo < vet.length-1; fixo++ ){menor = fixo;
            for( int i = menor + 1; i < vet.length; i++ ){if( vet[ i ] < vet[ menor ]){
                menor = i;
            }
            }
            if( menor != fixo ){
                double aux = vet[ fixo ];
                vet[ fixo ] = vet[ menor ];
                vet[ menor ] = aux;
            }
        }
        return( vet );
    }

    public static double[] InsertionSort( double[] vet ){
        double chave;
        int j;
        for ( int i = 1; i < vet.length; i++ ){
            chave = vet[ i ];
            j = i - 1;
            while(j >= 0 && vet[ j ] > chave){
                vet[ j+1 ] = vet[ j ];
                j = j - 1;
            }
            vet[ j+1 ] = chave;
        }
        return( vet );
    }

    //MergeSort
    public static void merge(double[] result, double[] left, double[] right) {
        int i1 = 0; // Índice para a parte esquerda
        int i2 = 0; // Índice para a parte direita
        for (int i = 0; i < result.length; i++) {
            if (i2 >= right.length || (i1 < left.length && left[i1] <= right[i2])) {
                result[i] = left[i1];
                i1++;
            } else {
                result[i] = right[i2];
                i2++;
            }
        }
    }
    public static double[] leftHalf(double[] array) {
        int size1 = array.length / 2;
        double[] left = new double[size1];
        for (int i = 0; i < size1; i++) {
            left[i] = array[i];
        }
        return left;
    }
    public static double[] rightHalf(double[] array) {
        int size1 = array.length / 2;
        int size2 = array.length - size1;
        double[] right = new double[size2];
        for (int i = 0; i < size2; i++) {
            right[i] = array[i + size1];
        }
        return right;
    }
    public static void mergeSort(double[] array) {
        if (array == null) {
            return;
        }
        if (array.length > 1) {
            double[] left = leftHalf(array);
            double[] right = rightHalf(array);
            mergeSort(left);
            mergeSort(right);
            merge(array, left, right);
        }
    }

    //QuickSort
    public static void swap(double [] array ,int i, int j)
    {
        double temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    public static void quicksort(double[] array, int esq, int dir) {
        int i = esq, j = dir;
        double pivo = array[(dir+esq)/2];
        while (i <= j) {
            while (array[i] < pivo) i++;
            while (array[j] > pivo) j--;
            if (i <= j) {
                swap(array,i, j);
                i++;
                j--;
            }
        }
        if (esq < j) quicksort(array,esq, j);
        if (i < dir) quicksort(array ,i, dir);
    }

    public static void shellSort ( double[] v )
    {
        int i , j , h = 1;
        double value;
        do {
            h = 3 * h + 1;
        } while ( h < v.length );
        do {
            h = h / 3;
            for ( i = h; i < v.length; i++) {
                value = v [ i ];
                j = i - h;
                while (j >= 0 && value < v [ j ]) {
                    v [ j + h ] = v [ j ];
                    j = j - h;
                }
                v [ j + h ] = value;
            }
        } while ( h > 1 );
    }
    //HeapSort
    public static void heapify(double[] arr, int n, int i) {
        int largest = i; int left = 2 * i + 1; int right = 2 * i + 2;
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }
        if(right < n && arr[right] > arr[largest]) {
            largest = right;
        }
        if (largest != i) {
        double swap = arr[i];
        arr[i] = arr[largest];
        arr[largest] = swap;
        heapify(arr, n, largest);
        }
    }

    public static void heapSort(double[] arr) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
        for (int i = n - 1; i > 0; i--) {
            double temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }

    public static void main(String[] args) {
        double[] vet= gerarDecrescenteAleatorio(30000);
        heapSort(vet);

        long startTime = System.nanoTime();

        //BubbleSort(vet);
        //SelectionSort(vet);
        //InsertionSort(vet);
        //mergeSort(vet);
        //quicksort(vet,0, vet.length-1);
        //shellSort(vet);
        heapSort(vet);
        long endTime = System.nanoTime();
        long elapsedTimeInMillis = (endTime - startTime) ;
        double timeInSeconds = elapsedTimeInMillis / Math.pow(10, 9);

        System.out.println("Tempo decorrido: " + timeInSeconds + " segundos");    }

    public static double[] gerarAleatorio(int tamanho, double minimo, double maximo) {
        double[] vetorAleatorio = new double[tamanho];
        Random random = new Random();

        for (int i = 0; i < tamanho; i++) {
            vetorAleatorio[i] = minimo + (maximo - minimo) * random.nextDouble();
        }

        return vetorAleatorio;
    }
    public static double[] gerarDecrescenteAleatorio(int tamanho) {
        double[] vetorDecrescenteAleatorio = new double[tamanho];
        Random random = new Random();

        for (int i = 0; i < tamanho; i++) {
            double valor = tamanho - i;

            double parteFracionadaAleatoria = random.nextDouble();
            valor += parteFracionadaAleatoria;

            vetorDecrescenteAleatorio[i] = valor;
        }

        return vetorDecrescenteAleatorio;
    }


}


