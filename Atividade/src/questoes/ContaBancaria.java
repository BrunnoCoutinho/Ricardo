package questoes;

public class ContaBancaria {

    private double saldo;
    private String titular;

    public ContaBancaria(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }
    
    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void depositar(double valor) {

        if (valor > 0){
            saldo += valor;
            System.out.println("Deposito realizado feito sucesso");
        }
        else{
            System.out.println("Valor de deposito invalido");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo){
            saldo -= valor;
            System.out.println("Saque realidado feito sucesso");
        }
        else {
            System.out.println("Saldo insuficiente para realizar o saque");
        }
    }



}
