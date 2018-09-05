// Generated from C:/Users/Elias/Desktop/TP3_Compiladores/src\AnaliseSemantica.g4 by ANTLR 4.5.3

    import org.antlr.symtab.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AnaliseSemanticaParser}.
 */
public interface AnaliseSemanticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AnaliseSemanticaParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(AnaliseSemanticaParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnaliseSemanticaParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(AnaliseSemanticaParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnaliseSemanticaParser#declaracao_lista}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_lista(AnaliseSemanticaParser.Declaracao_listaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnaliseSemanticaParser#declaracao_lista}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_lista(AnaliseSemanticaParser.Declaracao_listaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnaliseSemanticaParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao(AnaliseSemanticaParser.DeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnaliseSemanticaParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao(AnaliseSemanticaParser.DeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnaliseSemanticaParser#var_declaracao}.
	 * @param ctx the parse tree
	 */
	void enterVar_declaracao(AnaliseSemanticaParser.Var_declaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnaliseSemanticaParser#var_declaracao}.
	 * @param ctx the parse tree
	 */
	void exitVar_declaracao(AnaliseSemanticaParser.Var_declaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnaliseSemanticaParser#tipo_especificador}.
	 * @param ctx the parse tree
	 */
	void enterTipo_especificador(AnaliseSemanticaParser.Tipo_especificadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnaliseSemanticaParser#tipo_especificador}.
	 * @param ctx the parse tree
	 */
	void exitTipo_especificador(AnaliseSemanticaParser.Tipo_especificadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnaliseSemanticaParser#atributos_declaracao}.
	 * @param ctx the parse tree
	 */
	void enterAtributos_declaracao(AnaliseSemanticaParser.Atributos_declaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnaliseSemanticaParser#atributos_declaracao}.
	 * @param ctx the parse tree
	 */
	void exitAtributos_declaracao(AnaliseSemanticaParser.Atributos_declaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnaliseSemanticaParser#fun_declaracao}.
	 * @param ctx the parse tree
	 */
	void enterFun_declaracao(AnaliseSemanticaParser.Fun_declaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnaliseSemanticaParser#fun_declaracao}.
	 * @param ctx the parse tree
	 */
	void exitFun_declaracao(AnaliseSemanticaParser.Fun_declaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnaliseSemanticaParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(AnaliseSemanticaParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnaliseSemanticaParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(AnaliseSemanticaParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnaliseSemanticaParser#param_lista}.
	 * @param ctx the parse tree
	 */
	void enterParam_lista(AnaliseSemanticaParser.Param_listaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnaliseSemanticaParser#param_lista}.
	 * @param ctx the parse tree
	 */
	void exitParam_lista(AnaliseSemanticaParser.Param_listaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnaliseSemanticaParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(AnaliseSemanticaParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnaliseSemanticaParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(AnaliseSemanticaParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnaliseSemanticaParser#composto_decl}.
	 * @param ctx the parse tree
	 */
	void enterComposto_decl(AnaliseSemanticaParser.Composto_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnaliseSemanticaParser#composto_decl}.
	 * @param ctx the parse tree
	 */
	void exitComposto_decl(AnaliseSemanticaParser.Composto_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnaliseSemanticaParser#local_declaracoes}.
	 * @param ctx the parse tree
	 */
	void enterLocal_declaracoes(AnaliseSemanticaParser.Local_declaracoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnaliseSemanticaParser#local_declaracoes}.
	 * @param ctx the parse tree
	 */
	void exitLocal_declaracoes(AnaliseSemanticaParser.Local_declaracoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnaliseSemanticaParser#comando_lista}.
	 * @param ctx the parse tree
	 */
	void enterComando_lista(AnaliseSemanticaParser.Comando_listaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnaliseSemanticaParser#comando_lista}.
	 * @param ctx the parse tree
	 */
	void exitComando_lista(AnaliseSemanticaParser.Comando_listaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnaliseSemanticaParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(AnaliseSemanticaParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnaliseSemanticaParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(AnaliseSemanticaParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnaliseSemanticaParser#expressao_decl}.
	 * @param ctx the parse tree
	 */
	void enterExpressao_decl(AnaliseSemanticaParser.Expressao_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnaliseSemanticaParser#expressao_decl}.
	 * @param ctx the parse tree
	 */
	void exitExpressao_decl(AnaliseSemanticaParser.Expressao_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnaliseSemanticaParser#selecao_decl}.
	 * @param ctx the parse tree
	 */
	void enterSelecao_decl(AnaliseSemanticaParser.Selecao_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnaliseSemanticaParser#selecao_decl}.
	 * @param ctx the parse tree
	 */
	void exitSelecao_decl(AnaliseSemanticaParser.Selecao_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnaliseSemanticaParser#iteracao_decl}.
	 * @param ctx the parse tree
	 */
	void enterIteracao_decl(AnaliseSemanticaParser.Iteracao_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnaliseSemanticaParser#iteracao_decl}.
	 * @param ctx the parse tree
	 */
	void exitIteracao_decl(AnaliseSemanticaParser.Iteracao_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnaliseSemanticaParser#retorno_decl}.
	 * @param ctx the parse tree
	 */
	void enterRetorno_decl(AnaliseSemanticaParser.Retorno_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnaliseSemanticaParser#retorno_decl}.
	 * @param ctx the parse tree
	 */
	void exitRetorno_decl(AnaliseSemanticaParser.Retorno_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnaliseSemanticaParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(AnaliseSemanticaParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnaliseSemanticaParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(AnaliseSemanticaParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnaliseSemanticaParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(AnaliseSemanticaParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnaliseSemanticaParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(AnaliseSemanticaParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnaliseSemanticaParser#expressao_simples}.
	 * @param ctx the parse tree
	 */
	void enterExpressao_simples(AnaliseSemanticaParser.Expressao_simplesContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnaliseSemanticaParser#expressao_simples}.
	 * @param ctx the parse tree
	 */
	void exitExpressao_simples(AnaliseSemanticaParser.Expressao_simplesContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnaliseSemanticaParser#op_relacional}.
	 * @param ctx the parse tree
	 */
	void enterOp_relacional(AnaliseSemanticaParser.Op_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnaliseSemanticaParser#op_relacional}.
	 * @param ctx the parse tree
	 */
	void exitOp_relacional(AnaliseSemanticaParser.Op_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnaliseSemanticaParser#expressao_soma}.
	 * @param ctx the parse tree
	 */
	void enterExpressao_soma(AnaliseSemanticaParser.Expressao_somaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnaliseSemanticaParser#expressao_soma}.
	 * @param ctx the parse tree
	 */
	void exitExpressao_soma(AnaliseSemanticaParser.Expressao_somaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnaliseSemanticaParser#soma}.
	 * @param ctx the parse tree
	 */
	void enterSoma(AnaliseSemanticaParser.SomaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnaliseSemanticaParser#soma}.
	 * @param ctx the parse tree
	 */
	void exitSoma(AnaliseSemanticaParser.SomaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnaliseSemanticaParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(AnaliseSemanticaParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnaliseSemanticaParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(AnaliseSemanticaParser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnaliseSemanticaParser#mult}.
	 * @param ctx the parse tree
	 */
	void enterMult(AnaliseSemanticaParser.MultContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnaliseSemanticaParser#mult}.
	 * @param ctx the parse tree
	 */
	void exitMult(AnaliseSemanticaParser.MultContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnaliseSemanticaParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFator(AnaliseSemanticaParser.FatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnaliseSemanticaParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFator(AnaliseSemanticaParser.FatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnaliseSemanticaParser#ativacao}.
	 * @param ctx the parse tree
	 */
	void enterAtivacao(AnaliseSemanticaParser.AtivacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnaliseSemanticaParser#ativacao}.
	 * @param ctx the parse tree
	 */
	void exitAtivacao(AnaliseSemanticaParser.AtivacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnaliseSemanticaParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(AnaliseSemanticaParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnaliseSemanticaParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(AnaliseSemanticaParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnaliseSemanticaParser#args_lista}.
	 * @param ctx the parse tree
	 */
	void enterArgs_lista(AnaliseSemanticaParser.Args_listaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnaliseSemanticaParser#args_lista}.
	 * @param ctx the parse tree
	 */
	void exitArgs_lista(AnaliseSemanticaParser.Args_listaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnaliseSemanticaParser#num}.
	 * @param ctx the parse tree
	 */
	void enterNum(AnaliseSemanticaParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnaliseSemanticaParser#num}.
	 * @param ctx the parse tree
	 */
	void exitNum(AnaliseSemanticaParser.NumContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnaliseSemanticaParser#num_int}.
	 * @param ctx the parse tree
	 */
	void enterNum_int(AnaliseSemanticaParser.Num_intContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnaliseSemanticaParser#num_int}.
	 * @param ctx the parse tree
	 */
	void exitNum_int(AnaliseSemanticaParser.Num_intContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnaliseSemanticaParser#digito}.
	 * @param ctx the parse tree
	 */
	void enterDigito(AnaliseSemanticaParser.DigitoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnaliseSemanticaParser#digito}.
	 * @param ctx the parse tree
	 */
	void exitDigito(AnaliseSemanticaParser.DigitoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnaliseSemanticaParser#ident}.
	 * @param ctx the parse tree
	 */
	void enterIdent(AnaliseSemanticaParser.IdentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnaliseSemanticaParser#ident}.
	 * @param ctx the parse tree
	 */
	void exitIdent(AnaliseSemanticaParser.IdentContext ctx);
}