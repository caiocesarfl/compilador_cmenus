// Generated from /home/caio/IdeaProjects/analisadorLexico/src/parser/Cmenos.g4 by ANTLR 4.5.3
package parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CmenosParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CmenosVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CmenosParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(CmenosParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmenosParser#declaracao_lista}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao_lista(CmenosParser.Declaracao_listaContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmenosParser#declaracao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao(CmenosParser.DeclaracaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmenosParser#var_declaracao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_declaracao(CmenosParser.Var_declaracaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmenosParser#tipo_especificador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_especificador(CmenosParser.Tipo_especificadorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmenosParser#atributos_declaracao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtributos_declaracao(CmenosParser.Atributos_declaracaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmenosParser#fun_declaracao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFun_declaracao(CmenosParser.Fun_declaracaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmenosParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(CmenosParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmenosParser#param_lista}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_lista(CmenosParser.Param_listaContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmenosParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(CmenosParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmenosParser#composto_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComposto_decl(CmenosParser.Composto_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmenosParser#local_declaracoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocal_declaracoes(CmenosParser.Local_declaracoesContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmenosParser#comando_lista}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComando_lista(CmenosParser.Comando_listaContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmenosParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComando(CmenosParser.ComandoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmenosParser#expressao_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao_decl(CmenosParser.Expressao_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmenosParser#selecao_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelecao_decl(CmenosParser.Selecao_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmenosParser#iteracao_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIteracao_decl(CmenosParser.Iteracao_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmenosParser#retorno_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetorno_decl(CmenosParser.Retorno_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmenosParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao(CmenosParser.ExpressaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmenosParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(CmenosParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmenosParser#expressao_simples}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao_simples(CmenosParser.Expressao_simplesContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmenosParser#op_relacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_relacional(CmenosParser.Op_relacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmenosParser#expressao_soma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao_soma(CmenosParser.Expressao_somaContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmenosParser#soma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSoma(CmenosParser.SomaContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmenosParser#termo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermo(CmenosParser.TermoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmenosParser#mult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult(CmenosParser.MultContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmenosParser#fator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFator(CmenosParser.FatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmenosParser#ativacao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtivacao(CmenosParser.AtivacaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmenosParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(CmenosParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmenosParser#args_lista}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs_lista(CmenosParser.Args_listaContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmenosParser#num}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum(CmenosParser.NumContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmenosParser#num_int}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum_int(CmenosParser.Num_intContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmenosParser#ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdent(CmenosParser.IdentContext ctx);
}