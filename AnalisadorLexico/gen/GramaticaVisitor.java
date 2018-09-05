// Generated from /home/caio/Área de Trabalho/AnalisadorLexico/src/Gramatica.g4 by ANTLR 4.5.3

    import org.antlr.symtab.*;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GramaticaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GramaticaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(GramaticaParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#declaracao_lista}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao_lista(GramaticaParser.Declaracao_listaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#declaracao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao(GramaticaParser.DeclaracaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#var_declaracao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_declaracao(GramaticaParser.Var_declaracaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#tipo_especificador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_especificador(GramaticaParser.Tipo_especificadorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#atributos_declaracao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtributos_declaracao(GramaticaParser.Atributos_declaracaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#fun_declaracao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFun_declaracao(GramaticaParser.Fun_declaracaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(GramaticaParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#param_lista}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_lista(GramaticaParser.Param_listaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(GramaticaParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#composto_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComposto_decl(GramaticaParser.Composto_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#local_declaracoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocal_declaracoes(GramaticaParser.Local_declaracoesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#comando_lista}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComando_lista(GramaticaParser.Comando_listaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComando(GramaticaParser.ComandoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#expressao_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao_decl(GramaticaParser.Expressao_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#selecao_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelecao_decl(GramaticaParser.Selecao_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#iteracao_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIteracao_decl(GramaticaParser.Iteracao_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#retorno_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetorno_decl(GramaticaParser.Retorno_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao(GramaticaParser.ExpressaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(GramaticaParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#expressao_simples}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao_simples(GramaticaParser.Expressao_simplesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#op_relacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_relacional(GramaticaParser.Op_relacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#expressao_soma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao_soma(GramaticaParser.Expressao_somaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#soma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSoma(GramaticaParser.SomaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#termo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermo(GramaticaParser.TermoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#mult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult(GramaticaParser.MultContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#fator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFator(GramaticaParser.FatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#ativacao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtivacao(GramaticaParser.AtivacaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(GramaticaParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#args_lista}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs_lista(GramaticaParser.Args_listaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#num}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum(GramaticaParser.NumContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#num_int}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum_int(GramaticaParser.Num_intContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#digito}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDigito(GramaticaParser.DigitoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdent(GramaticaParser.IdentContext ctx);
}