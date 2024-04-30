package List8;

import java.lang.reflect.Array;

public class Fila {
    private Celula primeiro, ultimo;
    public Fila() {
        primeiro = new Celula();
        ultimo = primeiro;
    }
    public void inserir(int x) {
        ultimo.prox = new Celula(x);
        ultimo = ultimo.prox;
    }
    public int remover() throws Exception {
        if (primeiro == ultimo) throw new Exception("Lista vazia!");
        Celula tmp = primeiro;
        primeiro = primeiro.prox;
        int elemento = primeiro.prox.elemento;
        tmp.prox = null;
        tmp = null;
        return elemento;
    }
    public void mostrar() throws Exception{
        if(primeiro == ultimo) throw new Exception("Lista vazia!");
        Celula temp;
        for(temp = primeiro.prox;temp != ultimo.prox; temp = temp.prox) {
            System.out.println(temp.elemento);
        }
    }
    public int amplitude() {
        if(primeiro == ultimo) return 0;
        int maior = 0, menor = primeiro.prox.elemento;
        Celula temp = primeiro.prox;
        while (temp != ultimo.prox) {
            if(temp.elemento > maior) maior = temp.elemento;
            if(temp.elemento < menor) menor = temp.elemento;
            temp = temp.prox;
        }
        return maior - menor;
    }
    public double mediaDosElementos() {
        if(primeiro == ultimo) return 0.0;
        int soma = 0, contador = 0;
        Celula temp = primeiro.prox;
        while (temp != ultimo.prox) {
            soma += temp.elemento;
            contador++;
            temp = temp.prox;
        }
        return (float) soma / contador;
    }
    public void furaFila(int elemento, int pos) {
        int contador = 0;
        Celula temp = primeiro.prox;
        while (temp != ultimo.prox) {
            contador++;
            if(contador == pos) temp.elemento = elemento;
            temp = temp.prox;
        }
    }
    public int menorRecursivo(Fila f) throws Exception {
        if (primeiro == ultimo){
            throw new Exception("ERRO!!!");
        }

        return menorRecursivo(primeiro.prox);
    }
    public int menorRecursivo (Celula i) throws Exception {
        int menor = Integer.MAX_VALUE;
        if (i == null) {
            return menor;
        }
        menor = menorRecursivo(i.prox);
        return Math.min(i.elemento, menor);
    }
    public void inverter(){
        Celula fim = ultimo;
        while (primeiro.prox != fim){
            Celula nova = new Celula(primeiro.prox.elemento);
            nova.prox = fim.prox;
            fim.prox = nova;
            Celula temp = primeiro.prox;
            primeiro.prox = temp.prox;
            nova = temp = null;
            if (ultimo == fim){
                ultimo = ultimo.prox;
            }
        }
        fim = null;
    }
}
