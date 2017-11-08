// Generated from /home/ilya/Documents/Compilers/Compiler project/src/grammar/D.g4 by ANTLR 4.7
package compiler.antlr;

import org.runtime.atn.*;
import org.runtime.dfa.DFA;
import org.runtime.*;
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
            RULE_r_if = 4, RULE_r_while = 5, RULE_r_for = 6, RULE_print = 7, RULE_r_return = 8,
            RULE_assignment = 9, RULE_declaration = 10, RULE_var_definition = 11,
            RULE_reference = 12, RULE_expression = 13, RULE_relation = 14, RULE_simple = 15,
            RULE_summand = 16, RULE_factor = 17, RULE_primary = 18, RULE_function_literal = 19,
            RULE_body = 20, RULE_type_indicator = 21, RULE_literal = 22, RULE_object = 23,
            RULE_tuple = 24;
    public static final String[] ruleNames = {
            "compilation_unit", "program", "scope", "statement", "r_if", "r_while",
            "r_for", "print", "r_return", "assignment", "declaration", "var_definition",
            "reference", "expression", "relation", "simple", "summand", "factor",
            "primary", "function_literal", "body", "type_indicator", "literal", "object",
            "tuple"
    };

    private static final String[] _LITERAL_NAMES = {
            null, "';'", "'if'", "'then'", "'else'", "'end'", "'while'", "'loop'",
            "'for'", "'in'", "'..'", "'print'", "','", "'return'", "':='", "'var'",
            "'['", "']'", "'('", "')'", "'.'", "'or'", "'and'", "'xor'", "'<'", "'<='",
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
                setState(50);
                program();
                setState(51);
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
                setState(53);
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
                setState(61);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__5) | (1L << T__7) | (1L << T__10) | (1L << T__12) | (1L << T__14) | (1L << IDENT))) != 0)) {
                    {
                        {
                            setState(55);
                            statement();
                            setState(57);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                            if (_la == T__0) {
                                {
                                    setState(56);
                                    match(T__0);
                                }
                            }

                        }
                    }
                    setState(63);
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
            setState(71);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case T__14:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(64);
                    declaration();
                }
                break;
                case IDENT:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(65);
                    assignment();
                }
                break;
                case T__1:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(66);
                    r_if();
                }
                break;
                case T__5:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(67);
                    r_while();
                }
                break;
                case T__7:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(68);
                    r_for();
                }
                break;
                case T__12:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(69);
                    r_return();
                }
                break;
                case T__10:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(70);
                    print();
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
        enterRule(_localctx, 8, RULE_r_if);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(73);
                match(T__1);
                setState(74);
                expression();
                setState(75);
                match(T__2);
                setState(76);
                scope();
                setState(79);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == T__3) {
                    {
                        setState(77);
                        match(T__3);
                        setState(78);
                        scope();
                    }
                }

                setState(81);
                match(T__4);
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
        enterRule(_localctx, 10, RULE_r_while);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(83);
                match(T__5);
                setState(84);
                expression();
                setState(85);
                match(T__6);
                setState(86);
                scope();
                setState(87);
                match(T__4);
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
        public ScopeContext scope() {
            return getRuleContext(ScopeContext.class, 0);
        }

        public TerminalNode IDENT() {
            return getToken(DParser.IDENT, 0);
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
        enterRule(_localctx, 12, RULE_r_for);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(89);
                match(T__7);
                setState(92);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 4, _ctx)) {
                    case 1: {
                        setState(90);
                        match(IDENT);
                        setState(91);
                        match(T__8);
                    }
                    break;
                }
                setState(98);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__15) | (1L << T__17) | (1L << T__29) | (1L << T__30) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__42) | (1L << INTEGER) | (1L << REAL) | (1L << STRING) | (1L << BOOLEAN) | (1L << EMPTY) | (1L << IDENT))) != 0)) {
                    {
                        setState(94);
                        expression();
                        setState(95);
                        match(T__9);
                        setState(96);
                        expression();
                    }
                }

                setState(100);
                match(T__6);
                setState(101);
                scope();
                setState(102);
                match(T__4);
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
        enterRule(_localctx, 14, RULE_print);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(104);
                match(T__10);
                setState(105);
                expression();
                setState(110);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T__11) {
                    {
                        {
                            setState(106);
                            match(T__11);
                            setState(107);
                            expression();
                        }
                    }
                    setState(112);
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
        enterRule(_localctx, 16, RULE_r_return);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(113);
                match(T__12);
                setState(115);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 7, _ctx)) {
                    case 1: {
                        setState(114);
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
        enterRule(_localctx, 18, RULE_assignment);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(117);
                reference(0);
                setState(118);
                match(T__13);
                setState(119);
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
        enterRule(_localctx, 20, RULE_declaration);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(121);
                match(T__14);
                setState(122);
                var_definition();
                setState(127);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T__11) {
                    {
                        {
                            setState(123);
                            match(T__11);
                            setState(124);
                            var_definition();
                        }
                    }
                    setState(129);
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
        enterRule(_localctx, 22, RULE_var_definition);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(130);
                match(IDENT);
                setState(133);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == T__13) {
                    {
                        setState(131);
                        match(T__13);
                        setState(132);
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
        int _startState = 24;
        enterRecursionRule(_localctx, 24, RULE_reference, _p);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                {
                    setState(136);
                    match(IDENT);
                }
                _ctx.stop = _input.LT(-1);
                setState(160);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 12, _ctx);
                while (_alt != 2 && _alt != org.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            setState(158);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 11, _ctx)) {
                                case 1: {
                                    _localctx = new ReferenceContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_reference);
                                    setState(138);
                                    if (!(precpred(_ctx, 3)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 3)");
                                    setState(139);
                                    match(T__15);
                                    setState(140);
                                    expression();
                                    setState(141);
                                    match(T__16);
                                }
                                break;
                                case 2: {
                                    _localctx = new ReferenceContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_reference);
                                    setState(143);
                                    if (!(precpred(_ctx, 2)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 2)");
                                    setState(144);
                                    match(T__17);
                                    setState(145);
                                    expression();
                                    setState(150);
                                    _errHandler.sync(this);
                                    _la = _input.LA(1);
                                    while (_la == T__11) {
                                        {
                                            {
                                                setState(146);
                                                match(T__11);
                                                setState(147);
                                                expression();
                                            }
                                        }
                                        setState(152);
                                        _errHandler.sync(this);
                                        _la = _input.LA(1);
                                    }
                                    setState(153);
                                    match(T__18);
                                }
                                break;
                                case 3: {
                                    _localctx = new ReferenceContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_reference);
                                    setState(155);
                                    if (!(precpred(_ctx, 1)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 1)");
                                    setState(156);
                                    match(T__19);
                                    setState(157);
                                    match(IDENT);
                                }
                                break;
                            }
                        }
                    }
                    setState(162);
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
        enterRule(_localctx, 26, RULE_expression);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(163);
                relation();
                setState(168);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 13, _ctx);
                while (_alt != 2 && _alt != org.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(164);
                                _la = _input.LA(1);
                                if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__21) | (1L << T__22))) != 0))) {
                                    _errHandler.recoverInline(this);
                                } else {
                                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                    _errHandler.reportMatch(this);
                                    consume();
                                }
                                setState(165);
                                relation();
                            }
                        }
                    }
                    setState(170);
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
        enterRule(_localctx, 28, RULE_relation);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(171);
                simple();
                setState(174);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 14, _ctx)) {
                    case 1: {
                        setState(172);
                        _la = _input.LA(1);
                        if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28))) != 0))) {
                            _errHandler.recoverInline(this);
                        } else {
                            if (_input.LA(1) == Token.EOF) matchedEOF = true;
                            _errHandler.reportMatch(this);
                            consume();
                        }
                        setState(173);
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
        enterRule(_localctx, 30, RULE_simple);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(176);
                summand();
                setState(183);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 16, _ctx);
                while (_alt != 2 && _alt != org.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(178);
                                _errHandler.sync(this);
                                switch (getInterpreter().adaptivePredict(_input, 15, _ctx)) {
                                    case 1: {
                                        setState(177);
                                        _la = _input.LA(1);
                                        if (!(_la == T__29 || _la == T__30)) {
                                            _errHandler.recoverInline(this);
                                        } else {
                                            if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                            _errHandler.reportMatch(this);
                                            consume();
                                        }
                                    }
                                    break;
                                }
                                setState(180);
                                summand();
                            }
                        }
                    }
                    setState(185);
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
        enterRule(_localctx, 32, RULE_summand);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(186);
                factor();
                setState(191);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 17, _ctx);
                while (_alt != 2 && _alt != org.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(187);
                                _la = _input.LA(1);
                                if (!(_la == T__31 || _la == T__32)) {
                                    _errHandler.recoverInline(this);
                                } else {
                                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                    _errHandler.reportMatch(this);
                                    consume();
                                }
                                setState(188);
                                factor();
                            }
                        }
                    }
                    setState(193);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 17, _ctx);
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
        enterRule(_localctx, 34, RULE_factor);
        int _la;
        try {
            setState(207);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 19, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(194);
                    reference(0);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(195);
                    reference(0);
                    setState(196);
                    match(T__33);
                    setState(197);
                    type_indicator();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(199);
                    match(T__17);
                    setState(200);
                    expression();
                    setState(201);
                    match(T__18);
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(204);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__29) | (1L << T__30) | (1L << T__34))) != 0)) {
                        {
                            setState(203);
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

                    setState(206);
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
        enterRule(_localctx, 36, RULE_primary);
        try {
            setState(220);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case T__15:
                case T__42:
                case INTEGER:
                case REAL:
                case STRING:
                case BOOLEAN:
                case EMPTY:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(209);
                    literal();
                }
                break;
                case T__36:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(210);
                    function_literal();
                }
                break;
                case T__35:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(211);
                    match(T__35);
                    setState(212);
                    expression();
                }
                break;
                case T__1:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(213);
                    match(T__1);
                    setState(214);
                    expression();
                    setState(215);
                    match(T__2);
                    setState(216);
                    expression();
                    setState(217);
                    match(T__3);
                    setState(218);
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
        enterRule(_localctx, 38, RULE_function_literal);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(222);
                match(T__36);
                setState(233);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == T__17) {
                    {
                        setState(223);
                        match(T__17);
                        setState(224);
                        match(IDENT);
                        setState(229);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while (_la == T__11) {
                            {
                                {
                                    setState(225);
                                    match(T__11);
                                    setState(226);
                                    match(IDENT);
                                }
                            }
                            setState(231);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                        setState(232);
                        match(T__18);
                    }
                }

                setState(235);
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
        enterRule(_localctx, 40, RULE_body);
        try {
            setState(242);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case T__1:
                case T__4:
                case T__5:
                case T__7:
                case T__10:
                case T__12:
                case T__14:
                case IDENT:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(237);
                    scope();
                    setState(238);
                    match(T__4);
                }
                break;
                case T__37:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(240);
                    match(T__37);
                    setState(241);
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
        enterRule(_localctx, 42, RULE_type_indicator);
        try {
            setState(254);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case T__38:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(244);
                    match(T__38);
                }
                break;
                case T__39:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(245);
                    match(T__39);
                }
                break;
                case T__40:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(246);
                    match(T__40);
                }
                break;
                case T__41:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(247);
                    match(T__41);
                }
                break;
                case EMPTY:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(248);
                    match(EMPTY);
                }
                break;
                case T__15:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(249);
                    match(T__15);
                    setState(250);
                    match(T__16);
                }
                break;
                case T__42:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(251);
                    match(T__42);
                    setState(252);
                    match(T__43);
                }
                break;
                case T__36:
                    enterOuterAlt(_localctx, 8);
                {
                    setState(253);
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
        enterRule(_localctx, 44, RULE_literal);
        try {
            setState(263);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case INTEGER:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(256);
                    match(INTEGER);
                }
                break;
                case REAL:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(257);
                    match(REAL);
                }
                break;
                case STRING:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(258);
                    match(STRING);
                }
                break;
                case BOOLEAN:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(259);
                    match(BOOLEAN);
                }
                break;
                case T__42:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(260);
                    object();
                }
                break;
                case T__15:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(261);
                    tuple();
                }
                break;
                case EMPTY:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(262);
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
        enterRule(_localctx, 46, RULE_object);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(265);
                match(T__42);
                setState(266);
                var_definition();
                setState(271);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T__11) {
                    {
                        {
                            setState(267);
                            match(T__11);
                            setState(268);
                            var_definition();
                        }
                    }
                    setState(273);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(274);
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
        enterRule(_localctx, 48, RULE_tuple);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(276);
                match(T__15);
                setState(285);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__15) | (1L << T__17) | (1L << T__29) | (1L << T__30) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__42) | (1L << INTEGER) | (1L << REAL) | (1L << STRING) | (1L << BOOLEAN) | (1L << EMPTY) | (1L << IDENT))) != 0)) {
                    {
                        setState(277);
                        expression();
                        setState(282);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while (_la == T__11) {
                            {
                                {
                                    setState(278);
                                    match(T__11);
                                    setState(279);
                                    expression();
                                }
                            }
                            setState(284);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                    }
                }

                setState(287);
                match(T__16);
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
            case 12:
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
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\65\u0124\4\2\t\2" +
                    "\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13" +
                    "\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
                    "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31" +
                    "\4\32\t\32\3\2\3\2\3\2\3\3\3\3\3\4\3\4\5\4<\n\4\7\4>\n\4\f\4\16\4A\13" +
                    "\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5J\n\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6R\n" +
                    "\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\5\b_\n\b\3\b\3\b\3\b\3" +
                    "\b\5\be\n\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\7\to\n\t\f\t\16\tr\13\t\3" +
                    "\n\3\n\5\nv\n\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\7\f\u0080\n\f\f\f" +
                    "\16\f\u0083\13\f\3\r\3\r\3\r\5\r\u0088\n\r\3\16\3\16\3\16\3\16\3\16\3" +
                    "\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u0097\n\16\f\16\16\16\u009a" +
                    "\13\16\3\16\3\16\3\16\3\16\3\16\7\16\u00a1\n\16\f\16\16\16\u00a4\13\16" +
                    "\3\17\3\17\3\17\7\17\u00a9\n\17\f\17\16\17\u00ac\13\17\3\20\3\20\3\20" +
                    "\5\20\u00b1\n\20\3\21\3\21\5\21\u00b5\n\21\3\21\7\21\u00b8\n\21\f\21\16" +
                    "\21\u00bb\13\21\3\22\3\22\3\22\7\22\u00c0\n\22\f\22\16\22\u00c3\13\22" +
                    "\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00cf\n\23\3\23" +
                    "\5\23\u00d2\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24" +
                    "\5\24\u00df\n\24\3\25\3\25\3\25\3\25\3\25\7\25\u00e6\n\25\f\25\16\25\u00e9" +
                    "\13\25\3\25\5\25\u00ec\n\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\5\26\u00f5" +
                    "\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0101\n\27" +
                    "\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u010a\n\30\3\31\3\31\3\31\3\31" +
                    "\7\31\u0110\n\31\f\31\16\31\u0113\13\31\3\31\3\31\3\32\3\32\3\32\3\32" +
                    "\7\32\u011b\n\32\f\32\16\32\u011e\13\32\5\32\u0120\n\32\3\32\3\32\3\32" +
                    "\2\3\32\33\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\2\7\3" +
                    "\2\27\31\3\2\32\37\3\2 !\3\2\"#\4\2 !%%\2\u013c\2\64\3\2\2\2\4\67\3\2" +
                    "\2\2\6?\3\2\2\2\bI\3\2\2\2\nK\3\2\2\2\fU\3\2\2\2\16[\3\2\2\2\20j\3\2\2" +
                    "\2\22s\3\2\2\2\24w\3\2\2\2\26{\3\2\2\2\30\u0084\3\2\2\2\32\u0089\3\2\2" +
                    "\2\34\u00a5\3\2\2\2\36\u00ad\3\2\2\2 \u00b2\3\2\2\2\"\u00bc\3\2\2\2$\u00d1" +
                    "\3\2\2\2&\u00de\3\2\2\2(\u00e0\3\2\2\2*\u00f4\3\2\2\2,\u0100\3\2\2\2." +
                    "\u0109\3\2\2\2\60\u010b\3\2\2\2\62\u0116\3\2\2\2\64\65\5\4\3\2\65\66\7" +
                    "\2\2\3\66\3\3\2\2\2\678\5\6\4\28\5\3\2\2\29;\5\b\5\2:<\7\3\2\2;:\3\2\2" +
                    "\2;<\3\2\2\2<>\3\2\2\2=9\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@\7\3\2" +
                    "\2\2A?\3\2\2\2BJ\5\26\f\2CJ\5\24\13\2DJ\5\n\6\2EJ\5\f\7\2FJ\5\16\b\2G" +
                    "J\5\22\n\2HJ\5\20\t\2IB\3\2\2\2IC\3\2\2\2ID\3\2\2\2IE\3\2\2\2IF\3\2\2" +
                    "\2IG\3\2\2\2IH\3\2\2\2J\t\3\2\2\2KL\7\4\2\2LM\5\34\17\2MN\7\5\2\2NQ\5" +
                    "\6\4\2OP\7\6\2\2PR\5\6\4\2QO\3\2\2\2QR\3\2\2\2RS\3\2\2\2ST\7\7\2\2T\13" +
                    "\3\2\2\2UV\7\b\2\2VW\5\34\17\2WX\7\t\2\2XY\5\6\4\2YZ\7\7\2\2Z\r\3\2\2" +
                    "\2[^\7\n\2\2\\]\7\64\2\2]_\7\13\2\2^\\\3\2\2\2^_\3\2\2\2_d\3\2\2\2`a\5" +
                    "\34\17\2ab\7\f\2\2bc\5\34\17\2ce\3\2\2\2d`\3\2\2\2de\3\2\2\2ef\3\2\2\2" +
                    "fg\7\t\2\2gh\5\6\4\2hi\7\7\2\2i\17\3\2\2\2jk\7\r\2\2kp\5\34\17\2lm\7\16" +
                    "\2\2mo\5\34\17\2nl\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2q\21\3\2\2\2r" +
                    "p\3\2\2\2su\7\17\2\2tv\5\34\17\2ut\3\2\2\2uv\3\2\2\2v\23\3\2\2\2wx\5\32" +
                    "\16\2xy\7\20\2\2yz\5\34\17\2z\25\3\2\2\2{|\7\21\2\2|\u0081\5\30\r\2}~" +
                    "\7\16\2\2~\u0080\5\30\r\2\177}\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3" +
                    "\2\2\2\u0081\u0082\3\2\2\2\u0082\27\3\2\2\2\u0083\u0081\3\2\2\2\u0084" +
                    "\u0087\7\64\2\2\u0085\u0086\7\20\2\2\u0086\u0088\5\34\17\2\u0087\u0085" +
                    "\3\2\2\2\u0087\u0088\3\2\2\2\u0088\31\3\2\2\2\u0089\u008a\b\16\1\2\u008a" +
                    "\u008b\7\64\2\2\u008b\u00a2\3\2\2\2\u008c\u008d\f\5\2\2\u008d\u008e\7" +
                    "\22\2\2\u008e\u008f\5\34\17\2\u008f\u0090\7\23\2\2\u0090\u00a1\3\2\2\2" +
                    "\u0091\u0092\f\4\2\2\u0092\u0093\7\24\2\2\u0093\u0098\5\34\17\2\u0094" +
                    "\u0095\7\16\2\2\u0095\u0097\5\34\17\2\u0096\u0094\3\2\2\2\u0097\u009a" +
                    "\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009b\3\2\2\2\u009a" +
                    "\u0098\3\2\2\2\u009b\u009c\7\25\2\2\u009c\u00a1\3\2\2\2\u009d\u009e\f" +
                    "\3\2\2\u009e\u009f\7\26\2\2\u009f\u00a1\7\64\2\2\u00a0\u008c\3\2\2\2\u00a0" +
                    "\u0091\3\2\2\2\u00a0\u009d\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2" +
                    "\2\2\u00a2\u00a3\3\2\2\2\u00a3\33\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00aa" +
                    "\5\36\20\2\u00a6\u00a7\t\2\2\2\u00a7\u00a9\5\36\20\2\u00a8\u00a6\3\2\2" +
                    "\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\35" +
                    "\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00b0\5 \21\2\u00ae\u00af\t\3\2\2\u00af" +
                    "\u00b1\5 \21\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\37\3\2\2" +
                    "\2\u00b2\u00b9\5\"\22\2\u00b3\u00b5\t\4\2\2\u00b4\u00b3\3\2\2\2\u00b4" +
                    "\u00b5\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b8\5\"\22\2\u00b7\u00b4\3" +
                    "\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba" +
                    "!\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00c1\5$\23\2\u00bd\u00be\t\5\2\2" +
                    "\u00be\u00c0\5$\23\2\u00bf\u00bd\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf" +
                    "\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2#\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4" +
                    "\u00d2\5\32\16\2\u00c5\u00c6\5\32\16\2\u00c6\u00c7\7$\2\2\u00c7\u00c8" +
                    "\5,\27\2\u00c8\u00d2\3\2\2\2\u00c9\u00ca\7\24\2\2\u00ca\u00cb\5\34\17" +
                    "\2\u00cb\u00cc\7\25\2\2\u00cc\u00d2\3\2\2\2\u00cd\u00cf\t\6\2\2\u00ce" +
                    "\u00cd\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d2\5&" +
                    "\24\2\u00d1\u00c4\3\2\2\2\u00d1\u00c5\3\2\2\2\u00d1\u00c9\3\2\2\2\u00d1" +
                    "\u00ce\3\2\2\2\u00d2%\3\2\2\2\u00d3\u00df\5.\30\2\u00d4\u00df\5(\25\2" +
                    "\u00d5\u00d6\7&\2\2\u00d6\u00df\5\34\17\2\u00d7\u00d8\7\4\2\2\u00d8\u00d9" +
                    "\5\34\17\2\u00d9\u00da\7\5\2\2\u00da\u00db\5\34\17\2\u00db\u00dc\7\6\2" +
                    "\2\u00dc\u00dd\5\34\17\2\u00dd\u00df\3\2\2\2\u00de\u00d3\3\2\2\2\u00de" +
                    "\u00d4\3\2\2\2\u00de\u00d5\3\2\2\2\u00de\u00d7\3\2\2\2\u00df\'\3\2\2\2" +
                    "\u00e0\u00eb\7\'\2\2\u00e1\u00e2\7\24\2\2\u00e2\u00e7\7\64\2\2\u00e3\u00e4" +
                    "\7\16\2\2\u00e4\u00e6\7\64\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00e9\3\2\2\2" +
                    "\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00e7" +
                    "\3\2\2\2\u00ea\u00ec\7\25\2\2\u00eb\u00e1\3\2\2\2\u00eb\u00ec\3\2\2\2" +
                    "\u00ec\u00ed\3\2\2\2\u00ed\u00ee\5*\26\2\u00ee)\3\2\2\2\u00ef\u00f0\5" +
                    "\6\4\2\u00f0\u00f1\7\7\2\2\u00f1\u00f5\3\2\2\2\u00f2\u00f3\7(\2\2\u00f3" +
                    "\u00f5\5\34\17\2\u00f4\u00ef\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5+\3\2\2" +
                    "\2\u00f6\u0101\7)\2\2\u00f7\u0101\7*\2\2\u00f8\u0101\7+\2\2\u00f9\u0101" +
                    "\7,\2\2\u00fa\u0101\7\63\2\2\u00fb\u00fc\7\22\2\2\u00fc\u0101\7\23\2\2" +
                    "\u00fd\u00fe\7-\2\2\u00fe\u0101\7.\2\2\u00ff\u0101\7\'\2\2\u0100\u00f6" +
                    "\3\2\2\2\u0100\u00f7\3\2\2\2\u0100\u00f8\3\2\2\2\u0100\u00f9\3\2\2\2\u0100" +
                    "\u00fa\3\2\2\2\u0100\u00fb\3\2\2\2\u0100\u00fd\3\2\2\2\u0100\u00ff\3\2" +
                    "\2\2\u0101-\3\2\2\2\u0102\u010a\7/\2\2\u0103\u010a\7\60\2\2\u0104\u010a" +
                    "\7\61\2\2\u0105\u010a\7\62\2\2\u0106\u010a\5\60\31\2\u0107\u010a\5\62" +
                    "\32\2\u0108\u010a\7\63\2\2\u0109\u0102\3\2\2\2\u0109\u0103\3\2\2\2\u0109" +
                    "\u0104\3\2\2\2\u0109\u0105\3\2\2\2\u0109\u0106\3\2\2\2\u0109\u0107\3\2" +
                    "\2\2\u0109\u0108\3\2\2\2\u010a/\3\2\2\2\u010b\u010c\7-\2\2\u010c\u0111" +
                    "\5\30\r\2\u010d\u010e\7\16\2\2\u010e\u0110\5\30\r\2\u010f\u010d\3\2\2" +
                    "\2\u0110\u0113\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0114" +
                    "\3\2\2\2\u0113\u0111\3\2\2\2\u0114\u0115\7.\2\2\u0115\61\3\2\2\2\u0116" +
                    "\u011f\7\22\2\2\u0117\u011c\5\34\17\2\u0118\u0119\7\16\2\2\u0119\u011b" +
                    "\5\34\17\2\u011a\u0118\3\2\2\2\u011b\u011e\3\2\2\2\u011c\u011a\3\2\2\2" +
                    "\u011c\u011d\3\2\2\2\u011d\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011f\u0117" +
                    "\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0122\7\23\2\2" +
                    "\u0122\63\3\2\2\2\37;?IQ^dpu\u0081\u0087\u0098\u00a0\u00a2\u00aa\u00b0" +
                    "\u00b4\u00b9\u00c1\u00ce\u00d1\u00de\u00e7\u00eb\u00f4\u0100\u0109\u0111" +
                    "\u011c\u011f";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}