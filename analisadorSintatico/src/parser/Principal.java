
package parser;

/**
 * Created by caio on 19/10/16.
 */

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.*;

import java.io.*;


import java.io.IOException;

public class Principal {
    public static void main (String[] args ) throws IOException {
        /*
        ArrayList<NovosToken> novosTokens = new ArrayList<>(); //lista de todos os tokens
        ArrayList<String> tabelaSimbolos =  new ArrayList<>();      //tabela de simbolos
        //leitura de arquivos antler
        //o nome do arquivo estará no args[0]
       ANTLRFileStream input = new ANTLRFileStream(args[0]);
        Cmenos lexer = new Cmenos(input);
        //System.out.println(lexer.getRuleNames());
        int hunder;
        Token token = lexer.nextToken();

        while (token.getType() != Cmenos.EOF){

            //System.out.println("\t" + getTokenType(token.getType()) + "\t\t" + token.getText());

            // verifica se é um identificador
            if (token.getType()==25) {
                //verifica se o mesmo já está na tabela de simbolos
                //se ainda não estiver
                if (!tabelaSimbolos.contains(token.getText())) {
                    //adiciona na tabela de simbolos
                    tabelaSimbolos.add(token.getText());
                    // adiciona na lista de tokens com o ponteiro para tabela de simbolos
                    novosTokens.add(new NovosToken (getTokenType(token.getType()), Integer.toString (tabelaSimbolos.size()-1)));
                }

                //se já estiver na tabela de simbolos
                else {
                // adiciona na lista de tokens com o ponteiro para tabela de simbolos , para isso executa-se uma busca na lista para obter a posição

                    novosTokens.add(new NovosToken (getTokenType(token.getType()), Integer.toString (tabelaSimbolos.indexOf(token.getText()))));

                }


            }
            // se não for identificador, adicionar na lista de token, seu tipo e valor
            else {

                novosTokens.add(new NovosToken (getTokenType(token.getType()), token.getText()));
            }
            token = lexer.nextToken();

        }
        //impressão da lista de tokens
        System.out.println("Tokens ");
        for (int i=0; i<novosTokens.size(); i++) {
            System.out.println (" Tipo do Token: " + novosTokens.get(i).getTipo() + "\t Valor: " + novosTokens.get(i).getValor());

        }
        //impressão da tabela de simbolos
        System.out.println("Tabela de simbolos ");
        for (int i=0; i<tabelaSimbolos.size(); i++) {
            System.out.println (" Posicao:" + i + " Simbolo: " +tabelaSimbolos.get(i));

        }

        */

        System.out.println("Análise Sintática");

        File file = new File("testes/teste_fornecido.cmm");
        CmenosLexer scanner = new CmenosLexer((CharStream)(new ANTLRFileStream(file.getAbsolutePath())));
        CommonTokenStream tokens = new CommonTokenStream((TokenSource)scanner);
        CmenosParser parser = new CmenosParser(tokens);
        //parser.removeErrorListeners();
        parser.programa();


    }



    private static String getTokenType(int tipoToken) {

        switch (tipoToken){
            case Cmenos.INT:
                return "INT";
            case Cmenos.FLOAT:
                return "FLOAT";
            case Cmenos.STRUCT:
                return "STRUCT";
            case Cmenos.IF:
                return "IF";
            case  Cmenos.ELSE:
                return "ELSE";
            case Cmenos.RETURN:
                return "RETURN";
            case Cmenos.WHILE:
                return "WHILE";
            case Cmenos.PONTO_VIRGULA:
                return "PONTO_VIRGULA";
            case Cmenos.VIRGULA:
                return "VIRGULA";
            default:
                return "outros";
        }
    }


}

