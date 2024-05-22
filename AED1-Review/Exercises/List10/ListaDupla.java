package List10;

class ListaDupla<T> {
    private CelulaDupla<T> primeiro, ultimo;
    private int tamanho = 0;

    public ListaDupla() {
        primeiro = new CelulaDupla();
        ultimo = primeiro;
    }

    public void inserirInicio(T x) {
        CelulaDupla tmp = new CelulaDupla(x);
        tmp.ant = primeiro;
        tmp.prox = primeiro.prox;
        primeiro.prox = tmp;
        if (primeiro == ultimo) {
            ultimo = tmp;
        } else {
            tmp.prox.ant = tmp;
        }
        tmp = null;
        tamanho++;
    }

    public void inserirFim(T x) {
        ultimo.prox = new CelulaDupla(x);
        ultimo.prox.ant = ultimo;
        ultimo = ultimo.prox;
        tamanho++;
    }

    public void inserir(T x, int pos) throws Exception {
        if (pos < 0 || pos > tamanho){
            throw new Exception("Erro!");
        } else if (pos == 0){ inserirInicio(x);
        } else if (pos == tamanho){ inserirFim(x);
        } else {
            CelulaDupla i = primeiro;
            for (int j = 0; j < pos; j++, i = i.prox);
            CelulaDupla tmp = new CelulaDupla(x);
            tmp.ant = i;
            tmp.prox = i.prox;
            tmp.ant.prox = tmp.prox.ant = tmp;
            tmp = i = null;
            tamanho++;
        }
    }

    public T removerInicio() throws Exception {
        if (primeiro == ultimo)
            throw new Exception("Erro!");
        CelulaDupla tmp = primeiro;
        primeiro = primeiro.prox;
        T elemento = primeiro.elemento;
        tmp.prox = primeiro.ant = null;
        tmp = null;
        return elemento;
    }

    public T removerFim() throws Exception {
        if (primeiro == ultimo)
            throw new Exception("Erro!");
        T elemento = ultimo.elemento;
        ultimo = ultimo.ant;
        ultimo.prox.ant = null;
        ultimo.prox = null;
        return elemento;
    }
    public T remover(int pos) throws Exception {
        T elemento;
        if (primeiro == ultimo){
            throw new Exception("Erro!");
        } else if (pos < 0 || pos >= tamanho){
            throw new Exception("Erro!");
        } else if (pos == 0){
            elemento = removerInicio();
        } else if (pos == tamanho - 1){
            elemento = removerFim();
        } else {
            CelulaDupla i = primeiro.prox;
            for (int j = 0; j < pos; j++, i = i.prox);
            i.ant.prox = i.prox;
            i.prox.ant = i.ant;
            elemento = (T) i.elemento;
            i.prox = i.ant = null;
            i = null;
        }
        return elemento;
    }

    public void mostrar() {
        System.out.print("[");
        for(CelulaDupla i = primeiro; i != ultimo; i = i.prox) {
            System.out.print(i.elemento + " ");
        }
        System.out.print("]");
    }

    private int tamanho() {return tamanho;}
}
