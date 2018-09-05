// Generated from /home/caio/Área de Trabalho/AnalisadorLexico/src/Gramatica.g4 by ANTLR 4.5.3

    import org.antlr.symtab.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GramaticaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, DIGIT=3, LETRA_MINUSCULA=4, LETRA_MAIUSCULA=5, CHAR=6, 
		ELSE=7, FLOAT=8, IF=9, INT=10, RETURN=11, STRUCT=12, VOID=13, WHILE=14, 
		ABRE_PARENTESE=15, FECHA_PARENTESE=16, ABRE_CHAVE=17, FECHA_CHAVE=18, 
		ABRE_COLCHETE=19, FECHA_COLCHETE=20, PONTO_VIRGULA=21, VIRGULA=22, ASPAS=23, 
		ATRIBUICAO=24, MAIOR=25, MENOR=26, MAIS=27, MENOS=28, MULTIPLICACAO=29, 
		DIVISAO=30, MAIORIGUAL=31, MENORIGUAL=32, IGUALDADE=33, DIFERENTE=34, 
		COMENTARIO=35, WS=36;
	public static final int
		RULE_programa = 0, RULE_declaracao_lista = 1, RULE_declaracao = 2, RULE_var_declaracao = 3, 
		RULE_tipo_especificador = 4, RULE_atributos_declaracao = 5, RULE_fun_declaracao = 6, 
		RULE_params = 7, RULE_param_lista = 8, RULE_param = 9, RULE_composto_decl = 10, 
		RULE_local_declaracoes = 11, RULE_comando_lista = 12, RULE_comando = 13, 
		RULE_expressao_decl = 14, RULE_selecao_decl = 15, RULE_iteracao_decl = 16, 
		RULE_retorno_decl = 17, RULE_expressao = 18, RULE_var = 19, RULE_expressao_simples = 20, 
		RULE_op_relacional = 21, RULE_expressao_soma = 22, RULE_soma = 23, RULE_termo = 24, 
		RULE_mult = 25, RULE_fator = 26, RULE_ativacao = 27, RULE_args = 28, RULE_args_lista = 29, 
		RULE_num = 30, RULE_num_int = 31, RULE_digito = 32, RULE_ident = 33;
	public static final String[] ruleNames = {
		"programa", "declaracao_lista", "declaracao", "var_declaracao", "tipo_especificador", 
		"atributos_declaracao", "fun_declaracao", "params", "param_lista", "param", 
		"composto_decl", "local_declaracoes", "comando_lista", "comando", "expressao_decl", 
		"selecao_decl", "iteracao_decl", "retorno_decl", "expressao", "var", "expressao_simples", 
		"op_relacional", "expressao_soma", "soma", "termo", "mult", "fator", "ativacao", 
		"args", "args_lista", "num", "num_int", "digito", "ident"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'.'", "'E'", null, null, null, "'char'", "'else'", "'float'", "'if'", 
		"'int'", "'return'", "'struct'", "'void'", "'while'", "'('", "')'", "'{'", 
		"'}'", "'['", "']'", "';'", "','", "'''", "'='", "'>'", "'<'", "'+'", 
		"'-'", "'*'", "'/'", "'>='", "'<='", "'=='", "'!='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "DIGIT", "LETRA_MINUSCULA", "LETRA_MAIUSCULA", "CHAR", 
		"ELSE", "FLOAT", "IF", "INT", "RETURN", "STRUCT", "VOID", "WHILE", "ABRE_PARENTESE", 
		"FECHA_PARENTESE", "ABRE_CHAVE", "FECHA_CHAVE", "ABRE_COLCHETE", "FECHA_COLCHETE", 
		"PONTO_VIRGULA", "VIRGULA", "ASPAS", "ATRIBUICAO", "MAIOR", "MENOR", "MAIS", 
		"MENOS", "MULTIPLICACAO", "DIVISAO", "MAIORIGUAL", "MENORIGUAL", "IGUALDADE", 
		"DIFERENTE", "COMENTARIO", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Gramatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GramaticaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramaContext extends ParserRuleContext {
		public Scope scope;
		public Declaracao_listaContext declaracao_lista() {
			return getRuleContext(Declaracao_listaContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			declaracao_lista();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declaracao_listaContext extends ParserRuleContext {
		public List<DeclaracaoContext> declaracao() {
			return getRuleContexts(DeclaracaoContext.class);
		}
		public DeclaracaoContext declaracao(int i) {
			return getRuleContext(DeclaracaoContext.class,i);
		}
		public Declaracao_listaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_lista; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterDeclaracao_lista(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitDeclaracao_lista(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitDeclaracao_lista(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracao_listaContext declaracao_lista() throws RecognitionException {
		Declaracao_listaContext _localctx = new Declaracao_listaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaracao_lista);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			declaracao();
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHAR) | (1L << FLOAT) | (1L << INT) | (1L << STRUCT) | (1L << VOID))) != 0)) {
				{
				{
				setState(71);
				declaracao();
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaracaoContext extends ParserRuleContext {
		public Var_declaracaoContext var_declaracao() {
			return getRuleContext(Var_declaracaoContext.class,0);
		}
		public Fun_declaracaoContext fun_declaracao() {
			return getRuleContext(Fun_declaracaoContext.class,0);
		}
		public DeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterDeclaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitDeclaracao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitDeclaracao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracao);
		try {
			setState(79);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				var_declaracao();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				fun_declaracao();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_declaracaoContext extends ParserRuleContext {
		public Tipo_especificadorContext tipo_especificador() {
			return getRuleContext(Tipo_especificadorContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public List<Num_intContext> num_int() {
			return getRuleContexts(Num_intContext.class);
		}
		public Num_intContext num_int(int i) {
			return getRuleContext(Num_intContext.class,i);
		}
		public Var_declaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_declaracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterVar_declaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitVar_declaracao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitVar_declaracao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_declaracaoContext var_declaracao() throws RecognitionException {
		Var_declaracaoContext _localctx = new Var_declaracaoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_var_declaracao);
		int _la;
		try {
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				tipo_especificador();
				setState(82);
				ident();
				setState(83);
				match(PONTO_VIRGULA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				tipo_especificador();
				setState(86);
				ident();
				setState(91); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(87);
					match(ABRE_COLCHETE);
					setState(88);
					num_int();
					setState(89);
					match(FECHA_COLCHETE);
					}
					}
					setState(93); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ABRE_COLCHETE );
				setState(95);
				match(PONTO_VIRGULA);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tipo_especificadorContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Atributos_declaracaoContext atributos_declaracao() {
			return getRuleContext(Atributos_declaracaoContext.class,0);
		}
		public Tipo_especificadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_especificador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterTipo_especificador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitTipo_especificador(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitTipo_especificador(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipo_especificadorContext tipo_especificador() throws RecognitionException {
		Tipo_especificadorContext _localctx = new Tipo_especificadorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tipo_especificador);
		try {
			setState(109);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				match(INT);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				match(FLOAT);
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(101);
				match(CHAR);
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 4);
				{
				setState(102);
				match(VOID);
				}
				break;
			case STRUCT:
				enterOuterAlt(_localctx, 5);
				{
				setState(103);
				match(STRUCT);
				setState(104);
				ident();
				setState(105);
				match(ABRE_CHAVE);
				setState(106);
				atributos_declaracao();
				setState(107);
				match(FECHA_CHAVE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Atributos_declaracaoContext extends ParserRuleContext {
		public List<Var_declaracaoContext> var_declaracao() {
			return getRuleContexts(Var_declaracaoContext.class);
		}
		public Var_declaracaoContext var_declaracao(int i) {
			return getRuleContext(Var_declaracaoContext.class,i);
		}
		public Atributos_declaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atributos_declaracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterAtributos_declaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitAtributos_declaracao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitAtributos_declaracao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Atributos_declaracaoContext atributos_declaracao() throws RecognitionException {
		Atributos_declaracaoContext _localctx = new Atributos_declaracaoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_atributos_declaracao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(111);
				var_declaracao();
				}
				}
				setState(114); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHAR) | (1L << FLOAT) | (1L << INT) | (1L << STRUCT) | (1L << VOID))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fun_declaracaoContext extends ParserRuleContext {
		public Scope scope;
		public Tipo_especificadorContext tipo_especificador() {
			return getRuleContext(Tipo_especificadorContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public Composto_declContext composto_decl() {
			return getRuleContext(Composto_declContext.class,0);
		}
		public Fun_declaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fun_declaracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterFun_declaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitFun_declaracao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitFun_declaracao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fun_declaracaoContext fun_declaracao() throws RecognitionException {
		Fun_declaracaoContext _localctx = new Fun_declaracaoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_fun_declaracao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			tipo_especificador();
			setState(117);
			ident();
			setState(118);
			match(ABRE_PARENTESE);
			setState(119);
			params();
			setState(120);
			match(FECHA_PARENTESE);
			setState(121);
			composto_decl();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamsContext extends ParserRuleContext {
		public Param_listaContext param_lista() {
			return getRuleContext(Param_listaContext.class,0);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_params);
		try {
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				param_lista();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				match(VOID);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Param_listaContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public Param_listaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_lista; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterParam_lista(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitParam_lista(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitParam_lista(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_listaContext param_lista() throws RecognitionException {
		Param_listaContext _localctx = new Param_listaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_param_lista);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			param();
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(128);
				match(VIRGULA);
				setState(129);
				param();
				}
				}
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamContext extends ParserRuleContext {
		public Tipo_especificadorContext tipo_especificador() {
			return getRuleContext(Tipo_especificadorContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_param);
		try {
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				tipo_especificador();
				setState(136);
				ident();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				tipo_especificador();
				setState(139);
				ident();
				setState(140);
				match(ABRE_COLCHETE);
				setState(141);
				match(FECHA_COLCHETE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Composto_declContext extends ParserRuleContext {
		public Local_declaracoesContext local_declaracoes() {
			return getRuleContext(Local_declaracoesContext.class,0);
		}
		public Comando_listaContext comando_lista() {
			return getRuleContext(Comando_listaContext.class,0);
		}
		public Composto_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_composto_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterComposto_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitComposto_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitComposto_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Composto_declContext composto_decl() throws RecognitionException {
		Composto_declContext _localctx = new Composto_declContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_composto_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(ABRE_CHAVE);
			setState(146);
			local_declaracoes();
			setState(147);
			comando_lista();
			setState(148);
			match(FECHA_CHAVE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Local_declaracoesContext extends ParserRuleContext {
		public List<Var_declaracaoContext> var_declaracao() {
			return getRuleContexts(Var_declaracaoContext.class);
		}
		public Var_declaracaoContext var_declaracao(int i) {
			return getRuleContext(Var_declaracaoContext.class,i);
		}
		public Local_declaracoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local_declaracoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterLocal_declaracoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitLocal_declaracoes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitLocal_declaracoes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Local_declaracoesContext local_declaracoes() throws RecognitionException {
		Local_declaracoesContext _localctx = new Local_declaracoesContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_local_declaracoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHAR) | (1L << FLOAT) | (1L << INT) | (1L << STRUCT) | (1L << VOID))) != 0)) {
				{
				{
				setState(150);
				var_declaracao();
				}
				}
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Comando_listaContext extends ParserRuleContext {
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public Comando_listaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando_lista; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterComando_lista(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitComando_lista(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitComando_lista(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comando_listaContext comando_lista() throws RecognitionException {
		Comando_listaContext _localctx = new Comando_listaContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_comando_lista);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIGIT) | (1L << LETRA_MINUSCULA) | (1L << IF) | (1L << RETURN) | (1L << WHILE) | (1L << ABRE_PARENTESE) | (1L << ABRE_CHAVE) | (1L << PONTO_VIRGULA) | (1L << MAIS) | (1L << MENOS))) != 0)) {
				{
				{
				setState(156);
				comando();
				}
				}
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComandoContext extends ParserRuleContext {
		public Expressao_declContext expressao_decl() {
			return getRuleContext(Expressao_declContext.class,0);
		}
		public Composto_declContext composto_decl() {
			return getRuleContext(Composto_declContext.class,0);
		}
		public Selecao_declContext selecao_decl() {
			return getRuleContext(Selecao_declContext.class,0);
		}
		public Iteracao_declContext iteracao_decl() {
			return getRuleContext(Iteracao_declContext.class,0);
		}
		public Retorno_declContext retorno_decl() {
			return getRuleContext(Retorno_declContext.class,0);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterComando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitComando(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitComando(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_comando);
		try {
			setState(167);
			switch (_input.LA(1)) {
			case DIGIT:
			case LETRA_MINUSCULA:
			case ABRE_PARENTESE:
			case PONTO_VIRGULA:
			case MAIS:
			case MENOS:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				expressao_decl();
				}
				break;
			case ABRE_CHAVE:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				composto_decl();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(164);
				selecao_decl();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(165);
				iteracao_decl();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 5);
				{
				setState(166);
				retorno_decl();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expressao_declContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public Expressao_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterExpressao_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitExpressao_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitExpressao_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expressao_declContext expressao_decl() throws RecognitionException {
		Expressao_declContext _localctx = new Expressao_declContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expressao_decl);
		try {
			setState(173);
			switch (_input.LA(1)) {
			case DIGIT:
			case LETRA_MINUSCULA:
			case ABRE_PARENTESE:
			case MAIS:
			case MENOS:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				expressao();
				setState(170);
				match(PONTO_VIRGULA);
				}
				break;
			case PONTO_VIRGULA:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				match(PONTO_VIRGULA);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Selecao_declContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public Selecao_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selecao_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterSelecao_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitSelecao_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitSelecao_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Selecao_declContext selecao_decl() throws RecognitionException {
		Selecao_declContext _localctx = new Selecao_declContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_selecao_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(IF);
			setState(176);
			match(ABRE_PARENTESE);
			setState(177);
			expressao();
			setState(178);
			match(FECHA_PARENTESE);
			setState(179);
			comando();
			setState(182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(180);
				match(ELSE);
				setState(181);
				comando();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Iteracao_declContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public Iteracao_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iteracao_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterIteracao_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitIteracao_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitIteracao_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Iteracao_declContext iteracao_decl() throws RecognitionException {
		Iteracao_declContext _localctx = new Iteracao_declContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_iteracao_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(WHILE);
			setState(185);
			match(ABRE_PARENTESE);
			setState(186);
			expressao();
			setState(187);
			match(FECHA_PARENTESE);
			setState(188);
			comando();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Retorno_declContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public Retorno_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retorno_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterRetorno_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitRetorno_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitRetorno_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Retorno_declContext retorno_decl() throws RecognitionException {
		Retorno_declContext _localctx = new Retorno_declContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_retorno_decl);
		try {
			setState(196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				match(RETURN);
				setState(191);
				match(PONTO_VIRGULA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				match(RETURN);
				setState(193);
				expressao();
				setState(194);
				match(PONTO_VIRGULA);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressaoContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public Expressao_simplesContext expressao_simples() {
			return getRuleContext(Expressao_simplesContext.class,0);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitExpressao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitExpressao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expressao);
		try {
			setState(203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				var();
				setState(199);
				match(ATRIBUICAO);
				setState(200);
				expressao();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
				expressao_simples();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_var);
		int _la;
		try {
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				ident();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				ident();
				setState(211); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(207);
					match(ABRE_COLCHETE);
					setState(208);
					expressao();
					setState(209);
					match(FECHA_COLCHETE);
					}
					}
					setState(213); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ABRE_COLCHETE );
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expressao_simplesContext extends ParserRuleContext {
		public List<Expressao_somaContext> expressao_soma() {
			return getRuleContexts(Expressao_somaContext.class);
		}
		public Expressao_somaContext expressao_soma(int i) {
			return getRuleContext(Expressao_somaContext.class,i);
		}
		public Op_relacionalContext op_relacional() {
			return getRuleContext(Op_relacionalContext.class,0);
		}
		public Expressao_simplesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao_simples; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterExpressao_simples(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitExpressao_simples(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitExpressao_simples(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expressao_simplesContext expressao_simples() throws RecognitionException {
		Expressao_simplesContext _localctx = new Expressao_simplesContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_expressao_simples);
		try {
			setState(222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				expressao_soma();
				setState(218);
				op_relacional();
				setState(219);
				expressao_soma();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(221);
				expressao_soma();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_relacionalContext extends ParserRuleContext {
		public Op_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_relacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterOp_relacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitOp_relacional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitOp_relacional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_relacionalContext op_relacional() throws RecognitionException {
		Op_relacionalContext _localctx = new Op_relacionalContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_op_relacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAIOR) | (1L << MENOR) | (1L << MAIORIGUAL) | (1L << MENORIGUAL) | (1L << IGUALDADE) | (1L << DIFERENTE))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expressao_somaContext extends ParserRuleContext {
		public List<TermoContext> termo() {
			return getRuleContexts(TermoContext.class);
		}
		public TermoContext termo(int i) {
			return getRuleContext(TermoContext.class,i);
		}
		public List<SomaContext> soma() {
			return getRuleContexts(SomaContext.class);
		}
		public SomaContext soma(int i) {
			return getRuleContext(SomaContext.class,i);
		}
		public Expressao_somaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao_soma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterExpressao_soma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitExpressao_soma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitExpressao_soma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expressao_somaContext expressao_soma() throws RecognitionException {
		Expressao_somaContext _localctx = new Expressao_somaContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_expressao_soma);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			termo();
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MAIS || _la==MENOS) {
				{
				{
				setState(227);
				soma();
				setState(228);
				termo();
				}
				}
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SomaContext extends ParserRuleContext {
		public SomaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_soma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterSoma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitSoma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitSoma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SomaContext soma() throws RecognitionException {
		SomaContext _localctx = new SomaContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_soma);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			_la = _input.LA(1);
			if ( !(_la==MAIS || _la==MENOS) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermoContext extends ParserRuleContext {
		public List<FatorContext> fator() {
			return getRuleContexts(FatorContext.class);
		}
		public FatorContext fator(int i) {
			return getRuleContext(FatorContext.class,i);
		}
		public List<MultContext> mult() {
			return getRuleContexts(MultContext.class);
		}
		public MultContext mult(int i) {
			return getRuleContext(MultContext.class,i);
		}
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitTermo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitTermo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_termo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			fator();
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULTIPLICACAO || _la==DIVISAO) {
				{
				{
				setState(238);
				mult();
				setState(239);
				fator();
				}
				}
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultContext extends ParserRuleContext {
		public MultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mult; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitMult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitMult(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultContext mult() throws RecognitionException {
		MultContext _localctx = new MultContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_mult);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			_la = _input.LA(1);
			if ( !(_la==MULTIPLICACAO || _la==DIVISAO) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FatorContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public AtivacaoContext ativacao() {
			return getRuleContext(AtivacaoContext.class,0);
		}
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public Num_intContext num_int() {
			return getRuleContext(Num_intContext.class,0);
		}
		public FatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterFator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitFator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitFator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_fator);
		try {
			setState(256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(248);
				match(ABRE_PARENTESE);
				setState(249);
				expressao();
				setState(250);
				match(FECHA_PARENTESE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(252);
				var();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(253);
				ativacao();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(254);
				num();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(255);
				num_int();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtivacaoContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public AtivacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ativacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterAtivacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitAtivacao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitAtivacao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtivacaoContext ativacao() throws RecognitionException {
		AtivacaoContext _localctx = new AtivacaoContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_ativacao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			ident();
			setState(259);
			match(ABRE_PARENTESE);
			setState(260);
			args();
			setState(261);
			match(FECHA_PARENTESE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgsContext extends ParserRuleContext {
		public Args_listaContext args_lista() {
			return getRuleContext(Args_listaContext.class,0);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIGIT) | (1L << LETRA_MINUSCULA) | (1L << ABRE_PARENTESE) | (1L << MAIS) | (1L << MENOS))) != 0)) {
				{
				setState(263);
				args_lista();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Args_listaContext extends ParserRuleContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public Args_listaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args_lista; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterArgs_lista(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitArgs_lista(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitArgs_lista(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Args_listaContext args_lista() throws RecognitionException {
		Args_listaContext _localctx = new Args_listaContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_args_lista);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			expressao();
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(267);
				match(VIRGULA);
				setState(268);
				expressao();
				}
				}
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumContext extends ParserRuleContext {
		public List<SomaContext> soma() {
			return getRuleContexts(SomaContext.class);
		}
		public SomaContext soma(int i) {
			return getRuleContext(SomaContext.class,i);
		}
		public List<DigitoContext> digito() {
			return getRuleContexts(DigitoContext.class);
		}
		public DigitoContext digito(int i) {
			return getRuleContext(DigitoContext.class,i);
		}
		public NumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitNum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumContext num() throws RecognitionException {
		NumContext _localctx = new NumContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_num);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			_la = _input.LA(1);
			if (_la==MAIS || _la==MENOS) {
				{
				setState(274);
				soma();
				}
			}

			setState(278); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(277);
				digito();
				}
				}
				setState(280); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
			setState(288);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(282);
				match(T__0);
				setState(284); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(283);
					digito();
					}
					}
					setState(286); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DIGIT );
				}
			}

			setState(299);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(290);
				match(T__1);
				setState(292);
				_la = _input.LA(1);
				if (_la==MAIS || _la==MENOS) {
					{
					setState(291);
					soma();
					}
				}

				setState(295); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(294);
					digito();
					}
					}
					setState(297); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DIGIT );
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Num_intContext extends ParserRuleContext {
		public List<DigitoContext> digito() {
			return getRuleContexts(DigitoContext.class);
		}
		public DigitoContext digito(int i) {
			return getRuleContext(DigitoContext.class,i);
		}
		public Num_intContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num_int; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterNum_int(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitNum_int(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitNum_int(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Num_intContext num_int() throws RecognitionException {
		Num_intContext _localctx = new Num_intContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_num_int);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(301);
				digito();
				}
				}
				setState(304); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DigitoContext extends ParserRuleContext {
		public TerminalNode DIGIT() { return getToken(GramaticaParser.DIGIT, 0); }
		public DigitoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_digito; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterDigito(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitDigito(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitDigito(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DigitoContext digito() throws RecognitionException {
		DigitoContext _localctx = new DigitoContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_digito);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(DIGIT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentContext extends ParserRuleContext {
		public List<TerminalNode> LETRA_MINUSCULA() { return getTokens(GramaticaParser.LETRA_MINUSCULA); }
		public TerminalNode LETRA_MINUSCULA(int i) {
			return getToken(GramaticaParser.LETRA_MINUSCULA, i);
		}
		public List<TerminalNode> LETRA_MAIUSCULA() { return getTokens(GramaticaParser.LETRA_MAIUSCULA); }
		public TerminalNode LETRA_MAIUSCULA(int i) {
			return getToken(GramaticaParser.LETRA_MAIUSCULA, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(GramaticaParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(GramaticaParser.DIGIT, i);
		}
		public IdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ident; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitIdent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentContext ident() throws RecognitionException {
		IdentContext _localctx = new IdentContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_ident);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(LETRA_MINUSCULA);
			setState(312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIGIT) | (1L << LETRA_MINUSCULA) | (1L << LETRA_MAIUSCULA))) != 0)) {
				{
				{
				setState(309);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIGIT) | (1L << LETRA_MINUSCULA) | (1L << LETRA_MAIUSCULA))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				}
				setState(314);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3&\u013e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\3\3\3\7\3K\n\3\f\3\16\3N\13\3\3\4\3\4\5\4"+
		"R\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\6\5^\n\5\r\5\16\5_\3\5\3"+
		"\5\5\5d\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6p\n\6\3\7\6\7s"+
		"\n\7\r\7\16\7t\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\5\t\u0080\n\t\3\n\3"+
		"\n\3\n\7\n\u0085\n\n\f\n\16\n\u0088\13\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\5\13\u0092\n\13\3\f\3\f\3\f\3\f\3\f\3\r\7\r\u009a\n\r\f\r\16"+
		"\r\u009d\13\r\3\16\7\16\u00a0\n\16\f\16\16\16\u00a3\13\16\3\17\3\17\3"+
		"\17\3\17\3\17\5\17\u00aa\n\17\3\20\3\20\3\20\3\20\5\20\u00b0\n\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00b9\n\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00c7\n\23\3\24\3\24\3\24\3\24"+
		"\3\24\5\24\u00ce\n\24\3\25\3\25\3\25\3\25\3\25\3\25\6\25\u00d6\n\25\r"+
		"\25\16\25\u00d7\5\25\u00da\n\25\3\26\3\26\3\26\3\26\3\26\5\26\u00e1\n"+
		"\26\3\27\3\27\3\30\3\30\3\30\3\30\7\30\u00e9\n\30\f\30\16\30\u00ec\13"+
		"\30\3\31\3\31\3\32\3\32\3\32\3\32\7\32\u00f4\n\32\f\32\16\32\u00f7\13"+
		"\32\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0103\n\34"+
		"\3\35\3\35\3\35\3\35\3\35\3\36\5\36\u010b\n\36\3\37\3\37\3\37\7\37\u0110"+
		"\n\37\f\37\16\37\u0113\13\37\3 \5 \u0116\n \3 \6 \u0119\n \r \16 \u011a"+
		"\3 \3 \6 \u011f\n \r \16 \u0120\5 \u0123\n \3 \3 \5 \u0127\n \3 \6 \u012a"+
		"\n \r \16 \u012b\5 \u012e\n \3!\6!\u0131\n!\r!\16!\u0132\3\"\3\"\3#\3"+
		"#\7#\u0139\n#\f#\16#\u013c\13#\3#\2\2$\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@BD\2\6\4\2\33\34!$\3\2\35\36\3\2\37 \3"+
		"\2\5\7\u0145\2F\3\2\2\2\4H\3\2\2\2\6Q\3\2\2\2\bc\3\2\2\2\no\3\2\2\2\f"+
		"r\3\2\2\2\16v\3\2\2\2\20\177\3\2\2\2\22\u0081\3\2\2\2\24\u0091\3\2\2\2"+
		"\26\u0093\3\2\2\2\30\u009b\3\2\2\2\32\u00a1\3\2\2\2\34\u00a9\3\2\2\2\36"+
		"\u00af\3\2\2\2 \u00b1\3\2\2\2\"\u00ba\3\2\2\2$\u00c6\3\2\2\2&\u00cd\3"+
		"\2\2\2(\u00d9\3\2\2\2*\u00e0\3\2\2\2,\u00e2\3\2\2\2.\u00e4\3\2\2\2\60"+
		"\u00ed\3\2\2\2\62\u00ef\3\2\2\2\64\u00f8\3\2\2\2\66\u0102\3\2\2\28\u0104"+
		"\3\2\2\2:\u010a\3\2\2\2<\u010c\3\2\2\2>\u0115\3\2\2\2@\u0130\3\2\2\2B"+
		"\u0134\3\2\2\2D\u0136\3\2\2\2FG\5\4\3\2G\3\3\2\2\2HL\5\6\4\2IK\5\6\4\2"+
		"JI\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2M\5\3\2\2\2NL\3\2\2\2OR\5\b\5"+
		"\2PR\5\16\b\2QO\3\2\2\2QP\3\2\2\2R\7\3\2\2\2ST\5\n\6\2TU\5D#\2UV\7\27"+
		"\2\2Vd\3\2\2\2WX\5\n\6\2X]\5D#\2YZ\7\25\2\2Z[\5@!\2[\\\7\26\2\2\\^\3\2"+
		"\2\2]Y\3\2\2\2^_\3\2\2\2_]\3\2\2\2_`\3\2\2\2`a\3\2\2\2ab\7\27\2\2bd\3"+
		"\2\2\2cS\3\2\2\2cW\3\2\2\2d\t\3\2\2\2ep\7\f\2\2fp\7\n\2\2gp\7\b\2\2hp"+
		"\7\17\2\2ij\7\16\2\2jk\5D#\2kl\7\23\2\2lm\5\f\7\2mn\7\24\2\2np\3\2\2\2"+
		"oe\3\2\2\2of\3\2\2\2og\3\2\2\2oh\3\2\2\2oi\3\2\2\2p\13\3\2\2\2qs\5\b\5"+
		"\2rq\3\2\2\2st\3\2\2\2tr\3\2\2\2tu\3\2\2\2u\r\3\2\2\2vw\5\n\6\2wx\5D#"+
		"\2xy\7\21\2\2yz\5\20\t\2z{\7\22\2\2{|\5\26\f\2|\17\3\2\2\2}\u0080\5\22"+
		"\n\2~\u0080\7\17\2\2\177}\3\2\2\2\177~\3\2\2\2\u0080\21\3\2\2\2\u0081"+
		"\u0086\5\24\13\2\u0082\u0083\7\30\2\2\u0083\u0085\5\24\13\2\u0084\u0082"+
		"\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087"+
		"\23\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008a\5\n\6\2\u008a\u008b\5D#\2"+
		"\u008b\u0092\3\2\2\2\u008c\u008d\5\n\6\2\u008d\u008e\5D#\2\u008e\u008f"+
		"\7\25\2\2\u008f\u0090\7\26\2\2\u0090\u0092\3\2\2\2\u0091\u0089\3\2\2\2"+
		"\u0091\u008c\3\2\2\2\u0092\25\3\2\2\2\u0093\u0094\7\23\2\2\u0094\u0095"+
		"\5\30\r\2\u0095\u0096\5\32\16\2\u0096\u0097\7\24\2\2\u0097\27\3\2\2\2"+
		"\u0098\u009a\5\b\5\2\u0099\u0098\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099"+
		"\3\2\2\2\u009b\u009c\3\2\2\2\u009c\31\3\2\2\2\u009d\u009b\3\2\2\2\u009e"+
		"\u00a0\5\34\17\2\u009f\u009e\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3"+
		"\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\33\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4"+
		"\u00aa\5\36\20\2\u00a5\u00aa\5\26\f\2\u00a6\u00aa\5 \21\2\u00a7\u00aa"+
		"\5\"\22\2\u00a8\u00aa\5$\23\2\u00a9\u00a4\3\2\2\2\u00a9\u00a5\3\2\2\2"+
		"\u00a9\u00a6\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00a8\3\2\2\2\u00aa\35"+
		"\3\2\2\2\u00ab\u00ac\5&\24\2\u00ac\u00ad\7\27\2\2\u00ad\u00b0\3\2\2\2"+
		"\u00ae\u00b0\7\27\2\2\u00af\u00ab\3\2\2\2\u00af\u00ae\3\2\2\2\u00b0\37"+
		"\3\2\2\2\u00b1\u00b2\7\13\2\2\u00b2\u00b3\7\21\2\2\u00b3\u00b4\5&\24\2"+
		"\u00b4\u00b5\7\22\2\2\u00b5\u00b8\5\34\17\2\u00b6\u00b7\7\t\2\2\u00b7"+
		"\u00b9\5\34\17\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9!\3\2\2"+
		"\2\u00ba\u00bb\7\20\2\2\u00bb\u00bc\7\21\2\2\u00bc\u00bd\5&\24\2\u00bd"+
		"\u00be\7\22\2\2\u00be\u00bf\5\34\17\2\u00bf#\3\2\2\2\u00c0\u00c1\7\r\2"+
		"\2\u00c1\u00c7\7\27\2\2\u00c2\u00c3\7\r\2\2\u00c3\u00c4\5&\24\2\u00c4"+
		"\u00c5\7\27\2\2\u00c5\u00c7\3\2\2\2\u00c6\u00c0\3\2\2\2\u00c6\u00c2\3"+
		"\2\2\2\u00c7%\3\2\2\2\u00c8\u00c9\5(\25\2\u00c9\u00ca\7\32\2\2\u00ca\u00cb"+
		"\5&\24\2\u00cb\u00ce\3\2\2\2\u00cc\u00ce\5*\26\2\u00cd\u00c8\3\2\2\2\u00cd"+
		"\u00cc\3\2\2\2\u00ce\'\3\2\2\2\u00cf\u00da\5D#\2\u00d0\u00d5\5D#\2\u00d1"+
		"\u00d2\7\25\2\2\u00d2\u00d3\5&\24\2\u00d3\u00d4\7\26\2\2\u00d4\u00d6\3"+
		"\2\2\2\u00d5\u00d1\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7"+
		"\u00d8\3\2\2\2\u00d8\u00da\3\2\2\2\u00d9\u00cf\3\2\2\2\u00d9\u00d0\3\2"+
		"\2\2\u00da)\3\2\2\2\u00db\u00dc\5.\30\2\u00dc\u00dd\5,\27\2\u00dd\u00de"+
		"\5.\30\2\u00de\u00e1\3\2\2\2\u00df\u00e1\5.\30\2\u00e0\u00db\3\2\2\2\u00e0"+
		"\u00df\3\2\2\2\u00e1+\3\2\2\2\u00e2\u00e3\t\2\2\2\u00e3-\3\2\2\2\u00e4"+
		"\u00ea\5\62\32\2\u00e5\u00e6\5\60\31\2\u00e6\u00e7\5\62\32\2\u00e7\u00e9"+
		"\3\2\2\2\u00e8\u00e5\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea"+
		"\u00eb\3\2\2\2\u00eb/\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00ee\t\3\2\2"+
		"\u00ee\61\3\2\2\2\u00ef\u00f5\5\66\34\2\u00f0\u00f1\5\64\33\2\u00f1\u00f2"+
		"\5\66\34\2\u00f2\u00f4\3\2\2\2\u00f3\u00f0\3\2\2\2\u00f4\u00f7\3\2\2\2"+
		"\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\63\3\2\2\2\u00f7\u00f5"+
		"\3\2\2\2\u00f8\u00f9\t\4\2\2\u00f9\65\3\2\2\2\u00fa\u00fb\7\21\2\2\u00fb"+
		"\u00fc\5&\24\2\u00fc\u00fd\7\22\2\2\u00fd\u0103\3\2\2\2\u00fe\u0103\5"+
		"(\25\2\u00ff\u0103\58\35\2\u0100\u0103\5> \2\u0101\u0103\5@!\2\u0102\u00fa"+
		"\3\2\2\2\u0102\u00fe\3\2\2\2\u0102\u00ff\3\2\2\2\u0102\u0100\3\2\2\2\u0102"+
		"\u0101\3\2\2\2\u0103\67\3\2\2\2\u0104\u0105\5D#\2\u0105\u0106\7\21\2\2"+
		"\u0106\u0107\5:\36\2\u0107\u0108\7\22\2\2\u01089\3\2\2\2\u0109\u010b\5"+
		"<\37\2\u010a\u0109\3\2\2\2\u010a\u010b\3\2\2\2\u010b;\3\2\2\2\u010c\u0111"+
		"\5&\24\2\u010d\u010e\7\30\2\2\u010e\u0110\5&\24\2\u010f\u010d\3\2\2\2"+
		"\u0110\u0113\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112=\3"+
		"\2\2\2\u0113\u0111\3\2\2\2\u0114\u0116\5\60\31\2\u0115\u0114\3\2\2\2\u0115"+
		"\u0116\3\2\2\2\u0116\u0118\3\2\2\2\u0117\u0119\5B\"\2\u0118\u0117\3\2"+
		"\2\2\u0119\u011a\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b"+
		"\u0122\3\2\2\2\u011c\u011e\7\3\2\2\u011d\u011f\5B\"\2\u011e\u011d\3\2"+
		"\2\2\u011f\u0120\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121"+
		"\u0123\3\2\2\2\u0122\u011c\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u012d\3\2"+
		"\2\2\u0124\u0126\7\4\2\2\u0125\u0127\5\60\31\2\u0126\u0125\3\2\2\2\u0126"+
		"\u0127\3\2\2\2\u0127\u0129\3\2\2\2\u0128\u012a\5B\"\2\u0129\u0128\3\2"+
		"\2\2\u012a\u012b\3\2\2\2\u012b\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c"+
		"\u012e\3\2\2\2\u012d\u0124\3\2\2\2\u012d\u012e\3\2\2\2\u012e?\3\2\2\2"+
		"\u012f\u0131\5B\"\2\u0130\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0130"+
		"\3\2\2\2\u0132\u0133\3\2\2\2\u0133A\3\2\2\2\u0134\u0135\7\5\2\2\u0135"+
		"C\3\2\2\2\u0136\u013a\7\6\2\2\u0137\u0139\t\5\2\2\u0138\u0137\3\2\2\2"+
		"\u0139\u013c\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013bE\3"+
		"\2\2\2\u013c\u013a\3\2\2\2#LQ_cot\177\u0086\u0091\u009b\u00a1\u00a9\u00af"+
		"\u00b8\u00c6\u00cd\u00d7\u00d9\u00e0\u00ea\u00f5\u0102\u010a\u0111\u0115"+
		"\u011a\u0120\u0122\u0126\u012b\u012d\u0132\u013a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}