// Generated from /home/ilya/Documents/Compilers/Compiler project/src/translator/translator/antlr/D.g4 by ANTLR 4.7
package translator.antlr;
import org.runtime.atn.*;
import org.runtime.dfa.DFA;
import org.runtime.*;
import org.runtime.misc.*;
import org.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

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
            T__38 = 39, T__39 = 40, T__40 = 41, T__41 = 42, T__42 = 43, T__43 = 44, T__44 = 45,
            T__45 = 46, T__46 = 47, INTEGER = 48, REAL = 49, STRING = 50, BOOLEAN = 51, EMPTY = 52,
            IDENT = 53, WS = 54;
    public static final int
            RULE_compilation_unit = 0, RULE_program = 1, RULE_scope = 2, RULE_statement = 3,
            RULE_invocation = 4, RULE_r_if = 5, RULE_r_while = 6, RULE_r_for = 7,
            RULE_print = 8, RULE_r_return = 9, RULE_assignment = 10, RULE_declaration = 11,
            RULE_var_definition = 12, RULE_reference = 13, RULE_expression = 14, RULE_relation = 15,
            RULE_simple = 16, RULE_summand = 17, RULE_factor = 18, RULE_primary = 19,
            RULE_readInt = 20, RULE_readReal = 21, RULE_readString = 22, RULE_function_literal = 23,
            RULE_body = 24, RULE_type_indicator = 25, RULE_literal = 26, RULE_object = 27,
            RULE_tuple = 28;
    public static final String[] ruleNames = {
            "compilation_unit", "program", "scope", "statement", "invocation", "r_if",
            "r_while", "r_for", "print", "r_return", "assignment", "declaration",
            "var_definition", "reference", "expression", "relation", "simple", "summand",
            "factor", "primary", "readInt", "readReal", "readString", "function_literal",
            "body", "type_indicator", "literal", "object", "tuple"
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
                setState(58);
                program();
                setState(59);
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
                setState(61);
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
                setState(69);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__8) | (1L << T__10) | (1L << T__13) | (1L << T__14) | (1L << T__16) | (1L << IDENT))) != 0)) {
                    {
                        {
                            setState(63);
                            statement();
                            setState(65);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                            if (_la == T__0) {
                                {
                                    setState(64);
                                    match(T__0);
                                }
                            }

                        }
                    }
                    setState(71);
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
            setState(80);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 2, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(72);
                    declaration();
                }
				break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(73);
                    assignment();
                }
				break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(74);
                    r_if();
                }
				break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(75);
                    r_while();
                }
				break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(76);
                    r_for();
                }
				break;
                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(77);
                    r_return();
                }
				break;
                case 7:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(78);
                    print();
                }
				break;
                case 8:
                    enterOuterAlt(_localctx, 8);
                {
                    setState(79);
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
                setState(82);
                match(IDENT);
                setState(83);
                match(T__1);
                setState(84);
                expression();
                setState(89);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T__2) {
                    {
                        {
                            setState(85);
                            match(T__2);
                            setState(86);
                            expression();
                        }
                    }
                    setState(91);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(92);
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
                setState(94);
                match(T__4);
                setState(95);
                expression();
                setState(96);
                match(T__5);
                setState(97);
                scope();
                setState(100);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == T__6) {
                    {
                        setState(98);
                        match(T__6);
                        setState(99);
                        scope();
                    }
                }

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
                setState(104);
                match(T__8);
                setState(105);
                expression();
                setState(106);
                match(T__9);
                setState(107);
                scope();
                setState(108);
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public ScopeContext scope() {
            return getRuleContext(ScopeContext.class, 0);
        }

        public TerminalNode IDENT() {
            return getToken(DParser.IDENT, 0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(110);
                match(T__10);
                setState(113);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 5, _ctx)) {
                    case 1: {
                        setState(111);
                        match(IDENT);
                        setState(112);
                        match(T__11);
                    }
                    break;
                }
                setState(115);
                expression();
                setState(116);
                match(T__12);
                setState(117);
                expression();
                setState(118);
                match(T__9);
                setState(119);
                scope();
                setState(120);
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
                setState(122);
                match(T__13);
                setState(123);
                expression();
                setState(128);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T__2) {
                    {
                        {
                            setState(124);
                            match(T__2);
                            setState(125);
                            expression();
                        }
                    }
                    setState(130);
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
                setState(131);
                match(T__14);
                setState(133);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 7, _ctx)) {
                    case 1: {
                        setState(132);
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
                setState(135);
                reference(0);
                setState(136);
                match(T__15);
                setState(137);
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
                setState(139);
                match(T__16);
                setState(140);
                var_definition();
                setState(145);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T__2) {
                    {
                        {
                            setState(141);
                            match(T__2);
                            setState(142);
                            var_definition();
                        }
                    }
                    setState(147);
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
                setState(148);
                match(IDENT);
                setState(151);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == T__15) {
                    {
                        setState(149);
                        match(T__15);
                        setState(150);
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
                    setState(154);
                    match(IDENT);
                }
                _ctx.stop = _input.LT(-1);
                setState(178);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 12, _ctx);
                while (_alt != 2 && _alt != ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            setState(176);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 11, _ctx)) {
                                case 1: {
                                    _localctx = new ReferenceContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_reference);
                                    setState(156);
                                    if (!(precpred(_ctx, 3)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 3)");
                                    setState(157);
                                    match(T__17);
                                    setState(158);
                                    expression();
                                    setState(159);
                                    match(T__18);
                                }
                                break;
                                case 2: {
                                    _localctx = new ReferenceContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_reference);
                                    setState(161);
                                    if (!(precpred(_ctx, 2)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 2)");
                                    setState(162);
                                    match(T__1);
                                    setState(163);
                                    expression();
                                    setState(168);
                                    _errHandler.sync(this);
                                    _la = _input.LA(1);
                                    while (_la == T__2) {
                                        {
                                            {
                                                setState(164);
                                                match(T__2);
                                                setState(165);
                                                expression();
                                            }
                                        }
                                        setState(170);
                                        _errHandler.sync(this);
                                        _la = _input.LA(1);
                                    }
                                    setState(171);
                                    match(T__3);
                                }
                                break;
                                case 3: {
                                    _localctx = new ReferenceContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_reference);
                                    setState(173);
                                    if (!(precpred(_ctx, 1)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 1)");
                                    setState(174);
                                    match(T__19);
                                    setState(175);
                                    match(IDENT);
                                }
                                break;
                            }
                        }
                    }
                    setState(180);
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
                setState(181);
                relation();
                setState(186);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 13, _ctx);
                while (_alt != 2 && _alt != ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(182);
                                _la = _input.LA(1);
                                if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__21) | (1L << T__22))) != 0))) {
                                    _errHandler.recoverInline(this);
                                } else {
                                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                    _errHandler.reportMatch(this);
                                    consume();
                                }
                                setState(183);
                                relation();
                            }
                        }
                    }
                    setState(188);
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
                setState(189);
                simple();
                setState(192);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 14, _ctx)) {
                    case 1: {
                        setState(190);
                        _la = _input.LA(1);
                        if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28))) != 0))) {
                            _errHandler.recoverInline(this);
                        } else {
                            if (_input.LA(1) == Token.EOF) matchedEOF = true;
                            _errHandler.reportMatch(this);
                            consume();
                        }
                        setState(191);
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
                setState(194);
                summand();
                setState(199);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 15, _ctx);
                while (_alt != 2 && _alt != ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(195);
                                _la = _input.LA(1);
                                if (!(_la == T__29 || _la == T__30)) {
                                    _errHandler.recoverInline(this);
                                } else {
                                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                    _errHandler.reportMatch(this);
                                    consume();
                                }
                                setState(196);
                                summand();
                            }
                        }
                    }
                    setState(201);
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
                setState(202);
                factor();
                setState(207);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 16, _ctx);
                while (_alt != 2 && _alt != ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(203);
                                _la = _input.LA(1);
                                if (!(_la == T__31 || _la == T__32)) {
                                    _errHandler.recoverInline(this);
                                } else {
                                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                    _errHandler.reportMatch(this);
                                    consume();
                                }
                                setState(204);
                                factor();
                            }
                        }
                    }
                    setState(209);
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
            setState(223);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 18, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(210);
                    reference(0);
                }
				break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(211);
                    reference(0);
                    setState(212);
                    match(T__33);
                    setState(213);
                    type_indicator();
                }
				break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(215);
                    match(T__1);
                    setState(216);
                    expression();
                    setState(217);
                    match(T__3);
                }
				break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(220);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__29) | (1L << T__30) | (1L << T__34))) != 0)) {
                        {
                            setState(219);
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

                    setState(222);
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

        public ReadIntContext readInt() {
            return getRuleContext(ReadIntContext.class, 0);
        }

        public ReadRealContext readReal() {
            return getRuleContext(ReadRealContext.class, 0);
        }

        public ReadStringContext readString() {
            return getRuleContext(ReadStringContext.class, 0);
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
            setState(239);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case T__17:
                case T__45:
                case INTEGER:
                case REAL:
                case STRING:
                case BOOLEAN:
                case EMPTY:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(225);
                    literal();
                }
				break;
                case T__39:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(226);
                    function_literal();
                }
				break;
                case T__35:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(227);
                    match(T__35);
                    setState(228);
                    expression();
                }
				break;
                case T__4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(229);
                    match(T__4);
                    setState(230);
                    expression();
                    setState(231);
                    match(T__5);
                    setState(232);
                    expression();
                    setState(233);
                    match(T__6);
                    setState(234);
                    expression();
                }
                break;
                case T__36:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(236);
                    readInt();
                }
                break;
                case T__37:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(237);
                    readReal();
                }
                break;
                case T__38:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(238);
                    readString();
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

    public static class ReadIntContext extends ParserRuleContext {
        public ReadIntContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_readInt;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof DListener) ((DListener) listener).enterReadInt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof DListener) ((DListener) listener).exitReadInt(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof DVisitor) return ((DVisitor<? extends T>) visitor).visitReadInt(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ReadIntContext readInt() throws RecognitionException {
        ReadIntContext _localctx = new ReadIntContext(_ctx, getState());
        enterRule(_localctx, 40, RULE_readInt);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(241);
                match(T__36);
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

    public static class ReadRealContext extends ParserRuleContext {
        public ReadRealContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_readReal;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof DListener) ((DListener) listener).enterReadReal(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof DListener) ((DListener) listener).exitReadReal(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof DVisitor) return ((DVisitor<? extends T>) visitor).visitReadReal(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ReadRealContext readReal() throws RecognitionException {
        ReadRealContext _localctx = new ReadRealContext(_ctx, getState());
        enterRule(_localctx, 42, RULE_readReal);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(243);
                match(T__37);
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

    public static class ReadStringContext extends ParserRuleContext {
        public ReadStringContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_readString;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof DListener) ((DListener) listener).enterReadString(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof DListener) ((DListener) listener).exitReadString(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof DVisitor) return ((DVisitor<? extends T>) visitor).visitReadString(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ReadStringContext readString() throws RecognitionException {
        ReadStringContext _localctx = new ReadStringContext(_ctx, getState());
        enterRule(_localctx, 44, RULE_readString);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(245);
                match(T__38);
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
        enterRule(_localctx, 46, RULE_function_literal);
        int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(247);
                match(T__39);
                setState(258);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == T__1) {
                    {
                        setState(248);
                        match(T__1);
                        setState(249);
                        match(IDENT);
                        setState(254);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while (_la == T__2) {
                            {
                                {
                                    setState(250);
                                    match(T__2);
                                    setState(251);
                                    match(IDENT);
                                }
                            }
                            setState(256);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                        setState(257);
                        match(T__3);
                    }
                }

                setState(260);
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
        enterRule(_localctx, 48, RULE_body);
        try {
            setState(267);
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
                    setState(262);
                    scope();
                    setState(263);
                    match(T__7);
                }
				break;
                case T__40:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(265);
                    match(T__40);
                    setState(266);
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
        enterRule(_localctx, 50, RULE_type_indicator);
        try {
            setState(279);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case T__41:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(269);
                    match(T__41);
                }
				break;
                case T__42:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(270);
                    match(T__42);
                }
				break;
                case T__43:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(271);
                    match(T__43);
                }
				break;
                case T__44:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(272);
                    match(T__44);
                }
				break;
                case EMPTY:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(273);
                    match(EMPTY);
                }
				break;
                case T__17:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(274);
                    match(T__17);
                    setState(275);
                    match(T__18);
                }
				break;
                case T__45:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(276);
                    match(T__45);
                    setState(277);
                    match(T__46);
                }
				break;
                case T__39:
                    enterOuterAlt(_localctx, 8);
                {
                    setState(278);
                    match(T__39);
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
        enterRule(_localctx, 52, RULE_literal);
        try {
            setState(288);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case INTEGER:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(281);
                    match(INTEGER);
                }
				break;
                case REAL:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(282);
                    match(REAL);
                }
				break;
                case STRING:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(283);
                    match(STRING);
                }
				break;
                case BOOLEAN:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(284);
                    match(BOOLEAN);
                }
				break;
                case T__45:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(285);
                    object();
                }
				break;
                case T__17:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(286);
                    tuple();
                }
				break;
                case EMPTY:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(287);
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
        enterRule(_localctx, 54, RULE_object);
        int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(290);
                match(T__45);
                setState(291);
                var_definition();
                setState(296);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T__2) {
                    {
                        {
                            setState(292);
                            match(T__2);
                            setState(293);
                            var_definition();
                        }
                    }
                    setState(298);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(299);
                match(T__46);
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
        enterRule(_localctx, 56, RULE_tuple);
        int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(301);
                match(T__17);
                setState(310);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__17) | (1L << T__29) | (1L << T__30) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__45) | (1L << INTEGER) | (1L << REAL) | (1L << STRING) | (1L << BOOLEAN) | (1L << EMPTY) | (1L << IDENT))) != 0)) {
                    {
                        setState(302);
                        expression();
                        setState(307);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while (_la == T__2) {
                            {
                                {
                                    setState(303);
                                    match(T__2);
                                    setState(304);
                                    expression();
                                }
                            }
                            setState(309);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                    }
                }

                setState(312);
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
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\38\u013d\4\2\t\2\4" +
                    "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t" +
                    "\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
                    "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31" +
                    "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\3\3\3\3" +
                    "\3\4\3\4\5\4D\n\4\7\4F\n\4\f\4\16\4I\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5" +
                    "\3\5\5\5S\n\5\3\6\3\6\3\6\3\6\3\6\7\6Z\n\6\f\6\16\6]\13\6\3\6\3\6\3\7" +
                    "\3\7\3\7\3\7\3\7\3\7\5\7g\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t" +
                    "\3\t\5\tt\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\7\n\u0081\n" +
                    "\n\f\n\16\n\u0084\13\n\3\13\3\13\5\13\u0088\n\13\3\f\3\f\3\f\3\f\3\r\3" +
                    "\r\3\r\3\r\7\r\u0092\n\r\f\r\16\r\u0095\13\r\3\16\3\16\3\16\5\16\u009a" +
                    "\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17" +
                    "\7\17\u00a9\n\17\f\17\16\17\u00ac\13\17\3\17\3\17\3\17\3\17\3\17\7\17" +
                    "\u00b3\n\17\f\17\16\17\u00b6\13\17\3\20\3\20\3\20\7\20\u00bb\n\20\f\20" +
                    "\16\20\u00be\13\20\3\21\3\21\3\21\5\21\u00c3\n\21\3\22\3\22\3\22\7\22" +
                    "\u00c8\n\22\f\22\16\22\u00cb\13\22\3\23\3\23\3\23\7\23\u00d0\n\23\f\23" +
                    "\16\23\u00d3\13\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5" +
                    "\24\u00df\n\24\3\24\5\24\u00e2\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25" +
                    "\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00f2\n\25\3\26\3\26\3\27\3\27" +
                    "\3\30\3\30\3\31\3\31\3\31\3\31\3\31\7\31\u00ff\n\31\f\31\16\31\u0102\13" +
                    "\31\3\31\5\31\u0105\n\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\5\32\u010e" +
                    "\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u011a\n\33" +
                    "\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0123\n\34\3\35\3\35\3\35\3\35" +
                    "\7\35\u0129\n\35\f\35\16\35\u012c\13\35\3\35\3\35\3\36\3\36\3\36\3\36" +
                    "\7\36\u0134\n\36\f\36\16\36\u0137\13\36\5\36\u0139\n\36\3\36\3\36\3\36" +
                    "\2\3\34\37\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66" +
                    "8:\2\7\3\2\27\31\3\2\32\37\3\2 !\3\2\"#\4\2 !%%\2\u0154\2<\3\2\2\2\4?" +
                    "\3\2\2\2\6G\3\2\2\2\bR\3\2\2\2\nT\3\2\2\2\f`\3\2\2\2\16j\3\2\2\2\20p\3" +
                    "\2\2\2\22|\3\2\2\2\24\u0085\3\2\2\2\26\u0089\3\2\2\2\30\u008d\3\2\2\2" +
                    "\32\u0096\3\2\2\2\34\u009b\3\2\2\2\36\u00b7\3\2\2\2 \u00bf\3\2\2\2\"\u00c4" +
                    "\3\2\2\2$\u00cc\3\2\2\2&\u00e1\3\2\2\2(\u00f1\3\2\2\2*\u00f3\3\2\2\2," +
                    "\u00f5\3\2\2\2.\u00f7\3\2\2\2\60\u00f9\3\2\2\2\62\u010d\3\2\2\2\64\u0119" +
                    "\3\2\2\2\66\u0122\3\2\2\28\u0124\3\2\2\2:\u012f\3\2\2\2<=\5\4\3\2=>\7" +
                    "\2\2\3>\3\3\2\2\2?@\5\6\4\2@\5\3\2\2\2AC\5\b\5\2BD\7\3\2\2CB\3\2\2\2C" +
                    "D\3\2\2\2DF\3\2\2\2EA\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2H\7\3\2\2\2" +
                    "IG\3\2\2\2JS\5\30\r\2KS\5\26\f\2LS\5\f\7\2MS\5\16\b\2NS\5\20\t\2OS\5\24" +
                    "\13\2PS\5\22\n\2QS\5\n\6\2RJ\3\2\2\2RK\3\2\2\2RL\3\2\2\2RM\3\2\2\2RN\3" +
                    "\2\2\2RO\3\2\2\2RP\3\2\2\2RQ\3\2\2\2S\t\3\2\2\2TU\7\67\2\2UV\7\4\2\2V" +
                    "[\5\36\20\2WX\7\5\2\2XZ\5\36\20\2YW\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2" +
                    "\2\2\\^\3\2\2\2][\3\2\2\2^_\7\6\2\2_\13\3\2\2\2`a\7\7\2\2ab\5\36\20\2" +
                    "bc\7\b\2\2cf\5\6\4\2de\7\t\2\2eg\5\6\4\2fd\3\2\2\2fg\3\2\2\2gh\3\2\2\2" +
                    "hi\7\n\2\2i\r\3\2\2\2jk\7\13\2\2kl\5\36\20\2lm\7\f\2\2mn\5\6\4\2no\7\n" +
                    "\2\2o\17\3\2\2\2ps\7\r\2\2qr\7\67\2\2rt\7\16\2\2sq\3\2\2\2st\3\2\2\2t" +
                    "u\3\2\2\2uv\5\36\20\2vw\7\17\2\2wx\5\36\20\2xy\7\f\2\2yz\5\6\4\2z{\7\n" +
                    "\2\2{\21\3\2\2\2|}\7\20\2\2}\u0082\5\36\20\2~\177\7\5\2\2\177\u0081\5" +
                    "\36\20\2\u0080~\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082" +
                    "\u0083\3\2\2\2\u0083\23\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0087\7\21\2" +
                    "\2\u0086\u0088\5\36\20\2\u0087\u0086\3\2\2\2\u0087\u0088\3\2\2\2\u0088" +
                    "\25\3\2\2\2\u0089\u008a\5\34\17\2\u008a\u008b\7\22\2\2\u008b\u008c\5\36" +
                    "\20\2\u008c\27\3\2\2\2\u008d\u008e\7\23\2\2\u008e\u0093\5\32\16\2\u008f" +
                    "\u0090\7\5\2\2\u0090\u0092\5\32\16\2\u0091\u008f\3\2\2\2\u0092\u0095\3" +
                    "\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\31\3\2\2\2\u0095" +
                    "\u0093\3\2\2\2\u0096\u0099\7\67\2\2\u0097\u0098\7\22\2\2\u0098\u009a\5" +
                    "\36\20\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\33\3\2\2\2\u009b" +
                    "\u009c\b\17\1\2\u009c\u009d\7\67\2\2\u009d\u00b4\3\2\2\2\u009e\u009f\f" +
                    "\5\2\2\u009f\u00a0\7\24\2\2\u00a0\u00a1\5\36\20\2\u00a1\u00a2\7\25\2\2" +
                    "\u00a2\u00b3\3\2\2\2\u00a3\u00a4\f\4\2\2\u00a4\u00a5\7\4\2\2\u00a5\u00aa" +
                    "\5\36\20\2\u00a6\u00a7\7\5\2\2\u00a7\u00a9\5\36\20\2\u00a8\u00a6\3\2\2" +
                    "\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ad" +
                    "\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00ae\7\6\2\2\u00ae\u00b3\3\2\2\2\u00af" +
                    "\u00b0\f\3\2\2\u00b0\u00b1\7\26\2\2\u00b1\u00b3\7\67\2\2\u00b2\u009e\3" +
                    "\2\2\2\u00b2\u00a3\3\2\2\2\u00b2\u00af\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4" +
                    "\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\35\3\2\2\2\u00b6\u00b4\3\2\2" +
                    "\2\u00b7\u00bc\5 \21\2\u00b8\u00b9\t\2\2\2\u00b9\u00bb\5 \21\2\u00ba\u00b8" +
                    "\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd" +
                    "\37\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c2\5\"\22\2\u00c0\u00c1\t\3\2" +
                    "\2\u00c1\u00c3\5\"\22\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3" +
                    "!\3\2\2\2\u00c4\u00c9\5$\23\2\u00c5\u00c6\t\4\2\2\u00c6\u00c8\5$\23\2" +
                    "\u00c7\u00c5\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca" +
                    "\3\2\2\2\u00ca#\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00d1\5&\24\2\u00cd" +
                    "\u00ce\t\5\2\2\u00ce\u00d0\5&\24\2\u00cf\u00cd\3\2\2\2\u00d0\u00d3\3\2" +
                    "\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2%\3\2\2\2\u00d3\u00d1" +
                    "\3\2\2\2\u00d4\u00e2\5\34\17\2\u00d5\u00d6\5\34\17\2\u00d6\u00d7\7$\2" +
                    "\2\u00d7\u00d8\5\64\33\2\u00d8\u00e2\3\2\2\2\u00d9\u00da\7\4\2\2\u00da" +
                    "\u00db\5\36\20\2\u00db\u00dc\7\6\2\2\u00dc\u00e2\3\2\2\2\u00dd\u00df\t" +
                    "\6\2\2\u00de\u00dd\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0" +
                    "\u00e2\5(\25\2\u00e1\u00d4\3\2\2\2\u00e1\u00d5\3\2\2\2\u00e1\u00d9\3\2" +
                    "\2\2\u00e1\u00de\3\2\2\2\u00e2\'\3\2\2\2\u00e3\u00f2\5\66\34\2\u00e4\u00f2" +
                    "\5\60\31\2\u00e5\u00e6\7&\2\2\u00e6\u00f2\5\36\20\2\u00e7\u00e8\7\7\2" +
                    "\2\u00e8\u00e9\5\36\20\2\u00e9\u00ea\7\b\2\2\u00ea\u00eb\5\36\20\2\u00eb" +
                    "\u00ec\7\t\2\2\u00ec\u00ed\5\36\20\2\u00ed\u00f2\3\2\2\2\u00ee\u00f2\5" +
                    "*\26\2\u00ef\u00f2\5,\27\2\u00f0\u00f2\5.\30\2\u00f1\u00e3\3\2\2\2\u00f1" +
                    "\u00e4\3\2\2\2\u00f1\u00e5\3\2\2\2\u00f1\u00e7\3\2\2\2\u00f1\u00ee\3\2" +
                    "\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f0\3\2\2\2\u00f2)\3\2\2\2\u00f3\u00f4" +
                    "\7\'\2\2\u00f4+\3\2\2\2\u00f5\u00f6\7(\2\2\u00f6-\3\2\2\2\u00f7\u00f8" +
                    "\7)\2\2\u00f8/\3\2\2\2\u00f9\u0104\7*\2\2\u00fa\u00fb\7\4\2\2\u00fb\u0100" +
                    "\7\67\2\2\u00fc\u00fd\7\5\2\2\u00fd\u00ff\7\67\2\2\u00fe\u00fc\3\2\2\2" +
                    "\u00ff\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0103" +
                    "\3\2\2\2\u0102\u0100\3\2\2\2\u0103\u0105\7\6\2\2\u0104\u00fa\3\2\2\2\u0104" +
                    "\u0105\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0107\5\62\32\2\u0107\61\3\2" +
                    "\2\2\u0108\u0109\5\6\4\2\u0109\u010a\7\n\2\2\u010a\u010e\3\2\2\2\u010b" +
                    "\u010c\7+\2\2\u010c\u010e\5\36\20\2\u010d\u0108\3\2\2\2\u010d\u010b\3" +
                    "\2\2\2\u010e\63\3\2\2\2\u010f\u011a\7,\2\2\u0110\u011a\7-\2\2\u0111\u011a" +
                    "\7.\2\2\u0112\u011a\7/\2\2\u0113\u011a\7\66\2\2\u0114\u0115\7\24\2\2\u0115" +
                    "\u011a\7\25\2\2\u0116\u0117\7\60\2\2\u0117\u011a\7\61\2\2\u0118\u011a" +
                    "\7*\2\2\u0119\u010f\3\2\2\2\u0119\u0110\3\2\2\2\u0119\u0111\3\2\2\2\u0119" +
                    "\u0112\3\2\2\2\u0119\u0113\3\2\2\2\u0119\u0114\3\2\2\2\u0119\u0116\3\2" +
                    "\2\2\u0119\u0118\3\2\2\2\u011a\65\3\2\2\2\u011b\u0123\7\62\2\2\u011c\u0123" +
                    "\7\63\2\2\u011d\u0123\7\64\2\2\u011e\u0123\7\65\2\2\u011f\u0123\58\35" +
                    "\2\u0120\u0123\5:\36\2\u0121\u0123\7\66\2\2\u0122\u011b\3\2\2\2\u0122" +
                    "\u011c\3\2\2\2\u0122\u011d\3\2\2\2\u0122\u011e\3\2\2\2\u0122\u011f\3\2" +
                    "\2\2\u0122\u0120\3\2\2\2\u0122\u0121\3\2\2\2\u0123\67\3\2\2\2\u0124\u0125" +
                    "\7\60\2\2\u0125\u012a\5\32\16\2\u0126\u0127\7\5\2\2\u0127\u0129\5\32\16" +
                    "\2\u0128\u0126\3\2\2\2\u0129\u012c\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b" +
                    "\3\2\2\2\u012b\u012d\3\2\2\2\u012c\u012a\3\2\2\2\u012d\u012e\7\61\2\2" +
                    "\u012e9\3\2\2\2\u012f\u0138\7\24\2\2\u0130\u0135\5\36\20\2\u0131\u0132" +
                    "\7\5\2\2\u0132\u0134\5\36\20\2\u0133\u0131\3\2\2\2\u0134\u0137\3\2\2\2" +
                    "\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0139\3\2\2\2\u0137\u0135" +
                    "\3\2\2\2\u0138\u0130\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013a\3\2\2\2\u013a" +
                    "\u013b\7\25\2\2\u013b;\3\2\2\2\36CGR[fs\u0082\u0087\u0093\u0099\u00aa" +
                    "\u00b2\u00b4\u00bc\u00c2\u00c9\u00d1\u00de\u00e1\u00f1\u0100\u0104\u010d" +
                    "\u0119\u0122\u012a\u0135\u0138";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}