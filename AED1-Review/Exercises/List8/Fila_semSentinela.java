package List8;

public class Fila_semSentinela {
    private Celula primeiro;
    private Celula ultimo;
    public Fila_semSentinela(){
        this.primeiro = null;
        this.ultimo = null;
    }
    public void inserir(int x){
        Celula nova = new Celula(x);
        if (primeiro == null){
            primeiro = nova;
        } else {
            ultimo.prox = nova;
        }
        ultimo = nova;
    }
    public int remover() throws Exception{
        int elemento;
        if (primeiro == null){
            throw new Exception("ERRO: Fila vazia!");
        }
        elemento = primeiro.elemento;
        primeiro = primeiro.prox;
        if (primeiro == null){
            ultimo = null;
        }
        return elemento;
    }
    public void mostrar(){
        Celula i = primeiro;
        while (i != null){
            System.out.print(i.elemento+" | ");
            i = i.prox;
        }
        System.out.println();
    }
}

