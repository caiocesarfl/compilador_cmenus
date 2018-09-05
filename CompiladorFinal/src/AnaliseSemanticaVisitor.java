// Generated from C:/Users/Elias/Desktop/TP3_Compiladores/src\AnaliseSemantica.g4 by ANTLR 4.5.3

    import org.antlr.symtab.*;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AnaliseSemanticaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AnaliseSemanticaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AnaliseSemanticaParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(AnaliseSemanticaParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnaliseSemanticaParser#declaracao_lista}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao_lista(AnaliseSemanticaParser.Declaracao_listaContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnaliseSemanticaParser#declaracao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao(AnaliseSemanticaParser.DeclaracaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnaliseSemanticaParser#var_declaracao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_declaracao(AnaliseSemanticaParser.Var_declaracaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnaliseSemanticaParser#tipo_especificador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_especificador(AnaliseSemanticaParser.Tipo_especificadorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnaliseSemanticaParser#atributos_declaracao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtributos_declaracao(AnaliseSemanticaParser.Atributos_declaracaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnaliseSemanticaParser#fun_declaracao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFun_declaracao(AnaliseSemanticaParser.Fun_declaracaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnaliseSemanticaParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(AnaliseSemanticaParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnaliseSemanticaParser#param_lista}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_lista(AnaliseSemanticaParser.Param_listaContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnaliseSemanticaParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(AnaliseSemanticaParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnaliseSemanticaParser#composto_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComposto_decl(AnaliseSemanticaParser.Composto_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnaliseSemanticaParser#local_declaracoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocal_declaracoes(AnaliseSemanticaParser.Local_declaracoesContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnaliseSemanticaParser#comando_lista}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComando_lista(AnaliseSemanticaParser.Comando_listaContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnaliseSemanticaParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComando(AnaliseSemanticaParser.ComandoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnaliseSemanticaParser#expressao_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao_decl(AnaliseSemanticaParser.Expressao_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnaliseSemanticaParser#selecao_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelecao_decl(AnaliseSemanticaParser.Selecao_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnaliseSemanticaParser#iteracao_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIteracao_decl(AnaliseSemanticaParser.Iteracao_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnaliseSemanticaParser#retorno_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetorno_decl(AnaliseSemanticaParser.Retorno_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnaliseSemanticaParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao(AnaliseSemanticaParser.ExpressaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnaliseSemanticaParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(AnaliseSemanticaParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnaliseSemanticaParser#expressao_simples}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao_simples(AnaliseSemanticaParser.Expressao_simplesContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnaliseSemanticaParser#op_relacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_relacional(AnaliseSemanticaParser.Op_relacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnaliseSemanticaParser#expressao_soma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao_soma(AnaliseSemanticaParser.Expressao_somaContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnaliseSemanticaParser#soma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSoma(AnaliseSemanticaParser.SomaContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnaliseSemanticaParser#termo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermo(AnaliseSemanticaParser.TermoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnaliseSemanticaParser#mult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult(AnaliseSemanticaParser.MultContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnaliseSemanticaParser#fator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFator(AnaliseSemanticaParser.FatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnaliseSemanticaParser#ativacao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtivacao(AnaliseSemanticaParser.AtivacaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnaliseSemanticaParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(AnaliseSemanticaParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnaliseSemanticaParser#args_lista}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs_lista(AnaliseSemanticaParser.Args_listaContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnaliseSemanticaParser#num}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum(AnaliseSemanticaParser.NumContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnaliseSemanticaParser#num_int}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum_int(AnaliseSemanticaParser.Num_intContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnaliseSemanticaParser#digito}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDigito(AnaliseSemanticaParser.DigitoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnaliseSemanticaParser#ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdent(AnaliseSemanticaParser.IdentContext ctx);
}