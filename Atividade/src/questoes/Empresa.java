package questoes;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private String nome;
    private List<Empregado> empregados;

    // Construtor
    public Empresa(String nome) {
        this.nome = nome;
        this.empregados = new ArrayList<>();
    }

    public void adicionarEmpregado(Empregado empregado) {
        empregados.add(empregado);
    }

    public void listarEmpregados() {
        System.out.println("Empregados da empresa " + nome + ":");
        for (Empregado e : empregados) {
            e.exibirDetalhes();
        }
    }

}
