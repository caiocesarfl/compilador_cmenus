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
public class CmenosLexer extends Lexer {
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
		ESPACO=35;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "DIGITO", "LETRA_MINUSCULA", "LETRA_MAIUSCULA", "PONTO_VIRGULA", 
		"VIRGULA", "PONTO", "CHAR", "FLOAT", "INT", "STRUCT", "RETURN", "VOID", 
		"WHILE", "IF", "ELSE", "ABRE_CHAVES", "FECHA_CHAVES", "ABRE_COLCHETES", 
		"FECHA_COLCHETES", "ABRE_PARENTESES", "FECHA_PARENTESES", "ATRIBUICAO", 
		"OP_ADICAO", "OP_SUBTRACAO", "OP_MULTIPLICACAO", "OP_DIVISAO", "MAIOR", 
		"MENOR", "MAIORIGUAL", "MENORIGUAL", "IGUALDADE", "DIFERENCA", "COMENTARIO", 
		"ESPACO"
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
		"ESPACO"
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


	public CmenosLexer(CharStream input) {
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2%\u00c2\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3"+
		"\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27"+
		"\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36"+
		"\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3#\7#\u00b2"+
		"\n#\f#\16#\u00b5\13#\3#\3#\3#\3#\3#\3$\6$\u00bd\n$\r$\16$\u00be\3$\3$"+
		"\3\u00b3\2%\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%\3\2\6\3\2\62;\3\2c|\3\2C\\\5\2\13\f\17\17\"\""+
		"\u00c3\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2"+
		"G\3\2\2\2\3I\3\2\2\2\5K\3\2\2\2\7M\3\2\2\2\tO\3\2\2\2\13Q\3\2\2\2\rS\3"+
		"\2\2\2\17U\3\2\2\2\21W\3\2\2\2\23\\\3\2\2\2\25b\3\2\2\2\27f\3\2\2\2\31"+
		"m\3\2\2\2\33t\3\2\2\2\35y\3\2\2\2\37\177\3\2\2\2!\u0082\3\2\2\2#\u0087"+
		"\3\2\2\2%\u0089\3\2\2\2\'\u008b\3\2\2\2)\u008d\3\2\2\2+\u008f\3\2\2\2"+
		"-\u0091\3\2\2\2/\u0093\3\2\2\2\61\u0095\3\2\2\2\63\u0097\3\2\2\2\65\u0099"+
		"\3\2\2\2\67\u009b\3\2\2\29\u009d\3\2\2\2;\u009f\3\2\2\2=\u00a1\3\2\2\2"+
		"?\u00a4\3\2\2\2A\u00a7\3\2\2\2C\u00aa\3\2\2\2E\u00ad\3\2\2\2G\u00bc\3"+
		"\2\2\2IJ\7G\2\2J\4\3\2\2\2KL\t\2\2\2L\6\3\2\2\2MN\t\3\2\2N\b\3\2\2\2O"+
		"P\t\4\2\2P\n\3\2\2\2QR\7=\2\2R\f\3\2\2\2ST\7.\2\2T\16\3\2\2\2UV\7\60\2"+
		"\2V\20\3\2\2\2WX\7e\2\2XY\7j\2\2YZ\7c\2\2Z[\7t\2\2[\22\3\2\2\2\\]\7h\2"+
		"\2]^\7n\2\2^_\7q\2\2_`\7c\2\2`a\7v\2\2a\24\3\2\2\2bc\7k\2\2cd\7p\2\2d"+
		"e\7v\2\2e\26\3\2\2\2fg\7u\2\2gh\7v\2\2hi\7t\2\2ij\7w\2\2jk\7e\2\2kl\7"+
		"v\2\2l\30\3\2\2\2mn\7t\2\2no\7g\2\2op\7v\2\2pq\7w\2\2qr\7t\2\2rs\7p\2"+
		"\2s\32\3\2\2\2tu\7x\2\2uv\7q\2\2vw\7k\2\2wx\7f\2\2x\34\3\2\2\2yz\7y\2"+
		"\2z{\7j\2\2{|\7k\2\2|}\7n\2\2}~\7g\2\2~\36\3\2\2\2\177\u0080\7k\2\2\u0080"+
		"\u0081\7h\2\2\u0081 \3\2\2\2\u0082\u0083\7g\2\2\u0083\u0084\7n\2\2\u0084"+
		"\u0085\7u\2\2\u0085\u0086\7g\2\2\u0086\"\3\2\2\2\u0087\u0088\7}\2\2\u0088"+
		"$\3\2\2\2\u0089\u008a\7\177\2\2\u008a&\3\2\2\2\u008b\u008c\7]\2\2\u008c"+
		"(\3\2\2\2\u008d\u008e\7_\2\2\u008e*\3\2\2\2\u008f\u0090\7*\2\2\u0090,"+
		"\3\2\2\2\u0091\u0092\7+\2\2\u0092.\3\2\2\2\u0093\u0094\7?\2\2\u0094\60"+
		"\3\2\2\2\u0095\u0096\7-\2\2\u0096\62\3\2\2\2\u0097\u0098\7/\2\2\u0098"+
		"\64\3\2\2\2\u0099\u009a\7,\2\2\u009a\66\3\2\2\2\u009b\u009c\7\61\2\2\u009c"+
		"8\3\2\2\2\u009d\u009e\7@\2\2\u009e:\3\2\2\2\u009f\u00a0\7>\2\2\u00a0<"+
		"\3\2\2\2\u00a1\u00a2\7@\2\2\u00a2\u00a3\7?\2\2\u00a3>\3\2\2\2\u00a4\u00a5"+
		"\7>\2\2\u00a5\u00a6\7?\2\2\u00a6@\3\2\2\2\u00a7\u00a8\7?\2\2\u00a8\u00a9"+
		"\7?\2\2\u00a9B\3\2\2\2\u00aa\u00ab\7#\2\2\u00ab\u00ac\7?\2\2\u00acD\3"+
		"\2\2\2\u00ad\u00ae\7\61\2\2\u00ae\u00af\7,\2\2\u00af\u00b3\3\2\2\2\u00b0"+
		"\u00b2\13\2\2\2\u00b1\u00b0\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b4\3"+
		"\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b6\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6"+
		"\u00b7\7,\2\2\u00b7\u00b8\7\61\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\b#"+
		"\2\2\u00baF\3\2\2\2\u00bb\u00bd\t\5\2\2\u00bc\u00bb\3\2\2\2\u00bd\u00be"+
		"\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0"+
		"\u00c1\b$\2\2\u00c1H\3\2\2\2\5\2\u00b3\u00be\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}