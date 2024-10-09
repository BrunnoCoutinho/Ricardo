package questoes;

public class Animal {

    private String nome;
    private Som som;

    public Animal(String nome, Som som) {
        this.nome = nome;
        this.som = som;
    }

    public void fazerSom() {
        System.out.print(nome + " faz: ");
        som.emitirSom();
    }

}
