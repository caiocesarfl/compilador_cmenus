// Generated from /home/caio/IdeaProjects/analisadorLexico/out/production/analisadorLexico/Cmenoslex.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CmenoslexParser}.
 */
public interface CmenoslexListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CmenoslexParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(CmenoslexParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmenoslexParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(CmenoslexParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmenoslexParser#declaraçãoLista}.
	 * @param ctx the parse tree
	 */
	void enterDeclaraçãoLista(CmenoslexParser.DeclaraçãoListaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmenoslexParser#declaraçãoLista}.
	 * @param ctx the parse tree
	 */
	void exitDeclaraçãoLista(CmenoslexParser.DeclaraçãoListaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmenoslexParser#declaração}.
	 * @param ctx the parse tree
	 */
	void enterDeclaração(CmenoslexParser.DeclaraçãoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmenoslexParser#declaração}.
	 * @param ctx the parse tree
	 */
	void exitDeclaração(CmenoslexParser.DeclaraçãoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmenoslexParser#varDeclaração}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaração(CmenoslexParser.VarDeclaraçãoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmenoslexParser#varDeclaração}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaração(CmenoslexParser.VarDeclaraçãoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmenoslexParser#tipoEspecificador}.
	 * @param ctx the parse tree
	 */
	void enterTipoEspecificador(CmenoslexParser.TipoEspecificadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmenoslexParser#tipoEspecificador}.
	 * @param ctx the parse tree
	 */
	void exitTipoEspecificador(CmenoslexParser.TipoEspecificadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmenoslexParser#atributosDeclaração}.
	 * @param ctx the parse tree
	 */
	void enterAtributosDeclaração(CmenoslexParser.AtributosDeclaraçãoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmenoslexParser#atributosDeclaração}.
	 * @param ctx the parse tree
	 */
	void exitAtributosDeclaração(CmenoslexParser.AtributosDeclaraçãoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmenoslexParser#funDeclaração}.
	 * @param ctx the parse tree
	 */
	void enterFunDeclaração(CmenoslexParser.FunDeclaraçãoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmenoslexParser#funDeclaração}.
	 * @param ctx the parse tree
	 */
	void exitFunDeclaração(CmenoslexParser.FunDeclaraçãoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmenoslexParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(CmenoslexParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmenoslexParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(CmenoslexParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmenoslexParser#paramLista}.
	 * @param ctx the parse tree
	 */
	void enterParamLista(CmenoslexParser.ParamListaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmenoslexParser#paramLista}.
	 * @param ctx the parse tree
	 */
	void exitParamLista(CmenoslexParser.ParamListaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmenoslexParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(CmenoslexParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmenoslexParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(CmenoslexParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmenoslexParser#compostoDecl}.
	 * @param ctx the parse tree
	 */
	void enterCompostoDecl(CmenoslexParser.CompostoDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmenoslexParser#compostoDecl}.
	 * @param ctx the parse tree
	 */
	void exitCompostoDecl(CmenoslexParser.CompostoDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmenoslexParser#localDeclarações}.
	 * @param ctx the parse tree
	 */
	void enterLocalDeclarações(CmenoslexParser.LocalDeclaraçõesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmenoslexParser#localDeclarações}.
	 * @param ctx the parse tree
	 */
	void exitLocalDeclarações(CmenoslexParser.LocalDeclaraçõesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmenoslexParser#comandoLista}.
	 * @param ctx the parse tree
	 */
	void enterComandoLista(CmenoslexParser.ComandoListaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmenoslexParser#comandoLista}.
	 * @param ctx the parse tree
	 */
	void exitComandoLista(CmenoslexParser.ComandoListaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmenoslexParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(CmenoslexParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmenoslexParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(CmenoslexParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmenoslexParser#expressãoDecl}.
	 * @param ctx the parse tree
	 */
	void enterExpressãoDecl(CmenoslexParser.ExpressãoDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmenoslexParser#expressãoDecl}.
	 * @param ctx the parse tree
	 */
	void exitExpressãoDecl(CmenoslexParser.ExpressãoDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmenoslexParser#seleçãoDecl}.
	 * @param ctx the parse tree
	 */
	void enterSeleçãoDecl(CmenoslexParser.SeleçãoDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmenoslexParser#seleçãoDecl}.
	 * @param ctx the parse tree
	 */
	void exitSeleçãoDecl(CmenoslexParser.SeleçãoDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmenoslexParser#iteraçãoDecl}.
	 * @param ctx the parse tree
	 */
	void enterIteraçãoDecl(CmenoslexParser.IteraçãoDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmenoslexParser#iteraçãoDecl}.
	 * @param ctx the parse tree
	 */
	void exitIteraçãoDecl(CmenoslexParser.IteraçãoDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmenoslexParser#retornoDecl}.
	 * @param ctx the parse tree
	 */
	void enterRetornoDecl(CmenoslexParser.RetornoDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmenoslexParser#retornoDecl}.
	 * @param ctx the parse tree
	 */
	void exitRetornoDecl(CmenoslexParser.RetornoDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmenoslexParser#expressão}.
	 * @param ctx the parse tree
	 */
	void enterExpressão(CmenoslexParser.ExpressãoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmenoslexParser#expressão}.
	 * @param ctx the parse tree
	 */
	void exitExpressão(CmenoslexParser.ExpressãoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmenoslexParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(CmenoslexParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmenoslexParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(CmenoslexParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmenoslexParser#expressãoSimples}.
	 * @param ctx the parse tree
	 */
	void enterExpressãoSimples(CmenoslexParser.ExpressãoSimplesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmenoslexParser#expressãoSimples}.
	 * @param ctx the parse tree
	 */
	void exitExpressãoSimples(CmenoslexParser.ExpressãoSimplesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmenoslexParser#expressãoSoma}.
	 * @param ctx the parse tree
	 */
	void enterExpressãoSoma(CmenoslexParser.ExpressãoSomaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmenoslexParser#expressãoSoma}.
	 * @param ctx the parse tree
	 */
	void exitExpressãoSoma(CmenoslexParser.ExpressãoSomaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmenoslexParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(CmenoslexParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmenoslexParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(CmenoslexParser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmenoslexParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFator(CmenoslexParser.FatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmenoslexParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFator(CmenoslexParser.FatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmenoslexParser#ativação}.
	 * @param ctx the parse tree
	 */
	void enterAtivação(CmenoslexParser.AtivaçãoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmenoslexParser#ativação}.
	 * @param ctx the parse tree
	 */
	void exitAtivação(CmenoslexParser.AtivaçãoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmenoslexParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(CmenoslexParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmenoslexParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(CmenoslexParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmenoslexParser#argLista}.
	 * @param ctx the parse tree
	 */
	void enterArgLista(CmenoslexParser.ArgListaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmenoslexParser#argLista}.
	 * @param ctx the parse tree
	 */
	void exitArgLista(CmenoslexParser.ArgListaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmenoslexParser#digito}.
	 * @param ctx the parse tree
	 */
	void enterDigito(CmenoslexParser.DigitoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmenoslexParser#digito}.
	 * @param ctx the parse tree
	 */
	void exitDigito(CmenoslexParser.DigitoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmenoslexParser#letra}.
	 * @param ctx the parse tree
	 */
	void enterLetra(CmenoslexParser.LetraContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmenoslexParser#letra}.
	 * @param ctx the parse tree
	 */
	void exitLetra(CmenoslexParser.LetraContext ctx);
}