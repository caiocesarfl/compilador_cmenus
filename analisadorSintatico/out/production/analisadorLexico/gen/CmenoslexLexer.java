// Generated from /home/caio/IdeaProjects/analisadorLexico/out/production/analisadorLexico/Cmenoslex.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CmenoslexLexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
		"T__33", "T__34", "T__35", "COMENTARIO", "DESCONSIDERAR", "INT", "FLOAT", 
		"VOID", "STRUCT", "IF", "ELSE", "WHILE", "RETURN", "CHAR", "OP_MULT", 
		"OP_SOMA", "OP_COMPARACAO", "OP_RELACIONAL", "OP_ATRIBUICAO", "ABRE_CHAVE", 
		"FECHA_CHAVE", "ABRE_COLCHETE", "FECHA_COLCHETE", "ABRE_PARENTESES", "FECHA_PARENTESES", 
		"PONTO_VIRGULA", "VIRGULA", "DIGITO_INTEIRO", "DIGITO_REAL", "ARRANJO", 
		"IDENTIFICADOR", "ERRO_IDENTIFICADOR", "ERRO_NUMERO_REAL_CASA_DECIMAL", 
		"ERRO_NUMERO_REAL_CASA_INTEIRA", "ERRO_CARACTER_DECIMAL", "ERRO_CARACTER_INVALIDO"
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


	public CmenoslexLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Cmenoslex.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 64:
			ERRO_IDENTIFICADOR_action((RuleContext)_localctx, actionIndex);
			break;
		case 65:
			ERRO_NUMERO_REAL_CASA_DECIMAL_action((RuleContext)_localctx, actionIndex);
			break;
		case 66:
			ERRO_NUMERO_REAL_CASA_INTEIRA_action((RuleContext)_localctx, actionIndex);
			break;
		case 67:
			ERRO_CARACTER_DECIMAL_action((RuleContext)_localctx, actionIndex);
			break;
		case 68:
			ERRO_CARACTER_INVALIDO_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void ERRO_IDENTIFICADOR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			System.out.println("\t ERRO 1 : Identificador invalido" + " Linha: " + getLine() + " Coluna: " + getCharPositionInLine() + " Token: " + getText());
			break;
		}
	}
	private void ERRO_NUMERO_REAL_CASA_DECIMAL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			System.out.println("\t ERRO 2: Erro numero decimal: caractere invalido na casa decimal (depois do ponto)" + " Linha: " + getLine() + " Coluna: " + getCharPositionInLine() + " Token: " + getText());
			break;
		}
	}
	private void ERRO_NUMERO_REAL_CASA_INTEIRA_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			System.out.println("\t ERRO 3: Erro numero decimal: caractere invalido na casa inteira (antes do ponto)" + " Linha: " + getLine() + " Coluna: " + getCharPositionInLine() + " Token: " + getText());
			break;
		}
	}
	private void ERRO_CARACTER_DECIMAL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			System.out.println("\t ERRO 4: Uso de caracter invalido como separador da casa decimal" + " Linha: " + getLine() + " Coluna: " + getCharPositionInLine() + " Token: " + getText());
			break;
		}
	}
	private void ERRO_CARACTER_INVALIDO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:
			System.out.println("\t ERRO 5 : Caracter nao reconhecido" + " Linha: " + getLine() + " Coluna: " + getCharPositionInLine() + " Token: " + getText());
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2G\u01ae\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\3\2\3\2\3\3\3\3"+
		"\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f"+
		"\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3"+
		"\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3"+
		"\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\""+
		"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3&\3&\7&\u00da\n&\f&\16&\u00dd\13&\3&\3&"+
		"\3&\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3"+
		"*\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3/\3"+
		"/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63"+
		"\3\63\3\63\3\63\5\63\u0121\n\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\5\64\u012c\n\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:"+
		"\3;\3;\3<\3<\3=\3=\3>\6>\u0141\n>\r>\16>\u0142\3?\6?\u0146\n?\r?\16?\u0147"+
		"\3?\3?\7?\u014c\n?\f?\16?\u014f\13?\3@\6@\u0152\n@\r@\16@\u0153\3@\7@"+
		"\u0157\n@\f@\16@\u015a\13@\3@\7@\u015d\n@\f@\16@\u0160\13@\3@\3@\6@\u0164"+
		"\n@\r@\16@\u0165\3@\3@\3A\6A\u016b\nA\rA\16A\u016c\3A\7A\u0170\nA\fA\16"+
		"A\u0173\13A\3B\3B\7B\u0177\nB\fB\16B\u017a\13B\3B\3B\3B\3B\3C\6C\u0181"+
		"\nC\rC\16C\u0182\3C\3C\3C\3C\3C\3C\3C\3D\6D\u018d\nD\rD\16D\u018e\3D\3"+
		"D\6D\u0193\nD\rD\16D\u0194\3D\3D\3D\3D\3E\6E\u019c\nE\rE\16E\u019d\3E"+
		"\3E\6E\u01a2\nE\rE\16E\u01a3\3E\3E\3E\3E\3F\3F\3F\3F\3F\3\u00db\2G\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s"+
		";u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\3\2\r\5\2\13"+
		"\f\17\17\"\"\4\2,,\61\61\4\2--//\4\2>>@@\3\2\62;\4\2C\\c|\5\2\62;C\\c"+
		"|\6\2\62;C\\aac|\6\2\62;C]aac|\6\2\"\"C\\^^c|\4\2..<=\u01c3\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2"+
		"\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3"+
		"\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2"+
		"\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2"+
		"W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3"+
		"\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2"+
		"\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2"+
		"}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2"+
		"\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\3\u008d\3\2\2\2\5\u008f"+
		"\3\2\2\2\7\u0091\3\2\2\2\t\u0093\3\2\2\2\13\u0095\3\2\2\2\r\u0097\3\2"+
		"\2\2\17\u0099\3\2\2\2\21\u009b\3\2\2\2\23\u009d\3\2\2\2\25\u009f\3\2\2"+
		"\2\27\u00a1\3\2\2\2\31\u00a3\3\2\2\2\33\u00a5\3\2\2\2\35\u00a7\3\2\2\2"+
		"\37\u00a9\3\2\2\2!\u00ab\3\2\2\2#\u00ad\3\2\2\2%\u00af\3\2\2\2\'\u00b1"+
		"\3\2\2\2)\u00b3\3\2\2\2+\u00b5\3\2\2\2-\u00b7\3\2\2\2/\u00b9\3\2\2\2\61"+
		"\u00bb\3\2\2\2\63\u00bd\3\2\2\2\65\u00bf\3\2\2\2\67\u00c1\3\2\2\29\u00c3"+
		"\3\2\2\2;\u00c5\3\2\2\2=\u00c7\3\2\2\2?\u00c9\3\2\2\2A\u00cb\3\2\2\2C"+
		"\u00cd\3\2\2\2E\u00cf\3\2\2\2G\u00d1\3\2\2\2I\u00d3\3\2\2\2K\u00d5\3\2"+
		"\2\2M\u00e3\3\2\2\2O\u00e7\3\2\2\2Q\u00eb\3\2\2\2S\u00f1\3\2\2\2U\u00f6"+
		"\3\2\2\2W\u00fd\3\2\2\2Y\u0100\3\2\2\2[\u0105\3\2\2\2]\u010b\3\2\2\2_"+
		"\u0112\3\2\2\2a\u0117\3\2\2\2c\u0119\3\2\2\2e\u0120\3\2\2\2g\u012b\3\2"+
		"\2\2i\u012d\3\2\2\2k\u012f\3\2\2\2m\u0131\3\2\2\2o\u0133\3\2\2\2q\u0135"+
		"\3\2\2\2s\u0137\3\2\2\2u\u0139\3\2\2\2w\u013b\3\2\2\2y\u013d\3\2\2\2{"+
		"\u0140\3\2\2\2}\u0145\3\2\2\2\177\u0151\3\2\2\2\u0081\u016a\3\2\2\2\u0083"+
		"\u0174\3\2\2\2\u0085\u0180\3\2\2\2\u0087\u018c\3\2\2\2\u0089\u019b\3\2"+
		"\2\2\u008b\u01a9\3\2\2\2\u008d\u008e\7\62\2\2\u008e\4\3\2\2\2\u008f\u0090"+
		"\7\63\2\2\u0090\6\3\2\2\2\u0091\u0092\7\64\2\2\u0092\b\3\2\2\2\u0093\u0094"+
		"\7\65\2\2\u0094\n\3\2\2\2\u0095\u0096\7\66\2\2\u0096\f\3\2\2\2\u0097\u0098"+
		"\7\67\2\2\u0098\16\3\2\2\2\u0099\u009a\78\2\2\u009a\20\3\2\2\2\u009b\u009c"+
		"\79\2\2\u009c\22\3\2\2\2\u009d\u009e\7:\2\2\u009e\24\3\2\2\2\u009f\u00a0"+
		"\7;\2\2\u00a0\26\3\2\2\2\u00a1\u00a2\7c\2\2\u00a2\30\3\2\2\2\u00a3\u00a4"+
		"\7d\2\2\u00a4\32\3\2\2\2\u00a5\u00a6\7e\2\2\u00a6\34\3\2\2\2\u00a7\u00a8"+
		"\7f\2\2\u00a8\36\3\2\2\2\u00a9\u00aa\7g\2\2\u00aa \3\2\2\2\u00ab\u00ac"+
		"\7h\2\2\u00ac\"\3\2\2\2\u00ad\u00ae\7i\2\2\u00ae$\3\2\2\2\u00af\u00b0"+
		"\7j\2\2\u00b0&\3\2\2\2\u00b1\u00b2\7k\2\2\u00b2(\3\2\2\2\u00b3\u00b4\7"+
		"l\2\2\u00b4*\3\2\2\2\u00b5\u00b6\7m\2\2\u00b6,\3\2\2\2\u00b7\u00b8\7n"+
		"\2\2\u00b8.\3\2\2\2\u00b9\u00ba\7o\2\2\u00ba\60\3\2\2\2\u00bb\u00bc\7"+
		"p\2\2\u00bc\62\3\2\2\2\u00bd\u00be\7q\2\2\u00be\64\3\2\2\2\u00bf\u00c0"+
		"\7r\2\2\u00c0\66\3\2\2\2\u00c1\u00c2\7s\2\2\u00c28\3\2\2\2\u00c3\u00c4"+
		"\7t\2\2\u00c4:\3\2\2\2\u00c5\u00c6\7u\2\2\u00c6<\3\2\2\2\u00c7\u00c8\7"+
		"v\2\2\u00c8>\3\2\2\2\u00c9\u00ca\7w\2\2\u00ca@\3\2\2\2\u00cb\u00cc\7x"+
		"\2\2\u00ccB\3\2\2\2\u00cd\u00ce\7y\2\2\u00ceD\3\2\2\2\u00cf\u00d0\7z\2"+
		"\2\u00d0F\3\2\2\2\u00d1\u00d2\7{\2\2\u00d2H\3\2\2\2\u00d3\u00d4\7|\2\2"+
		"\u00d4J\3\2\2\2\u00d5\u00d6\7\61\2\2\u00d6\u00d7\7,\2\2\u00d7\u00db\3"+
		"\2\2\2\u00d8\u00da\13\2\2\2\u00d9\u00d8\3\2\2\2\u00da\u00dd\3\2\2\2\u00db"+
		"\u00dc\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc\u00de\3\2\2\2\u00dd\u00db\3\2"+
		"\2\2\u00de\u00df\7,\2\2\u00df\u00e0\7\61\2\2\u00e0\u00e1\3\2\2\2\u00e1"+
		"\u00e2\b&\2\2\u00e2L\3\2\2\2\u00e3\u00e4\t\2\2\2\u00e4\u00e5\3\2\2\2\u00e5"+
		"\u00e6\b\'\2\2\u00e6N\3\2\2\2\u00e7\u00e8\7k\2\2\u00e8\u00e9\7p\2\2\u00e9"+
		"\u00ea\7v\2\2\u00eaP\3\2\2\2\u00eb\u00ec\7h\2\2\u00ec\u00ed\7n\2\2\u00ed"+
		"\u00ee\7q\2\2\u00ee\u00ef\7c\2\2\u00ef\u00f0\7v\2\2\u00f0R\3\2\2\2\u00f1"+
		"\u00f2\7x\2\2\u00f2\u00f3\7q\2\2\u00f3\u00f4\7k\2\2\u00f4\u00f5\7f\2\2"+
		"\u00f5T\3\2\2\2\u00f6\u00f7\7u\2\2\u00f7\u00f8\7v\2\2\u00f8\u00f9\7t\2"+
		"\2\u00f9\u00fa\7w\2\2\u00fa\u00fb\7e\2\2\u00fb\u00fc\7v\2\2\u00fcV\3\2"+
		"\2\2\u00fd\u00fe\7k\2\2\u00fe\u00ff\7h\2\2\u00ffX\3\2\2\2\u0100\u0101"+
		"\7g\2\2\u0101\u0102\7n\2\2\u0102\u0103\7u\2\2\u0103\u0104\7g\2\2\u0104"+
		"Z\3\2\2\2\u0105\u0106\7y\2\2\u0106\u0107\7j\2\2\u0107\u0108\7k\2\2\u0108"+
		"\u0109\7n\2\2\u0109\u010a\7g\2\2\u010a\\\3\2\2\2\u010b\u010c\7t\2\2\u010c"+
		"\u010d\7g\2\2\u010d\u010e\7v\2\2\u010e\u010f\7w\2\2\u010f\u0110\7t\2\2"+
		"\u0110\u0111\7p\2\2\u0111^\3\2\2\2\u0112\u0113\7e\2\2\u0113\u0114\7j\2"+
		"\2\u0114\u0115\7c\2\2\u0115\u0116\7t\2\2\u0116`\3\2\2\2\u0117\u0118\t"+
		"\3\2\2\u0118b\3\2\2\2\u0119\u011a\t\4\2\2\u011ad\3\2\2\2\u011b\u0121\t"+
		"\5\2\2\u011c\u011d\7>\2\2\u011d\u0121\7?\2\2\u011e\u011f\7@\2\2\u011f"+
		"\u0121\7?\2\2\u0120\u011b\3\2\2\2\u0120\u011c\3\2\2\2\u0120\u011e\3\2"+
		"\2\2\u0121f\3\2\2\2\u0122\u0123\7?\2\2\u0123\u012c\7\"\2\2\u0124\u012c"+
		"\7~\2\2\u0125\u0126\7\"\2\2\u0126\u012c\7?\2\2\u0127\u0128\7?\2\2\u0128"+
		"\u012c\7?\2\2\u0129\u012a\7#\2\2\u012a\u012c\7?\2\2\u012b\u0122\3\2\2"+
		"\2\u012b\u0124\3\2\2\2\u012b\u0125\3\2\2\2\u012b\u0127\3\2\2\2\u012b\u0129"+
		"\3\2\2\2\u012ch\3\2\2\2\u012d\u012e\7?\2\2\u012ej\3\2\2\2\u012f\u0130"+
		"\7}\2\2\u0130l\3\2\2\2\u0131\u0132\7\177\2\2\u0132n\3\2\2\2\u0133\u0134"+
		"\7]\2\2\u0134p\3\2\2\2\u0135\u0136\7_\2\2\u0136r\3\2\2\2\u0137\u0138\7"+
		"*\2\2\u0138t\3\2\2\2\u0139\u013a\7+\2\2\u013av\3\2\2\2\u013b\u013c\7="+
		"\2\2\u013cx\3\2\2\2\u013d\u013e\7.\2\2\u013ez\3\2\2\2\u013f\u0141\t\6"+
		"\2\2\u0140\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0140\3\2\2\2\u0142"+
		"\u0143\3\2\2\2\u0143|\3\2\2\2\u0144\u0146\t\6\2\2\u0145\u0144\3\2\2\2"+
		"\u0146\u0147\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0149"+
		"\3\2\2\2\u0149\u014d\7\60\2\2\u014a\u014c\t\6\2\2\u014b\u014a\3\2\2\2"+
		"\u014c\u014f\3\2\2\2\u014d\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e~\3"+
		"\2\2\2\u014f\u014d\3\2\2\2\u0150\u0152\t\7\2\2\u0151\u0150\3\2\2\2\u0152"+
		"\u0153\3\2\2\2\u0153\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0158\3\2"+
		"\2\2\u0155\u0157\t\b\2\2\u0156\u0155\3\2\2\2\u0157\u015a\3\2\2\2\u0158"+
		"\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015e\3\2\2\2\u015a\u0158\3\2"+
		"\2\2\u015b\u015d\7\"\2\2\u015c\u015b\3\2\2\2\u015d\u0160\3\2\2\2\u015e"+
		"\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0161\3\2\2\2\u0160\u015e\3\2"+
		"\2\2\u0161\u0163\7]\2\2\u0162\u0164\t\6\2\2\u0163\u0162\3\2\2\2\u0164"+
		"\u0165\3\2\2\2\u0165\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0167\3\2"+
		"\2\2\u0167\u0168\7_\2\2\u0168\u0080\3\2\2\2\u0169\u016b\t\7\2\2\u016a"+
		"\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016a\3\2\2\2\u016c\u016d\3\2"+
		"\2\2\u016d\u0171\3\2\2\2\u016e\u0170\t\t\2\2\u016f\u016e\3\2\2\2\u0170"+
		"\u0173\3\2\2\2\u0171\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0082\3\2"+
		"\2\2\u0173\u0171\3\2\2\2\u0174\u0178\t\6\2\2\u0175\u0177\t\n\2\2\u0176"+
		"\u0175\3\2\2\2\u0177\u017a\3\2\2\2\u0178\u0176\3\2\2\2\u0178\u0179\3\2"+
		"\2\2\u0179\u017b\3\2\2\2\u017a\u0178\3\2\2\2\u017b\u017c\bB\3\2\u017c"+
		"\u017d\3\2\2\2\u017d\u017e\bB\2\2\u017e\u0084\3\2\2\2\u017f\u0181\t\6"+
		"\2\2\u0180\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0180\3\2\2\2\u0182"+
		"\u0183\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0185\7\60\2\2\u0185\u0186\t"+
		"\13\2\2\u0186\u0187\3\2\2\2\u0187\u0188\bC\4\2\u0188\u0189\3\2\2\2\u0189"+
		"\u018a\bC\2\2\u018a\u0086\3\2\2\2\u018b\u018d\t\13\2\2\u018c\u018b\3\2"+
		"\2\2\u018d\u018e\3\2\2\2\u018e\u018c\3\2\2\2\u018e\u018f\3\2\2\2\u018f"+
		"\u0190\3\2\2\2\u0190\u0192\7\60\2\2\u0191\u0193\t\6\2\2\u0192\u0191\3"+
		"\2\2\2\u0193\u0194\3\2\2\2\u0194\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u0195"+
		"\u0196\3\2\2\2\u0196\u0197\bD\5\2\u0197\u0198\3\2\2\2\u0198\u0199\bD\2"+
		"\2\u0199\u0088\3\2\2\2\u019a\u019c\t\6\2\2\u019b\u019a\3\2\2\2\u019c\u019d"+
		"\3\2\2\2\u019d\u019b\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u019f\3\2\2\2\u019f"+
		"\u01a1\t\f\2\2\u01a0\u01a2\t\6\2\2\u01a1\u01a0\3\2\2\2\u01a2\u01a3\3\2"+
		"\2\2\u01a3\u01a1\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5"+
		"\u01a6\bE\6\2\u01a6\u01a7\3\2\2\2\u01a7\u01a8\bE\2\2\u01a8\u008a\3\2\2"+
		"\2\u01a9\u01aa\13\2\2\2\u01aa\u01ab\bF\7\2\u01ab\u01ac\3\2\2\2\u01ac\u01ad"+
		"\bF\2\2\u01ad\u008c\3\2\2\2\25\2\u00db\u0120\u012b\u0142\u0147\u014d\u0153"+
		"\u0158\u015e\u0165\u016c\u0171\u0178\u0182\u018e\u0194\u019d\u01a3\b\b"+
		"\2\2\3B\2\3C\3\3D\4\3E\5\3F\6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}