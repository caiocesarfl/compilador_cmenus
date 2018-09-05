
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {

        String arquivoNome = "teste_fornecido.cmm";
        File file = new File(arquivoNome);

        // Análise sintática

        GramaticaLexer scanner = new GramaticaLexer((CharStream)(new ANTLRFileStream(file.getAbsolutePath())));
        CommonTokenStream tokens = new CommonTokenStream((TokenSource)scanner);
        GramaticaParser parser = new GramaticaParser(tokens);

        parser.removeErrorListeners();
        //coloca os erros semanticos

        parser.addErrorListener(new Erro());

        GramaticaParser.ProgramaContext ProgramaContext = parser.programa();
        ParseTreeWalker treeWalker = new ParseTreeWalker();
        MyListener listener = new MyListener(parser, tokens);
        treeWalker.walk(listener, ProgramaContext);

        System.out.println(" Impressão das triplas\n");
        System.out.println("Operador" + " Arg 1 " + " Arg 2 ");
        for(int i = 0; i < Codigo3Enderecos.triplas.size(); i++){
            System.out.println(Codigo3Enderecos.triplas.get(i).getOperador() + "  |  " + Codigo3Enderecos.triplas.get(i).getArgUm()
                    + "  |  " + Codigo3Enderecos.triplas.get(i).getArgDois());
        }

        System.out.println("\n Impressão das Quadruplas\n");
        System.out.println("Resultado" + " Operador " + " Arg 1 " + " Arg 2 ");
        for(int i = 0; i < Codigo3Enderecos.quadruplas.size(); i++){
            System.out.println(Codigo3Enderecos.quadruplas.get(i).getResultado() + "  |  " + Codigo3Enderecos.quadruplas.get(i).getOperador() + "    | " + Codigo3Enderecos.triplas.get(i).getArgUm()
                    + "  |  " + Codigo3Enderecos.quadruplas.get(i).getArgDois());
        }
    }
}