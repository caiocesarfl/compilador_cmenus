
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {

        String arquivoNome = "programCorrect.txt";
        File file = new File(arquivoNome);
        AnaliseSemanticaLexer scanner = new AnaliseSemanticaLexer((CharStream)(new ANTLRFileStream(file.getAbsolutePath())));
        CommonTokenStream tokens = new CommonTokenStream((TokenSource)scanner);
        AnaliseSemanticaParser parser = new AnaliseSemanticaParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(new ImprimeErro());
        AnaliseSemanticaParser.ProgramaContext ProgramaContext = parser.programa();
        ParseTreeWalker treeWalker = new ParseTreeWalker();
        MyAnaliseSemanticaListener listener = new MyAnaliseSemanticaListener (parser, tokens);
        treeWalker.walk(listener, ProgramaContext);

        System.out.println("<<< Triplas >>>");
        System.out.println("Operator " + " Arg 1 " + " Arg 2 ");
        for(int i=0; i < ThreeAddressCode.triplas.size(); i++){
            System.out.println(ThreeAddressCode.triplas.get(i).getOperador() + "  |  " + ThreeAddressCode.triplas.get(i).getArgUm()
                    + "  |  " + ThreeAddressCode.triplas.get(i).getArgDois());
        }

        System.out.println("<<< Quadruplas >>>");
        System.out.println("Resultado" + " Operator " + " Arg 1 " + " Arg 2 ");
        for(int i=0; i < ThreeAddressCode.quadruplas.size(); i++){
            System.out.println(ThreeAddressCode.quadruplas.get(i).getResultado() + "  |  " + ThreeAddressCode.quadruplas.get(i).getOperador() + "    | " + ThreeAddressCode.triplas.get(i).getArgUm()
                    + "  |  " + ThreeAddressCode.quadruplas.get(i).getArgDois());
        }
    }
}