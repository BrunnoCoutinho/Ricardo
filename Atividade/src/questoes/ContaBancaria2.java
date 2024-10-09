package questoes;

public class ContaBancaria2 {

    private String titular;
    private double saldo;

    public ContaBancaria2(String titular) {
        this.titular = titular;
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito deve ser maior que zero.");
        }
    }

    public void sacar(double valor) throws SaldoInsuficiente {
        if (valor > saldo) {
            throw new SaldoInsuficiente("R$ " + valor);
        } else {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void exibir() {
        System.out.println("Titular: " + titular + ", Saldo: R$ " + saldo);
    }

}
