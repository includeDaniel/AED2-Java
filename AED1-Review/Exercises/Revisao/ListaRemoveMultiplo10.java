package Revisao;

import java.util.Stack;

public class ListaRemoveMultiplo10 {
    public static Stack<Integer> RemoverMultiplos10(Lista L) throws Exception {
        Stack<Integer> Pilha = new Stack<Integer>();
        int temp ;
        int size = L.tamanho();
        for(int i = 0; i < size; i++) {
            temp = L.removerInicio();
            if(temp % 10 == 0) {
                Pilha.push(temp);
            } else {
                L.inserirFim(temp);
            }
        }
        return Pilha;
    }
    public static void main(String[] args) throws Exception {
        Lista L = new Lista();
        L.inserirFim(2);
        L.inserirFim(10);
        L.inserirFim(2);
        L.inserirFim(30);
        L.inserirFim(4);
        L.inserirFim(100);
        L.mostrar();

        Stack<Integer> P = RemoverMultiplos10(L);
        System.out.println();

        L.mostrar();
        System.out.println(P);
    }
}
