import java.util.ArrayList;
import java.util.List;

import questoes.*;

public class App {
    public static void main(String[] args) throws Exception {

        //questao 1

        // Carro carro1 = new Carro ("Ferrari","Italia",1986);
        // carro1.exibir();

        //questao2

        // Carro2 carro1 = new Carro2 ("Chevrolet","Onix",2022);
        
        // carro1.exibir();
        // carro1.acelerar(50);
        // carro1.acelerar(40);
        // carro1.frear(10);
        // carro1.frear(5);

        // carro1.exibirVelocidade();

        // questao3

        // ContaBancaria conta = new ContaBancaria(8900, "Marta");

        // System.out.println("Titular: " + conta.getTitular());
        // System.out.println("Saldo: R$ " + conta.getSaldo()+'\n');

        // conta.depositar(190.0);
        // System.out.println("Saldo após depósito: R$ " + conta.getSaldo()+'\n');

        // conta.sacar(120.0);
        // System.out.println("Saldo após saque: R$ " + conta.getSaldo()+'\n');

        // conta.sacar(10.0);
        // System.out.println("Saldo final: R$ " + conta.getSaldo()+'\n');

        // questao4

        // Som somCachorro = new Som("AuAu");
        // Som somGato = new Som("Miau");
        // Som somVaca = new Som("Muuh");

        // somCachorro.emitirSom();
        // somGato.emitirSom();
        // somVaca.emitirSom();

        //questao5

        // Som somCachorro = new Som("AuAu");
        // Som somGato = new Som("Miau");
        // Som somVaca = new Som("Muuh");

        // Animal cachorro = new Animal("Cachorro", somCachorro);
        // Animal gato = new Animal("Gato", somGato);
        // Animal vaca = new Animal("Vaca", somVaca);

        // List<Animal> animais = new ArrayList<>();
        // animais.add(cachorro);
        // animais.add(gato);
        // animais.add(vaca);

        // for (Animal animal : animais) {
        //     animal.fazerSom();
        // }

        //questao6

        // Motor motor = new Motor(120,"Gasolina");
        // Carro3 carro = new Carro3 ("Ford","Toro",2014,motor);

        // carro.exibir();

        //questao7

        // Professor prof1 = new Professor("Carlos");
        // Professor prof2 = new Professor("Lucas");

        // Escola escolaA = new Escola("Escola A");
        // Escola escolaB = new Escola("Escola B");

        // escolaA.adicionarProfessor(prof1);
        // escolaA.adicionarProfessor(prof2);
        // escolaB.adicionarProfessor(prof1);

        // escolaA.listarProfessores(); 
        // escolaB.listarProfessores(); 

        // prof1.listarEscolas();
        // prof2.listarEscolas();

        //questao8

        // Empresa empresa = new Empresa("Tech inova");

        // Empregado empregado1 = new Empregado("João", "Gerente", 5000);
        // Empregado empregado2 = new Empregado("Tales", "Caixa", 1200);

        // empresa.adicionarEmpregado(empregado1);
        // empresa.adicionarEmpregado(empregado2);

        // empresa.listarEmpregados();

        //questao9

        // Documentos documentos = new Documentos();

        // Documentos.Relatorio relatorio = documentos.new Relatorio();
        // relatorio.imprimir();

        // Documentos.Contrato contrato = documentos.new Contrato();
        // contrato.imprimir();

        //questao10

        // Calculadora num = new Calculadora();

        // System.out.println(num.somar(30,15));
        // System.out.println(num.somar(80,10,5));

        //questao11

        // FuncionarioHorista horista = new FuncionarioHorista("Carlos", 200, 45);  
        // FuncionarioAssalariado assalariado = new FuncionarioAssalariado("Tales", 6000);  

        // horista.exibirDetalhes();  
        // assalariado.exibirDetalhes();  

        //questao12

        // Produto produto1 = new Produto("Presunto", 15);
        // Produto produto2 = new Produto("Queijo", 11);

        // double soma = produto1.somarPrecos(produto2);
        // System.out.println("Soma do valor dos produtos: R$ " + soma);

        //questao13

        // int numero = 9;
        // int fatorial = Fatorial.fatorial(numero);
        // System.out.println("Fatorial de " + numero + " é: " + fatorial);

        //questao14

        // Configuracao config1 = Configuracao.getInstancia();
        // System.out.println("Configuração Inicial: " + config1.getConfiguracao());

        // config1.setConfiguracao("Nova configuração adicionada");

        // Configuracao config2 = Configuracao.getInstancia();
        // System.out.println("Configuração Após Alteração: " + config2.getConfiguracao());

        // System.out.println("São iguais: " + (config1 == config2));

        //questao15

        // ContaBancaria2 conta = new ContaBancaria2("Hugo");
     
        // conta.depositar(3000);
        // conta.exibir();

        // try {

        //     conta.sacar(4000);
        // } catch (SaldoInsuficiente e) {
        //     System.out.println("Saque alem do limite: " + e.getMessage());
        // }

        // try {
        //     conta.sacar(1500);
        //     conta.exibir();
        // } catch (SaldoInsuficiente e) {
        //     System.out.println("Exceção capturada: " + e.getMessage());
        // }
    
    }
}
