package questoes;

public class Documentos {

    public class Relatorio implements Imprimivel {
        
        public void imprimir() {
            System.out.println("Imprimindo Relatório");
        }
    }

    public class Contrato implements Imprimivel {

        public void imprimir() {
            System.out.println("Imprimindo Contrato");
        }
    }

}
