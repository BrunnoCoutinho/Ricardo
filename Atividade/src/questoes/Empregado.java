package questoes;

public class Empregado {

   public String nome;
   public String cargo;
   public double salario;

    // Construtor
    public Empregado(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Método para exibir os detalhes do empregado
    public void exibirDetalhes() {
        System.out.println("Nome: " + nome + ", Cargo: " + cargo + ", Salário: R$ " + salario);
    }
}
