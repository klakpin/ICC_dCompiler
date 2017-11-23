// Generated from /home/ilya/Documents/Compilers/Compiler project/src/translator/translator/antlr/D.g4 by ANTLR 4.7
package translator.antlr;
import org.runtime.Lexer;
import org.runtime.CharStream;
import org.runtime.Token;
import org.runtime.TokenStream;
import org.runtime.*;
import org.runtime.atn.*;
import org.runtime.dfa.DFA;
import org.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DLexer extends Lexer {
    static {
        RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION);
    }

    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    public static final int
            T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, T__6 = 7, T__7 = 8, T__8 = 9,
            T__9 = 10, T__10 = 11, T__11 = 12, T__12 = 13, T__13 = 14, T__14 = 15, T__15 = 16, T__16 = 17,
            T__17 = 18, T__18 = 19, T__19 = 20, T__20 = 21, T__21 = 22, T__22 = 23, T__23 = 24,
            T__24 = 25, T__25 = 26, T__26 = 27, T__27 = 28, T__28 = 29, T__29 = 30, T__30 = 31,
            T__31 = 32, T__32 = 33, T__33 = 34, T__34 = 35, T__35 = 36, T__36 = 37, T__37 = 38,
            T__38 = 39, T__39 = 40, T__40 = 41, T__41 = 42, T__42 = 43, T__43 = 44, T__44 = 45,
            T__45 = 46, T__46 = 47, INTEGER = 48, REAL = 49, STRING = 50, BOOLEAN = 51, EMPTY = 52,
            IDENT = 53, WS = 54;
    public static String[] channelNames = {
            "DEFAULT_TOKEN_CHANNEL", "HIDDEN"
    };

    public static String[] modeNames = {
            "DEFAULT_MODE"
    };

    public static final String[] ruleNames = {
            "T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8",
            "T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16",
            "T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24",
            "T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32",
            "T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "T__40",
            "T__41", "T__42", "T__43", "T__44", "T__45", "T__46", "INTEGER", "REAL",
            "STRING", "BOOLEAN", "EMPTY", "IDENT", "WS"
    };

    private static final String[] _LITERAL_NAMES = {
            null, "';'", "'('", "','", "')'", "'if'", "'then'", "'else'", "'end'",
            "'while'", "'loop'", "'for'", "'in'", "'..'", "'print'", "'return'", "':='",
            "'var'", "'['", "']'", "'.'", "'or'", "'and'", "'xor'", "'<'", "'<='",
            "'>'", "'>='", "'='", "'/='", "'+'", "'-'", "'*'", "'/'", "'is'", "'not'",
            "'size'", "'@int'", "'@real'", "'@string'", "'func'", "'=>'", "'int'",
            "'real'", "'bool'", "'string'", "'{'", "'}'", null, null, null, null,
            "'empty'"
    };
    private static final String[] _SYMBOLIC_NAMES = {
            null, null, null, null, null, null, null, null, null, null, null, null,
            null, null, null, null, null, null, null, null, null, null, null, null,
            null, null, null, null, null, null, null, null, null, null, null, null,
            null, null, null, null, null, null, null, null, null, null, null, null,
            "INTEGER", "REAL", "STRING", "BOOLEAN", "EMPTY", "IDENT", "WS"
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


    public DLexer(CharStream input) {
        super(input);
        _interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    @Override
    public String getGrammarFileName() {
        return "D.g4";
    }

    @Override
    public String[] getRuleNames() {
        return ruleNames;
    }

    @Override
    public String getSerializedATN() {
        return _serializedATN;
    }

    @Override
    public String[] getChannelNames() {
        return channelNames;
    }

    @Override
    public String[] getModeNames() {
        return modeNames;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }

    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\28\u0151\b\1\4\2\t" +
                    "\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13" +
                    "\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
                    "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31" +
                    "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!" +
                    "\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4" +
                    ",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t" +
                    "\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6" +
                    "\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3" +
                    "\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3" +
                    "\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3" +
                    "\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3" +
                    "\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3" +
                    "\31\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3" +
                    "\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3" +
                    "&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3" +
                    ")\3)\3*\3*\3*\3+\3+\3+\3+\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3.\3.\3.\3.\3" +
                    ".\3.\3.\3/\3/\3\60\3\60\3\61\6\61\u011b\n\61\r\61\16\61\u011c\3\62\6\62" +
                    "\u0120\n\62\r\62\16\62\u0121\3\62\3\62\6\62\u0126\n\62\r\62\16\62\u0127" +
                    "\3\63\3\63\7\63\u012c\n\63\f\63\16\63\u012f\13\63\3\63\3\63\3\64\3\64" +
                    "\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u013c\n\64\3\65\3\65\3\65\3\65" +
                    "\3\65\3\65\3\66\3\66\7\66\u0146\n\66\f\66\16\66\u0149\13\66\3\67\6\67" +
                    "\u014c\n\67\r\67\16\67\u014d\3\67\3\67\2\28\3\3\5\4\7\5\t\6\13\7\r\b\17" +
                    "\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+" +
                    "\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+" +
                    "U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8\3\2\7\3\2\62;\6\2\f\f\"\"C" +
                    "\\c|\4\2C\\c|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\2\u0157\2\3\3\2\2\2\2" +
                    "\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2" +
                    "\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2" +
                    "\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2" +
                    "\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2" +
                    "\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2" +
                    "\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2" +
                    "K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3" +
                    "\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2" +
                    "\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\3o\3\2\2\2\5" +
                    "q\3\2\2\2\7s\3\2\2\2\tu\3\2\2\2\13w\3\2\2\2\rz\3\2\2\2\17\177\3\2\2\2" +
                    "\21\u0084\3\2\2\2\23\u0088\3\2\2\2\25\u008e\3\2\2\2\27\u0093\3\2\2\2\31" +
                    "\u0097\3\2\2\2\33\u009a\3\2\2\2\35\u009d\3\2\2\2\37\u00a3\3\2\2\2!\u00aa" +
                    "\3\2\2\2#\u00ad\3\2\2\2%\u00b1\3\2\2\2\'\u00b3\3\2\2\2)\u00b5\3\2\2\2" +
                    "+\u00b7\3\2\2\2-\u00ba\3\2\2\2/\u00be\3\2\2\2\61\u00c2\3\2\2\2\63\u00c4" +
                    "\3\2\2\2\65\u00c7\3\2\2\2\67\u00c9\3\2\2\29\u00cc\3\2\2\2;\u00ce\3\2\2" +
                    "\2=\u00d1\3\2\2\2?\u00d3\3\2\2\2A\u00d5\3\2\2\2C\u00d7\3\2\2\2E\u00d9" +
                    "\3\2\2\2G\u00dc\3\2\2\2I\u00e0\3\2\2\2K\u00e5\3\2\2\2M\u00ea\3\2\2\2O" +
                    "\u00f0\3\2\2\2Q\u00f8\3\2\2\2S\u00fd\3\2\2\2U\u0100\3\2\2\2W\u0104\3\2" +
                    "\2\2Y\u0109\3\2\2\2[\u010e\3\2\2\2]\u0115\3\2\2\2_\u0117\3\2\2\2a\u011a" +
                    "\3\2\2\2c\u011f\3\2\2\2e\u0129\3\2\2\2g\u013b\3\2\2\2i\u013d\3\2\2\2k" +
                    "\u0143\3\2\2\2m\u014b\3\2\2\2op\7=\2\2p\4\3\2\2\2qr\7*\2\2r\6\3\2\2\2" +
                    "st\7.\2\2t\b\3\2\2\2uv\7+\2\2v\n\3\2\2\2wx\7k\2\2xy\7h\2\2y\f\3\2\2\2" +
                    "z{\7v\2\2{|\7j\2\2|}\7g\2\2}~\7p\2\2~\16\3\2\2\2\177\u0080\7g\2\2\u0080" +
                    "\u0081\7n\2\2\u0081\u0082\7u\2\2\u0082\u0083\7g\2\2\u0083\20\3\2\2\2\u0084" +
                    "\u0085\7g\2\2\u0085\u0086\7p\2\2\u0086\u0087\7f\2\2\u0087\22\3\2\2\2\u0088" +
                    "\u0089\7y\2\2\u0089\u008a\7j\2\2\u008a\u008b\7k\2\2\u008b\u008c\7n\2\2" +
                    "\u008c\u008d\7g\2\2\u008d\24\3\2\2\2\u008e\u008f\7n\2\2\u008f\u0090\7" +
                    "q\2\2\u0090\u0091\7q\2\2\u0091\u0092\7r\2\2\u0092\26\3\2\2\2\u0093\u0094" +
                    "\7h\2\2\u0094\u0095\7q\2\2\u0095\u0096\7t\2\2\u0096\30\3\2\2\2\u0097\u0098" +
                    "\7k\2\2\u0098\u0099\7p\2\2\u0099\32\3\2\2\2\u009a\u009b\7\60\2\2\u009b" +
                    "\u009c\7\60\2\2\u009c\34\3\2\2\2\u009d\u009e\7r\2\2\u009e\u009f\7t\2\2" +
                    "\u009f\u00a0\7k\2\2\u00a0\u00a1\7p\2\2\u00a1\u00a2\7v\2\2\u00a2\36\3\2" +
                    "\2\2\u00a3\u00a4\7t\2\2\u00a4\u00a5\7g\2\2\u00a5\u00a6\7v\2\2\u00a6\u00a7" +
                    "\7w\2\2\u00a7\u00a8\7t\2\2\u00a8\u00a9\7p\2\2\u00a9 \3\2\2\2\u00aa\u00ab" +
                    "\7<\2\2\u00ab\u00ac\7?\2\2\u00ac\"\3\2\2\2\u00ad\u00ae\7x\2\2\u00ae\u00af" +
                    "\7c\2\2\u00af\u00b0\7t\2\2\u00b0$\3\2\2\2\u00b1\u00b2\7]\2\2\u00b2&\3" +
                    "\2\2\2\u00b3\u00b4\7_\2\2\u00b4(\3\2\2\2\u00b5\u00b6\7\60\2\2\u00b6*\3" +
                    "\2\2\2\u00b7\u00b8\7q\2\2\u00b8\u00b9\7t\2\2\u00b9,\3\2\2\2\u00ba\u00bb" +
                    "\7c\2\2\u00bb\u00bc\7p\2\2\u00bc\u00bd\7f\2\2\u00bd.\3\2\2\2\u00be\u00bf" +
                    "\7z\2\2\u00bf\u00c0\7q\2\2\u00c0\u00c1\7t\2\2\u00c1\60\3\2\2\2\u00c2\u00c3" +
                    "\7>\2\2\u00c3\62\3\2\2\2\u00c4\u00c5\7>\2\2\u00c5\u00c6\7?\2\2\u00c6\64" +
                    "\3\2\2\2\u00c7\u00c8\7@\2\2\u00c8\66\3\2\2\2\u00c9\u00ca\7@\2\2\u00ca" +
                    "\u00cb\7?\2\2\u00cb8\3\2\2\2\u00cc\u00cd\7?\2\2\u00cd:\3\2\2\2\u00ce\u00cf" +
                    "\7\61\2\2\u00cf\u00d0\7?\2\2\u00d0<\3\2\2\2\u00d1\u00d2\7-\2\2\u00d2>" +
                    "\3\2\2\2\u00d3\u00d4\7/\2\2\u00d4@\3\2\2\2\u00d5\u00d6\7,\2\2\u00d6B\3" +
                    "\2\2\2\u00d7\u00d8\7\61\2\2\u00d8D\3\2\2\2\u00d9\u00da\7k\2\2\u00da\u00db" +
                    "\7u\2\2\u00dbF\3\2\2\2\u00dc\u00dd\7p\2\2\u00dd\u00de\7q\2\2\u00de\u00df" +
                    "\7v\2\2\u00dfH\3\2\2\2\u00e0\u00e1\7u\2\2\u00e1\u00e2\7k\2\2\u00e2\u00e3" +
                    "\7|\2\2\u00e3\u00e4\7g\2\2\u00e4J\3\2\2\2\u00e5\u00e6\7B\2\2\u00e6\u00e7" +
                    "\7k\2\2\u00e7\u00e8\7p\2\2\u00e8\u00e9\7v\2\2\u00e9L\3\2\2\2\u00ea\u00eb" +
                    "\7B\2\2\u00eb\u00ec\7t\2\2\u00ec\u00ed\7g\2\2\u00ed\u00ee\7c\2\2\u00ee" +
                    "\u00ef\7n\2\2\u00efN\3\2\2\2\u00f0\u00f1\7B\2\2\u00f1\u00f2\7u\2\2\u00f2" +
                    "\u00f3\7v\2\2\u00f3\u00f4\7t\2\2\u00f4\u00f5\7k\2\2\u00f5\u00f6\7p\2\2" +
                    "\u00f6\u00f7\7i\2\2\u00f7P\3\2\2\2\u00f8\u00f9\7h\2\2\u00f9\u00fa\7w\2" +
                    "\2\u00fa\u00fb\7p\2\2\u00fb\u00fc\7e\2\2\u00fcR\3\2\2\2\u00fd\u00fe\7" +
                    "?\2\2\u00fe\u00ff\7@\2\2\u00ffT\3\2\2\2\u0100\u0101\7k\2\2\u0101\u0102" +
                    "\7p\2\2\u0102\u0103\7v\2\2\u0103V\3\2\2\2\u0104\u0105\7t\2\2\u0105\u0106" +
                    "\7g\2\2\u0106\u0107\7c\2\2\u0107\u0108\7n\2\2\u0108X\3\2\2\2\u0109\u010a" +
                    "\7d\2\2\u010a\u010b\7q\2\2\u010b\u010c\7q\2\2\u010c\u010d\7n\2\2\u010d" +
                    "Z\3\2\2\2\u010e\u010f\7u\2\2\u010f\u0110\7v\2\2\u0110\u0111\7t\2\2\u0111" +
                    "\u0112\7k\2\2\u0112\u0113\7p\2\2\u0113\u0114\7i\2\2\u0114\\\3\2\2\2\u0115" +
                    "\u0116\7}\2\2\u0116^\3\2\2\2\u0117\u0118\7\177\2\2\u0118`\3\2\2\2\u0119" +
                    "\u011b\t\2\2\2\u011a\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011a\3\2" +
                    "\2\2\u011c\u011d\3\2\2\2\u011db\3\2\2\2\u011e\u0120\t\2\2\2\u011f\u011e" +
                    "\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122" +
                    "\u0123\3\2\2\2\u0123\u0125\7\60\2\2\u0124\u0126\t\2\2\2\u0125\u0124\3" +
                    "\2\2\2\u0126\u0127\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128" +
                    "d\3\2\2\2\u0129\u012d\7$\2\2\u012a\u012c\t\3\2\2\u012b\u012a\3\2\2\2\u012c" +
                    "\u012f\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u0130\3\2" +
                    "\2\2\u012f\u012d\3\2\2\2\u0130\u0131\7$\2\2\u0131f\3\2\2\2\u0132\u0133" +
                    "\7v\2\2\u0133\u0134\7t\2\2\u0134\u0135\7w\2\2\u0135\u013c\7g\2\2\u0136" +
                    "\u0137\7h\2\2\u0137\u0138\7c\2\2\u0138\u0139\7n\2\2\u0139\u013a\7u\2\2" +
                    "\u013a\u013c\7g\2\2\u013b\u0132\3\2\2\2\u013b\u0136\3\2\2\2\u013ch\3\2" +
                    "\2\2\u013d\u013e\7g\2\2\u013e\u013f\7o\2\2\u013f\u0140\7r\2\2\u0140\u0141" +
                    "\7v\2\2\u0141\u0142\7{\2\2\u0142j\3\2\2\2\u0143\u0147\t\4\2\2\u0144\u0146" +
                    "\t\5\2\2\u0145\u0144\3\2\2\2\u0146\u0149\3\2\2\2\u0147\u0145\3\2\2\2\u0147" +
                    "\u0148\3\2\2\2\u0148l\3\2\2\2\u0149\u0147\3\2\2\2\u014a\u014c\t\6\2\2" +
                    "\u014b\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014b\3\2\2\2\u014d\u014e" +
                    "\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0150\b\67\2\2\u0150n\3\2\2\2\n\2\u011c" +
                    "\u0121\u0127\u012d\u013b\u0147\u014d\3\b\2\2";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}