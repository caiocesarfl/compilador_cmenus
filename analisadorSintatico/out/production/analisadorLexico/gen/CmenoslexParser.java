// Generated from /home/caio/IdeaProjects/analisadorLexico/out/production/analisadorLexico/Cmenoslex.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CmenoslexParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, COMENTARIO=37, DESCONSIDERAR=38, 
		INT=39, FLOAT=40, VOID=41, STRUCT=42, IF=43, ELSE=44, WHILE=45, RETURN=46, 
		CHAR=47, OP_MULT=48, OP_SOMA=49, OP_COMPARACAO=50, OP_RELACIONAL=51, OP_ATRIBUICAO=52, 
		ABRE_CHAVE=53, FECHA_CHAVE=54, ABRE_COLCHETE=55, FECHA_COLCHETE=56, ABRE_PARENTESES=57, 
		FECHA_PARENTESES=58, PONTO_VIRGULA=59, VIRGULA=60, DIGITO_INTEIRO=61, 
		DIGITO_REAL=62, ARRANJO=63, IDENTIFICADOR=64, ERRO_IDENTIFICADOR=65, ERRO_NUMERO_REAL_CASA_DECIMAL=66, 
		ERRO_NUMERO_REAL_CASA_INTEIRA=67, ERRO_CARACTER_DECIMAL=68, ERRO_CARACTER_INVALIDO=69;
	public static final int
		RULE_programa = 0, RULE_declaraçãoLista = 1, RULE_declaração = 2, RULE_varDeclaração = 3, 
		RULE_tipoEspecificador = 4, RULE_atributosDeclaração = 5, RULE_funDeclaração = 6, 
		RULE_params = 7, RULE_paramLista = 8, RULE_param = 9, RULE_compostoDecl = 10, 
		RULE_localDeclarações = 11, RULE_comandoLista = 12, RULE_comando = 13, 
		RULE_expressãoDecl = 14, RULE_seleçãoDecl = 15, RULE_iteraçãoDecl = 16, 
		RULE_retornoDecl = 17, RULE_expressão = 18, RULE_var = 19, RULE_expressãoSimples = 20, 
		RULE_expressãoSoma = 21, RULE_termo = 22, RULE_fator = 23, RULE_ativação = 24, 
		RULE_args = 25, RULE_argLista = 26, RULE_digito = 27, RULE_letra = 28;
	public static final String[] ruleNames = {
		"programa", "declaraçãoLista", "declaração", "varDeclaração", "tipoEspecificador", 
		"atributosDeclaração", "funDeclaração", "params", "paramLista", "param", 
		"compostoDecl", "localDeclarações", "comandoLista", "comando", "expressãoDecl", 
		"seleçãoDecl", "iteraçãoDecl", "retornoDecl", "expressão", "var", "expressãoSimples", 
		"expressãoSoma", "termo", "fator", "ativação", "args", "argLista", "digito", 
		"letra"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'0'", "'1'", "'2'", "'3'", "'4'", "'5'", "'6'", "'7'", "'8'", "'9'", 
		"'a'", "'b'", "'c'", "'d'", "'e'", "'f'", "'g'", "'h'", "'i'", "'j'", 
		"'k'", "'l'", "'m'", "'n'", "'o'", "'p'", "'q'", "'r'", "'s'", "'t'", 
		"'u'", "'v'", "'w'", "'x'", "'y'", "'z'", null, null, "'int'", "'float'", 
		"'void'", "'struct'", "'if'", "'else'", "'while'", "'return'", "'char'", 
		null, null, null, null, "'='", "'{'", "'}'", "'['", "']'", "'('", "')'", 
		"';'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "COMENTARIO", "DESCONSIDERAR", "INT", "FLOAT", "VOID", "STRUCT", 
		"IF", "ELSE", "WHILE", "RETURN", "CHAR", "OP_MULT", "OP_SOMA", "OP_COMPARACAO", 
		"OP_RELACIONAL", "OP_ATRIBUICAO", "ABRE_CHAVE", "FECHA_CHAVE", "ABRE_COLCHETE", 
		"FECHA_COLCHETE", "ABRE_PARENTESES", "FECHA_PARENTESES", "PONTO_VIRGULA", 
		"VIRGULA", "DIGITO_INTEIRO", "DIGITO_REAL", "ARRANJO", "IDENTIFICADOR", 
		"ERRO_IDENTIFICADOR", "ERRO_NUMERO_REAL_CASA_DECIMAL", "ERRO_NUMERO_REAL_CASA_INTEIRA", 
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
	public String getGrammarFileName() { return "Cmenoslex.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CmenoslexParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramaContext extends ParserRuleContext {
		public DeclaraçãoListaContext declaraçãoLista() {
			return getRuleContext(DeclaraçãoListaContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmenoslexListener ) ((CmenoslexListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmenoslexListener ) ((CmenoslexListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmenoslexVisitor ) return ((CmenoslexVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			declaraçãoLista();
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

	public static class DeclaraçãoListaContext extends ParserRuleContext {
		public List<DeclaraçãoContext> declaração() {
			return getRuleContexts(DeclaraçãoContext.class);
		}
		public DeclaraçãoContext declaração(int i) {
			return getRuleContext(DeclaraçãoContext.class,i);
		}
		public DeclaraçãoListaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaraçãoLista; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmenoslexListener ) ((CmenoslexListener)listener).enterDeclaraçãoLista(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmenoslexListener ) ((CmenoslexListener)listener).exitDeclaraçãoLista(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmenoslexVisitor ) return ((CmenoslexVisitor<? extends T>)visitor).visitDeclaraçãoLista(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaraçãoListaContext declaraçãoLista() throws RecognitionException {
		DeclaraçãoListaContext _localctx = new DeclaraçãoListaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaraçãoLista);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			declaração();
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << VOID) | (1L << STRUCT) | (1L << CHAR))) != 0)) {
				{
				{
				setState(61);
				declaração();
				}
				}
				setState(66);
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

	public static class DeclaraçãoContext extends ParserRuleContext {
		public VarDeclaraçãoContext varDeclaração() {
			return getRuleContext(VarDeclaraçãoContext.class,0);
		}
		public FunDeclaraçãoContext funDeclaração() {
			return getRuleContext(FunDeclaraçãoContext.class,0);
		}
		public DeclaraçãoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaração; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmenoslexListener ) ((CmenoslexListener)listener).enterDeclaração(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmenoslexListener ) ((CmenoslexListener)listener).exitDeclaração(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmenoslexVisitor ) return ((CmenoslexVisitor<? extends T>)visitor).visitDeclaração(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaraçãoContext declaração() throws RecognitionException {
		DeclaraçãoContext _localctx = new DeclaraçãoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaração);
		try {
			setState(69);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				varDeclaração();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				funDeclaração();
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

	public static class VarDeclaraçãoContext extends ParserRuleContext {
		public TipoEspecificadorContext tipoEspecificador() {
			return getRuleContext(TipoEspecificadorContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(CmenoslexParser.IDENTIFICADOR, 0); }
		public TerminalNode PONTO_VIRGULA() { return getToken(CmenoslexParser.PONTO_VIRGULA, 0); }
		public List<TerminalNode> ABRE_COLCHETE() { return getTokens(CmenoslexParser.ABRE_COLCHETE); }
		public TerminalNode ABRE_COLCHETE(int i) {
			return getToken(CmenoslexParser.ABRE_COLCHETE, i);
		}
		public List<TerminalNode> DIGITO_INTEIRO() { return getTokens(CmenoslexParser.DIGITO_INTEIRO); }
		public TerminalNode DIGITO_INTEIRO(int i) {
			return getToken(CmenoslexParser.DIGITO_INTEIRO, i);
		}
		public List<TerminalNode> FECHA_COLCHETE() { return getTokens(CmenoslexParser.FECHA_COLCHETE); }
		public TerminalNode FECHA_COLCHETE(int i) {
			return getToken(CmenoslexParser.FECHA_COLCHETE, i);
		}
		public VarDeclaraçãoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaração; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmenoslexListener ) ((CmenoslexListener)listener).enterVarDeclaração(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmenoslexListener ) ((CmenoslexListener)listener).exitVarDeclaração(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmenoslexVisitor ) return ((CmenoslexVisitor<? extends T>)visitor).visitVarDeclaração(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclaraçãoContext varDeclaração() throws RecognitionException {
		VarDeclaraçãoContext _localctx = new VarDeclaraçãoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varDeclaração);
		try {
			setState(84);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				tipoEspecificador();
				setState(72);
				match(IDENTIFICADOR);
				setState(73);
				match(PONTO_VIRGULA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				tipoEspecificador();
				setState(76);
				match(IDENTIFICADOR);
				setState(77);
				match(ABRE_COLCHETE);
				setState(78);
				match(DIGITO_INTEIRO);
				setState(79);
				match(FECHA_COLCHETE);
				{
				setState(80);
				match(ABRE_COLCHETE);
				setState(81);
				match(DIGITO_INTEIRO);
				setState(82);
				match(FECHA_COLCHETE);
				}
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

	public static class TipoEspecificadorContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(CmenoslexParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(CmenoslexParser.FLOAT, 0); }
		public TerminalNode CHAR() { return getToken(CmenoslexParser.CHAR, 0); }
		public TerminalNode VOID() { return getToken(CmenoslexParser.VOID, 0); }
		public TerminalNode STRUCT() { return getToken(CmenoslexParser.STRUCT, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(CmenoslexParser.IDENTIFICADOR, 0); }
		public TerminalNode ABRE_CHAVE() { return getToken(CmenoslexParser.ABRE_CHAVE, 0); }
		public AtributosDeclaraçãoContext atributosDeclaração() {
			return getRuleContext(AtributosDeclaraçãoContext.class,0);
		}
		public TerminalNode FECHA_CHAVE() { return getToken(CmenoslexParser.FECHA_CHAVE, 0); }
		public TipoEspecificadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoEspecificador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmenoslexListener ) ((CmenoslexListener)listener).enterTipoEspecificador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmenoslexListener ) ((CmenoslexListener)listener).exitTipoEspecificador(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmenoslexVisitor ) return ((CmenoslexVisitor<? extends T>)visitor).visitTipoEspecificador(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoEspecificadorContext tipoEspecificador() throws RecognitionException {
		TipoEspecificadorContext _localctx = new TipoEspecificadorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tipoEspecificador);
		try {
			setState(96);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				match(INT);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				match(FLOAT);
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(88);
				match(CHAR);
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 4);
				{
				setState(89);
				match(VOID);
				}
				break;
			case STRUCT:
				enterOuterAlt(_localctx, 5);
				{
				setState(90);
				match(STRUCT);
				setState(91);
				match(IDENTIFICADOR);
				setState(92);
				match(ABRE_CHAVE);
				setState(93);
				atributosDeclaração();
				setState(94);
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

	public static class AtributosDeclaraçãoContext extends ParserRuleContext {
		public List<VarDeclaraçãoContext> varDeclaração() {
			return getRuleContexts(VarDeclaraçãoContext.class);
		}
		public VarDeclaraçãoContext varDeclaração(int i) {
			return getRuleContext(VarDeclaraçãoContext.class,i);
		}
		public AtributosDeclaraçãoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atributosDeclaração; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmenoslexListener ) ((CmenoslexListener)listener).enterAtributosDeclaração(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmenoslexListener ) ((CmenoslexListener)listener).exitAtributosDeclaração(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmenoslexVisitor ) return ((CmenoslexVisitor<? extends T>)visitor).visitAtributosDeclaração(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtributosDeclaraçãoContext atributosDeclaração() throws RecognitionException {
		AtributosDeclaraçãoContext _localctx = new AtributosDeclaraçãoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_atributosDeclaração);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			varDeclaração();
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << VOID) | (1L << STRUCT) | (1L << CHAR))) != 0)) {
				{
				{
				setState(99);
				varDeclaração();
				}
				}
				setState(104);
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

	public static class FunDeclaraçãoContext extends ParserRuleContext {
		public TipoEspecificadorContext tipoEspecificador() {
			return getRuleContext(TipoEspecificadorContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(CmenoslexParser.IDENTIFICADOR, 0); }
		public CompostoDeclContext compostoDecl() {
			return getRuleContext(CompostoDeclContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public FunDeclaraçãoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funDeclaração; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmenoslexListener ) ((CmenoslexListener)listener).enterFunDeclaração(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmenoslexListener ) ((CmenoslexListener)listener).exitFunDeclaração(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmenoslexVisitor ) return ((CmenoslexVisitor<? extends T>)visitor).visitFunDeclaração(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunDeclaraçãoContext funDeclaração() throws RecognitionException {
		FunDeclaraçãoContext _localctx = new FunDeclaraçãoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_funDeclaração);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			tipoEspecificador();
			setState(106);
			match(IDENTIFICADOR);
			{
			setState(107);
			params();
			}
			setState(108);
			compostoDecl();
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
		public ParamListaContext paramLista() {
			return getRuleContext(ParamListaContext.class,0);
		}
		public TerminalNode VOID() { return getToken(CmenoslexParser.VOID, 0); }
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmenoslexListener ) ((CmenoslexListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmenoslexListener ) ((CmenoslexListener)listener).exitParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmenoslexVisitor ) return ((CmenoslexVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_params);
		try {
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				paramLista();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
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

	public static class ParamListaContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(CmenoslexParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(CmenoslexParser.VIRGULA, i);
		}
		public ParamListaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramLista; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmenoslexListener ) ((CmenoslexListener)listener).enterParamLista(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmenoslexListener ) ((CmenoslexListener)listener).exitParamLista(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmenoslexVisitor ) return ((CmenoslexVisitor<? extends T>)visitor).visitParamLista(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamListaContext paramLista() throws RecognitionException {
		ParamListaContext _localctx = new ParamListaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_paramLista);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			param();
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(115);
				match(VIRGULA);
				setState(116);
				param();
				}
				}
				setState(121);
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
		public TipoEspecificadorContext tipoEspecificador() {
			return getRuleContext(TipoEspecificadorContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(CmenoslexParser.IDENTIFICADOR, 0); }
		public TerminalNode ABRE_COLCHETE() { return getToken(CmenoslexParser.ABRE_COLCHETE, 0); }
		public TerminalNode FECHA_COLCHETE() { return getToken(CmenoslexParser.FECHA_COLCHETE, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmenoslexListener ) ((CmenoslexListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmenoslexListener ) ((CmenoslexListener)listener).exitParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmenoslexVisitor ) return ((CmenoslexVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_param);
		try {
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				tipoEspecificador();
				setState(123);
				match(IDENTIFICADOR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				tipoEspecificador();
				setState(126);
				match(IDENTIFICADOR);
				setState(127);
				match(ABRE_COLCHETE);
				setState(128);
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

	public static class CompostoDeclContext extends ParserRuleContext {
		public TerminalNode ABRE_CHAVE() { return getToken(CmenoslexParser.ABRE_CHAVE, 0); }
		public LocalDeclaraçõesContext localDeclarações() {
			return getRuleContext(LocalDeclaraçõesContext.class,0);
		}
		public ComandoListaContext comandoLista() {
			return getRuleContext(ComandoListaContext.class,0);
		}
		public TerminalNode FECHA_CHAVE() { return getToken(CmenoslexParser.FECHA_CHAVE, 0); }
		public CompostoDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compostoDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmenoslexListener ) ((CmenoslexListener)listener).enterCompostoDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmenoslexListener ) ((CmenoslexListener)listener).exitCompostoDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmenoslexVisitor ) return ((CmenoslexVisitor<? extends T>)visitor).visitCompostoDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompostoDeclContext compostoDecl() throws RecognitionException {
		CompostoDeclContext _localctx = new CompostoDeclContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_compostoDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(ABRE_CHAVE);
			setState(133);
			localDeclarações();
			setState(134);
			comandoLista();
			setState(135);
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

	public static class LocalDeclaraçõesContext extends ParserRuleContext {
		public List<VarDeclaraçãoContext> varDeclaração() {
			return getRuleContexts(VarDeclaraçãoContext.class);
		}
		public VarDeclaraçãoContext varDeclaração(int i) {
			return getRuleContext(VarDeclaraçãoContext.class,i);
		}
		public LocalDeclaraçõesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localDeclarações; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmenoslexListener ) ((CmenoslexListener)listener).enterLocalDeclarações(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmenoslexListener ) ((CmenoslexListener)listener).exitLocalDeclarações(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmenoslexVisitor ) return ((CmenoslexVisitor<? extends T>)visitor).visitLocalDeclarações(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalDeclaraçõesContext localDeclarações() throws RecognitionException {
		LocalDeclaraçõesContext _localctx = new LocalDeclaraçõesContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_localDeclarações);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << VOID) | (1L << STRUCT) | (1L << CHAR))) != 0)) {
				{
				{
				setState(137);
				varDeclaração();
				}
				}
				setState(142);
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

	public static class ComandoListaContext extends ParserRuleContext {
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public ComandoListaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandoLista; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmenoslexListener ) ((CmenoslexListener)listener).enterComandoLista(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmenoslexListener ) ((CmenoslexListener)listener).exitComandoLista(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmenoslexVisitor ) return ((CmenoslexVisitor<? extends T>)visitor).visitComandoLista(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandoListaContext comandoLista() throws RecognitionException {
		ComandoListaContext _localctx = new ComandoListaContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_comandoLista);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 43)) & ~0x3f) == 0 && ((1L << (_la - 43)) & ((1L << (IF - 43)) | (1L << (WHILE - 43)) | (1L << (RETURN - 43)) | (1L << (ABRE_CHAVE - 43)) | (1L << (ABRE_PARENTESES - 43)) | (1L << (PONTO_VIRGULA - 43)) | (1L << (DIGITO_INTEIRO - 43)) | (1L << (DIGITO_REAL - 43)) | (1L << (IDENTIFICADOR - 43)))) != 0)) {
				{
				{
				setState(143);
				comando();
				}
				}
				setState(148);
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
		public ExpressãoDeclContext expressãoDecl() {
			return getRuleContext(ExpressãoDeclContext.class,0);
		}
		public CompostoDeclContext compostoDecl() {
			return getRuleContext(CompostoDeclContext.class,0);
		}
		public SeleçãoDeclContext seleçãoDecl() {
			return getRuleContext(SeleçãoDeclContext.class,0);
		}
		public IteraçãoDeclContext iteraçãoDecl() {
			return getRuleContext(IteraçãoDeclContext.class,0);
		}
		public RetornoDeclContext retornoDecl() {
			return getRuleContext(RetornoDeclContext.class,0);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmenoslexListener ) ((CmenoslexListener)listener).enterComando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmenoslexListener ) ((CmenoslexListener)listener).exitComando(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmenoslexVisitor ) return ((CmenoslexVisitor<? extends T>)visitor).visitComando(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_comando);
		try {
			setState(154);
			switch (_input.LA(1)) {
			case ABRE_PARENTESES:
			case PONTO_VIRGULA:
			case DIGITO_INTEIRO:
			case DIGITO_REAL:
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				expressãoDecl();
				}
				break;
			case ABRE_CHAVE:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				compostoDecl();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(151);
				seleçãoDecl();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(152);
				iteraçãoDecl();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 5);
				{
				setState(153);
				retornoDecl();
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

	public static class ExpressãoDeclContext extends ParserRuleContext {
		public ExpressãoContext expressão() {
			return getRuleContext(ExpressãoContext.class,0);
		}
		public TerminalNode PONTO_VIRGULA() { return getToken(CmenoslexParser.PONTO_VIRGULA, 0); }
		public ExpressãoDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressãoDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmenoslexListener ) ((CmenoslexListener)listener).enterExpressãoDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmenoslexListener ) ((CmenoslexListener)listener).exitExpressãoDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmenoslexVisitor ) return ((CmenoslexVisitor<? extends T>)visitor).visitExpressãoDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressãoDeclContext expressãoDecl() throws RecognitionException {
		ExpressãoDeclContext _localctx = new ExpressãoDeclContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expressãoDecl);
		try {
			setState(160);
			switch (_input.LA(1)) {
			case ABRE_PARENTESES:
			case DIGITO_INTEIRO:
			case DIGITO_REAL:
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				expressão();
				setState(157);
				match(PONTO_VIRGULA);
				}
				break;
			case PONTO_VIRGULA:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
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

	public static class SeleçãoDeclContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(CmenoslexParser.IF, 0); }
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public ExpressãoContext expressão() {
			return getRuleContext(ExpressãoContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(CmenoslexParser.ELSE, 0); }
		public SeleçãoDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seleçãoDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmenoslexListener ) ((CmenoslexListener)listener).enterSeleçãoDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmenoslexListener ) ((CmenoslexListener)listener).exitSeleçãoDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmenoslexVisitor ) return ((CmenoslexVisitor<? extends T>)visitor).visitSeleçãoDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeleçãoDeclContext seleçãoDecl() throws RecognitionException {
		SeleçãoDeclContext _localctx = new SeleçãoDeclContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_seleçãoDecl);
		try {
			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				match(IF);
				{
				setState(163);
				expressão();
				}
				setState(164);
				comando();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				match(IF);
				{
				setState(167);
				expressão();
				}
				setState(168);
				comando();
				setState(169);
				match(ELSE);
				setState(170);
				comando();
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

	public static class IteraçãoDeclContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(CmenoslexParser.WHILE, 0); }
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public ExpressãoContext expressão() {
			return getRuleContext(ExpressãoContext.class,0);
		}
		public IteraçãoDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iteraçãoDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmenoslexListener ) ((CmenoslexListener)listener).enterIteraçãoDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmenoslexListener ) ((CmenoslexListener)listener).exitIteraçãoDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmenoslexVisitor ) return ((CmenoslexVisitor<? extends T>)visitor).visitIteraçãoDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IteraçãoDeclContext iteraçãoDecl() throws RecognitionException {
		IteraçãoDeclContext _localctx = new IteraçãoDeclContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_iteraçãoDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(WHILE);
			{
			setState(175);
			expressão();
			}
			setState(176);
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

	public static class RetornoDeclContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(CmenoslexParser.RETURN, 0); }
		public TerminalNode PONTO_VIRGULA() { return getToken(CmenoslexParser.PONTO_VIRGULA, 0); }
		public ExpressãoContext expressão() {
			return getRuleContext(ExpressãoContext.class,0);
		}
		public RetornoDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retornoDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmenoslexListener ) ((CmenoslexListener)listener).enterRetornoDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmenoslexListener ) ((CmenoslexListener)listener).exitRetornoDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmenoslexVisitor ) return ((CmenoslexVisitor<? extends T>)visitor).visitRetornoDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetornoDeclContext retornoDecl() throws RecognitionException {
		RetornoDeclContext _localctx = new RetornoDeclContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_retornoDecl);
		try {
			setState(182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				match(RETURN);
				setState(179);
				match(PONTO_VIRGULA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
				match(RETURN);
				setState(181);
				expressão();
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

	public static class ExpressãoContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode OP_ATRIBUICAO() { return getToken(CmenoslexParser.OP_ATRIBUICAO, 0); }
		public ExpressãoContext expressão() {
			return getRuleContext(ExpressãoContext.class,0);
		}
		public ExpressãoSimplesContext expressãoSimples() {
			return getRuleContext(ExpressãoSimplesContext.class,0);
		}
		public ExpressãoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressão; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmenoslexListener ) ((CmenoslexListener)listener).enterExpressão(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmenoslexListener ) ((CmenoslexListener)listener).exitExpressão(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmenoslexVisitor ) return ((CmenoslexVisitor<? extends T>)visitor).visitExpressão(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressãoContext expressão() throws RecognitionException {
		ExpressãoContext _localctx = new ExpressãoContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expressão);
		try {
			setState(189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				var();
				setState(185);
				match(OP_ATRIBUICAO);
				setState(186);
				expressão();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
				expressãoSimples();
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
		public TerminalNode IDENTIFICADOR() { return getToken(CmenoslexParser.IDENTIFICADOR, 0); }
		public List<TerminalNode> ABRE_COLCHETE() { return getTokens(CmenoslexParser.ABRE_COLCHETE); }
		public TerminalNode ABRE_COLCHETE(int i) {
			return getToken(CmenoslexParser.ABRE_COLCHETE, i);
		}
		public List<ExpressãoContext> expressão() {
			return getRuleContexts(ExpressãoContext.class);
		}
		public ExpressãoContext expressão(int i) {
			return getRuleContext(ExpressãoContext.class,i);
		}
		public List<TerminalNode> FECHA_COLCHETE() { return getTokens(CmenoslexParser.FECHA_COLCHETE); }
		public TerminalNode FECHA_COLCHETE(int i) {
			return getToken(CmenoslexParser.FECHA_COLCHETE, i);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmenoslexListener ) ((CmenoslexListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmenoslexListener ) ((CmenoslexListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmenoslexVisitor ) return ((CmenoslexVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_var);
		int _la;
		try {
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				match(IDENTIFICADOR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				match(IDENTIFICADOR);
				setState(193);
				match(ABRE_COLCHETE);
				setState(194);
				expressão();
				setState(195);
				match(FECHA_COLCHETE);
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ABRE_COLCHETE) {
					{
					{
					setState(196);
					match(ABRE_COLCHETE);
					setState(197);
					expressão();
					setState(198);
					match(FECHA_COLCHETE);
					}
					}
					setState(204);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class ExpressãoSimplesContext extends ParserRuleContext {
		public List<ExpressãoSomaContext> expressãoSoma() {
			return getRuleContexts(ExpressãoSomaContext.class);
		}
		public ExpressãoSomaContext expressãoSoma(int i) {
			return getRuleContext(ExpressãoSomaContext.class,i);
		}
		public TerminalNode OP_RELACIONAL() { return getToken(CmenoslexParser.OP_RELACIONAL, 0); }
		public ExpressãoSimplesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressãoSimples; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmenoslexListener ) ((CmenoslexListener)listener).enterExpressãoSimples(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmenoslexListener ) ((CmenoslexListener)listener).exitExpressãoSimples(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmenoslexVisitor ) return ((CmenoslexVisitor<? extends T>)visitor).visitExpressãoSimples(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressãoSimplesContext expressãoSimples() throws RecognitionException {
		ExpressãoSimplesContext _localctx = new ExpressãoSimplesContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_expressãoSimples);
		try {
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				expressãoSoma();
				setState(208);
				match(OP_RELACIONAL);
				setState(209);
				expressãoSoma();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				expressãoSoma();
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

	public static class ExpressãoSomaContext extends ParserRuleContext {
		public List<TermoContext> termo() {
			return getRuleContexts(TermoContext.class);
		}
		public TermoContext termo(int i) {
			return getRuleContext(TermoContext.class,i);
		}
		public List<TerminalNode> OP_SOMA() { return getTokens(CmenoslexParser.OP_SOMA); }
		public TerminalNode OP_SOMA(int i) {
			return getToken(CmenoslexParser.OP_SOMA, i);
		}
		public ExpressãoSomaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressãoSoma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmenoslexListener ) ((CmenoslexListener)listener).enterExpressãoSoma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmenoslexListener ) ((CmenoslexListener)listener).exitExpressãoSoma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmenoslexVisitor ) return ((CmenoslexVisitor<? extends T>)visitor).visitExpressãoSoma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressãoSomaContext expressãoSoma() throws RecognitionException {
		ExpressãoSomaContext _localctx = new ExpressãoSomaContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_expressãoSoma);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			termo();
			setState(219);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(215);
					match(OP_SOMA);
					setState(216);
					termo();
					}
					} 
				}
				setState(221);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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
		public TerminalNode OP_MULT() { return getToken(CmenoslexParser.OP_MULT, 0); }
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmenoslexListener ) ((CmenoslexListener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmenoslexListener ) ((CmenoslexListener)listener).exitTermo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmenoslexVisitor ) return ((CmenoslexVisitor<? extends T>)visitor).visitTermo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_termo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			fator();
			{
			setState(223);
			match(OP_MULT);
			setState(224);
			fator();
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
		public TerminalNode ABRE_PARENTESES() { return getToken(CmenoslexParser.ABRE_PARENTESES, 0); }
		public ExpressãoContext expressão() {
			return getRuleContext(ExpressãoContext.class,0);
		}
		public TerminalNode FECHA_PARENTESES() { return getToken(CmenoslexParser.FECHA_PARENTESES, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public AtivaçãoContext ativação() {
			return getRuleContext(AtivaçãoContext.class,0);
		}
		public TerminalNode DIGITO_REAL() { return getToken(CmenoslexParser.DIGITO_REAL, 0); }
		public TerminalNode DIGITO_INTEIRO() { return getToken(CmenoslexParser.DIGITO_INTEIRO, 0); }
		public FatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmenoslexListener ) ((CmenoslexListener)listener).enterFator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmenoslexListener ) ((CmenoslexListener)listener).exitFator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmenoslexVisitor ) return ((CmenoslexVisitor<? extends T>)visitor).visitFator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_fator);
		try {
			setState(234);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(226);
				match(ABRE_PARENTESES);
				setState(227);
				expressão();
				setState(228);
				match(FECHA_PARENTESES);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
				var();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(231);
				ativação();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(232);
				match(DIGITO_REAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(233);
				match(DIGITO_INTEIRO);
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

	public static class AtivaçãoContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(CmenoslexParser.IDENTIFICADOR, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public AtivaçãoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ativação; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmenoslexListener ) ((CmenoslexListener)listener).enterAtivação(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmenoslexListener ) ((CmenoslexListener)listener).exitAtivação(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmenoslexVisitor ) return ((CmenoslexVisitor<? extends T>)visitor).visitAtivação(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtivaçãoContext ativação() throws RecognitionException {
		AtivaçãoContext _localctx = new AtivaçãoContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_ativação);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(IDENTIFICADOR);
			{
			setState(237);
			args();
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

	public static class ArgsContext extends ParserRuleContext {
		public ArgListaContext argLista() {
			return getRuleContext(ArgListaContext.class,0);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmenoslexListener ) ((CmenoslexListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmenoslexListener ) ((CmenoslexListener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmenoslexVisitor ) return ((CmenoslexVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_args);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(239);
				argLista();
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

	public static class ArgListaContext extends ParserRuleContext {
		public List<ExpressãoContext> expressão() {
			return getRuleContexts(ExpressãoContext.class);
		}
		public ExpressãoContext expressão(int i) {
			return getRuleContext(ExpressãoContext.class,i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(CmenoslexParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(CmenoslexParser.VIRGULA, i);
		}
		public ArgListaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argLista; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmenoslexListener ) ((CmenoslexListener)listener).enterArgLista(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmenoslexListener ) ((CmenoslexListener)listener).exitArgLista(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmenoslexVisitor ) return ((CmenoslexVisitor<? extends T>)visitor).visitArgLista(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgListaContext argLista() throws RecognitionException {
		ArgListaContext _localctx = new ArgListaContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_argLista);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			expressão();
			setState(247);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(243);
					match(VIRGULA);
					setState(244);
					expressão();
					}
					} 
				}
				setState(249);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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

	public static class DigitoContext extends ParserRuleContext {
		public DigitoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_digito; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmenoslexListener ) ((CmenoslexListener)listener).enterDigito(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmenoslexListener ) ((CmenoslexListener)listener).exitDigito(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmenoslexVisitor ) return ((CmenoslexVisitor<? extends T>)visitor).visitDigito(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DigitoContext digito() throws RecognitionException {
		DigitoContext _localctx = new DigitoContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_digito);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9))) != 0)) ) {
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

	public static class LetraContext extends ParserRuleContext {
		public LetraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letra; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmenoslexListener ) ((CmenoslexListener)listener).enterLetra(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmenoslexListener ) ((CmenoslexListener)listener).exitLetra(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmenoslexVisitor ) return ((CmenoslexVisitor<? extends T>)visitor).visitLetra(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetraContext letra() throws RecognitionException {
		LetraContext _localctx = new LetraContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_letra);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35))) != 0)) ) {
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3G\u0101\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\3\3\3\7\3"+
		"A\n\3\f\3\16\3D\13\3\3\4\3\4\5\4H\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\5\5W\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\5\6c\n\6\3\7\3\7\7\7g\n\7\f\7\16\7j\13\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\5\ts\n\t\3\n\3\n\3\n\7\nx\n\n\f\n\16\n{\13\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\5\13\u0085\n\13\3\f\3\f\3\f\3\f\3\f\3\r\7\r\u008d\n\r"+
		"\f\r\16\r\u0090\13\r\3\16\7\16\u0093\n\16\f\16\16\16\u0096\13\16\3\17"+
		"\3\17\3\17\3\17\3\17\5\17\u009d\n\17\3\20\3\20\3\20\3\20\5\20\u00a3\n"+
		"\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00af\n\21"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\5\23\u00b9\n\23\3\24\3\24\3\24"+
		"\3\24\3\24\5\24\u00c0\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\7\25\u00cb\n\25\f\25\16\25\u00ce\13\25\5\25\u00d0\n\25\3\26\3\26\3\26"+
		"\3\26\3\26\5\26\u00d7\n\26\3\27\3\27\3\27\7\27\u00dc\n\27\f\27\16\27\u00df"+
		"\13\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31"+
		"\u00ed\n\31\3\32\3\32\3\32\3\33\5\33\u00f3\n\33\3\34\3\34\3\34\7\34\u00f8"+
		"\n\34\f\34\16\34\u00fb\13\34\3\35\3\35\3\36\3\36\3\36\2\2\37\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:\2\4\3\2\3\f\3\2\r"+
		"&\u0102\2<\3\2\2\2\4>\3\2\2\2\6G\3\2\2\2\bV\3\2\2\2\nb\3\2\2\2\fd\3\2"+
		"\2\2\16k\3\2\2\2\20r\3\2\2\2\22t\3\2\2\2\24\u0084\3\2\2\2\26\u0086\3\2"+
		"\2\2\30\u008e\3\2\2\2\32\u0094\3\2\2\2\34\u009c\3\2\2\2\36\u00a2\3\2\2"+
		"\2 \u00ae\3\2\2\2\"\u00b0\3\2\2\2$\u00b8\3\2\2\2&\u00bf\3\2\2\2(\u00cf"+
		"\3\2\2\2*\u00d6\3\2\2\2,\u00d8\3\2\2\2.\u00e0\3\2\2\2\60\u00ec\3\2\2\2"+
		"\62\u00ee\3\2\2\2\64\u00f2\3\2\2\2\66\u00f4\3\2\2\28\u00fc\3\2\2\2:\u00fe"+
		"\3\2\2\2<=\5\4\3\2=\3\3\2\2\2>B\5\6\4\2?A\5\6\4\2@?\3\2\2\2AD\3\2\2\2"+
		"B@\3\2\2\2BC\3\2\2\2C\5\3\2\2\2DB\3\2\2\2EH\5\b\5\2FH\5\16\b\2GE\3\2\2"+
		"\2GF\3\2\2\2H\7\3\2\2\2IJ\5\n\6\2JK\7B\2\2KL\7=\2\2LW\3\2\2\2MN\5\n\6"+
		"\2NO\7B\2\2OP\79\2\2PQ\7?\2\2QR\7:\2\2RS\79\2\2ST\7?\2\2TU\7:\2\2UW\3"+
		"\2\2\2VI\3\2\2\2VM\3\2\2\2W\t\3\2\2\2Xc\7)\2\2Yc\7*\2\2Zc\7\61\2\2[c\7"+
		"+\2\2\\]\7,\2\2]^\7B\2\2^_\7\67\2\2_`\5\f\7\2`a\78\2\2ac\3\2\2\2bX\3\2"+
		"\2\2bY\3\2\2\2bZ\3\2\2\2b[\3\2\2\2b\\\3\2\2\2c\13\3\2\2\2dh\5\b\5\2eg"+
		"\5\b\5\2fe\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2i\r\3\2\2\2jh\3\2\2\2"+
		"kl\5\n\6\2lm\7B\2\2mn\5\20\t\2no\5\26\f\2o\17\3\2\2\2ps\5\22\n\2qs\7+"+
		"\2\2rp\3\2\2\2rq\3\2\2\2s\21\3\2\2\2ty\5\24\13\2uv\7>\2\2vx\5\24\13\2"+
		"wu\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z\23\3\2\2\2{y\3\2\2\2|}\5\n\6"+
		"\2}~\7B\2\2~\u0085\3\2\2\2\177\u0080\5\n\6\2\u0080\u0081\7B\2\2\u0081"+
		"\u0082\79\2\2\u0082\u0083\7:\2\2\u0083\u0085\3\2\2\2\u0084|\3\2\2\2\u0084"+
		"\177\3\2\2\2\u0085\25\3\2\2\2\u0086\u0087\7\67\2\2\u0087\u0088\5\30\r"+
		"\2\u0088\u0089\5\32\16\2\u0089\u008a\78\2\2\u008a\27\3\2\2\2\u008b\u008d"+
		"\5\b\5\2\u008c\u008b\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e"+
		"\u008f\3\2\2\2\u008f\31\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0093\5\34\17"+
		"\2\u0092\u0091\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095"+
		"\3\2\2\2\u0095\33\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u009d\5\36\20\2\u0098"+
		"\u009d\5\26\f\2\u0099\u009d\5 \21\2\u009a\u009d\5\"\22\2\u009b\u009d\5"+
		"$\23\2\u009c\u0097\3\2\2\2\u009c\u0098\3\2\2\2\u009c\u0099\3\2\2\2\u009c"+
		"\u009a\3\2\2\2\u009c\u009b\3\2\2\2\u009d\35\3\2\2\2\u009e\u009f\5&\24"+
		"\2\u009f\u00a0\7=\2\2\u00a0\u00a3\3\2\2\2\u00a1\u00a3\7=\2\2\u00a2\u009e"+
		"\3\2\2\2\u00a2\u00a1\3\2\2\2\u00a3\37\3\2\2\2\u00a4\u00a5\7-\2\2\u00a5"+
		"\u00a6\5&\24\2\u00a6\u00a7\5\34\17\2\u00a7\u00af\3\2\2\2\u00a8\u00a9\7"+
		"-\2\2\u00a9\u00aa\5&\24\2\u00aa\u00ab\5\34\17\2\u00ab\u00ac\7.\2\2\u00ac"+
		"\u00ad\5\34\17\2\u00ad\u00af\3\2\2\2\u00ae\u00a4\3\2\2\2\u00ae\u00a8\3"+
		"\2\2\2\u00af!\3\2\2\2\u00b0\u00b1\7/\2\2\u00b1\u00b2\5&\24\2\u00b2\u00b3"+
		"\5\34\17\2\u00b3#\3\2\2\2\u00b4\u00b5\7\60\2\2\u00b5\u00b9\7=\2\2\u00b6"+
		"\u00b7\7\60\2\2\u00b7\u00b9\5&\24\2\u00b8\u00b4\3\2\2\2\u00b8\u00b6\3"+
		"\2\2\2\u00b9%\3\2\2\2\u00ba\u00bb\5(\25\2\u00bb\u00bc\7\66\2\2\u00bc\u00bd"+
		"\5&\24\2\u00bd\u00c0\3\2\2\2\u00be\u00c0\5*\26\2\u00bf\u00ba\3\2\2\2\u00bf"+
		"\u00be\3\2\2\2\u00c0\'\3\2\2\2\u00c1\u00d0\7B\2\2\u00c2\u00c3\7B\2\2\u00c3"+
		"\u00c4\79\2\2\u00c4\u00c5\5&\24\2\u00c5\u00cc\7:\2\2\u00c6\u00c7\79\2"+
		"\2\u00c7\u00c8\5&\24\2\u00c8\u00c9\7:\2\2\u00c9\u00cb\3\2\2\2\u00ca\u00c6"+
		"\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd"+
		"\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00c1\3\2\2\2\u00cf\u00c2\3\2"+
		"\2\2\u00d0)\3\2\2\2\u00d1\u00d2\5,\27\2\u00d2\u00d3\7\65\2\2\u00d3\u00d4"+
		"\5,\27\2\u00d4\u00d7\3\2\2\2\u00d5\u00d7\5,\27\2\u00d6\u00d1\3\2\2\2\u00d6"+
		"\u00d5\3\2\2\2\u00d7+\3\2\2\2\u00d8\u00dd\5.\30\2\u00d9\u00da\7\63\2\2"+
		"\u00da\u00dc\5.\30\2\u00db\u00d9\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db"+
		"\3\2\2\2\u00dd\u00de\3\2\2\2\u00de-\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0"+
		"\u00e1\5\60\31\2\u00e1\u00e2\7\62\2\2\u00e2\u00e3\5\60\31\2\u00e3/\3\2"+
		"\2\2\u00e4\u00e5\7;\2\2\u00e5\u00e6\5&\24\2\u00e6\u00e7\7<\2\2\u00e7\u00ed"+
		"\3\2\2\2\u00e8\u00ed\5(\25\2\u00e9\u00ed\5\62\32\2\u00ea\u00ed\7@\2\2"+
		"\u00eb\u00ed\7?\2\2\u00ec\u00e4\3\2\2\2\u00ec\u00e8\3\2\2\2\u00ec\u00e9"+
		"\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00eb\3\2\2\2\u00ed\61\3\2\2\2\u00ee"+
		"\u00ef\7B\2\2\u00ef\u00f0\5\64\33\2\u00f0\63\3\2\2\2\u00f1\u00f3\5\66"+
		"\34\2\u00f2\u00f1\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\65\3\2\2\2\u00f4\u00f9"+
		"\5&\24\2\u00f5\u00f6\7>\2\2\u00f6\u00f8\5&\24\2\u00f7\u00f5\3\2\2\2\u00f8"+
		"\u00fb\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\67\3\2\2"+
		"\2\u00fb\u00f9\3\2\2\2\u00fc\u00fd\t\2\2\2\u00fd9\3\2\2\2\u00fe\u00ff"+
		"\t\3\2\2\u00ff;\3\2\2\2\30BGVbhry\u0084\u008e\u0094\u009c\u00a2\u00ae"+
		"\u00b8\u00bf\u00cc\u00cf\u00d6\u00dd\u00ec\u00f2\u00f9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}