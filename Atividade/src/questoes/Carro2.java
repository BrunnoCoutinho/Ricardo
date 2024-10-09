package questoes;

public class Carro2 {

    public String marca;
    public String modelo;
    public int ano;
    public int velocidade;

    public Carro2(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = 0;
    }

    public void exibir(){
        System.out.println(marca + " - "+ modelo+" - " + ano);
    }

    public void acelerar (int valor){
        velocidade += valor;
        System.err.println("Aumentando velocidade: " + velocidade);

    }

    public void frear (int valor){
        velocidade -= valor; 

        if (velocidade < 0) {
            velocidade = 0;
        }

        System.out.println("Baixando velocidade: " + velocidade);
    }

    public void exibirVelocidade (){

        System.out.println("Velocidade final: " + velocidade );
    }
  

}
