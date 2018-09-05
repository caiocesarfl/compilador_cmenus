// Generated from /home/caio/IdeaProjects/analisadorLexico/src/parser/Cmenos.g4 by ANTLR 4.5.3
package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Cmenos extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DIGITO=1, LETRA_MINUSCULA=2, LETRA_MAIUSCULA=3, PONTO_VIRGULA=4, VIRGULA=5, 
		PONTO=6, CHAR=7, FLOAT=8, INT=9, STRUCT=10, RETURN=11, VOID=12, WHILE=13, 
		IF=14, ELSE=15, ABRE_CHAVES=16, FECHA_CHAVES=17, ABRE_COLCHETES=18, FECHA_COLCHETES=19, 
		ABRE_PARENTESES=20, FECHA_PARENTESES=21, ATRIBUICAO=22, OP_ADICAO=23, 
		OP_SUBTRACAO=24, OP_MULTIPLICACAO=25, OP_DIVISAO=26, MAIOR=27, MENOR=28, 
		MAIORIGUAL=29, MENORIGUAL=30, IGUALDADE=31, DIFERENCA=32, COMENTARIO=33, 
		ESPACO=34, ERRO_IDENTIFICADOR=35, ERRO_NUMERO_REAL_CASA_DECIMAL=36, ERRO_NUMERO_REAL_CASA_INTEIRA=37, 
		ERRO_CARACTER_DECIMAL=38, ERRO_CARACTER_INVALIDO=39;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"DIGITO", "LETRA_MINUSCULA", "LETRA_MAIUSCULA", "PONTO_VIRGULA", "VIRGULA", 
		"PONTO", "CHAR", "FLOAT", "INT", "STRUCT", "RETURN", "VOID", "WHILE", 
		"IF", "ELSE", "ABRE_CHAVES", "FECHA_CHAVES", "ABRE_COLCHETES", "FECHA_COLCHETES", 
		"ABRE_PARENTESES", "FECHA_PARENTESES", "ATRIBUICAO", "OP_ADICAO", "OP_SUBTRACAO", 
		"OP_MULTIPLICACAO", "OP_DIVISAO", "MAIOR", "MENOR", "MAIORIGUAL", "MENORIGUAL", 
		"IGUALDADE", "DIFERENCA", "COMENTARIO", "ESPACO", "ERRO_IDENTIFICADOR", 
		"ERRO_NUMERO_REAL_CASA_DECIMAL", "ERRO_NUMERO_REAL_CASA_INTEIRA", "ERRO_CARACTER_DECIMAL", 
		"ERRO_CARACTER_INVALIDO"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, "';'", "','", "'.'", "'char'", "'float'", "'int'", 
		"'struct'", "'return'", "'void'", "'while'", "'if'", "'else'", "'{'", 
		"'}'", "'['", "']'", "'('", "')'", "'='", "'+'", "'-'", "'*'", "'/'", 
		"'>'", "'<'", "'>='", "'<='", "'=='", "'!='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "DIGITO", "LETRA_MINUSCULA", "LETRA_MAIUSCULA", "PONTO_VIRGULA", 
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


	public Cmenos(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Cmenos.g4"; }

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
		case 34:
			ERRO_IDENTIFICADOR_action((RuleContext)_localctx, actionIndex);
			break;
		case 35:
			ERRO_NUMERO_REAL_CASA_DECIMAL_action((RuleContext)_localctx, actionIndex);
			break;
		case 36:
			ERRO_NUMERO_REAL_CASA_INTEIRA_action((RuleContext)_localctx, actionIndex);
			break;
		case 37:
			ERRO_CARACTER_DECIMAL_action((RuleContext)_localctx, actionIndex);
			break;
		case 38:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2)\u0102\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\3\3\3\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3"+
		"\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3"+
		"\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3"+
		"!\3\"\3\"\3\"\3\"\7\"\u00b8\n\"\f\"\16\"\u00bb\13\"\3\"\3\"\3\"\3\"\3"+
		"\"\3#\6#\u00c3\n#\r#\16#\u00c4\3#\3#\3$\3$\7$\u00cb\n$\f$\16$\u00ce\13"+
		"$\3$\3$\3$\3$\3%\6%\u00d5\n%\r%\16%\u00d6\3%\3%\3%\3%\3%\3%\3%\3&\6&\u00e1"+
		"\n&\r&\16&\u00e2\3&\3&\6&\u00e7\n&\r&\16&\u00e8\3&\3&\3&\3&\3\'\6\'\u00f0"+
		"\n\'\r\'\16\'\u00f1\3\'\3\'\6\'\u00f6\n\'\r\'\16\'\u00f7\3\'\3\'\3\'\3"+
		"\'\3(\3(\3(\3(\3(\3\u00b9\2)\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)\3\2\t\3\2\62;\3\2"+
		"c|\3\2C\\\5\2\13\f\17\17\"\"\6\2\62;C]aac|\6\2\"\"C\\^^c|\4\2..<=\u0109"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\3Q\3\2\2\2\5S\3\2\2\2\7"+
		"U\3\2\2\2\tW\3\2\2\2\13Y\3\2\2\2\r[\3\2\2\2\17]\3\2\2\2\21b\3\2\2\2\23"+
		"h\3\2\2\2\25l\3\2\2\2\27s\3\2\2\2\31z\3\2\2\2\33\177\3\2\2\2\35\u0085"+
		"\3\2\2\2\37\u0088\3\2\2\2!\u008d\3\2\2\2#\u008f\3\2\2\2%\u0091\3\2\2\2"+
		"\'\u0093\3\2\2\2)\u0095\3\2\2\2+\u0097\3\2\2\2-\u0099\3\2\2\2/\u009b\3"+
		"\2\2\2\61\u009d\3\2\2\2\63\u009f\3\2\2\2\65\u00a1\3\2\2\2\67\u00a3\3\2"+
		"\2\29\u00a5\3\2\2\2;\u00a7\3\2\2\2=\u00aa\3\2\2\2?\u00ad\3\2\2\2A\u00b0"+
		"\3\2\2\2C\u00b3\3\2\2\2E\u00c2\3\2\2\2G\u00c8\3\2\2\2I\u00d4\3\2\2\2K"+
		"\u00e0\3\2\2\2M\u00ef\3\2\2\2O\u00fd\3\2\2\2QR\t\2\2\2R\4\3\2\2\2ST\t"+
		"\3\2\2T\6\3\2\2\2UV\t\4\2\2V\b\3\2\2\2WX\7=\2\2X\n\3\2\2\2YZ\7.\2\2Z\f"+
		"\3\2\2\2[\\\7\60\2\2\\\16\3\2\2\2]^\7e\2\2^_\7j\2\2_`\7c\2\2`a\7t\2\2"+
		"a\20\3\2\2\2bc\7h\2\2cd\7n\2\2de\7q\2\2ef\7c\2\2fg\7v\2\2g\22\3\2\2\2"+
		"hi\7k\2\2ij\7p\2\2jk\7v\2\2k\24\3\2\2\2lm\7u\2\2mn\7v\2\2no\7t\2\2op\7"+
		"w\2\2pq\7e\2\2qr\7v\2\2r\26\3\2\2\2st\7t\2\2tu\7g\2\2uv\7v\2\2vw\7w\2"+
		"\2wx\7t\2\2xy\7p\2\2y\30\3\2\2\2z{\7x\2\2{|\7q\2\2|}\7k\2\2}~\7f\2\2~"+
		"\32\3\2\2\2\177\u0080\7y\2\2\u0080\u0081\7j\2\2\u0081\u0082\7k\2\2\u0082"+
		"\u0083\7n\2\2\u0083\u0084\7g\2\2\u0084\34\3\2\2\2\u0085\u0086\7k\2\2\u0086"+
		"\u0087\7h\2\2\u0087\36\3\2\2\2\u0088\u0089\7g\2\2\u0089\u008a\7n\2\2\u008a"+
		"\u008b\7u\2\2\u008b\u008c\7g\2\2\u008c \3\2\2\2\u008d\u008e\7}\2\2\u008e"+
		"\"\3\2\2\2\u008f\u0090\7\177\2\2\u0090$\3\2\2\2\u0091\u0092\7]\2\2\u0092"+
		"&\3\2\2\2\u0093\u0094\7_\2\2\u0094(\3\2\2\2\u0095\u0096\7*\2\2\u0096*"+
		"\3\2\2\2\u0097\u0098\7+\2\2\u0098,\3\2\2\2\u0099\u009a\7?\2\2\u009a.\3"+
		"\2\2\2\u009b\u009c\7-\2\2\u009c\60\3\2\2\2\u009d\u009e\7/\2\2\u009e\62"+
		"\3\2\2\2\u009f\u00a0\7,\2\2\u00a0\64\3\2\2\2\u00a1\u00a2\7\61\2\2\u00a2"+
		"\66\3\2\2\2\u00a3\u00a4\7@\2\2\u00a48\3\2\2\2\u00a5\u00a6\7>\2\2\u00a6"+
		":\3\2\2\2\u00a7\u00a8\7@\2\2\u00a8\u00a9\7?\2\2\u00a9<\3\2\2\2\u00aa\u00ab"+
		"\7>\2\2\u00ab\u00ac\7?\2\2\u00ac>\3\2\2\2\u00ad\u00ae\7?\2\2\u00ae\u00af"+
		"\7?\2\2\u00af@\3\2\2\2\u00b0\u00b1\7#\2\2\u00b1\u00b2\7?\2\2\u00b2B\3"+
		"\2\2\2\u00b3\u00b4\7\61\2\2\u00b4\u00b5\7,\2\2\u00b5\u00b9\3\2\2\2\u00b6"+
		"\u00b8\13\2\2\2\u00b7\u00b6\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00ba\3"+
		"\2\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc"+
		"\u00bd\7,\2\2\u00bd\u00be\7\61\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\b\""+
		"\2\2\u00c0D\3\2\2\2\u00c1\u00c3\t\5\2\2\u00c2\u00c1\3\2\2\2\u00c3\u00c4"+
		"\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6"+
		"\u00c7\b#\2\2\u00c7F\3\2\2\2\u00c8\u00cc\t\2\2\2\u00c9\u00cb\t\6\2\2\u00ca"+
		"\u00c9\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2"+
		"\2\2\u00cd\u00cf\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d0\b$\3\2\u00d0"+
		"\u00d1\3\2\2\2\u00d1\u00d2\b$\2\2\u00d2H\3\2\2\2\u00d3\u00d5\t\2\2\2\u00d4"+
		"\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2"+
		"\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\7\60\2\2\u00d9\u00da\t\7\2\2\u00da"+
		"\u00db\3\2\2\2\u00db\u00dc\b%\4\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\b%\2"+
		"\2\u00deJ\3\2\2\2\u00df\u00e1\t\7\2\2\u00e0\u00df\3\2\2\2\u00e1\u00e2"+
		"\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4"+
		"\u00e6\7\60\2\2\u00e5\u00e7\t\2\2\2\u00e6\u00e5\3\2\2\2\u00e7\u00e8\3"+
		"\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea"+
		"\u00eb\b&\5\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\b&\2\2\u00edL\3\2\2\2\u00ee"+
		"\u00f0\t\2\2\2\u00ef\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00ef\3\2"+
		"\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f5\t\b\2\2\u00f4"+
		"\u00f6\t\2\2\2\u00f5\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f5\3\2"+
		"\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa\b\'\6\2\u00fa"+
		"\u00fb\3\2\2\2\u00fb\u00fc\b\'\2\2\u00fcN\3\2\2\2\u00fd\u00fe\13\2\2\2"+
		"\u00fe\u00ff\b(\7\2\u00ff\u0100\3\2\2\2\u0100\u0101\b(\2\2\u0101P\3\2"+
		"\2\2\13\2\u00b9\u00c4\u00cc\u00d6\u00e2\u00e8\u00f1\u00f7\b\b\2\2\3$\2"+
		"\3%\3\3&\4\3\'\5\3(\6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}