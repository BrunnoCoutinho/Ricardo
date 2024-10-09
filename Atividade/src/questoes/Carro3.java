package questoes;

public class Carro3 {
    
    public String marca;
    public String modelo;
    public int ano;
    public Motor motor;

    public Carro3(String marca, String modelo, int ano, Motor motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.motor = motor;
    }

    public void exibir(){
        System.out.println(marca + " - "+ modelo+" - " + ano);
        motor.exibirMotor();
    }




}
