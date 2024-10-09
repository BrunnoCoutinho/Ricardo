package questoes;

public class Configuracao {

    private static Configuracao instancia;

    private String configuracao;


    private Configuracao() {

        this.configuracao = "Configuração Padrão";
    }

    public static Configuracao getInstancia() {

        if (instancia == null) {
            instancia = new Configuracao();
        }
        return instancia;
    }

    public String getConfiguracao() {
        return configuracao;
    }

    public void setConfiguracao(String configuracao) {
        this.configuracao = configuracao;
    }

}
