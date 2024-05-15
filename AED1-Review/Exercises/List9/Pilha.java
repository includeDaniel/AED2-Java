package List9;

import List8.Celula;

public class Pilha {
    private Celula topo;

    public Pilha() {
        topo = null;
    }

    public void inserir(int x) {
        Celula temp = new Celula(x);
        temp.prox = topo;
        topo = temp;
        temp = null;
    }

    public int remover() throws Exception {
        if (topo == null) {
            throw new Exception("Erro ao remover!");
        }
        int resp = topo.elemento;
        Celula tmp = topo;
        topo = topo.prox;
        tmp.prox = null;
        tmp = null;
        return resp;
    }
    public int tamanhoPilha() {
        int tamanho = 0;
        for(int i = 0; topo != null; topo = topo.prox) {
            tamanho++;
        }
        return tamanho;
    }

    public int somaElementos() throws Exception{
        if (estaVazia()){
            throw new Exception("Pilha vazia!");
        }
        return somaElementos(topo);
    }
    private int somaElementos(Celula i){
        if (i.prox == null){
            return i.elemento;
        }
        return i.elemento + somaElementos(i.prox);
    }

    public int maiorElemento() {
        int maior = 0;
        Celula temp = topo;
        while(temp != null) {
            if(temp.elemento > maior) maior = temp.elemento;
            temp = temp.prox;
        }
        return maior;
    }

    public void mostraRecursivo() throws Exception {
        if(estaVazia()) {
            throw new Exception("Vazia");
        }
        Celula temp = topo;
        mostraRecursivo(temp);
    }
    private void mostraRecursivo(Celula temp) throws Exception {
        if(temp != null) {
            System.out.println(temp.elemento);
            mostraRecursivo(temp.prox);
        }
    }

    public void mostrar() {
        Celula temp = topo;
        while(temp != null) {
            System.out.println(temp.elemento);
            temp = temp.prox;
        }
    }

    public boolean estaVazia() {
        if(topo == null) return true;
        return false;
    }
}
