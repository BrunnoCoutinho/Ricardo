package questoes;

import java.util.ArrayList;
import java.util.List;

public class Escola {

    String nome;
    List<Professor> professores = new ArrayList<>();

    public Escola(String nome) {
        this.nome = nome;
    }

    public void adicionarProfessor(Professor professor) {
        professores.add(professor);
        professor.escolas.add(this);  
    }

    public void listarProfessores() {
        System.out.println("Professores da escola " + nome + ":");
        for (Professor p : professores) {
            System.out.println(p.nome);
        }
    }

}
