package questoes;

public abstract class Funcionario {

    protected String nome;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public abstract double calcularSalario();

    public void exibirDetalhes() {
        System.out.println("Funcionário: " + nome + ", Salário: R$ " + calcularSalario());
    }

}
