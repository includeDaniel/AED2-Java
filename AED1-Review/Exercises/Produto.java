public class Produto {
    private int id;
    private String descricao;
    private float preco;
    private int quant;
    private int cont;

    public Produto(String d, float p, int q) {
        this.descricao = d;
        this.preco = p;
        this.quant = q;
    }
    public int getCont() {
        return cont;
    }
    public int getId() {
        return id;
    }
    public boolean emEstoque() {
        if(quant <= 0) {
            return false;
        }
        return true;
    }
    public void setDescricao(String d) {
        this.descricao = d;
    }
    public void setPreco(float p) {
        this.preco = p;
    }
    public void setQuant(int q) {
        this.quant = q;
    }
}
