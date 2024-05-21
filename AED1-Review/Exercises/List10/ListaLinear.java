package List10;

public class ListaLinear<T> {
    private T[] array;
    private int n;
    ListaLinear () { this(6); }
    ListaLinear (int tamanho) {
        array = (T[]) new  Object[tamanho];
        n = 0;
    }

    void inserirInicio(T x) throws Exception {
        if (n >= array.length)
            throw new Exception("Erro!");
//levar elementos para o fim do array
        for (int i = n; i > 0; i--){
            array[i] = array[i-1];
        }
        array[0] = x;
        n++;
    }

    void inserirFim(T x) throws Exception {
        if (n >= array.length)
            throw new Exception("Erro!");
        array[n] = x;
        n++;
    }

    void removerInicio() throws Exception {
        if (n >= array.length)
            throw new Exception("Erro!");

        for(int i = n; i > 0; i--) {
            array[i] = array[i+1];
        }
        n--;
    }

    T removerFim() throws Exception {
        if (n == 0)
            throw new Exception("Erro!");
        return array[--n];
    }

    T remover(int pos) throws Exception {
        if(n == 0 || pos < 0 || pos >= n) throw new Exception("Erro!");

        T resp = array[pos];
        n--;

        for(int i = pos; i < n; i++) {
            array[i] = array[i+1];
        }

        return resp;
    }

    void mostrar() {
        System.out.print("[");
        for(int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("]");
    }
}

