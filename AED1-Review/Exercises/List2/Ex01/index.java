package List2.Ex01;

public class index {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("João", "Silva");
        Funcionario pessoa2 = new Funcionario("Maria", "Medeiros", 123, 1750);

        Professor pessoa3 = new Professor("José", "Souza", 223, -500);
        Professor pessoa4 = new Professor("Ana", "Oliveira", 332, 1500);

        pessoa1.getNomeCompleto();
        pessoa2.getNomeCompleto();
        pessoa3.getNomeCompleto();
        pessoa4.getNomeCompleto();

        pessoa2.getSalarioPrimeiraParcela();
        pessoa2.getSalarioSegundaParcela();

        pessoa3.getSalarioPrimeiraParcela();
        pessoa3.getSalarioSegundaParcela();

        pessoa4.getSalarioPrimeiraParcela();
        pessoa4.getSalarioSegundaParcela();
    }
}
