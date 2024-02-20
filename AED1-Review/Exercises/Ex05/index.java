package Ex05;
public class index {
    public static void main(String[] args) {
        Produto camisa = new Produto("bem confortável", (float) 53.4, 4);
        Produto camisa2 = new Produto("desconfortável", (float) 12.4, 15);
        System.out.println(camisa.emEstoque());
        System.out.println(camisa.getId());
        System.out.println(camisa);
        camisa.setDescricao("De seda");
        camisa.setPreco(33);
        camisa.setQuant(2);
        System.out.println(camisa);
        System.out.println(camisa2);
        System.out.println(camisa.getCont());
    }
}
