public class Quadruplas {

    private String resultado;
    private String operador;
    private String argUm;
    private String argDois;

    public Quadruplas(String resultado, String operador, String argUm, String argDois) {
        this.resultado = resultado;
        this.operador = operador;
        this.argUm = argUm;
        this.argDois = argDois;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    public String getArgUm() {
        return argUm;
    }

    public void setArgUm(String argUm) {
        this.argUm = argUm;
    }

    public String getArgDois() {
        return argDois;
    }

    public void setArgDois(String argDois) {
        this.argDois = argDois;
    }
}
