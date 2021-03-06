// Generated from /home/caio/Área de Trabalho/AnalisadorLexico/src/Gramatica.g4 by ANTLR 4.5.3

    import org.antlr.symtab.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GramaticaLexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "DIGIT", "LETRA_MINUSCULA", "LETRA_MAIUSCULA", "CHAR", 
		"ELSE", "FLOAT", "IF", "INT", "RETURN", "STRUCT", "VOID", "WHILE", "ABRE_PARENTESE", 
		"FECHA_PARENTESE", "ABRE_CHAVE", "FECHA_CHAVE", "ABRE_COLCHETE", "FECHA_COLCHETE", 
		"PONTO_VIRGULA", "VIRGULA", "ASPAS", "ATRIBUICAO", "MAIOR", "MENOR", "MAIS", 
		"MENOS", "MULTIPLICACAO", "DIVISAO", "MAIORIGUAL", "MENORIGUAL", "IGUALDADE", 
		"DIFERENTE", "COMENTARIO", "WS"
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


	public GramaticaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Gramatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2&\u00c6\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3"+
		"\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3"+
		"\36\3\36\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3$"+
		"\7$\u00b6\n$\f$\16$\u00b9\13$\3$\3$\3$\3$\3$\3%\6%\u00c1\n%\r%\16%\u00c2"+
		"\3%\3%\3\u00b7\2&\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&\3\2\6\3\2\62;\3\2c|\3\2C\\\5\2\13\f\17"+
		"\17\"\"\u00c7\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3"+
		"\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2"+
		"\2\2G\3\2\2\2\2I\3\2\2\2\3K\3\2\2\2\5M\3\2\2\2\7O\3\2\2\2\tQ\3\2\2\2\13"+
		"S\3\2\2\2\rU\3\2\2\2\17Z\3\2\2\2\21_\3\2\2\2\23e\3\2\2\2\25h\3\2\2\2\27"+
		"l\3\2\2\2\31s\3\2\2\2\33z\3\2\2\2\35\177\3\2\2\2\37\u0085\3\2\2\2!\u0087"+
		"\3\2\2\2#\u0089\3\2\2\2%\u008b\3\2\2\2\'\u008d\3\2\2\2)\u008f\3\2\2\2"+
		"+\u0091\3\2\2\2-\u0093\3\2\2\2/\u0095\3\2\2\2\61\u0097\3\2\2\2\63\u0099"+
		"\3\2\2\2\65\u009b\3\2\2\2\67\u009d\3\2\2\29\u009f\3\2\2\2;\u00a1\3\2\2"+
		"\2=\u00a3\3\2\2\2?\u00a5\3\2\2\2A\u00a8\3\2\2\2C\u00ab\3\2\2\2E\u00ae"+
		"\3\2\2\2G\u00b1\3\2\2\2I\u00c0\3\2\2\2KL\7\60\2\2L\4\3\2\2\2MN\7G\2\2"+
		"N\6\3\2\2\2OP\t\2\2\2P\b\3\2\2\2QR\t\3\2\2R\n\3\2\2\2ST\t\4\2\2T\f\3\2"+
		"\2\2UV\7e\2\2VW\7j\2\2WX\7c\2\2XY\7t\2\2Y\16\3\2\2\2Z[\7g\2\2[\\\7n\2"+
		"\2\\]\7u\2\2]^\7g\2\2^\20\3\2\2\2_`\7h\2\2`a\7n\2\2ab\7q\2\2bc\7c\2\2"+
		"cd\7v\2\2d\22\3\2\2\2ef\7k\2\2fg\7h\2\2g\24\3\2\2\2hi\7k\2\2ij\7p\2\2"+
		"jk\7v\2\2k\26\3\2\2\2lm\7t\2\2mn\7g\2\2no\7v\2\2op\7w\2\2pq\7t\2\2qr\7"+
		"p\2\2r\30\3\2\2\2st\7u\2\2tu\7v\2\2uv\7t\2\2vw\7w\2\2wx\7e\2\2xy\7v\2"+
		"\2y\32\3\2\2\2z{\7x\2\2{|\7q\2\2|}\7k\2\2}~\7f\2\2~\34\3\2\2\2\177\u0080"+
		"\7y\2\2\u0080\u0081\7j\2\2\u0081\u0082\7k\2\2\u0082\u0083\7n\2\2\u0083"+
		"\u0084\7g\2\2\u0084\36\3\2\2\2\u0085\u0086\7*\2\2\u0086 \3\2\2\2\u0087"+
		"\u0088\7+\2\2\u0088\"\3\2\2\2\u0089\u008a\7}\2\2\u008a$\3\2\2\2\u008b"+
		"\u008c\7\177\2\2\u008c&\3\2\2\2\u008d\u008e\7]\2\2\u008e(\3\2\2\2\u008f"+
		"\u0090\7_\2\2\u0090*\3\2\2\2\u0091\u0092\7=\2\2\u0092,\3\2\2\2\u0093\u0094"+
		"\7.\2\2\u0094.\3\2\2\2\u0095\u0096\7)\2\2\u0096\60\3\2\2\2\u0097\u0098"+
		"\7?\2\2\u0098\62\3\2\2\2\u0099\u009a\7@\2\2\u009a\64\3\2\2\2\u009b\u009c"+
		"\7>\2\2\u009c\66\3\2\2\2\u009d\u009e\7-\2\2\u009e8\3\2\2\2\u009f\u00a0"+
		"\7/\2\2\u00a0:\3\2\2\2\u00a1\u00a2\7,\2\2\u00a2<\3\2\2\2\u00a3\u00a4\7"+
		"\61\2\2\u00a4>\3\2\2\2\u00a5\u00a6\7@\2\2\u00a6\u00a7\7?\2\2\u00a7@\3"+
		"\2\2\2\u00a8\u00a9\7>\2\2\u00a9\u00aa\7?\2\2\u00aaB\3\2\2\2\u00ab\u00ac"+
		"\7?\2\2\u00ac\u00ad\7?\2\2\u00adD\3\2\2\2\u00ae\u00af\7#\2\2\u00af\u00b0"+
		"\7?\2\2\u00b0F\3\2\2\2\u00b1\u00b2\7\61\2\2\u00b2\u00b3\7,\2\2\u00b3\u00b7"+
		"\3\2\2\2\u00b4\u00b6\13\2\2\2\u00b5\u00b4\3\2\2\2\u00b6\u00b9\3\2\2\2"+
		"\u00b7\u00b8\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00ba\3\2\2\2\u00b9\u00b7"+
		"\3\2\2\2\u00ba\u00bb\7,\2\2\u00bb\u00bc\7\61\2\2\u00bc\u00bd\3\2\2\2\u00bd"+
		"\u00be\b$\2\2\u00beH\3\2\2\2\u00bf\u00c1\t\5\2\2\u00c0\u00bf\3\2\2\2\u00c1"+
		"\u00c2\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\3\2"+
		"\2\2\u00c4\u00c5\b%\2\2\u00c5J\3\2\2\2\5\2\u00b7\u00c2\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}