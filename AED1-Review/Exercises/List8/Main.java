package List8;

public class Main {
    public static void main(String[] args) throws Exception {
        Fila a =  new Fila();
        a.inserir(1);
        a.inserir(2);
        a.inserir(3);
        a.inserir(4);


        a.inverter();
        a.mostrar();

        System.out.println(a.menorRecursivo(a));
    }
}
