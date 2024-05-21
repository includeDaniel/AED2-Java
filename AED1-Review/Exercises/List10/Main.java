package List10;

public class Main {
    public static void main(String[] args) throws Exception {
        ListaLinear L = new ListaLinear();
        L.inserirFim(2);
        L.inserirFim(5);
        L.mostrar();
        L.removerInicio();
        L.mostrar();
    }
}
