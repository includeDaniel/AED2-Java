package List9;

import List8.Celula;

public class PilhaSentinela {
    private Celula topo;
    private int tamanho;
    public PilhaSentinela(){
        topo = new Celula();
    }
    public void inserir(int y){
        Celula tmp = new Celula(y);
        tmp.prox = topo.prox;
        topo.prox = tmp;
        tmp = null;
        tamanho++;
    }
    public void mostrar(){
        for (Celula i = topo; i != null; i = i.prox){
            System.out.println(i.elemento + " ");
        }
    }
    public int remover(int y) throws Exception{
        if (estaVazia()){
            throw new Exception("Pilha vazia");
        } else {
            int elemento = topo.prox.elemento;
            Celula tmp = topo.prox;
            topo.prox = topo.prox.prox;
            tmp.prox = null;
            tamanho--;
            return elemento;
        }
    }
    public int getTamanho() { return tamanho; }
    public boolean estaVazia(){ return (topo.prox == null); }
}
