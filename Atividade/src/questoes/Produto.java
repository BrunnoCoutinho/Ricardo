package questoes;

public class Produto {

    public String nome;
    public double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public double somarPrecos(Produto outro) {
        return this.preco + outro.preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }


}
