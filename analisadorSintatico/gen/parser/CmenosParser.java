// Generated from /home/caio/IdeaProjects/analisadorLexico/src/parser/Cmenos.g4 by ANTLR 4.5.3
package parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CmenosParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, DIGITO=2, LETRA_MINUSCULA=3, LETRA_MAIUSCULA=4, PONTO_VIRGULA=5, 
		VIRGULA=6, PONTO=7, CHAR=8, FLOAT=9, INT=10, STRUCT=11, RETURN=12, VOID=13, 
		WHILE=14, IF=15, ELSE=16, ABRE_CHAVES=17, FECHA_CHAVES=18, ABRE_COLCHETES=19, 
		FECHA_COLCHETES=20, ABRE_PARENTESES=21, FECHA_PARENTESES=22, ATRIBUICAO=23, 
		OP_ADICAO=24, OP_SUBTRACAO=25, OP_MULTIPLICACAO=26, OP_DIVISAO=27, MAIOR=28, 
		MENOR=29, MAIORIGUAL=30, MENORIGUAL=31, IGUALDADE=32, DIFERENCA=33, COMENTARIO=34, 
		ESPACO=35, ERRO_IDENTIFICADOR=36, ERRO_NUMERO_REAL_CASA_DECIMAL=37, ERRO_NUMERO_REAL_CASA_INTEIRA=38, 
		ERRO_CARACTER_DECIMAL=39, ERRO_CARACTER_INVALIDO=40;
	public static final int
		RULE_programa = 0, RULE_declaracao_lista = 1, RULE_declaracao = 2, RULE_var_declaracao = 3, 
		RULE_tipo_especificador = 4, RULE_atributos_declaracao = 5, RULE_fun_declaracao = 6, 
		RULE_params = 7, RULE_param_lista = 8, RULE_param = 9, RULE_composto_decl = 10, 
		RULE_local_declaracoes = 11, RULE_comando_lista = 12, RULE_comando = 13, 
		RULE_expressao_decl = 14, RULE_selecao_decl = 15, RULE_iteracao_decl = 16, 
		RULE_retorno_decl = 17, RULE_expressao = 18, RULE_var = 19, RULE_expressao_simples = 20, 
		RULE_op_relacional = 21, RULE_expressao_soma = 22, RULE_soma = 23, RULE_termo = 24, 
		RULE_mult = 25, RULE_fator = 26, RULE_ativacao = 27, RULE_args = 28, RULE_args_lista = 29, 
		RULE_num = 30, RULE_num_int = 31, RULE_ident = 32;
	public static final String[] ruleNames = {
		"programa", "declaracao_lista", "declaracao", "var_declaracao", "tipo_especificador", 
		"atributos_declaracao", "fun_declaracao", "params", "param_lista", "param", 
		"composto_decl", "local_declaracoes", "comando_lista", "comando", "expressao_decl", 
		"selecao_decl", "iteracao_decl", "retorno_decl", "expressao", "var", "expressao_simples", 
		"op_relacional", "expressao_soma", "soma", "termo", "mult", "fator", "ativacao", 
		"args", "args_lista", "num", "num_int", "ident"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'E'", null, null, null, "';'", "','", "'.'", "'char'", "'float'", 
		"'int'", "'struct'", "'return'", "'void'", "'while'", "'if'", "'else'", 
		"'{'", "'}'", "'['", "']'", "'('", "')'", "'='", "'+'", "'-'", "'*'", 
		"'/'", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "DIGITO", "LETRA_MINUSCULA", "LETRA_MAIUSCULA", "PONTO_VIRGULA", 
		"VIRGULA", "PONTO", "CHAR", "FLOAT", "INT", "STRUCT", "RETURN", "VOID", 
		"WHILE", "IF", "ELSE", "ABRE_CHAVES", "FECHA_CHAVES", "ABRE_COLCHETES", 
		"FECHA_COLCHETES", "ABRE_PARENTESES", "FECHA_PARENTESES", "ATRIBUICAO", 
		"OP_ADICAO", "OP_SUBTRACAO", "OP_MULTIPLICACAO", "OP_DIVISAO", "MAIOR", 
		"MENOR", "MAIORIGUAL", "MENORIGUAL", "IGUALDADE", "DIFERENCA", "COMENTARIO", 
		"ESPACO", "ERRO_IDENTIFICADOR", "ERRO_NUMERO_REAL_CASA_DECIMAL", "ERRO_NUMERO_REAL_CASA_INTEIRA", 
		"ERRO_CARACTER_DECIMAL", "ERRO_CARACTER_INVALIDO"
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
	public String getGrammarFileName() { return "Cmenos.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CmenosParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramaContext extends ParserRuleContext {
		public Declaracao_listaContext declaracao_lista() {
			return getRuleContext(Declaracao_listaContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmenosListener ) ((CmenosListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmenosListener ) ((CmenosListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmenosVisitor ) return ((CmenosVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
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
			if ( listener instanceof CmenosListener ) ((CmenosListener)listener).enterDeclaracao_lista(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmenosListener ) ((CmenosListener)listener).exitDeclaracao_lista(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmenosVisitor ) return ((CmenosVisitor<? extends T>)visitor).visitDeclaracao_lista(this);
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
			setState(68);
			declaracao();
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHAR) | (1L << FLOAT) | (1L << INT) | (1L << STRUCT) | (1L << VOID))) != 0)) {
				{
				{
				setState(69);
				declaracao();
				}
				}
				setState(74);
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
			if ( listener instanceof CmenosListener ) ((CmenosListener)listener).enterDeclaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmenosListener ) ((CmenosListener)listener).exitDeclaracao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmenosVisitor ) return ((CmenosVisitor<? extends T>)visitor).visitDeclaracao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracao);
		try {
			setState(77);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				var_declaracao();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
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
		public TerminalNode PONTO_VIRGULA() { return getToken(CmenosParser.PONTO_VIRGULA, 0); }
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
			if ( listener instanceof CmenosListener ) ((CmenosListener)listener).enterVar_declaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmenosListener ) ((CmenosListener)listener).exitVar_declaracao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmenosVisitor ) return ((CmenosVisitor<? extends T>)visitor).visitVar_declaracao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_declaracaoContext var_declaracao() throws RecognitionException {
		Var_declaracaoContext _localctx = new Var_declaracaoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_var_declaracao);
		int _la;
		try {
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				tipo_especificador();
				setState(80);
				ident();
				setState(81);
				match(PONTO_VIRGULA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				tipo_especificador();
				setState(84);
				ident();
				setState(89); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(85);
					match(ABRE_COLCHETES);
					setState(86);
					num_int();
					setState(87);
					match(FECHA_COLCHETES);
					}
					}
					setState(91); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ABRE_COLCHETES );
				setState(93);
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
		public TerminalNode INT() { return getToken(CmenosParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(CmenosParser.FLOAT, 0); }
		public TerminalNode CHAR() { return getToken(CmenosParser.CHAR, 0); }
		public TerminalNode VOID() { return getToken(CmenosParser.VOID, 0); }
		public TerminalNode STRUCT() { return getToken(CmenosParser.STRUCT, 0); }
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
			if ( listener instanceof CmenosListener ) ((CmenosListener)listener).enterTipo_especificador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmenosListener ) ((CmenosListener)listener).exitTipo_especificador(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmenosVisitor ) return ((CmenosVisitor<? extends T>)visitor).visitTipo_especificador(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipo_especificadorContext tipo_especificador() throws RecognitionException {
		Tipo_especificadorContext _localctx = new Tipo_especificadorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tipo_especificador);
		try {
			setState(107);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				match(INT);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				match(FLOAT);
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(99);
				match(CHAR);
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 4);
				{
				setState(100);
				match(VOID);
				}
				break;
			case STRUCT:
				enterOuterAlt(_localctx, 5);
				{
				setState(101);
				match(STRUCT);
				setState(102);
				ident();
				setState(103);
				match(ABRE_CHAVES);
				setState(104);
				atributos_declaracao();
				setState(105);
				match(FECHA_CHAVES);
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
			if ( listener instanceof CmenosListener ) ((CmenosListener)listener).enterAtributos_declaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmenosListener ) ((CmenosListener)listener).exitAtributos_declaracao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmenosVisitor ) return ((CmenosVisitor<? extends T>)visitor).visitAtributos_declaracao(this);
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
			setState(110); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(109);
				var_declaracao();
				}
				}
				setState(112); 
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
			if ( listener instanceof CmenosListener ) ((CmenosListener)listener).enterFun_declaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmenosListener ) ((CmenosListener)listener).exitFun_declaracao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmenosVisitor ) return ((CmenosVisitor<? extends T>)visitor).visitFun_declaracao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fun_declaracaoContext fun_declaracao() throws RecognitionException {
		Fun_declaracaoContext _localctx = new Fun_declaracaoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_fun_declaracao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			tipo_especificador();
			setState(115);
			ident();
			setState(116);
			match(ABRE_PARENTESES);
			setState(117);
			params();
			setState(118);
			match(FECHA_PARENTESES);
			setState(119);
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
		public TerminalNode VOID() { return getToken(CmenosParser.VOID, 0); }
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmenosListener ) ((CmenosListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmenosListener ) ((CmenosListener)listener).exitParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmenosVisitor ) return ((CmenosVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_params);
		try {
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				param_lista();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
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
			if ( listener instanceof CmenosListener ) ((CmenosListener)listener).enterParam_lista(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmenosListener ) ((CmenosListener)listener).exitParam_lista(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmenosVisitor ) return ((CmenosVisitor<? extends T>)visitor).visitParam_lista(this);
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
			setState(125);
			param();
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(126);
				match(VIRGULA);
				setState(127);
				param();
				}
				}
				setState(132);
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
			if ( listener instanceof CmenosListener ) ((CmenosListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmenosListener ) ((CmenosListener)listener).exitParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmenosVisitor ) return ((CmenosVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_param);
		try {
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				tipo_especificador();
				setState(134);
				ident();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				tipo_especificador();
				setState(137);
				ident();
				setState(138);
				match(ABRE_COLCHETES);
				setState(139);
				match(FECHA_COLCHETES);
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
			if ( listener instanceof CmenosListener ) ((CmenosListener)listener).enterComposto_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmenosListener ) ((CmenosListener)listener).exitComposto_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmenosVisitor ) return ((CmenosVisitor<? extends T>)visitor).visitComposto_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Composto_declContext composto_decl() throws RecognitionException {
		Composto_declContext _localctx = new Composto_declContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_composto_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(ABRE_CHAVES);
			setState(144);
			local_declaracoes();
			setState(145);
			comando_lista();
			setState(146);
			match(FECHA_CHAVES);
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
			if ( listener instanceof CmenosListener ) ((CmenosListener)listener).enterLocal_declaracoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmenosListener ) ((CmenosListener)listener).exitLocal_declaracoes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmenosVisitor ) return ((CmenosVisitor<? extends T>)visitor).visitLocal_declaracoes(this);
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
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHAR) | (1L << FLOAT) | (1L << INT) | (1L << STRUCT) | (1L << VOID))) != 0)) {
				{
				{
				setState(148);
				var_declaracao();
				}
				}
				setState(153);
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
			if ( listener instanceof CmenosListener ) ((CmenosListener)listener).enterComando_lista(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmenosListener ) ((CmenosListener)listener).exitComando_lista(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmenosVisitor ) return ((CmenosVisitor<? extends T>)visitor).visitComando_lista(this);
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
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIGITO) | (1L << LETRA_MINUSCULA) | (1L << PONTO_VIRGULA) | (1L << RETURN) | (1L << WHILE) | (1L << IF) | (1L << ABRE_CHAVES) | (1L << ABRE_PARENTESES) | (1L << OP_ADICAO) | (1L << OP_SUBTRACAO))) != 0)) {
				{
				{
				setState(154);
				comando();
				}
				}
				setState(159);
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
			if ( listener instanceof CmenosListener ) ((CmenosListener)listener).enterComando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmenosListener ) ((CmenosListener)listener).exitComando(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmenosVisitor ) return ((CmenosVisitor<? extends T>)visitor).visitComando(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_comando);
		try {
			setState(165);
			switch (_input.LA(1)) {
			case DIGITO:
			case LETRA_MINUSCULA:
			case PONTO_VIRGULA:
			case ABRE_PARENTESES:
			case OP_ADICAO:
			case OP_SUBTRACAO:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				expressao_decl();
				}
				break;
			case ABRE_CHAVES:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				composto_decl();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(162);
				selecao_decl();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(163);
				iteracao_decl();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 5);
				{
				setState(164);
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
		public TerminalNode PONTO_VIRGULA() { return getToken(CmenosParser.PONTO_VIRGULA, 0); }
		public Expressao_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmenosListener ) ((CmenosListener)listener).enterExpressao_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmenosListener ) ((CmenosListener)listener).exitExpressao_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmenosVisitor ) return ((CmenosVisitor<? extends T>)visitor).visitExpressao_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expressao_declContext expressao_decl() throws RecognitionException {
		Expressao_declContext _localctx = new Expressao_declContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expressao_decl);
		try {
			setState(171);
			switch (_input.LA(1)) {
			case DIGITO:
			case LETRA_MINUSCULA:
			case ABRE_PARENTESES:
			case OP_ADICAO:
			case OP_SUBTRACAO:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				expressao();
				setState(168);
				match(PONTO_VIRGULA);
				}
				break;
			case PONTO_VIRGULA:
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
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
		public TerminalNode IF() { return getToken(CmenosParser.IF, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(CmenosParser.ELSE, 0); }
		public Selecao_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selecao_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmenosListener ) ((CmenosListener)listener).enterSelecao_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmenosListener ) ((CmenosListener)listener).exitSelecao_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmenosVisitor ) return ((CmenosVisitor<? extends T>)visitor).visitSelecao_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Selecao_declContext selecao_decl() throws RecognitionException {
		Selecao_declContext _localctx = new Selecao_declContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_selecao_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(IF);
			setState(174);
			match(ABRE_PARENTESES);
			setState(175);
			expressao();
			setState(176);
			match(FECHA_PARENTESES);
			setState(177);
			comando();
			setState(180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(178);
				match(ELSE);
				setState(179);
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
		public TerminalNode WHILE() { return getToken(CmenosParser.WHILE, 0); }
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
			if ( listener instanceof CmenosListener ) ((CmenosListener)listener).enterIteracao_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmenosListener ) ((CmenosListener)listener).exitIteracao_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmenosVisitor ) return ((CmenosVisitor<? extends T>)visitor).visitIteracao_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Iteracao_declContext iteracao_decl() throws RecognitionException {
		Iteracao_declContext _localctx = new Iteracao_declContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_iteracao_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(WHILE);
			setState(183);
			match(ABRE_PARENTESES);
			setState(184);
			expressao();
			setState(185);
			match(FECHA_PARENTESES);
			setState(186);
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
		public TerminalNode RETURN() { return getToken(CmenosParser.RETURN, 0); }
		public TerminalNode PONTO_VIRGULA() { return getToken(CmenosParser.PONTO_VIRGULA, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public Retorno_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retorno_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmenosListener ) ((CmenosListener)listener).enterRetorno_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmenosListener ) ((CmenosListener)listener).exitRetorno_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmenosVisitor ) return ((CmenosVisitor<? extends T>)visitor).visitRetorno_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Retorno_declContext retorno_decl() throws RecognitionException {
		Retorno_declContext _localctx = new Retorno_declContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_retorno_decl);
		try {
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(188);
				match(RETURN);
				setState(189);
				match(PONTO_VIRGULA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				match(RETURN);
				setState(191);
				expressao();
				setState(192);
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
		public TerminalNode ATRIBUICAO() { return getToken(CmenosParser.ATRIBUICAO, 0); }
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
			if ( listener instanceof CmenosListener ) ((CmenosListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmenosListener ) ((CmenosListener)listener).exitExpressao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmenosVisitor ) return ((CmenosVisitor<? extends T>)visitor).visitExpressao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expressao);
		try {
			setState(201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				var();
				setState(197);
				match(ATRIBUICAO);
				setState(198);
				expressao();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
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
			if ( listener instanceof CmenosListener ) ((CmenosListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmenosListener ) ((CmenosListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmenosVisitor ) return ((CmenosVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_var);
		int _la;
		try {
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				ident();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				ident();
				setState(209); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(205);
					match(ABRE_COLCHETES);
					setState(206);
					expressao();
					setState(207);
					match(FECHA_COLCHETES);
					}
					}
					setState(211); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ABRE_COLCHETES );
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
			if ( listener instanceof CmenosListener ) ((CmenosListener)listener).enterExpressao_simples(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmenosListener ) ((CmenosListener)listener).exitExpressao_simples(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmenosVisitor ) return ((CmenosVisitor<? extends T>)visitor).visitExpressao_simples(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expressao_simplesContext expressao_simples() throws RecognitionException {
		Expressao_simplesContext _localctx = new Expressao_simplesContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_expressao_simples);
		try {
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				expressao_soma();
				setState(216);
				op_relacional();
				setState(217);
				expressao_soma();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
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
		public TerminalNode MENORIGUAL() { return getToken(CmenosParser.MENORIGUAL, 0); }
		public TerminalNode MENOR() { return getToken(CmenosParser.MENOR, 0); }
		public TerminalNode MAIOR() { return getToken(CmenosParser.MAIOR, 0); }
		public TerminalNode MAIORIGUAL() { return getToken(CmenosParser.MAIORIGUAL, 0); }
		public TerminalNode IGUALDADE() { return getToken(CmenosParser.IGUALDADE, 0); }
		public TerminalNode DIFERENCA() { return getToken(CmenosParser.DIFERENCA, 0); }
		public Op_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_relacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmenosListener ) ((CmenosListener)listener).enterOp_relacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmenosListener ) ((CmenosListener)listener).exitOp_relacional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmenosVisitor ) return ((CmenosVisitor<? extends T>)visitor).visitOp_relacional(this);
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
			setState(222);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAIOR) | (1L << MENOR) | (1L << MAIORIGUAL) | (1L << MENORIGUAL) | (1L << IGUALDADE) | (1L << DIFERENCA))) != 0)) ) {
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
			if ( listener instanceof CmenosListener ) ((CmenosListener)listener).enterExpressao_soma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmenosListener ) ((CmenosListener)listener).exitExpressao_soma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmenosVisitor ) return ((CmenosVisitor<? extends T>)visitor).visitExpressao_soma(this);
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
			setState(224);
			termo();
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_ADICAO || _la==OP_SUBTRACAO) {
				{
				{
				setState(225);
				soma();
				setState(226);
				termo();
				}
				}
				setState(232);
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
		public TerminalNode OP_ADICAO() { return getToken(CmenosParser.OP_ADICAO, 0); }
		public TerminalNode OP_SUBTRACAO() { return getToken(CmenosParser.OP_SUBTRACAO, 0); }
		public SomaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_soma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmenosListener ) ((CmenosListener)listener).enterSoma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmenosListener ) ((CmenosListener)listener).exitSoma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmenosVisitor ) return ((CmenosVisitor<? extends T>)visitor).visitSoma(this);
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
			setState(233);
			_la = _input.LA(1);
			if ( !(_la==OP_ADICAO || _la==OP_SUBTRACAO) ) {
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
			if ( listener instanceof CmenosListener ) ((CmenosListener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmenosListener ) ((CmenosListener)listener).exitTermo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmenosVisitor ) return ((CmenosVisitor<? extends T>)visitor).visitTermo(this);
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
			setState(235);
			fator();
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_MULTIPLICACAO || _la==OP_DIVISAO) {
				{
				{
				setState(236);
				mult();
				setState(237);
				fator();
				}
				}
				setState(243);
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
		public TerminalNode OP_MULTIPLICACAO() { return getToken(CmenosParser.OP_MULTIPLICACAO, 0); }
		public TerminalNode OP_DIVISAO() { return getToken(CmenosParser.OP_DIVISAO, 0); }
		public MultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mult; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmenosListener ) ((CmenosListener)listener).enterMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmenosListener ) ((CmenosListener)listener).exitMult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmenosVisitor ) return ((CmenosVisitor<? extends T>)visitor).visitMult(this);
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
			setState(244);
			_la = _input.LA(1);
			if ( !(_la==OP_MULTIPLICACAO || _la==OP_DIVISAO) ) {
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
			if ( listener instanceof CmenosListener ) ((CmenosListener)listener).enterFator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmenosListener ) ((CmenosListener)listener).exitFator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmenosVisitor ) return ((CmenosVisitor<? extends T>)visitor).visitFator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_fator);
		try {
			setState(254);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				match(ABRE_PARENTESES);
				setState(247);
				expressao();
				setState(248);
				match(FECHA_PARENTESES);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
				var();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(251);
				ativacao();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(252);
				num();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(253);
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
			if ( listener instanceof CmenosListener ) ((CmenosListener)listener).enterAtivacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmenosListener ) ((CmenosListener)listener).exitAtivacao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmenosVisitor ) return ((CmenosVisitor<? extends T>)visitor).visitAtivacao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtivacaoContext ativacao() throws RecognitionException {
		AtivacaoContext _localctx = new AtivacaoContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_ativacao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			ident();
			setState(257);
			match(ABRE_PARENTESES);
			setState(258);
			args();
			setState(259);
			match(FECHA_PARENTESES);
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
			if ( listener instanceof CmenosListener ) ((CmenosListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmenosListener ) ((CmenosListener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmenosVisitor ) return ((CmenosVisitor<? extends T>)visitor).visitArgs(this);
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
			setState(262);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIGITO) | (1L << LETRA_MINUSCULA) | (1L << ABRE_PARENTESES) | (1L << OP_ADICAO) | (1L << OP_SUBTRACAO))) != 0)) {
				{
				setState(261);
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
		public List<TerminalNode> VIRGULA() { return getTokens(CmenosParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(CmenosParser.VIRGULA, i);
		}
		public Args_listaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args_lista; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmenosListener ) ((CmenosListener)listener).enterArgs_lista(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmenosListener ) ((CmenosListener)listener).exitArgs_lista(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmenosVisitor ) return ((CmenosVisitor<? extends T>)visitor).visitArgs_lista(this);
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
			setState(264);
			expressao();
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(265);
				match(VIRGULA);
				setState(266);
				expressao();
				}
				}
				setState(271);
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
		public List<TerminalNode> DIGITO() { return getTokens(CmenosParser.DIGITO); }
		public TerminalNode DIGITO(int i) {
			return getToken(CmenosParser.DIGITO, i);
		}
		public TerminalNode PONTO() { return getToken(CmenosParser.PONTO, 0); }
		public NumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmenosListener ) ((CmenosListener)listener).enterNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmenosListener ) ((CmenosListener)listener).exitNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmenosVisitor ) return ((CmenosVisitor<? extends T>)visitor).visitNum(this);
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
			setState(273);
			_la = _input.LA(1);
			if (_la==OP_ADICAO || _la==OP_SUBTRACAO) {
				{
				setState(272);
				soma();
				}
			}

			setState(276); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(275);
				match(DIGITO);
				}
				}
				setState(278); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGITO );
			setState(286);
			_la = _input.LA(1);
			if (_la==PONTO) {
				{
				setState(280);
				match(PONTO);
				setState(282); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(281);
					match(DIGITO);
					}
					}
					setState(284); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DIGITO );
				}
			}

			setState(299);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(288);
				match(T__0);
				setState(290);
				_la = _input.LA(1);
				if (_la==OP_ADICAO || _la==OP_SUBTRACAO) {
					{
					setState(289);
					soma();
					}
				}

				{
				setState(292);
				match(DIGITO);
				}
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DIGITO) {
					{
					{
					setState(293);
					match(DIGITO);
					}
					}
					setState(298);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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
		public List<TerminalNode> DIGITO() { return getTokens(CmenosParser.DIGITO); }
		public TerminalNode DIGITO(int i) {
			return getToken(CmenosParser.DIGITO, i);
		}
		public Num_intContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num_int; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmenosListener ) ((CmenosListener)listener).enterNum_int(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmenosListener ) ((CmenosListener)listener).exitNum_int(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmenosVisitor ) return ((CmenosVisitor<? extends T>)visitor).visitNum_int(this);
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
				match(DIGITO);
				}
				}
				setState(304); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGITO );
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
		public List<TerminalNode> LETRA_MINUSCULA() { return getTokens(CmenosParser.LETRA_MINUSCULA); }
		public TerminalNode LETRA_MINUSCULA(int i) {
			return getToken(CmenosParser.LETRA_MINUSCULA, i);
		}
		public List<TerminalNode> LETRA_MAIUSCULA() { return getTokens(CmenosParser.LETRA_MAIUSCULA); }
		public TerminalNode LETRA_MAIUSCULA(int i) {
			return getToken(CmenosParser.LETRA_MAIUSCULA, i);
		}
		public List<TerminalNode> DIGITO() { return getTokens(CmenosParser.DIGITO); }
		public TerminalNode DIGITO(int i) {
			return getToken(CmenosParser.DIGITO, i);
		}
		public IdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ident; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmenosListener ) ((CmenosListener)listener).enterIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmenosListener ) ((CmenosListener)listener).exitIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmenosVisitor ) return ((CmenosVisitor<? extends T>)visitor).visitIdent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentContext ident() throws RecognitionException {
		IdentContext _localctx = new IdentContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_ident);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(LETRA_MINUSCULA);
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIGITO) | (1L << LETRA_MINUSCULA) | (1L << LETRA_MAIUSCULA))) != 0)) {
				{
				{
				setState(307);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIGITO) | (1L << LETRA_MINUSCULA) | (1L << LETRA_MAIUSCULA))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				}
				setState(312);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3*\u013c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\3\3\3\7\3I\n\3\f\3\16\3L\13\3\3\4\3\4\5\4P\n\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\6\5\\\n\5\r\5\16\5]\3\5\3\5\5\5"+
		"b\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6n\n\6\3\7\6\7q\n\7\r"+
		"\7\16\7r\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\5\t~\n\t\3\n\3\n\3\n\7\n"+
		"\u0083\n\n\f\n\16\n\u0086\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\5\13\u0090\n\13\3\f\3\f\3\f\3\f\3\f\3\r\7\r\u0098\n\r\f\r\16\r\u009b"+
		"\13\r\3\16\7\16\u009e\n\16\f\16\16\16\u00a1\13\16\3\17\3\17\3\17\3\17"+
		"\3\17\5\17\u00a8\n\17\3\20\3\20\3\20\3\20\5\20\u00ae\n\20\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\5\21\u00b7\n\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00c5\n\23\3\24\3\24\3\24\3\24\3\24"+
		"\5\24\u00cc\n\24\3\25\3\25\3\25\3\25\3\25\3\25\6\25\u00d4\n\25\r\25\16"+
		"\25\u00d5\5\25\u00d8\n\25\3\26\3\26\3\26\3\26\3\26\5\26\u00df\n\26\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\7\30\u00e7\n\30\f\30\16\30\u00ea\13\30\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\7\32\u00f2\n\32\f\32\16\32\u00f5\13\32\3\33"+
		"\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0101\n\34\3\35\3\35"+
		"\3\35\3\35\3\35\3\36\5\36\u0109\n\36\3\37\3\37\3\37\7\37\u010e\n\37\f"+
		"\37\16\37\u0111\13\37\3 \5 \u0114\n \3 \6 \u0117\n \r \16 \u0118\3 \3"+
		" \6 \u011d\n \r \16 \u011e\5 \u0121\n \3 \3 \5 \u0125\n \3 \3 \7 \u0129"+
		"\n \f \16 \u012c\13 \5 \u012e\n \3!\6!\u0131\n!\r!\16!\u0132\3\"\3\"\7"+
		"\"\u0137\n\"\f\"\16\"\u013a\13\"\3\"\2\2#\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@B\2\6\3\2\36#\3\2\32\33\3\2\34\35\3"+
		"\2\4\6\u0144\2D\3\2\2\2\4F\3\2\2\2\6O\3\2\2\2\ba\3\2\2\2\nm\3\2\2\2\f"+
		"p\3\2\2\2\16t\3\2\2\2\20}\3\2\2\2\22\177\3\2\2\2\24\u008f\3\2\2\2\26\u0091"+
		"\3\2\2\2\30\u0099\3\2\2\2\32\u009f\3\2\2\2\34\u00a7\3\2\2\2\36\u00ad\3"+
		"\2\2\2 \u00af\3\2\2\2\"\u00b8\3\2\2\2$\u00c4\3\2\2\2&\u00cb\3\2\2\2(\u00d7"+
		"\3\2\2\2*\u00de\3\2\2\2,\u00e0\3\2\2\2.\u00e2\3\2\2\2\60\u00eb\3\2\2\2"+
		"\62\u00ed\3\2\2\2\64\u00f6\3\2\2\2\66\u0100\3\2\2\28\u0102\3\2\2\2:\u0108"+
		"\3\2\2\2<\u010a\3\2\2\2>\u0113\3\2\2\2@\u0130\3\2\2\2B\u0134\3\2\2\2D"+
		"E\5\4\3\2E\3\3\2\2\2FJ\5\6\4\2GI\5\6\4\2HG\3\2\2\2IL\3\2\2\2JH\3\2\2\2"+
		"JK\3\2\2\2K\5\3\2\2\2LJ\3\2\2\2MP\5\b\5\2NP\5\16\b\2OM\3\2\2\2ON\3\2\2"+
		"\2P\7\3\2\2\2QR\5\n\6\2RS\5B\"\2ST\7\7\2\2Tb\3\2\2\2UV\5\n\6\2V[\5B\""+
		"\2WX\7\25\2\2XY\5@!\2YZ\7\26\2\2Z\\\3\2\2\2[W\3\2\2\2\\]\3\2\2\2][\3\2"+
		"\2\2]^\3\2\2\2^_\3\2\2\2_`\7\7\2\2`b\3\2\2\2aQ\3\2\2\2aU\3\2\2\2b\t\3"+
		"\2\2\2cn\7\f\2\2dn\7\13\2\2en\7\n\2\2fn\7\17\2\2gh\7\r\2\2hi\5B\"\2ij"+
		"\7\23\2\2jk\5\f\7\2kl\7\24\2\2ln\3\2\2\2mc\3\2\2\2md\3\2\2\2me\3\2\2\2"+
		"mf\3\2\2\2mg\3\2\2\2n\13\3\2\2\2oq\5\b\5\2po\3\2\2\2qr\3\2\2\2rp\3\2\2"+
		"\2rs\3\2\2\2s\r\3\2\2\2tu\5\n\6\2uv\5B\"\2vw\7\27\2\2wx\5\20\t\2xy\7\30"+
		"\2\2yz\5\26\f\2z\17\3\2\2\2{~\5\22\n\2|~\7\17\2\2}{\3\2\2\2}|\3\2\2\2"+
		"~\21\3\2\2\2\177\u0084\5\24\13\2\u0080\u0081\7\b\2\2\u0081\u0083\5\24"+
		"\13\2\u0082\u0080\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0085\23\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u0088\5\n\6"+
		"\2\u0088\u0089\5B\"\2\u0089\u0090\3\2\2\2\u008a\u008b\5\n\6\2\u008b\u008c"+
		"\5B\"\2\u008c\u008d\7\25\2\2\u008d\u008e\7\26\2\2\u008e\u0090\3\2\2\2"+
		"\u008f\u0087\3\2\2\2\u008f\u008a\3\2\2\2\u0090\25\3\2\2\2\u0091\u0092"+
		"\7\23\2\2\u0092\u0093\5\30\r\2\u0093\u0094\5\32\16\2\u0094\u0095\7\24"+
		"\2\2\u0095\27\3\2\2\2\u0096\u0098\5\b\5\2\u0097\u0096\3\2\2\2\u0098\u009b"+
		"\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\31\3\2\2\2\u009b"+
		"\u0099\3\2\2\2\u009c\u009e\5\34\17\2\u009d\u009c\3\2\2\2\u009e\u00a1\3"+
		"\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\33\3\2\2\2\u00a1"+
		"\u009f\3\2\2\2\u00a2\u00a8\5\36\20\2\u00a3\u00a8\5\26\f\2\u00a4\u00a8"+
		"\5 \21\2\u00a5\u00a8\5\"\22\2\u00a6\u00a8\5$\23\2\u00a7\u00a2\3\2\2\2"+
		"\u00a7\u00a3\3\2\2\2\u00a7\u00a4\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a6"+
		"\3\2\2\2\u00a8\35\3\2\2\2\u00a9\u00aa\5&\24\2\u00aa\u00ab\7\7\2\2\u00ab"+
		"\u00ae\3\2\2\2\u00ac\u00ae\7\7\2\2\u00ad\u00a9\3\2\2\2\u00ad\u00ac\3\2"+
		"\2\2\u00ae\37\3\2\2\2\u00af\u00b0\7\21\2\2\u00b0\u00b1\7\27\2\2\u00b1"+
		"\u00b2\5&\24\2\u00b2\u00b3\7\30\2\2\u00b3\u00b6\5\34\17\2\u00b4\u00b5"+
		"\7\22\2\2\u00b5\u00b7\5\34\17\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2"+
		"\2\u00b7!\3\2\2\2\u00b8\u00b9\7\20\2\2\u00b9\u00ba\7\27\2\2\u00ba\u00bb"+
		"\5&\24\2\u00bb\u00bc\7\30\2\2\u00bc\u00bd\5\34\17\2\u00bd#\3\2\2\2\u00be"+
		"\u00bf\7\16\2\2\u00bf\u00c5\7\7\2\2\u00c0\u00c1\7\16\2\2\u00c1\u00c2\5"+
		"&\24\2\u00c2\u00c3\7\7\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00be\3\2\2\2\u00c4"+
		"\u00c0\3\2\2\2\u00c5%\3\2\2\2\u00c6\u00c7\5(\25\2\u00c7\u00c8\7\31\2\2"+
		"\u00c8\u00c9\5&\24\2\u00c9\u00cc\3\2\2\2\u00ca\u00cc\5*\26\2\u00cb\u00c6"+
		"\3\2\2\2\u00cb\u00ca\3\2\2\2\u00cc\'\3\2\2\2\u00cd\u00d8\5B\"\2\u00ce"+
		"\u00d3\5B\"\2\u00cf\u00d0\7\25\2\2\u00d0\u00d1\5&\24\2\u00d1\u00d2\7\26"+
		"\2\2\u00d2\u00d4\3\2\2\2\u00d3\u00cf\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5"+
		"\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d8\3\2\2\2\u00d7\u00cd\3\2"+
		"\2\2\u00d7\u00ce\3\2\2\2\u00d8)\3\2\2\2\u00d9\u00da\5.\30\2\u00da\u00db"+
		"\5,\27\2\u00db\u00dc\5.\30\2\u00dc\u00df\3\2\2\2\u00dd\u00df\5.\30\2\u00de"+
		"\u00d9\3\2\2\2\u00de\u00dd\3\2\2\2\u00df+\3\2\2\2\u00e0\u00e1\t\2\2\2"+
		"\u00e1-\3\2\2\2\u00e2\u00e8\5\62\32\2\u00e3\u00e4\5\60\31\2\u00e4\u00e5"+
		"\5\62\32\2\u00e5\u00e7\3\2\2\2\u00e6\u00e3\3\2\2\2\u00e7\u00ea\3\2\2\2"+
		"\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9/\3\2\2\2\u00ea\u00e8\3"+
		"\2\2\2\u00eb\u00ec\t\3\2\2\u00ec\61\3\2\2\2\u00ed\u00f3\5\66\34\2\u00ee"+
		"\u00ef\5\64\33\2\u00ef\u00f0\5\66\34\2\u00f0\u00f2\3\2\2\2\u00f1\u00ee"+
		"\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4"+
		"\63\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f7\t\4\2\2\u00f7\65\3\2\2\2\u00f8"+
		"\u00f9\7\27\2\2\u00f9\u00fa\5&\24\2\u00fa\u00fb\7\30\2\2\u00fb\u0101\3"+
		"\2\2\2\u00fc\u0101\5(\25\2\u00fd\u0101\58\35\2\u00fe\u0101\5> \2\u00ff"+
		"\u0101\5@!\2\u0100\u00f8\3\2\2\2\u0100\u00fc\3\2\2\2\u0100\u00fd\3\2\2"+
		"\2\u0100\u00fe\3\2\2\2\u0100\u00ff\3\2\2\2\u0101\67\3\2\2\2\u0102\u0103"+
		"\5B\"\2\u0103\u0104\7\27\2\2\u0104\u0105\5:\36\2\u0105\u0106\7\30\2\2"+
		"\u01069\3\2\2\2\u0107\u0109\5<\37\2\u0108\u0107\3\2\2\2\u0108\u0109\3"+
		"\2\2\2\u0109;\3\2\2\2\u010a\u010f\5&\24\2\u010b\u010c\7\b\2\2\u010c\u010e"+
		"\5&\24\2\u010d\u010b\3\2\2\2\u010e\u0111\3\2\2\2\u010f\u010d\3\2\2\2\u010f"+
		"\u0110\3\2\2\2\u0110=\3\2\2\2\u0111\u010f\3\2\2\2\u0112\u0114\5\60\31"+
		"\2\u0113\u0112\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0116\3\2\2\2\u0115\u0117"+
		"\7\4\2\2\u0116\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0116\3\2\2\2\u0118"+
		"\u0119\3\2\2\2\u0119\u0120\3\2\2\2\u011a\u011c\7\t\2\2\u011b\u011d\7\4"+
		"\2\2\u011c\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011c\3\2\2\2\u011e"+
		"\u011f\3\2\2\2\u011f\u0121\3\2\2\2\u0120\u011a\3\2\2\2\u0120\u0121\3\2"+
		"\2\2\u0121\u012d\3\2\2\2\u0122\u0124\7\3\2\2\u0123\u0125\5\60\31\2\u0124"+
		"\u0123\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u012a\7\4"+
		"\2\2\u0127\u0129\7\4\2\2\u0128\u0127\3\2\2\2\u0129\u012c\3\2\2\2\u012a"+
		"\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012e\3\2\2\2\u012c\u012a\3\2"+
		"\2\2\u012d\u0122\3\2\2\2\u012d\u012e\3\2\2\2\u012e?\3\2\2\2\u012f\u0131"+
		"\7\4\2\2\u0130\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0130\3\2\2\2\u0132"+
		"\u0133\3\2\2\2\u0133A\3\2\2\2\u0134\u0138\7\5\2\2\u0135\u0137\t\5\2\2"+
		"\u0136\u0135\3\2\2\2\u0137\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139"+
		"\3\2\2\2\u0139C\3\2\2\2\u013a\u0138\3\2\2\2#JO]amr}\u0084\u008f\u0099"+
		"\u009f\u00a7\u00ad\u00b6\u00c4\u00cb\u00d5\u00d7\u00de\u00e8\u00f3\u0100"+
		"\u0108\u010f\u0113\u0118\u011e\u0120\u0124\u012a\u012d\u0132\u0138";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}