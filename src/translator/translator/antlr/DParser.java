// Generated from /home/ilya/Documents/Compilers/Compiler project/src/translator/translator/antlr/D.g4 by ANTLR 4.7
package translator.antlr;
import org.runtime.atn.*;
import org.runtime.dfa.DFA;
import org.runtime.*;
import org.runtime.misc.*;
import org.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DParser extends Parser {
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
			T__38 = 39, T__39 = 40, T__40 = 41, T__41 = 42, T__42 = 43, T__43 = 44, INTEGER = 45,
			REAL = 46, STRING = 47, BOOLEAN = 48, EMPTY = 49, IDENT = 50, WS = 51;
	public static final int
			RULE_compilation_unit = 0, RULE_program = 1, RULE_scope = 2, RULE_statement = 3,
			RULE_invocation = 4, RULE_r_if = 5, RULE_r_while = 6, RULE_r_for = 7,
			RULE_print = 8, RULE_r_return = 9, RULE_assignment = 10, RULE_declaration = 11,
			RULE_var_definition = 12, RULE_reference = 13, RULE_expression = 14, RULE_relation = 15,
			RULE_simple = 16, RULE_summand = 17, RULE_factor = 18, RULE_primary = 19,
			RULE_function_literal = 20, RULE_body = 21, RULE_type_indicator = 22,
			RULE_literal = 23, RULE_object = 24, RULE_tuple = 25;
	public static final String[] ruleNames = {
			"compilation_unit", "program", "scope", "statement", "invocation", "r_if",
			"r_while", "r_for", "print", "r_return", "assignment", "declaration",
			"var_definition", "reference", "expression", "relation", "simple", "summand",
			"factor", "primary", "function_literal", "body", "type_indicator", "literal",
			"object", "tuple"
	};

	private static final String[] _LITERAL_NAMES = {
			null, "';'", "'('", "','", "')'", "'if'", "'then'", "'else'", "'end'",
			"'while'", "'loop'", "'for'", "'in'", "'..'", "'print'", "'return'", "':='",
			"'var'", "'['", "']'", "'.'", "'or'", "'and'", "'xor'", "'<'", "'<='",
			"'>'", "'>='", "'='", "'/='", "'+'", "'-'", "'*'", "'/'", "'is'", "'not'",
			"'size'", "'func'", "'=>'", "'int'", "'real'", "'bool'", "'string'", "'{'",
			"'}'", null, null, null, null, "'empty'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
			null, null, null, null, null, null, null, null, null, null, null, null,
			null, null, null, null, null, null, null, null, null, null, null, null,
			null, null, null, null, null, null, null, null, null, null, null, null,
			null, null, null, null, null, null, null, null, null, "INTEGER", "REAL",
			"STRING", "BOOLEAN", "EMPTY", "IDENT", "WS"
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
	public ATN getATN() {
		return _ATN;
	}

	public DParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
	}

	public static class Compilation_unitContext extends ParserRuleContext {
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class, 0);
		}

		public TerminalNode EOF() {
			return getToken(DParser.EOF, 0);
		}

		public Compilation_unitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_compilation_unit;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof DListener) ((DListener) listener).enterCompilation_unit(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof DListener) ((DListener) listener).exitCompilation_unit(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof DVisitor) return ((DVisitor<? extends T>) visitor).visitCompilation_unit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compilation_unitContext compilation_unit() throws RecognitionException {
		Compilation_unitContext _localctx = new Compilation_unitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilation_unit);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(52);
				program();
				setState(53);
				match(EOF);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramContext extends ParserRuleContext {
		public ScopeContext scope() {
			return getRuleContext(ScopeContext.class, 0);
		}

		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_program;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof DListener) ((DListener) listener).enterProgram(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof DListener) ((DListener) listener).exitProgram(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof DVisitor) return ((DVisitor<? extends T>) visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(55);
				scope();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScopeContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}

		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class, i);
		}

		public ScopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_scope;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof DListener) ((DListener) listener).enterScope(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof DListener) ((DListener) listener).exitScope(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof DVisitor) return ((DVisitor<? extends T>) visitor).visitScope(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScopeContext scope() throws RecognitionException {
		ScopeContext _localctx = new ScopeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_scope);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__8) | (1L << T__10) | (1L << T__13) | (1L << T__14) | (1L << T__16) | (1L << IDENT))) != 0)) {
					{
						{
							setState(57);
							statement();
							setState(59);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la == T__0) {
								{
									setState(58);
									match(T__0);
								}
							}

						}
					}
					setState(65);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class, 0);
		}

		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class, 0);
		}

		public R_ifContext r_if() {
			return getRuleContext(R_ifContext.class, 0);
		}

		public R_whileContext r_while() {
			return getRuleContext(R_whileContext.class, 0);
		}

		public R_forContext r_for() {
			return getRuleContext(R_forContext.class, 0);
		}

		public R_returnContext r_return() {
			return getRuleContext(R_returnContext.class, 0);
		}

		public PrintContext print() {
			return getRuleContext(PrintContext.class, 0);
		}

		public InvocationContext invocation() {
			return getRuleContext(InvocationContext.class, 0);
		}

		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_statement;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof DListener) ((DListener) listener).enterStatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof DListener) ((DListener) listener).exitStatement(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof DVisitor) return ((DVisitor<? extends T>) visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		try {
			setState(74);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 2, _ctx)) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(66);
					declaration();
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(67);
					assignment();
				}
				break;
				case 3:
					enterOuterAlt(_localctx, 3);
				{
					setState(68);
					r_if();
				}
				break;
				case 4:
					enterOuterAlt(_localctx, 4);
				{
					setState(69);
					r_while();
				}
				break;
				case 5:
					enterOuterAlt(_localctx, 5);
				{
					setState(70);
					r_for();
				}
				break;
				case 6:
					enterOuterAlt(_localctx, 6);
				{
					setState(71);
					r_return();
				}
				break;
				case 7:
					enterOuterAlt(_localctx, 7);
				{
					setState(72);
					print();
				}
				break;
				case 8:
					enterOuterAlt(_localctx, 8);
				{
					setState(73);
					invocation();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InvocationContext extends ParserRuleContext {
		public TerminalNode IDENT() {
			return getToken(DParser.IDENT, 0);
		}

		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}

		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class, i);
		}

		public InvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_invocation;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof DListener) ((DListener) listener).enterInvocation(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof DListener) ((DListener) listener).exitInvocation(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof DVisitor) return ((DVisitor<? extends T>) visitor).visitInvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InvocationContext invocation() throws RecognitionException {
		InvocationContext _localctx = new InvocationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_invocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(76);
				match(IDENT);
				setState(77);
				match(T__1);
				setState(78);
				expression();
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == T__2) {
					{
						{
							setState(79);
							match(T__2);
							setState(80);
							expression();
						}
					}
					setState(85);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(86);
				match(T__3);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class R_ifContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public List<ScopeContext> scope() {
			return getRuleContexts(ScopeContext.class);
		}

		public ScopeContext scope(int i) {
			return getRuleContext(ScopeContext.class, i);
		}

		public R_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_r_if;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof DListener) ((DListener) listener).enterR_if(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof DListener) ((DListener) listener).exitR_if(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof DVisitor) return ((DVisitor<? extends T>) visitor).visitR_if(this);
			else return visitor.visitChildren(this);
		}
	}

	public final R_ifContext r_if() throws RecognitionException {
		R_ifContext _localctx = new R_ifContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_r_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(88);
				match(T__4);
				setState(89);
				expression();
				setState(90);
				match(T__5);
				setState(91);
				scope();
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == T__6) {
					{
						setState(92);
						match(T__6);
						setState(93);
						scope();
					}
				}

				setState(96);
				match(T__7);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class R_whileContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public ScopeContext scope() {
			return getRuleContext(ScopeContext.class, 0);
		}

		public R_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_r_while;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof DListener) ((DListener) listener).enterR_while(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof DListener) ((DListener) listener).exitR_while(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof DVisitor) return ((DVisitor<? extends T>) visitor).visitR_while(this);
			else return visitor.visitChildren(this);
		}
	}

	public final R_whileContext r_while() throws RecognitionException {
		R_whileContext _localctx = new R_whileContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_r_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(98);
				match(T__8);
				setState(99);
				expression();
				setState(100);
				match(T__9);
				setState(101);
				scope();
				setState(102);
				match(T__7);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class R_forContext extends ParserRuleContext {
		public TerminalNode IDENT() {
			return getToken(DParser.IDENT, 0);
		}

		public ScopeContext scope() {
			return getRuleContext(ScopeContext.class, 0);
		}

		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}

		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class, i);
		}

		public R_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_r_for;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof DListener) ((DListener) listener).enterR_for(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof DListener) ((DListener) listener).exitR_for(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof DVisitor) return ((DVisitor<? extends T>) visitor).visitR_for(this);
			else return visitor.visitChildren(this);
		}
	}

	public final R_forContext r_for() throws RecognitionException {
		R_forContext _localctx = new R_forContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_r_for);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(104);
				match(T__10);
				setState(105);
				match(IDENT);
				setState(106);
				match(T__11);
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__17) | (1L << T__29) | (1L << T__30) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__42) | (1L << INTEGER) | (1L << REAL) | (1L << STRING) | (1L << BOOLEAN) | (1L << EMPTY) | (1L << IDENT))) != 0)) {
					{
						setState(107);
						expression();
						setState(108);
						match(T__12);
						setState(109);
						expression();
					}
				}

				setState(113);
				match(T__9);
				setState(114);
				scope();
				setState(115);
				match(T__7);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}

		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class, i);
		}

		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_print;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof DListener) ((DListener) listener).enterPrint(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof DListener) ((DListener) listener).exitPrint(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof DVisitor) return ((DVisitor<? extends T>) visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(117);
				match(T__13);
				setState(118);
				expression();
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == T__2) {
					{
						{
							setState(119);
							match(T__2);
							setState(120);
							expression();
						}
					}
					setState(125);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class R_returnContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public R_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_r_return;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof DListener) ((DListener) listener).enterR_return(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof DListener) ((DListener) listener).exitR_return(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof DVisitor) return ((DVisitor<? extends T>) visitor).visitR_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final R_returnContext r_return() throws RecognitionException {
		R_returnContext _localctx = new R_returnContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_r_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(126);
				match(T__14);
				setState(128);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 7, _ctx)) {
					case 1: {
						setState(127);
						expression();
					}
					break;
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class, 0);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_assignment;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof DListener) ((DListener) listener).enterAssignment(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof DListener) ((DListener) listener).exitAssignment(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof DVisitor) return ((DVisitor<? extends T>) visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(130);
				reference(0);
				setState(131);
				match(T__15);
				setState(132);
				expression();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public List<Var_definitionContext> var_definition() {
			return getRuleContexts(Var_definitionContext.class);
		}

		public Var_definitionContext var_definition(int i) {
			return getRuleContext(Var_definitionContext.class, i);
		}

		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_declaration;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof DListener) ((DListener) listener).enterDeclaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof DListener) ((DListener) listener).exitDeclaration(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof DVisitor) return ((DVisitor<? extends T>) visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(134);
				match(T__16);
				setState(135);
				var_definition();
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == T__2) {
					{
						{
							setState(136);
							match(T__2);
							setState(137);
							var_definition();
						}
					}
					setState(142);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_definitionContext extends ParserRuleContext {
		public TerminalNode IDENT() {
			return getToken(DParser.IDENT, 0);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public Var_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_var_definition;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof DListener) ((DListener) listener).enterVar_definition(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof DListener) ((DListener) listener).exitVar_definition(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof DVisitor) return ((DVisitor<? extends T>) visitor).visitVar_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_definitionContext var_definition() throws RecognitionException {
		Var_definitionContext _localctx = new Var_definitionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_var_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(143);
				match(IDENT);
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == T__15) {
					{
						setState(144);
						match(T__15);
						setState(145);
						expression();
					}
				}

			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReferenceContext extends ParserRuleContext {
		public TerminalNode IDENT() {
			return getToken(DParser.IDENT, 0);
		}

		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class, 0);
		}

		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}

		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class, i);
		}

		public ReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_reference;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof DListener) ((DListener) listener).enterReference(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof DListener) ((DListener) listener).exitReference(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof DVisitor) return ((DVisitor<? extends T>) visitor).visitReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReferenceContext reference() throws RecognitionException {
		return reference(0);
	}

	private ReferenceContext reference(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ReferenceContext _localctx = new ReferenceContext(_ctx, _parentState);
		ReferenceContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_reference, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				{
					setState(149);
					match(IDENT);
				}
				_ctx.stop = _input.LT(-1);
				setState(173);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 12, _ctx);
				while (_alt != 2 && _alt != org.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						if (_parseListeners != null) triggerExitRuleEvent();
						_prevctx = _localctx;
						{
							setState(171);
							_errHandler.sync(this);
							switch (getInterpreter().adaptivePredict(_input, 11, _ctx)) {
								case 1: {
									_localctx = new ReferenceContext(_parentctx, _parentState);
									pushNewRecursionContext(_localctx, _startState, RULE_reference);
									setState(151);
									if (!(precpred(_ctx, 3)))
										throw new FailedPredicateException(this, "precpred(_ctx, 3)");
									setState(152);
									match(T__17);
									setState(153);
									expression();
									setState(154);
									match(T__18);
								}
								break;
								case 2: {
									_localctx = new ReferenceContext(_parentctx, _parentState);
									pushNewRecursionContext(_localctx, _startState, RULE_reference);
									setState(156);
									if (!(precpred(_ctx, 2)))
										throw new FailedPredicateException(this, "precpred(_ctx, 2)");
									setState(157);
									match(T__1);
									setState(158);
									expression();
									setState(163);
									_errHandler.sync(this);
									_la = _input.LA(1);
									while (_la == T__2) {
										{
											{
												setState(159);
												match(T__2);
												setState(160);
												expression();
											}
										}
										setState(165);
										_errHandler.sync(this);
										_la = _input.LA(1);
									}
									setState(166);
									match(T__3);
								}
								break;
								case 3: {
									_localctx = new ReferenceContext(_parentctx, _parentState);
									pushNewRecursionContext(_localctx, _startState, RULE_reference);
									setState(168);
									if (!(precpred(_ctx, 1)))
										throw new FailedPredicateException(this, "precpred(_ctx, 1)");
									setState(169);
									match(T__19);
									setState(170);
									match(IDENT);
								}
								break;
							}
						}
					}
					setState(175);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 12, _ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public List<RelationContext> relation() {
			return getRuleContexts(RelationContext.class);
		}

		public RelationContext relation(int i) {
			return getRuleContext(RelationContext.class, i);
		}

		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_expression;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof DListener) ((DListener) listener).enterExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof DListener) ((DListener) listener).exitExpression(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof DVisitor) return ((DVisitor<? extends T>) visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(176);
				relation();
				setState(181);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 13, _ctx);
				while (_alt != 2 && _alt != org.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						{
							{
								setState(177);
								_la = _input.LA(1);
								if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__21) | (1L << T__22))) != 0))) {
									_errHandler.recoverInline(this);
								} else {
									if (_input.LA(1) == Token.EOF) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
								setState(178);
								relation();
							}
						}
					}
					setState(183);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 13, _ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationContext extends ParserRuleContext {
		public List<SimpleContext> simple() {
			return getRuleContexts(SimpleContext.class);
		}

		public SimpleContext simple(int i) {
			return getRuleContext(SimpleContext.class, i);
		}

		public RelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_relation;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof DListener) ((DListener) listener).enterRelation(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof DListener) ((DListener) listener).exitRelation(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof DVisitor) return ((DVisitor<? extends T>) visitor).visitRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationContext relation() throws RecognitionException {
		RelationContext _localctx = new RelationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_relation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(184);
				simple();
				setState(187);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 14, _ctx)) {
					case 1: {
						setState(185);
						_la = _input.LA(1);
						if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28))) != 0))) {
							_errHandler.recoverInline(this);
						} else {
							if (_input.LA(1) == Token.EOF) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(186);
						simple();
					}
					break;
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleContext extends ParserRuleContext {
		public List<SummandContext> summand() {
			return getRuleContexts(SummandContext.class);
		}

		public SummandContext summand(int i) {
			return getRuleContext(SummandContext.class, i);
		}

		public SimpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_simple;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof DListener) ((DListener) listener).enterSimple(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof DListener) ((DListener) listener).exitSimple(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof DVisitor) return ((DVisitor<? extends T>) visitor).visitSimple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleContext simple() throws RecognitionException {
		SimpleContext _localctx = new SimpleContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_simple);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(189);
				summand();
				setState(194);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 15, _ctx);
				while (_alt != 2 && _alt != org.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						{
							{
								setState(190);
								_la = _input.LA(1);
								if (!(_la == T__29 || _la == T__30)) {
									_errHandler.recoverInline(this);
								} else {
									if (_input.LA(1) == Token.EOF) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
								setState(191);
								summand();
							}
						}
					}
					setState(196);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 15, _ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SummandContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}

		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class, i);
		}

		public SummandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_summand;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof DListener) ((DListener) listener).enterSummand(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof DListener) ((DListener) listener).exitSummand(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof DVisitor) return ((DVisitor<? extends T>) visitor).visitSummand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SummandContext summand() throws RecognitionException {
		SummandContext _localctx = new SummandContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_summand);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(197);
				factor();
				setState(202);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 16, _ctx);
				while (_alt != 2 && _alt != org.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						{
							{
								setState(198);
								_la = _input.LA(1);
								if (!(_la == T__31 || _la == T__32)) {
									_errHandler.recoverInline(this);
								} else {
									if (_input.LA(1) == Token.EOF) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
								setState(199);
								factor();
							}
						}
					}
					setState(204);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 16, _ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class, 0);
		}

		public Type_indicatorContext type_indicator() {
			return getRuleContext(Type_indicatorContext.class, 0);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class, 0);
		}

		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_factor;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof DListener) ((DListener) listener).enterFactor(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof DListener) ((DListener) listener).exitFactor(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof DVisitor) return ((DVisitor<? extends T>) visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_factor);
		int _la;
		try {
			setState(218);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 18, _ctx)) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(205);
					reference(0);
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(206);
					reference(0);
					setState(207);
					match(T__33);
					setState(208);
					type_indicator();
				}
				break;
				case 3:
					enterOuterAlt(_localctx, 3);
				{
					setState(210);
					match(T__1);
					setState(211);
					expression();
					setState(212);
					match(T__3);
				}
				break;
				case 4:
					enterOuterAlt(_localctx, 4);
				{
					setState(215);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__29) | (1L << T__30) | (1L << T__34))) != 0)) {
						{
							setState(214);
							_la = _input.LA(1);
							if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__29) | (1L << T__30) | (1L << T__34))) != 0))) {
								_errHandler.recoverInline(this);
							} else {
								if (_input.LA(1) == Token.EOF) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
						}
					}

					setState(217);
					primary();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class, 0);
		}

		public Function_literalContext function_literal() {
			return getRuleContext(Function_literalContext.class, 0);
		}

		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}

		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class, i);
		}

		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_primary;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof DListener) ((DListener) listener).enterPrimary(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof DListener) ((DListener) listener).exitPrimary(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof DVisitor) return ((DVisitor<? extends T>) visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_primary);
		try {
			setState(231);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case T__17:
				case T__42:
				case INTEGER:
				case REAL:
				case STRING:
				case BOOLEAN:
				case EMPTY:
					enterOuterAlt(_localctx, 1);
				{
					setState(220);
					literal();
				}
				break;
				case T__36:
					enterOuterAlt(_localctx, 2);
				{
					setState(221);
					function_literal();
				}
				break;
				case T__35:
					enterOuterAlt(_localctx, 3);
				{
					setState(222);
					match(T__35);
					setState(223);
					expression();
				}
				break;
				case T__4:
					enterOuterAlt(_localctx, 4);
				{
					setState(224);
					match(T__4);
					setState(225);
					expression();
					setState(226);
					match(T__5);
					setState(227);
					expression();
					setState(228);
					match(T__6);
					setState(229);
					expression();
				}
				break;
				default:
					throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_literalContext extends ParserRuleContext {
		public BodyContext body() {
			return getRuleContext(BodyContext.class, 0);
		}

		public List<TerminalNode> IDENT() {
			return getTokens(DParser.IDENT);
		}

		public TerminalNode IDENT(int i) {
			return getToken(DParser.IDENT, i);
		}

		public Function_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_function_literal;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof DListener) ((DListener) listener).enterFunction_literal(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof DListener) ((DListener) listener).exitFunction_literal(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof DVisitor) return ((DVisitor<? extends T>) visitor).visitFunction_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_literalContext function_literal() throws RecognitionException {
		Function_literalContext _localctx = new Function_literalContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_function_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(233);
				match(T__36);
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == T__1) {
					{
						setState(234);
						match(T__1);
						setState(235);
						match(IDENT);
						setState(240);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la == T__2) {
							{
								{
									setState(236);
									match(T__2);
									setState(237);
									match(IDENT);
								}
							}
							setState(242);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(243);
						match(T__3);
					}
				}

				setState(246);
				body();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BodyContext extends ParserRuleContext {
		public ScopeContext scope() {
			return getRuleContext(ScopeContext.class, 0);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_body;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof DListener) ((DListener) listener).enterBody(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof DListener) ((DListener) listener).exitBody(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof DVisitor) return ((DVisitor<? extends T>) visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_body);
		try {
			setState(253);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case T__4:
				case T__7:
				case T__8:
				case T__10:
				case T__13:
				case T__14:
				case T__16:
				case IDENT:
					enterOuterAlt(_localctx, 1);
				{
					setState(248);
					scope();
					setState(249);
					match(T__7);
				}
				break;
				case T__37:
					enterOuterAlt(_localctx, 2);
				{
					setState(251);
					match(T__37);
					setState(252);
					expression();
				}
				break;
				default:
					throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_indicatorContext extends ParserRuleContext {
		public Type_indicatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_type_indicator;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof DListener) ((DListener) listener).enterType_indicator(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof DListener) ((DListener) listener).exitType_indicator(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof DVisitor) return ((DVisitor<? extends T>) visitor).visitType_indicator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_indicatorContext type_indicator() throws RecognitionException {
		Type_indicatorContext _localctx = new Type_indicatorContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_type_indicator);
		try {
			setState(265);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case T__38:
					enterOuterAlt(_localctx, 1);
				{
					setState(255);
					match(T__38);
				}
				break;
				case T__39:
					enterOuterAlt(_localctx, 2);
				{
					setState(256);
					match(T__39);
				}
				break;
				case T__40:
					enterOuterAlt(_localctx, 3);
				{
					setState(257);
					match(T__40);
				}
				break;
				case T__41:
					enterOuterAlt(_localctx, 4);
				{
					setState(258);
					match(T__41);
				}
				break;
				case EMPTY:
					enterOuterAlt(_localctx, 5);
				{
					setState(259);
					match(EMPTY);
				}
				break;
				case T__17:
					enterOuterAlt(_localctx, 6);
				{
					setState(260);
					match(T__17);
					setState(261);
					match(T__18);
				}
				break;
				case T__42:
					enterOuterAlt(_localctx, 7);
				{
					setState(262);
					match(T__42);
					setState(263);
					match(T__43);
				}
				break;
				case T__36:
					enterOuterAlt(_localctx, 8);
				{
					setState(264);
					match(T__36);
				}
				break;
				default:
					throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode INTEGER() {
			return getToken(DParser.INTEGER, 0);
		}

		public TerminalNode REAL() {
			return getToken(DParser.REAL, 0);
		}

		public TerminalNode STRING() {
			return getToken(DParser.STRING, 0);
		}

		public TerminalNode BOOLEAN() {
			return getToken(DParser.BOOLEAN, 0);
		}

		public ObjectContext object() {
			return getRuleContext(ObjectContext.class, 0);
		}

		public TupleContext tuple() {
			return getRuleContext(TupleContext.class, 0);
		}

		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_literal;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof DListener) ((DListener) listener).enterLiteral(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof DListener) ((DListener) listener).exitLiteral(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof DVisitor) return ((DVisitor<? extends T>) visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_literal);
		try {
			setState(274);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case INTEGER:
					enterOuterAlt(_localctx, 1);
				{
					setState(267);
					match(INTEGER);
				}
				break;
				case REAL:
					enterOuterAlt(_localctx, 2);
				{
					setState(268);
					match(REAL);
				}
				break;
				case STRING:
					enterOuterAlt(_localctx, 3);
				{
					setState(269);
					match(STRING);
				}
				break;
				case BOOLEAN:
					enterOuterAlt(_localctx, 4);
				{
					setState(270);
					match(BOOLEAN);
				}
				break;
				case T__42:
					enterOuterAlt(_localctx, 5);
				{
					setState(271);
					object();
				}
				break;
				case T__17:
					enterOuterAlt(_localctx, 6);
				{
					setState(272);
					tuple();
				}
				break;
				case EMPTY:
					enterOuterAlt(_localctx, 7);
				{
					setState(273);
					match(EMPTY);
				}
				break;
				default:
					throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectContext extends ParserRuleContext {
		public List<Var_definitionContext> var_definition() {
			return getRuleContexts(Var_definitionContext.class);
		}

		public Var_definitionContext var_definition(int i) {
			return getRuleContext(Var_definitionContext.class, i);
		}

		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_object;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof DListener) ((DListener) listener).enterObject(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof DListener) ((DListener) listener).exitObject(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof DVisitor) return ((DVisitor<? extends T>) visitor).visitObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_object);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(276);
				match(T__42);
				setState(277);
				var_definition();
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == T__2) {
					{
						{
							setState(278);
							match(T__2);
							setState(279);
							var_definition();
						}
					}
					setState(284);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(285);
				match(T__43);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TupleContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}

		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class, i);
		}

		public TupleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_tuple;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof DListener) ((DListener) listener).enterTuple(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof DListener) ((DListener) listener).exitTuple(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof DVisitor) return ((DVisitor<? extends T>) visitor).visitTuple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TupleContext tuple() throws RecognitionException {
		TupleContext _localctx = new TupleContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_tuple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(287);
				match(T__17);
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__17) | (1L << T__29) | (1L << T__30) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__42) | (1L << INTEGER) | (1L << REAL) | (1L << STRING) | (1L << BOOLEAN) | (1L << EMPTY) | (1L << IDENT))) != 0)) {
					{
						setState(288);
						expression();
						setState(293);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la == T__2) {
							{
								{
									setState(289);
									match(T__2);
									setState(290);
									expression();
								}
							}
							setState(295);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
					}
				}

				setState(298);
				match(T__18);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
			case 13:
				return reference_sempred((ReferenceContext) _localctx, predIndex);
		}
		return true;
	}

	private boolean reference_sempred(ReferenceContext _localctx, int predIndex) {
		switch (predIndex) {
			case 0:
				return precpred(_ctx, 3);
			case 1:
				return precpred(_ctx, 2);
			case 2:
				return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
			"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\65\u012f\4\2\t\2" +
					"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13" +
					"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
					"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31" +
					"\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\3\3\3\3\4\3\4\5\4>\n\4\7\4@\n\4\f\4" +
					"\16\4C\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5M\n\5\3\6\3\6\3\6\3\6\3" +
					"\6\7\6T\n\6\f\6\16\6W\13\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7a\n\7\3" +
					"\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tr\n\t\3" +
					"\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\7\n|\n\n\f\n\16\n\177\13\n\3\13\3\13\5" +
					"\13\u0083\n\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\7\r\u008d\n\r\f\r\16\r" +
					"\u0090\13\r\3\16\3\16\3\16\5\16\u0095\n\16\3\17\3\17\3\17\3\17\3\17\3" +
					"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00a4\n\17\f\17\16\17\u00a7" +
					"\13\17\3\17\3\17\3\17\3\17\3\17\7\17\u00ae\n\17\f\17\16\17\u00b1\13\17" +
					"\3\20\3\20\3\20\7\20\u00b6\n\20\f\20\16\20\u00b9\13\20\3\21\3\21\3\21" +
					"\5\21\u00be\n\21\3\22\3\22\3\22\7\22\u00c3\n\22\f\22\16\22\u00c6\13\22" +
					"\3\23\3\23\3\23\7\23\u00cb\n\23\f\23\16\23\u00ce\13\23\3\24\3\24\3\24" +
					"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00da\n\24\3\24\5\24\u00dd\n" +
					"\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00ea" +
					"\n\25\3\26\3\26\3\26\3\26\3\26\7\26\u00f1\n\26\f\26\16\26\u00f4\13\26" +
					"\3\26\5\26\u00f7\n\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\5\27\u0100\n" +
					"\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u010c\n\30" +
					"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0115\n\31\3\32\3\32\3\32\3\32" +
					"\7\32\u011b\n\32\f\32\16\32\u011e\13\32\3\32\3\32\3\33\3\33\3\33\3\33" +
					"\7\33\u0126\n\33\f\33\16\33\u0129\13\33\5\33\u012b\n\33\3\33\3\33\3\33" +
					"\2\3\34\34\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\2" +
					"\7\3\2\27\31\3\2\32\37\3\2 !\3\2\"#\4\2 !%%\2\u0146\2\66\3\2\2\2\49\3" +
					"\2\2\2\6A\3\2\2\2\bL\3\2\2\2\nN\3\2\2\2\fZ\3\2\2\2\16d\3\2\2\2\20j\3\2" +
					"\2\2\22w\3\2\2\2\24\u0080\3\2\2\2\26\u0084\3\2\2\2\30\u0088\3\2\2\2\32" +
					"\u0091\3\2\2\2\34\u0096\3\2\2\2\36\u00b2\3\2\2\2 \u00ba\3\2\2\2\"\u00bf" +
					"\3\2\2\2$\u00c7\3\2\2\2&\u00dc\3\2\2\2(\u00e9\3\2\2\2*\u00eb\3\2\2\2," +
					"\u00ff\3\2\2\2.\u010b\3\2\2\2\60\u0114\3\2\2\2\62\u0116\3\2\2\2\64\u0121" +
					"\3\2\2\2\66\67\5\4\3\2\678\7\2\2\38\3\3\2\2\29:\5\6\4\2:\5\3\2\2\2;=\5" +
					"\b\5\2<>\7\3\2\2=<\3\2\2\2=>\3\2\2\2>@\3\2\2\2?;\3\2\2\2@C\3\2\2\2A?\3" +
					"\2\2\2AB\3\2\2\2B\7\3\2\2\2CA\3\2\2\2DM\5\30\r\2EM\5\26\f\2FM\5\f\7\2" +
					"GM\5\16\b\2HM\5\20\t\2IM\5\24\13\2JM\5\22\n\2KM\5\n\6\2LD\3\2\2\2LE\3" +
					"\2\2\2LF\3\2\2\2LG\3\2\2\2LH\3\2\2\2LI\3\2\2\2LJ\3\2\2\2LK\3\2\2\2M\t" +
					"\3\2\2\2NO\7\64\2\2OP\7\4\2\2PU\5\36\20\2QR\7\5\2\2RT\5\36\20\2SQ\3\2" +
					"\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2VX\3\2\2\2WU\3\2\2\2XY\7\6\2\2Y\13\3" +
					"\2\2\2Z[\7\7\2\2[\\\5\36\20\2\\]\7\b\2\2]`\5\6\4\2^_\7\t\2\2_a\5\6\4\2" +
					"`^\3\2\2\2`a\3\2\2\2ab\3\2\2\2bc\7\n\2\2c\r\3\2\2\2de\7\13\2\2ef\5\36" +
					"\20\2fg\7\f\2\2gh\5\6\4\2hi\7\n\2\2i\17\3\2\2\2jk\7\r\2\2kl\7\64\2\2l" +
					"q\7\16\2\2mn\5\36\20\2no\7\17\2\2op\5\36\20\2pr\3\2\2\2qm\3\2\2\2qr\3" +
					"\2\2\2rs\3\2\2\2st\7\f\2\2tu\5\6\4\2uv\7\n\2\2v\21\3\2\2\2wx\7\20\2\2" +
					"x}\5\36\20\2yz\7\5\2\2z|\5\36\20\2{y\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~" +
					"\3\2\2\2~\23\3\2\2\2\177}\3\2\2\2\u0080\u0082\7\21\2\2\u0081\u0083\5\36" +
					"\20\2\u0082\u0081\3\2\2\2\u0082\u0083\3\2\2\2\u0083\25\3\2\2\2\u0084\u0085" +
					"\5\34\17\2\u0085\u0086\7\22\2\2\u0086\u0087\5\36\20\2\u0087\27\3\2\2\2" +
					"\u0088\u0089\7\23\2\2\u0089\u008e\5\32\16\2\u008a\u008b\7\5\2\2\u008b" +
					"\u008d\5\32\16\2\u008c\u008a\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3" +
					"\2\2\2\u008e\u008f\3\2\2\2\u008f\31\3\2\2\2\u0090\u008e\3\2\2\2\u0091" +
					"\u0094\7\64\2\2\u0092\u0093\7\22\2\2\u0093\u0095\5\36\20\2\u0094\u0092" +
					"\3\2\2\2\u0094\u0095\3\2\2\2\u0095\33\3\2\2\2\u0096\u0097\b\17\1\2\u0097" +
					"\u0098\7\64\2\2\u0098\u00af\3\2\2\2\u0099\u009a\f\5\2\2\u009a\u009b\7" +
					"\24\2\2\u009b\u009c\5\36\20\2\u009c\u009d\7\25\2\2\u009d\u00ae\3\2\2\2" +
					"\u009e\u009f\f\4\2\2\u009f\u00a0\7\4\2\2\u00a0\u00a5\5\36\20\2\u00a1\u00a2" +
					"\7\5\2\2\u00a2\u00a4\5\36\20\2\u00a3\u00a1\3\2\2\2\u00a4\u00a7\3\2\2\2" +
					"\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a8\3\2\2\2\u00a7\u00a5" +
					"\3\2\2\2\u00a8\u00a9\7\6\2\2\u00a9\u00ae\3\2\2\2\u00aa\u00ab\f\3\2\2\u00ab" +
					"\u00ac\7\26\2\2\u00ac\u00ae\7\64\2\2\u00ad\u0099\3\2\2\2\u00ad\u009e\3" +
					"\2\2\2\u00ad\u00aa\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af" +
					"\u00b0\3\2\2\2\u00b0\35\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b7\5 \21" +
					"\2\u00b3\u00b4\t\2\2\2\u00b4\u00b6\5 \21\2\u00b5\u00b3\3\2\2\2\u00b6\u00b9" +
					"\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\37\3\2\2\2\u00b9" +
					"\u00b7\3\2\2\2\u00ba\u00bd\5\"\22\2\u00bb\u00bc\t\3\2\2\u00bc\u00be\5" +
					"\"\22\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be!\3\2\2\2\u00bf\u00c4" +
					"\5$\23\2\u00c0\u00c1\t\4\2\2\u00c1\u00c3\5$\23\2\u00c2\u00c0\3\2\2\2\u00c3" +
					"\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5#\3\2\2\2" +
					"\u00c6\u00c4\3\2\2\2\u00c7\u00cc\5&\24\2\u00c8\u00c9\t\5\2\2\u00c9\u00cb" +
					"\5&\24\2\u00ca\u00c8\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc" +
					"\u00cd\3\2\2\2\u00cd%\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00dd\5\34\17" +
					"\2\u00d0\u00d1\5\34\17\2\u00d1\u00d2\7$\2\2\u00d2\u00d3\5.\30\2\u00d3" +
					"\u00dd\3\2\2\2\u00d4\u00d5\7\4\2\2\u00d5\u00d6\5\36\20\2\u00d6\u00d7\7" +
					"\6\2\2\u00d7\u00dd\3\2\2\2\u00d8\u00da\t\6\2\2\u00d9\u00d8\3\2\2\2\u00d9" +
					"\u00da\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dd\5(\25\2\u00dc\u00cf\3\2" +
					"\2\2\u00dc\u00d0\3\2\2\2\u00dc\u00d4\3\2\2\2\u00dc\u00d9\3\2\2\2\u00dd" +
					"\'\3\2\2\2\u00de\u00ea\5\60\31\2\u00df\u00ea\5*\26\2\u00e0\u00e1\7&\2" +
					"\2\u00e1\u00ea\5\36\20\2\u00e2\u00e3\7\7\2\2\u00e3\u00e4\5\36\20\2\u00e4" +
					"\u00e5\7\b\2\2\u00e5\u00e6\5\36\20\2\u00e6\u00e7\7\t\2\2\u00e7\u00e8\5" +
					"\36\20\2\u00e8\u00ea\3\2\2\2\u00e9\u00de\3\2\2\2\u00e9\u00df\3\2\2\2\u00e9" +
					"\u00e0\3\2\2\2\u00e9\u00e2\3\2\2\2\u00ea)\3\2\2\2\u00eb\u00f6\7\'\2\2" +
					"\u00ec\u00ed\7\4\2\2\u00ed\u00f2\7\64\2\2\u00ee\u00ef\7\5\2\2\u00ef\u00f1" +
					"\7\64\2\2\u00f0\u00ee\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f0\3\2\2\2" +
					"\u00f2\u00f3\3\2\2\2\u00f3\u00f5\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5\u00f7" +
					"\7\6\2\2\u00f6\u00ec\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8" +
					"\u00f9\5,\27\2\u00f9+\3\2\2\2\u00fa\u00fb\5\6\4\2\u00fb\u00fc\7\n\2\2" +
					"\u00fc\u0100\3\2\2\2\u00fd\u00fe\7(\2\2\u00fe\u0100\5\36\20\2\u00ff\u00fa" +
					"\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100-\3\2\2\2\u0101\u010c\7)\2\2\u0102\u010c" +
					"\7*\2\2\u0103\u010c\7+\2\2\u0104\u010c\7,\2\2\u0105\u010c\7\63\2\2\u0106" +
					"\u0107\7\24\2\2\u0107\u010c\7\25\2\2\u0108\u0109\7-\2\2\u0109\u010c\7" +
					".\2\2\u010a\u010c\7\'\2\2\u010b\u0101\3\2\2\2\u010b\u0102\3\2\2\2\u010b" +
					"\u0103\3\2\2\2\u010b\u0104\3\2\2\2\u010b\u0105\3\2\2\2\u010b\u0106\3\2" +
					"\2\2\u010b\u0108\3\2\2\2\u010b\u010a\3\2\2\2\u010c/\3\2\2\2\u010d\u0115" +
					"\7/\2\2\u010e\u0115\7\60\2\2\u010f\u0115\7\61\2\2\u0110\u0115\7\62\2\2" +
					"\u0111\u0115\5\62\32\2\u0112\u0115\5\64\33\2\u0113\u0115\7\63\2\2\u0114" +
					"\u010d\3\2\2\2\u0114\u010e\3\2\2\2\u0114\u010f\3\2\2\2\u0114\u0110\3\2" +
					"\2\2\u0114\u0111\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0113\3\2\2\2\u0115" +
					"\61\3\2\2\2\u0116\u0117\7-\2\2\u0117\u011c\5\32\16\2\u0118\u0119\7\5\2" +
					"\2\u0119\u011b\5\32\16\2\u011a\u0118\3\2\2\2\u011b\u011e\3\2\2\2\u011c" +
					"\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011f\3\2\2\2\u011e\u011c\3\2" +
					"\2\2\u011f\u0120\7.\2\2\u0120\63\3\2\2\2\u0121\u012a\7\24\2\2\u0122\u0127" +
					"\5\36\20\2\u0123\u0124\7\5\2\2\u0124\u0126\5\36\20\2\u0125\u0123\3\2\2" +
					"\2\u0126\u0129\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u012b" +
					"\3\2\2\2\u0129\u0127\3\2\2\2\u012a\u0122\3\2\2\2\u012a\u012b\3\2\2\2\u012b" +
					"\u012c\3\2\2\2\u012c\u012d\7\25\2\2\u012d\65\3\2\2\2\36=ALU`q}\u0082\u008e" +
					"\u0094\u00a5\u00ad\u00af\u00b7\u00bd\u00c4\u00cc\u00d9\u00dc\u00e9\u00f2" +
					"\u00f6\u00ff\u010b\u0114\u011c\u0127\u012a";
	public static final ATN _ATN =
			new ATNDeserializer().deserialize(_serializedATN.toCharArray());

	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}