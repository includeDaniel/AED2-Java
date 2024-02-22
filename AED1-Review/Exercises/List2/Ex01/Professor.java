package List2.Ex01;
public class Professor extends Funcionario {
    public Professor(String nome, String sobrenome, int matricula, double salario) {
        super(nome, sobrenome, matricula, salario);
    }
    @Override
    public double getSalarioPrimeiraParcela() {
        return salario;
    }

    @Override
    public double getSalarioSegundaParcela() {
        return 0;
    }
}
