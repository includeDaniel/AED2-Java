package List10;

public class MainListaLinear {
    public static void main(String[] args) throws Exception {
        ListaLinear<Integer> L1 = new  ListaLinear();
        L1.inserirFim(2);
        L1.inserirInicio(5);
        L1.inserirFim(1);
        L1.inserirFim(3);
        L1.mostrar();
        L1.removerInicio();
        L1.removerFim();
        L1.mostrar();

        System.out.println();

        ListaLinear<String> L2 = new  ListaLinear();
        L2.inserirFim("ae");
        L2.inserirInicio("da");
        L2.inserirFim("ne");
        L2.inserirFim("ij");
        L2.mostrar();
        L2.removerInicio();
        L2.removerFim();
        L2.mostrar();

        System.out.println();

        ListaLinear<Float> L3 = new  ListaLinear();
        L3.inserirFim((float) 2.5);
        L3.inserirInicio((float) 4.5);
        L3.inserirFim((float) 5.5);
        L3.inserirFim((float) 22.5);
        L3.mostrar();
        L3.removerInicio();
        L3.removerFim();
        L3.mostrar();

        System.out.println();

        ListaLinear<Character> L4 = new  ListaLinear();
        L4.inserirFim('a');
        L4.inserirInicio('d');
        L4.inserirFim('n');
        L4.inserirFim('i');
        L4.mostrar();
        L4.removerInicio();
        L4.removerFim();
        L4.mostrar();
    }
}
