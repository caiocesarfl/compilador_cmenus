// Generated from /home/caio/IdeaProjects/analisadorLexico/src/parser/Cmenos.g4 by ANTLR 4.5.3
package parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CmenosParser}.
 */
public interface CmenosListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CmenosParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(CmenosParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmenosParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(CmenosParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmenosParser#declaracao_lista}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_lista(CmenosParser.Declaracao_listaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmenosParser#declaracao_lista}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_lista(CmenosParser.Declaracao_listaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmenosParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao(CmenosParser.DeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmenosParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao(CmenosParser.DeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmenosParser#var_declaracao}.
	 * @param ctx the parse tree
	 */
	void enterVar_declaracao(CmenosParser.Var_declaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmenosParser#var_declaracao}.
	 * @param ctx the parse tree
	 */
	void exitVar_declaracao(CmenosParser.Var_declaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmenosParser#tipo_especificador}.
	 * @param ctx the parse tree
	 */
	void enterTipo_especificador(CmenosParser.Tipo_especificadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmenosParser#tipo_especificador}.
	 * @param ctx the parse tree
	 */
	void exitTipo_especificador(CmenosParser.Tipo_especificadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmenosParser#atributos_declaracao}.
	 * @param ctx the parse tree
	 */
	void enterAtributos_declaracao(CmenosParser.Atributos_declaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmenosParser#atributos_declaracao}.
	 * @param ctx the parse tree
	 */
	void exitAtributos_declaracao(CmenosParser.Atributos_declaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmenosParser#fun_declaracao}.
	 * @param ctx the parse tree
	 */
	void enterFun_declaracao(CmenosParser.Fun_declaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmenosParser#fun_declaracao}.
	 * @param ctx the parse tree
	 */
	void exitFun_declaracao(CmenosParser.Fun_declaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmenosParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(CmenosParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmenosParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(CmenosParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmenosParser#param_lista}.
	 * @param ctx the parse tree
	 */
	void enterParam_lista(CmenosParser.Param_listaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmenosParser#param_lista}.
	 * @param ctx the parse tree
	 */
	void exitParam_lista(CmenosParser.Param_listaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmenosParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(CmenosParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmenosParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(CmenosParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmenosParser#composto_decl}.
	 * @param ctx the parse tree
	 */
	void enterComposto_decl(CmenosParser.Composto_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmenosParser#composto_decl}.
	 * @param ctx the parse tree
	 */
	void exitComposto_decl(CmenosParser.Composto_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmenosParser#local_declaracoes}.
	 * @param ctx the parse tree
	 */
	void enterLocal_declaracoes(CmenosParser.Local_declaracoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmenosParser#local_declaracoes}.
	 * @param ctx the parse tree
	 */
	void exitLocal_declaracoes(CmenosParser.Local_declaracoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmenosParser#comando_lista}.
	 * @param ctx the parse tree
	 */
	void enterComando_lista(CmenosParser.Comando_listaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmenosParser#comando_lista}.
	 * @param ctx the parse tree
	 */
	void exitComando_lista(CmenosParser.Comando_listaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmenosParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(CmenosParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmenosParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(CmenosParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmenosParser#expressao_decl}.
	 * @param ctx the parse tree
	 */
	void enterExpressao_decl(CmenosParser.Expressao_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmenosParser#expressao_decl}.
	 * @param ctx the parse tree
	 */
	void exitExpressao_decl(CmenosParser.Expressao_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmenosParser#selecao_decl}.
	 * @param ctx the parse tree
	 */
	void enterSelecao_decl(CmenosParser.Selecao_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmenosParser#selecao_decl}.
	 * @param ctx the parse tree
	 */
	void exitSelecao_decl(CmenosParser.Selecao_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmenosParser#iteracao_decl}.
	 * @param ctx the parse tree
	 */
	void enterIteracao_decl(CmenosParser.Iteracao_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmenosParser#iteracao_decl}.
	 * @param ctx the parse tree
	 */
	void exitIteracao_decl(CmenosParser.Iteracao_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmenosParser#retorno_decl}.
	 * @param ctx the parse tree
	 */
	void enterRetorno_decl(CmenosParser.Retorno_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmenosParser#retorno_decl}.
	 * @param ctx the parse tree
	 */
	void exitRetorno_decl(CmenosParser.Retorno_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmenosParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(CmenosParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmenosParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(CmenosParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmenosParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(CmenosParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmenosParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(CmenosParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmenosParser#expressao_simples}.
	 * @param ctx the parse tree
	 */
	void enterExpressao_simples(CmenosParser.Expressao_simplesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmenosParser#expressao_simples}.
	 * @param ctx the parse tree
	 */
	void exitExpressao_simples(CmenosParser.Expressao_simplesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmenosParser#op_relacional}.
	 * @param ctx the parse tree
	 */
	void enterOp_relacional(CmenosParser.Op_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmenosParser#op_relacional}.
	 * @param ctx the parse tree
	 */
	void exitOp_relacional(CmenosParser.Op_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmenosParser#expressao_soma}.
	 * @param ctx the parse tree
	 */
	void enterExpressao_soma(CmenosParser.Expressao_somaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmenosParser#expressao_soma}.
	 * @param ctx the parse tree
	 */
	void exitExpressao_soma(CmenosParser.Expressao_somaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmenosParser#soma}.
	 * @param ctx the parse tree
	 */
	void enterSoma(CmenosParser.SomaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmenosParser#soma}.
	 * @param ctx the parse tree
	 */
	void exitSoma(CmenosParser.SomaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmenosParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(CmenosParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmenosParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(CmenosParser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmenosParser#mult}.
	 * @param ctx the parse tree
	 */
	void enterMult(CmenosParser.MultContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmenosParser#mult}.
	 * @param ctx the parse tree
	 */
	void exitMult(CmenosParser.MultContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmenosParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFator(CmenosParser.FatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmenosParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFator(CmenosParser.FatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmenosParser#ativacao}.
	 * @param ctx the parse tree
	 */
	void enterAtivacao(CmenosParser.AtivacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmenosParser#ativacao}.
	 * @param ctx the parse tree
	 */
	void exitAtivacao(CmenosParser.AtivacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmenosParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(CmenosParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmenosParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(CmenosParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmenosParser#args_lista}.
	 * @param ctx the parse tree
	 */
	void enterArgs_lista(CmenosParser.Args_listaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmenosParser#args_lista}.
	 * @param ctx the parse tree
	 */
	void exitArgs_lista(CmenosParser.Args_listaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmenosParser#num}.
	 * @param ctx the parse tree
	 */
	void enterNum(CmenosParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmenosParser#num}.
	 * @param ctx the parse tree
	 */
	void exitNum(CmenosParser.NumContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmenosParser#num_int}.
	 * @param ctx the parse tree
	 */
	void enterNum_int(CmenosParser.Num_intContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmenosParser#num_int}.
	 * @param ctx the parse tree
	 */
	void exitNum_int(CmenosParser.Num_intContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmenosParser#ident}.
	 * @param ctx the parse tree
	 */
	void enterIdent(CmenosParser.IdentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmenosParser#ident}.
	 * @param ctx the parse tree
	 */
	void exitIdent(CmenosParser.IdentContext ctx);
}