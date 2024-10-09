package questoes;

public class FuncionarioHorista extends Funcionario {
    
    private double hrsTrabalhadas;
    private double valorPorHora;

    public FuncionarioHorista(String nome, double hrsTrabalhadas, double valorPorHora) {
        super(nome);
        this.hrsTrabalhadas = hrsTrabalhadas;
        this.valorPorHora = valorPorHora;
    }

    @Override
    public double calcularSalario() {
        return hrsTrabalhadas * valorPorHora;
    }
    

}
