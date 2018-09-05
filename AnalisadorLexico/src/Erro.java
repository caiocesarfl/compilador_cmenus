/* Etapa 2 - Analise Sintatica: Elias Macena de Castro */

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

/**
 * Created by Elias on 01/02/2017.
 */
public class Erro extends BaseErrorListener {

    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        System.err.println(" linha:" + line + " coluna:" + charPositionInLine + " " + msg);
    }
}