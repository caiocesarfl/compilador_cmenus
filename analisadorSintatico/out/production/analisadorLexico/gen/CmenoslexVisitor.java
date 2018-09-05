// Generated from /home/caio/IdeaProjects/analisadorLexico/out/production/analisadorLexico/Cmenoslex.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CmenoslexParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CmenoslexVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CmenoslexParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(CmenoslexParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmenoslexParser#declaraçãoLista}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaraçãoLista(CmenoslexParser.DeclaraçãoListaContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmenoslexParser#declaração}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaração(CmenoslexParser.DeclaraçãoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmenoslexParser#varDeclaração}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaração(CmenoslexParser.VarDeclaraçãoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmenoslexParser#tipoEspecificador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoEspecificador(CmenoslexParser.TipoEspecificadorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmenoslexParser#atributosDeclaração}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtributosDeclaração(CmenoslexParser.AtributosDeclaraçãoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmenoslexParser#funDeclaração}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunDeclaração(CmenoslexParser.FunDeclaraçãoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmenoslexParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(CmenoslexParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmenoslexParser#paramLista}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamLista(CmenoslexParser.ParamListaContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmenoslexParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(CmenoslexParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmenoslexParser#compostoDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompostoDecl(CmenoslexParser.CompostoDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmenoslexParser#localDeclarações}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalDeclarações(CmenoslexParser.LocalDeclaraçõesContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmenoslexParser#comandoLista}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoLista(CmenoslexParser.ComandoListaContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmenoslexParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComando(CmenoslexParser.ComandoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmenoslexParser#expressãoDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressãoDecl(CmenoslexParser.ExpressãoDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmenoslexParser#seleçãoDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeleçãoDecl(CmenoslexParser.SeleçãoDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmenoslexParser#iteraçãoDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIteraçãoDecl(CmenoslexParser.IteraçãoDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmenoslexParser#retornoDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetornoDecl(CmenoslexParser.RetornoDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmenoslexParser#expressão}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressão(CmenoslexParser.ExpressãoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmenoslexParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(CmenoslexParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmenoslexParser#expressãoSimples}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressãoSimples(CmenoslexParser.ExpressãoSimplesContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmenoslexParser#expressãoSoma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressãoSoma(CmenoslexParser.ExpressãoSomaContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmenoslexParser#termo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermo(CmenoslexParser.TermoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmenoslexParser#fator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFator(CmenoslexParser.FatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmenoslexParser#ativação}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtivação(CmenoslexParser.AtivaçãoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmenoslexParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(CmenoslexParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmenoslexParser#argLista}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgLista(CmenoslexParser.ArgListaContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmenoslexParser#digito}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDigito(CmenoslexParser.DigitoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmenoslexParser#letra}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetra(CmenoslexParser.LetraContext ctx);
}