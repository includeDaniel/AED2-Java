package List9;

public class main {
    public static void main(String[] args) throws Exception {
        Pilha p = new Pilha();
        PilhaSentinela p1 = new PilhaSentinela();
        p.inserir(122);
        p.inserir(3);
        p.inserir(4);
        p.inserir(18);
        p.inserir(4);

        p.mostraRecursivo();

        System.out.println();

        p.remover();
        p.remover();

        p.mostraRecursivo();

        System.out.println();
        System.out.println();

        p1.inserir(3);
        p1.inserir(5);

        p1.mostrar();

    }
}
