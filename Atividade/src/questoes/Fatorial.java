package questoes;

public class Fatorial {

    public static int fatorial(int n) {
        if (n < 0) {
           System.out.println("O número deve ser não negativo.");
        }
        
        int resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

}
