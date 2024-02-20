package Ex05;
public class Produto {
        private final int id;
        private String descricao;
        private float preco;
        private int quant;
        private static int cont = 0;

        public Produto(String d, float p, int q) {
            this.descricao = d;
            this.preco = p;
            this.quant = q;
            cont++;
            this.id = cont;
        }
        public int getCont() {
            return cont;
        }
        public int getId() {
            return id;
        }
        public boolean emEstoque() {
            return quant > 0;
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

        @Override
        public String toString() {
            return "Produto{" +
                    "id=" + id +
                    ", descricao='" + descricao + '\'' +
                    ", preco=" + preco +
                    ", quant=" + quant +
                    '}';
        }
    }
