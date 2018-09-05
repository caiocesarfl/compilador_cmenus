// Generated from /home/caio/Área de Trabalho/AnalisadorLexico/src/Gramatica.g4 by ANTLR 4.5.3

    import org.antlr.symtab.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GramaticaParser}.
 */
public interface GramaticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(GramaticaParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(GramaticaParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#declaracao_lista}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_lista(GramaticaParser.Declaracao_listaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#declaracao_lista}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_lista(GramaticaParser.Declaracao_listaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao(GramaticaParser.DeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao(GramaticaParser.DeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#var_declaracao}.
	 * @param ctx the parse tree
	 */
	void enterVar_declaracao(GramaticaParser.Var_declaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#var_declaracao}.
	 * @param ctx the parse tree
	 */
	void exitVar_declaracao(GramaticaParser.Var_declaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#tipo_especificador}.
	 * @param ctx the parse tree
	 */
	void enterTipo_especificador(GramaticaParser.Tipo_especificadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#tipo_especificador}.
	 * @param ctx the parse tree
	 */
	void exitTipo_especificador(GramaticaParser.Tipo_especificadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#atributos_declaracao}.
	 * @param ctx the parse tree
	 */
	void enterAtributos_declaracao(GramaticaParser.Atributos_declaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#atributos_declaracao}.
	 * @param ctx the parse tree
	 */
	void exitAtributos_declaracao(GramaticaParser.Atributos_declaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#fun_declaracao}.
	 * @param ctx the parse tree
	 */
	void enterFun_declaracao(GramaticaParser.Fun_declaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#fun_declaracao}.
	 * @param ctx the parse tree
	 */
	void exitFun_declaracao(GramaticaParser.Fun_declaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(GramaticaParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(GramaticaParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#param_lista}.
	 * @param ctx the parse tree
	 */
	void enterParam_lista(GramaticaParser.Param_listaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#param_lista}.
	 * @param ctx the parse tree
	 */
	void exitParam_lista(GramaticaParser.Param_listaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(GramaticaParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(GramaticaParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#composto_decl}.
	 * @param ctx the parse tree
	 */
	void enterComposto_decl(GramaticaParser.Composto_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#composto_decl}.
	 * @param ctx the parse tree
	 */
	void exitComposto_decl(GramaticaParser.Composto_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#local_declaracoes}.
	 * @param ctx the parse tree
	 */
	void enterLocal_declaracoes(GramaticaParser.Local_declaracoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#local_declaracoes}.
	 * @param ctx the parse tree
	 */
	void exitLocal_declaracoes(GramaticaParser.Local_declaracoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#comando_lista}.
	 * @param ctx the parse tree
	 */
	void enterComando_lista(GramaticaParser.Comando_listaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#comando_lista}.
	 * @param ctx the parse tree
	 */
	void exitComando_lista(GramaticaParser.Comando_listaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(GramaticaParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(GramaticaParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#expressao_decl}.
	 * @param ctx the parse tree
	 */
	void enterExpressao_decl(GramaticaParser.Expressao_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#expressao_decl}.
	 * @param ctx the parse tree
	 */
	void exitExpressao_decl(GramaticaParser.Expressao_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#selecao_decl}.
	 * @param ctx the parse tree
	 */
	void enterSelecao_decl(GramaticaParser.Selecao_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#selecao_decl}.
	 * @param ctx the parse tree
	 */
	void exitSelecao_decl(GramaticaParser.Selecao_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#iteracao_decl}.
	 * @param ctx the parse tree
	 */
	void enterIteracao_decl(GramaticaParser.Iteracao_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#iteracao_decl}.
	 * @param ctx the parse tree
	 */
	void exitIteracao_decl(GramaticaParser.Iteracao_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#retorno_decl}.
	 * @param ctx the parse tree
	 */
	void enterRetorno_decl(GramaticaParser.Retorno_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#retorno_decl}.
	 * @param ctx the parse tree
	 */
	void exitRetorno_decl(GramaticaParser.Retorno_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(GramaticaParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(GramaticaParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(GramaticaParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(GramaticaParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#expressao_simples}.
	 * @param ctx the parse tree
	 */
	void enterExpressao_simples(GramaticaParser.Expressao_simplesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#expressao_simples}.
	 * @param ctx the parse tree
	 */
	void exitExpressao_simples(GramaticaParser.Expressao_simplesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#op_relacional}.
	 * @param ctx the parse tree
	 */
	void enterOp_relacional(GramaticaParser.Op_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#op_relacional}.
	 * @param ctx the parse tree
	 */
	void exitOp_relacional(GramaticaParser.Op_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#expressao_soma}.
	 * @param ctx the parse tree
	 */
	void enterExpressao_soma(GramaticaParser.Expressao_somaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#expressao_soma}.
	 * @param ctx the parse tree
	 */
	void exitExpressao_soma(GramaticaParser.Expressao_somaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#soma}.
	 * @param ctx the parse tree
	 */
	void enterSoma(GramaticaParser.SomaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#soma}.
	 * @param ctx the parse tree
	 */
	void exitSoma(GramaticaParser.SomaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(GramaticaParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(GramaticaParser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#mult}.
	 * @param ctx the parse tree
	 */
	void enterMult(GramaticaParser.MultContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#mult}.
	 * @param ctx the parse tree
	 */
	void exitMult(GramaticaParser.MultContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFator(GramaticaParser.FatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFator(GramaticaParser.FatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#ativacao}.
	 * @param ctx the parse tree
	 */
	void enterAtivacao(GramaticaParser.AtivacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#ativacao}.
	 * @param ctx the parse tree
	 */
	void exitAtivacao(GramaticaParser.AtivacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(GramaticaParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(GramaticaParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#args_lista}.
	 * @param ctx the parse tree
	 */
	void enterArgs_lista(GramaticaParser.Args_listaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#args_lista}.
	 * @param ctx the parse tree
	 */
	void exitArgs_lista(GramaticaParser.Args_listaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#num}.
	 * @param ctx the parse tree
	 */
	void enterNum(GramaticaParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#num}.
	 * @param ctx the parse tree
	 */
	void exitNum(GramaticaParser.NumContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#num_int}.
	 * @param ctx the parse tree
	 */
	void enterNum_int(GramaticaParser.Num_intContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#num_int}.
	 * @param ctx the parse tree
	 */
	void exitNum_int(GramaticaParser.Num_intContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#digito}.
	 * @param ctx the parse tree
	 */
	void enterDigito(GramaticaParser.DigitoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#digito}.
	 * @param ctx the parse tree
	 */
	void exitDigito(GramaticaParser.DigitoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#ident}.
	 * @param ctx the parse tree
	 */
	void enterIdent(GramaticaParser.IdentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#ident}.
	 * @param ctx the parse tree
	 */
	void exitIdent(GramaticaParser.IdentContext ctx);
}