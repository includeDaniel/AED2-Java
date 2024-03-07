package List3;

import javax.swing.JOptionPane;
public class Banco {
    public static void main(String[] args) {

        double limiteBanco = 200;
        //obtem dados
        String nome = typeString("Digite o nome do cliente");
        String cpf = typeString(" Digite o cpf do cliente");
        double saldo = typeDouble("Digite o saldo inicial do cliente");
        Conta c = new Conta(nome, cpf, saldo, limiteBanco);

        double saque = typeDouble("Digite o valor do saque");

        try {
            c.saca(saque);

        } catch (GastandoLimiteExeception e) {
            JOptionPane.showMessageDialog(null, e);
            JOptionPane.showMessageDialog(null, c.toString());
        } catch (SaldoInsuficienteException e) {
            JOptionPane.showMessageDialog(null, e);


        }
        JOptionPane.showMessageDialog(null, c.toString());
    }

    private static double typeDouble(String txt) {
        String userInput = JOptionPane.showInputDialog(txt);
        Double d = null;

        do {
            try {
                d = Double.parseDouble(userInput);

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valor errado digitado, digite novamente");
                System.out.println("Erro: " + e);
                userInput = JOptionPane.showInputDialog(txt);
            }
        }    while (d == null);
                return d;
    }

    private static String typeString(String txt) {
        return JOptionPane.showInputDialog(null, txt);
    }
}

