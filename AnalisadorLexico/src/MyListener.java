import org.antlr.symtab.*;
import java.util.ArrayList;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;


public class MyListener extends GramaticaBaseListener {

    Scope currentScope;
    public TokenStreamRewriter tokens;
    GramaticaParser parser;
    private Codigo3Enderecos ThreeAddress = new Codigo3Enderecos();

    private ArrayList<String> labels = new ArrayList<String>();
    private ArrayList<String> estados = new ArrayList<String>();

    public MyListener(GramaticaParser parser, CommonTokenStream tokens) {
        this.parser = parser;
        this.tokens = new TokenStreamRewriter(tokens);
    }

    private int GerarLabels(){
        String lbl = "L"+(labels.size()+1) ;
        labels.add(lbl);
        return (labels.size()-1);
    }

    private int GerarEstados(){
        String lbl = "T"+(estados.size()) ;
        labels.add(lbl);
        return (labels.size());
    }

    public void TAC(String Instrucao){
        String[] temp = Instrucao.split(":=");

        System.out.println("T0 := "+temp[1]);
        System.out.println(temp[0]+ " := T0");

    }

    @Override public void enterPrograma(GramaticaParser.ProgramaContext ctx) {

        GlobalScope g = new GlobalScope(null);
        ctx.scope = g;
        pushScope(g);
    }

    @Override public void exitPrograma(GramaticaParser.ProgramaContext ctx) {

        popScope();
    }

    @Override public void enterDeclaracao_lista(GramaticaParser.Declaracao_listaContext ctx) {
        super.enterDeclaracao_lista(ctx);
    }

    @Override public void exitDeclaracao_lista(GramaticaParser.Declaracao_listaContext ctx) {
        super.exitDeclaracao_lista(ctx);
    }

    @Override public void enterDeclaracao(GramaticaParser.DeclaracaoContext ctx) {
        super.enterDeclaracao(ctx);
    }

    @Override public void exitDeclaracao(GramaticaParser.DeclaracaoContext ctx) {
        super.exitDeclaracao(ctx);
    }

    @Override public void enterVar_declaracao(GramaticaParser.Var_declaracaoContext ctx) {
        VariableSymbol v = new VariableSymbol(ctx.ident().getText());



        if(ctx.tipo_especificador().getText().equals("int")){
            PrimitiveType type = new PrimitiveType("int");

            v.setType(type);
        }
        if(ctx.tipo_especificador().getText().equals("float")){
            PrimitiveType type = new PrimitiveType("float");
            v.setType(type);
        }
        if(ctx.tipo_especificador().getText().equals("char")){
            PrimitiveType type = new PrimitiveType("char");
            v.setType(type);
        }

        if(currentScope.getSymbol(ctx.ident().getText())!=null){
            System.out.println("variavel "+v.getName()+" já declarada");
            return;
        }


        currentScope.define(v);
    }

    @Override public void exitVar_declaracao(GramaticaParser.Var_declaracaoContext ctx) {
        super.exitVar_declaracao(ctx);
    }

    @Override public void enterTipo_especificador(GramaticaParser.Tipo_especificadorContext ctx) {
        super.enterTipo_especificador(ctx);
    }

    @Override public void exitTipo_especificador(GramaticaParser.Tipo_especificadorContext ctx) {
        super.exitTipo_especificador(ctx);
    }

    @Override public void enterAtributos_declaracao(GramaticaParser.Atributos_declaracaoContext ctx) {
        super.enterAtributos_declaracao(ctx);
    }

    @Override public void exitAtributos_declaracao(GramaticaParser.Atributos_declaracaoContext ctx) {
        super.exitAtributos_declaracao(ctx);
    }

    @Override public void enterFun_declaracao(GramaticaParser.Fun_declaracaoContext ctx) {
        FunctionSymbol f = new FunctionSymbol(ctx.ident().getText());
        f.setEnclosingScope(currentScope);
        currentScope.define(f);
        ctx.scope = f;
        pushScope(f);
    }

    @Override public void exitFun_declaracao(GramaticaParser.Fun_declaracaoContext ctx) {
        popScope();
    }

    @Override public void enterParams(GramaticaParser.ParamsContext ctx) {
        super.enterParams(ctx);
    }

    @Override public void exitParams(GramaticaParser.ParamsContext ctx) {
        super.exitParams(ctx);
    }

    @Override public void enterParam_lista(GramaticaParser.Param_listaContext ctx) {
        super.enterParam_lista(ctx);
    }

    @Override public void exitParam_lista(GramaticaParser.Param_listaContext ctx) {
        super.exitParam_lista(ctx);
    }

    @Override public void enterParam(GramaticaParser.ParamContext ctx) {
        super.enterParam(ctx);
    }

    @Override public void exitParam(GramaticaParser.ParamContext ctx) {
        super.exitParam(ctx);
    }

    @Override public void enterComposto_decl(GramaticaParser.Composto_declContext ctx) {
        super.enterComposto_decl(ctx);
    }

    @Override public void exitComposto_decl(GramaticaParser.Composto_declContext ctx) {
        super.exitComposto_decl(ctx);
    }

    @Override public void enterLocal_declaracoes(GramaticaParser.Local_declaracoesContext ctx) {
        super.enterLocal_declaracoes(ctx);
    }

    @Override public void exitLocal_declaracoes(GramaticaParser.Local_declaracoesContext ctx) {
        super.exitLocal_declaracoes(ctx);
    }

    @Override public void enterComando_lista(GramaticaParser.Comando_listaContext ctx) {
        super.enterComando_lista(ctx);
    }

    @Override public void exitComando_lista(GramaticaParser.Comando_listaContext ctx) {
        super.exitComando_lista(ctx);
    }

    @Override public void enterComando(GramaticaParser.ComandoContext ctx) {
        super.enterComando(ctx);
    }

    @Override public void exitComando(GramaticaParser.ComandoContext ctx) {
        super.exitComando(ctx);
    }

    @Override public void enterExpressao_decl(GramaticaParser.Expressao_declContext ctx) {
        super.enterExpressao_decl(ctx);
    }

    @Override public void exitExpressao_decl(GramaticaParser.Expressao_declContext ctx) {
        super.exitExpressao_decl(ctx);
    }

    @Override public void enterSelecao_decl(GramaticaParser.Selecao_declContext ctx) {
        super.enterSelecao_decl(ctx);

        // System.out.println("<-- Entrou em um IF -->");
        // System.out.println("");

        String Token = ctx.getChild(0).toString();
        if (Token.equals("if")){
            int ID_Label1 = GerarLabels(); //L1
            System.out.println("if " + ctx.getChild(2).getText()+ " goto " +labels.get(ID_Label1));

            //0 endereco 1 e 3 são os parenteses e 5 é else (se tiver)
            if (ctx.getChildCount() > 5){ //tem else no if
                String old1 = "{";
                String old2 = "}";
                String InstrucoesIf = ctx.getChild(6).getText().replace(old1,"").replace(old2,"");

                String[] Instrucoes = InstrucoesIf.split(";");
                for (int i = 0; i < Instrucoes.length; i++){
                    System.out.println("\t" + Instrucoes[i].replace("="," := "));
                }
                System.out.println("goto NEXT ");
                System.out.println(labels.get(ID_Label1)+": ");
                InstrucoesIf = ctx.getChild(4).getText().replace(old1,"").replace(old2,"");

                Instrucoes = InstrucoesIf.split(";");
                for (int i = 0; i < Instrucoes.length; i++){
                    System.out.println("\t" + Instrucoes[i].replace("="," := "));
                }
                System.out.println("NEXT: ");

            }else { // não tem else no if
                String old1 = "{";
                String old2 = "}";
                System.out.println("goto NEXT ");
                System.out.println(labels.get(ID_Label1)+": ");
                String InstrucoesIf = ctx.getChild(4).getText().replace(old1,"").replace(old2,"");

                String[] Instrucoes = InstrucoesIf.split(";");
                for (int i = 0; i < Instrucoes.length; i++){
                    System.out.println("\t" + Instrucoes[i].replace("="," := "));
                }
                System.out.println("NEXT: ");
            }
        }
    }

    @Override public void exitSelecao_decl(GramaticaParser.Selecao_declContext ctx) {
        super.exitSelecao_decl(ctx);
        // System.out.println("<-- Saiu do IF -->");
        System.out.println("");
    }

    @Override public void enterIteracao_decl(GramaticaParser.Iteracao_declContext ctx) {

        //  System.out.println("<-- Entrou em um WHILE --> " + ctx.getText());
        //
        //  System.out.println("");
        String Token = ctx.getChild(0).toString();
        if (Token.equals("while")){
            int ID_Label1 = GerarLabels(); //L1
            int ID_Label2 = GerarLabels(); //L2

            //0 endereco 1 e 3 são os parenteses
            System.out.println(labels.get(ID_Label1) + ": IF " + ctx.getChild(2).getText()+ " goto " +labels.get(ID_Label2));

            //removendo as chaves
            String old1 = "{";
            String old2 = "}";
            String InstrucoesWhile = ctx.getChild(4).getText().replace(old1,"").replace(old2,"");

            String[] Instrucoes = InstrucoesWhile.split(";");
            for (int i = 0; i < Instrucoes.length; i++){
                System.out.println("\t" + Instrucoes[i].replace("="," := "));
            }

            System.out.println("goto " + labels.get(ID_Label1));
            System.out.println(labels.get(ID_Label2) + ":");
        }

    }

    @Override public void exitIteracao_decl(GramaticaParser.Iteracao_declContext ctx) {
        super.exitIteracao_decl(ctx);
        //System.out.println("<-- Saiu do WHILE -->");
        //System.out.println("");
    }

    @Override public void enterRetorno_decl(GramaticaParser.Retorno_declContext ctx) {
        super.enterRetorno_decl(ctx);
    }

    @Override public void exitRetorno_decl(GramaticaParser.Retorno_declContext ctx) {
        super.exitRetorno_decl(ctx);
    }

    @Override public void enterExpressao(GramaticaParser.ExpressaoContext ctx) {
        // System.out.println(" <-- Entrou em uma Expressão --> " + ctx.getText());
        //  System.out.println(" ");
        try {
            ThreeAddress.main(ctx.getText());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override public void exitExpressao(GramaticaParser.ExpressaoContext ctx) {
        //  System.out.println(" <-- Saiu de uma Expressão --> " + ctx.getText());
        // System.out.println(" ");

        if(ctx.var()!=null) {
            VariableSymbol aux = (VariableSymbol) currentScope.getSymbol(ctx.var().getText());
            if(aux!=null) {
                if (aux.getType().getName().equals("int")) {
                    String[] retornoexpressoes = ctx.expressao().getText().split("[-+*/(), ]");
                    VariableSymbol simbolo;
                    for (int i = 0; i < retornoexpressoes.length; i++) {
                        simbolo = (VariableSymbol) currentScope.getSymbol(retornoexpressoes[i].trim());
                        if (simbolo != null) {
                            if (simbolo.getType().getName().equals("char")) {
                                System.out.println("Operação não permitida (int com char)");
                                return;
                            } else if (simbolo.getType().getName().equals("float")) {
                                System.out.println("CAST realizado (int com double");
                                return;
                            } else if (!simbolo.getType().getName().equals("int")) {
                                System.out.println("a variavel: " + ctx.var().ident().getText() + " espera um tipo: int");
                                return;
                            }
                        }
                    }
                }
                if (aux.getType().getName().equals("float")) {
                    String[] retornoexpressoes = ctx.expressao().getText().split("[-+*/(),]");
                    VariableSymbol simbolo;
                    for (int i = 0; i < retornoexpressoes.length; i++) {
                        simbolo = (VariableSymbol) currentScope.getSymbol(retornoexpressoes[i]);
                        if (simbolo != null) {
                            if (simbolo.getType().getName().equals("char")) {
                                System.out.println("Operação não permitido (float com char");
                                return;
                            } else if (simbolo.getType().getName().equals("int")) {
                                System.out.println("a variavel: " + ctx.var().ident().getText() + " espera um tipo: float e recebeu um tipo int.\n Será realizado um CAST de para FLOAT");
                                return;
                            } else if (!simbolo.getType().getName().equals("float")) {
                                System.out.println("a variavel: " + ctx.var().ident().getText() + " espera um tipo: float ");
                                return;
                            }
                        }
                    }
                }
                if (aux.getType().getName().equals("char")) {
                    String[] retornoexpressoes = ctx.expressao().getText().split("[-+*/(),]");
                    VariableSymbol simbolo;
                    for (int i = 0; i < retornoexpressoes.length; i++) {
                        simbolo = (VariableSymbol) currentScope.getSymbol(retornoexpressoes[i]);
                        if (simbolo != null) {
                            if (simbolo.getType().getName().equals("int")) {
                                System.out.println("Operação não permitida: a variavel: " + ctx.var().ident().getText() + " espera um tipo: " +
                                        "CHAR e recebeu um tipo INT.");
                                return;
                            } else if (simbolo.getType().getName().equals("float")) {
                                System.out.println("Operação não permitida: a variavel: " + ctx.var().ident().getText() + " espera um tipo: " +
                                        "CHAR e recebeu um tipo FLOAT.");
                                return;
                            } else if (!simbolo.getType().getName().equals("char")) {
                                System.out.println("a variavel: " + ctx.var().ident().getText() + " espera um tipo: char ");
                                return;
                            }
                        }
                    }
                }
            }
        }
    }

    @Override public void enterVar(GramaticaParser.VarContext ctx) {


        if(currentScope.resolve(ctx.ident().getText())==null){
            System.out.println("\nvariavel " + ctx.ident().getText()+" não foi declarada");
        }
    }

    @Override public void exitVar(GramaticaParser.VarContext ctx) {
        super.exitVar(ctx);
    }

    @Override public void enterExpressao_simples(GramaticaParser.Expressao_simplesContext ctx) {
        super.enterExpressao_simples(ctx);
    }

    @Override public void exitExpressao_simples(GramaticaParser.Expressao_simplesContext ctx) {
        super.exitExpressao_simples(ctx);
    }

    @Override public void enterOp_relacional(GramaticaParser.Op_relacionalContext ctx) {
        super.enterOp_relacional(ctx);
    }

    @Override public void exitOp_relacional(GramaticaParser.Op_relacionalContext ctx) {
        super.exitOp_relacional(ctx);
    }

    @Override public void enterExpressao_soma(GramaticaParser.Expressao_somaContext ctx) {
        super.enterExpressao_soma(ctx);
    }

    @Override public void exitExpressao_soma(GramaticaParser.Expressao_somaContext ctx) {
        super.exitExpressao_soma(ctx);
    }

    @Override public void enterSoma(GramaticaParser.SomaContext ctx) {
        super.enterSoma(ctx);
    }

    @Override public void exitSoma(GramaticaParser.SomaContext ctx) {
        super.exitSoma(ctx);
    }

    @Override public void enterTermo(GramaticaParser.TermoContext ctx) {
        super.enterTermo(ctx);
    }

    @Override public void exitTermo(GramaticaParser.TermoContext ctx) {
        super.exitTermo(ctx);
    }

    @Override public void enterMult(GramaticaParser.MultContext ctx) {
        super.enterMult(ctx);
    }

    @Override public void exitMult(GramaticaParser.MultContext ctx) {
        super.exitMult(ctx);
    }

    @Override public void enterFator(GramaticaParser.FatorContext ctx) {
        super.enterFator(ctx);
    }

    @Override public void exitFator(GramaticaParser.FatorContext ctx) {
        super.exitFator(ctx);
    }

    @Override public void enterAtivacao(GramaticaParser.AtivacaoContext ctx) {
        super.enterAtivacao(ctx);
    }

    @Override public void exitAtivacao(GramaticaParser.AtivacaoContext ctx) {
        super.exitAtivacao(ctx);
    }

    @Override public void enterArgs(GramaticaParser.ArgsContext ctx) {
        super.enterArgs(ctx);
    }

    @Override public void exitArgs(GramaticaParser.ArgsContext ctx) {
        super.exitArgs(ctx);
    }

    @Override public void enterArgs_lista(GramaticaParser.Args_listaContext ctx) {
        super.enterArgs_lista(ctx);
    }

    @Override public void exitArgs_lista(GramaticaParser.Args_listaContext ctx) {
        super.exitArgs_lista(ctx);
    }

    @Override public void enterNum(GramaticaParser.NumContext ctx) {

        if(currentScope.getSymbol(ctx.getText())==null)
        {
            if(ctx.getText().contains(".")){
                PrimitiveType type = new PrimitiveType("float");
                VariableSymbol v = new VariableSymbol(ctx.getText());
                v.setType(type);
                currentScope.define(v);
                //System.out.println(v.getType().getName() + " "+ v.getName());

            }
            else{
                PrimitiveType type = new PrimitiveType("int");
                VariableSymbol v = new VariableSymbol(ctx.getText());
                v.setType(type);
                currentScope.define(v);
                //System.out.println(v.getType().getName() + " "+ v.getName());

            }
        }
    }

    @Override public void exitNum(GramaticaParser.NumContext ctx) {
        super.exitNum(ctx);
    }

    @Override public void enterNum_int(GramaticaParser.Num_intContext ctx) {

        if(currentScope.getSymbol(ctx.getText())==null)
        {

            PrimitiveType type = new PrimitiveType("int");
            VariableSymbol v = new VariableSymbol(ctx.getText());
            v.setType(type);
            currentScope.define(v);
            //System.out.println(v.getType().getName() + " "+ v.getName());


        }
    }

    @Override public void exitNum_int(GramaticaParser.Num_intContext ctx) {
        super.exitNum_int(ctx);
    }

    @Override public void enterDigito(GramaticaParser.DigitoContext ctx) {
        super.enterDigito(ctx);
    }

    @Override public void exitDigito(GramaticaParser.DigitoContext ctx) {
        super.exitDigito(ctx);
    }

    @Override public void enterIdent(GramaticaParser.IdentContext ctx) {
        super.enterIdent(ctx);
    }

    @Override public void exitIdent(GramaticaParser.IdentContext ctx) {
        super.exitIdent(ctx);
    }

    @Override public void enterEveryRule(ParserRuleContext ctx) {
        super.enterEveryRule(ctx);
    }

    @Override public void exitEveryRule(ParserRuleContext ctx) {
        super.exitEveryRule(ctx);
    }

    @Override public void visitTerminal(TerminalNode node) {
        super.visitTerminal(node);
    }

    @Override public void visitErrorNode(ErrorNode node) {
        super.visitErrorNode(node);
    }

    private void pushScope(Scope s) {
        currentScope = s;
        //System.out.println("entering: "+currentScope.getName()+":"+s);
    }

    private void popScope() {
        //System.out.println("leaving: "+currentScope.getName()+":"+currentScope);
        currentScope = currentScope.getEnclosingScope();
    }
}