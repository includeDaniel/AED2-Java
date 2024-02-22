package List2.Ex01;

public class Funcionario extends Pessoa {
    protected int matricula;
    protected double salario = 0;
    public Funcionario(String nome, String sobrenome, int matricula, double salario) {
        super(nome, sobrenome);
        this.matricula = matricula;
        if(salario < 0) {
            System.out.println("Salario negativo!");
        } else {
            this.salario = salario;
        }
    }
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalarioPrimeiraParcela() {
        return salario * 0.6;
    }

    public double getSalarioSegundaParcela() {
        return salario * 0.4;
    }
}
