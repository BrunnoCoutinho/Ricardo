package questoes;

import java.util.ArrayList;
import java.util.List;
public class Professor {

    String nome;
    List<Escola> escolas = new ArrayList();

    public Professor(String nome) {
        this.nome = nome;
    }

    public void listarEscolas() {
        System.out.println("Escolas do professor " + nome + ":");
        for (Escola escola1 : escolas) {
            System.out.println(escola1.nome);
        }
    }
}
