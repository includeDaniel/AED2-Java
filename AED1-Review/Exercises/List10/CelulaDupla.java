package List10;

class CelulaDupla<T> {
    public T elemento;
    public CelulaDupla<T> prox, ant;
    public CelulaDupla () {
        this(null);
    }
    public CelulaDupla (T x) {
        this.elemento = x;
        this.prox = this.ant = null;
    }
}