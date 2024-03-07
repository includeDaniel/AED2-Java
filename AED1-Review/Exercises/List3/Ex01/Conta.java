package List3.Ex01;

public class Conta {
    private double saldo;
    private double limiteBanco;
    private String nome, cpf;

    public Conta(String nome, String cpf, double saldo, double limiteBanco) {
        this.setNome(nome);
        this.setCpf(cpf);
        this.setSaldo(saldo);
        this.setLimiteBanco(limiteBanco);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getCPf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimiteBanco() {
        return limiteBanco;
    }

    public void setLimiteBanco(double limiteBanco) {
        this.limiteBanco = limiteBanco;
    }

    public void setSaldo(double saldo) {
        this.saldo = (saldo < 0) ? 0 : saldo;
    }

    public void deposita(double valor) {
        setSaldo((valor < 0) ? saldo : saldo + valor);
    }

    public void saca(double valor) throws SaldoInsuficienteException, GastandoLimiteExeception {
        if (getSaldo() > valor) {
            setSaldo(getSaldo() - valor);
        }else if(getSaldo() + getLimiteBanco() >= valor) {
            setLimiteBanco((getSaldo() + getLimiteBanco()) - valor);
            setSaldo(0);
            throw new GastandoLimiteExeception("Seu limite está em: " + this.limiteBanco);
        } else {
            throw new SaldoInsuficienteException("Seu saldo " + this.saldo + "\ne seu limite: " + this.limiteBanco + "\n Você tentou sacar: " + valor);
        }
    }

    public String toString() {
        return "Cliente: " + this.nome + "\riCPE: " + this.cpf + "\nSaldo: " + this.saldo + "\nLimite: " + this.limiteBanco;
    }


}
