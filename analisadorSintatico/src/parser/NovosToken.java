package parser;

/**
 * Created by caio on 20/10/16.
 */
//classe de tokens
public class NovosToken {
    private String tipo; //tipo do token
    private String valor;

    public NovosToken(String tipo, String valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
