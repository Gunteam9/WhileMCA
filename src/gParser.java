// Generated from g.g4 by ANTLR 4.9
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, Identifier=33, Constant=34, WS=35;
	public static final int
		RULE_program = 0, RULE_declaration = 1, RULE_lDeclIdent = 2, RULE_lDeclVariables = 3, 
		RULE_declVariables = 4, RULE_lIdentifier = 5, RULE_type = 6, RULE_block = 7, 
		RULE_statements = 8, RULE_statement = 9, RULE_lAexpression = 10, RULE_aexpression = 11, 
		RULE_opa = 12, RULE_bexpression = 13, RULE_opr = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "declaration", "lDeclIdent", "lDeclVariables", "declVariables", 
			"lIdentifier", "type", "block", "statements", "statement", "lAexpression", 
			"aexpression", "opa", "bexpression", "opr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'program'", "'begin'", "'end'", "'proc'", "'('", "','", "'res'", 
			"')'", "';'", "'int'", "'boolean'", "'skip'", "':='", "'if'", "'then'", 
			"'else'", "'while'", "'do'", "'call'", "'-'", "'+'", "'*'", "'/'", "'true'", 
			"'false'", "'not'", "'<'", "'<='", "'>'", "'>='", "'='", "'<>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "Identifier", "Constant", 
			"WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "g.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public gParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public LDeclVariablesContext lDeclVariables() {
			return getRuleContext(LDeclVariablesContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(gParser.EOF, 0); }
		public TerminalNode Identifier() { return getToken(gParser.Identifier, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(T__0);
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(31);
				match(Identifier);
				}
			}

			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(34);
				declaration();
				}
				}
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(40);
			match(T__1);
			setState(41);
			lDeclVariables();
			setState(42);
			statements();
			setState(43);
			match(T__2);
			setState(44);
			match(EOF);
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

	public static class DeclarationContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(gParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(gParser.Identifier, i);
		}
		public LDeclIdentContext lDeclIdent() {
			return getRuleContext(LDeclIdentContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(T__3);
			setState(47);
			match(Identifier);
			setState(48);
			match(T__4);
			setState(49);
			lDeclIdent();
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(50);
				match(T__5);
				setState(51);
				match(T__6);
				setState(52);
				type();
				setState(53);
				match(Identifier);
				}
			}

			setState(57);
			match(T__7);
			setState(58);
			match(T__1);
			setState(59);
			statements();
			setState(60);
			match(T__2);
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

	public static class LDeclIdentContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> Identifier() { return getTokens(gParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(gParser.Identifier, i);
		}
		public LDeclIdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lDeclIdent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterLDeclIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitLDeclIdent(this);
		}
	}

	public final LDeclIdentContext lDeclIdent() throws RecognitionException {
		LDeclIdentContext _localctx = new LDeclIdentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_lDeclIdent);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			type();
			setState(63);
			match(Identifier);
			setState(70);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(64);
					match(T__5);
					setState(65);
					type();
					setState(66);
					match(Identifier);
					}
					} 
				}
				setState(72);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public static class LDeclVariablesContext extends ParserRuleContext {
		public DeclVariablesContext declVariables() {
			return getRuleContext(DeclVariablesContext.class,0);
		}
		public List<LDeclVariablesContext> lDeclVariables() {
			return getRuleContexts(LDeclVariablesContext.class);
		}
		public LDeclVariablesContext lDeclVariables(int i) {
			return getRuleContext(LDeclVariablesContext.class,i);
		}
		public LDeclVariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lDeclVariables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterLDeclVariables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitLDeclVariables(this);
		}
	}

	public final LDeclVariablesContext lDeclVariables() throws RecognitionException {
		LDeclVariablesContext _localctx = new LDeclVariablesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_lDeclVariables);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			declVariables();
			setState(77);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(74);
					lDeclVariables();
					}
					} 
				}
				setState(79);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class DeclVariablesContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public LIdentifierContext lIdentifier() {
			return getRuleContext(LIdentifierContext.class,0);
		}
		public DeclVariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declVariables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterDeclVariables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitDeclVariables(this);
		}
	}

	public final DeclVariablesContext declVariables() throws RecognitionException {
		DeclVariablesContext _localctx = new DeclVariablesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declVariables);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			type();
			setState(81);
			lIdentifier();
			setState(82);
			match(T__8);
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

	public static class LIdentifierContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(gParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(gParser.Identifier, i);
		}
		public LIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterLIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitLIdentifier(this);
		}
	}

	public final LIdentifierContext lIdentifier() throws RecognitionException {
		LIdentifierContext _localctx = new LIdentifierContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_lIdentifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(Identifier);
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(85);
				match(T__5);
				setState(86);
				match(Identifier);
				}
				}
				setState(91);
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

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			_la = _input.LA(1);
			if ( !(_la==T__9 || _la==T__10) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class BlockContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_block);
		try {
			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
			case T__13:
			case T__16:
			case T__18:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				statement();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				match(T__4);
				setState(96);
				statements();
				setState(97);
				match(T__7);
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

	public static class StatementsContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitStatements(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			statement();
			setState(106);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(102);
					match(T__8);
					setState(103);
					statements();
					}
					} 
				}
				setState(108);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class StatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(gParser.Identifier, 0); }
		public AexpressionContext aexpression() {
			return getRuleContext(AexpressionContext.class,0);
		}
		public BexpressionContext bexpression() {
			return getRuleContext(BexpressionContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public LAexpressionContext lAexpression() {
			return getRuleContext(LAexpressionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_statement);
		try {
			setState(132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				match(T__11);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				match(Identifier);
				setState(111);
				match(T__12);
				setState(112);
				aexpression(0);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 3);
				{
				setState(113);
				match(T__13);
				setState(114);
				bexpression();
				setState(115);
				match(T__14);
				setState(116);
				block();
				setState(119);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(117);
					match(T__15);
					setState(118);
					block();
					}
					break;
				}
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 4);
				{
				setState(121);
				match(T__16);
				setState(122);
				bexpression();
				setState(123);
				match(T__17);
				setState(124);
				block();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 5);
				{
				setState(126);
				match(T__18);
				setState(127);
				match(Identifier);
				setState(128);
				match(T__4);
				setState(129);
				lAexpression();
				setState(130);
				match(T__7);
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

	public static class LAexpressionContext extends ParserRuleContext {
		public List<AexpressionContext> aexpression() {
			return getRuleContexts(AexpressionContext.class);
		}
		public AexpressionContext aexpression(int i) {
			return getRuleContext(AexpressionContext.class,i);
		}
		public LAexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lAexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterLAexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitLAexpression(this);
		}
	}

	public final LAexpressionContext lAexpression() throws RecognitionException {
		LAexpressionContext _localctx = new LAexpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_lAexpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			aexpression(0);
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(135);
				match(T__5);
				setState(136);
				aexpression(0);
				}
				}
				setState(141);
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

	public static class AexpressionContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(gParser.Identifier, 0); }
		public TerminalNode Constant() { return getToken(gParser.Constant, 0); }
		public List<AexpressionContext> aexpression() {
			return getRuleContexts(AexpressionContext.class);
		}
		public AexpressionContext aexpression(int i) {
			return getRuleContext(AexpressionContext.class,i);
		}
		public OpaContext opa() {
			return getRuleContext(OpaContext.class,0);
		}
		public AexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterAexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitAexpression(this);
		}
	}

	public final AexpressionContext aexpression() throws RecognitionException {
		return aexpression(0);
	}

	private AexpressionContext aexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AexpressionContext _localctx = new AexpressionContext(_ctx, _parentState);
		AexpressionContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_aexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				{
				setState(143);
				match(Identifier);
				}
				break;
			case Constant:
				{
				setState(144);
				match(Constant);
				}
				break;
			case T__19:
				{
				setState(145);
				match(T__19);
				setState(146);
				aexpression(2);
				}
				break;
			case T__4:
				{
				setState(147);
				match(T__4);
				setState(148);
				aexpression(0);
				setState(149);
				match(T__7);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(159);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AexpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_aexpression);
					setState(153);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(154);
					opa();
					setState(155);
					aexpression(4);
					}
					} 
				}
				setState(161);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class OpaContext extends ParserRuleContext {
		public OpaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterOpa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitOpa(this);
		}
	}

	public final OpaContext opa() throws RecognitionException {
		OpaContext _localctx = new OpaContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_opa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class BexpressionContext extends ParserRuleContext {
		public List<AexpressionContext> aexpression() {
			return getRuleContexts(AexpressionContext.class);
		}
		public AexpressionContext aexpression(int i) {
			return getRuleContext(AexpressionContext.class,i);
		}
		public OprContext opr() {
			return getRuleContext(OprContext.class,0);
		}
		public BexpressionContext bexpression() {
			return getRuleContext(BexpressionContext.class,0);
		}
		public BexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterBexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitBexpression(this);
		}
	}

	public final BexpressionContext bexpression() throws RecognitionException {
		BexpressionContext _localctx = new BexpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_bexpression);
		try {
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				match(T__23);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				match(T__24);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(166);
				aexpression(0);
				setState(167);
				opr();
				setState(168);
				aexpression(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(170);
				match(T__25);
				setState(171);
				bexpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(172);
				match(T__4);
				setState(173);
				bexpression();
				setState(174);
				match(T__7);
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

	public static class OprContext extends ParserRuleContext {
		public OprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterOpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitOpr(this);
		}
	}

	public final OprContext opr() throws RecognitionException {
		OprContext _localctx = new OprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_opr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 11:
			return aexpression_sempred((AexpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean aexpression_sempred(AexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3%\u00b7\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\5\2#\n\2\3\2"+
		"\7\2&\n\2\f\2\16\2)\13\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\5\3:\n\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\7"+
		"\4G\n\4\f\4\16\4J\13\4\3\5\3\5\7\5N\n\5\f\5\16\5Q\13\5\3\6\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\7\7Z\n\7\f\7\16\7]\13\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\5\tf"+
		"\n\t\3\n\3\n\3\n\7\nk\n\n\f\n\16\nn\13\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\5\13z\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\5\13\u0087\n\13\3\f\3\f\3\f\7\f\u008c\n\f\f\f\16\f\u008f"+
		"\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u009a\n\r\3\r\3\r\3\r\3"+
		"\r\7\r\u00a0\n\r\f\r\16\r\u00a3\13\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00b3\n\17\3\20\3\20\3\20\2\3"+
		"\30\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\5\3\2\f\r\3\2\26\31\3"+
		"\2\35\"\2\u00bd\2 \3\2\2\2\4\60\3\2\2\2\6@\3\2\2\2\bK\3\2\2\2\nR\3\2\2"+
		"\2\fV\3\2\2\2\16^\3\2\2\2\20e\3\2\2\2\22g\3\2\2\2\24\u0086\3\2\2\2\26"+
		"\u0088\3\2\2\2\30\u0099\3\2\2\2\32\u00a4\3\2\2\2\34\u00b2\3\2\2\2\36\u00b4"+
		"\3\2\2\2 \"\7\3\2\2!#\7#\2\2\"!\3\2\2\2\"#\3\2\2\2#\'\3\2\2\2$&\5\4\3"+
		"\2%$\3\2\2\2&)\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(*\3\2\2\2)\'\3\2\2\2*+\7"+
		"\4\2\2+,\5\b\5\2,-\5\22\n\2-.\7\5\2\2./\7\2\2\3/\3\3\2\2\2\60\61\7\6\2"+
		"\2\61\62\7#\2\2\62\63\7\7\2\2\639\5\6\4\2\64\65\7\b\2\2\65\66\7\t\2\2"+
		"\66\67\5\16\b\2\678\7#\2\28:\3\2\2\29\64\3\2\2\29:\3\2\2\2:;\3\2\2\2;"+
		"<\7\n\2\2<=\7\4\2\2=>\5\22\n\2>?\7\5\2\2?\5\3\2\2\2@A\5\16\b\2AH\7#\2"+
		"\2BC\7\b\2\2CD\5\16\b\2DE\7#\2\2EG\3\2\2\2FB\3\2\2\2GJ\3\2\2\2HF\3\2\2"+
		"\2HI\3\2\2\2I\7\3\2\2\2JH\3\2\2\2KO\5\n\6\2LN\5\b\5\2ML\3\2\2\2NQ\3\2"+
		"\2\2OM\3\2\2\2OP\3\2\2\2P\t\3\2\2\2QO\3\2\2\2RS\5\16\b\2ST\5\f\7\2TU\7"+
		"\13\2\2U\13\3\2\2\2V[\7#\2\2WX\7\b\2\2XZ\7#\2\2YW\3\2\2\2Z]\3\2\2\2[Y"+
		"\3\2\2\2[\\\3\2\2\2\\\r\3\2\2\2][\3\2\2\2^_\t\2\2\2_\17\3\2\2\2`f\5\24"+
		"\13\2ab\7\7\2\2bc\5\22\n\2cd\7\n\2\2df\3\2\2\2e`\3\2\2\2ea\3\2\2\2f\21"+
		"\3\2\2\2gl\5\24\13\2hi\7\13\2\2ik\5\22\n\2jh\3\2\2\2kn\3\2\2\2lj\3\2\2"+
		"\2lm\3\2\2\2m\23\3\2\2\2nl\3\2\2\2o\u0087\7\16\2\2pq\7#\2\2qr\7\17\2\2"+
		"r\u0087\5\30\r\2st\7\20\2\2tu\5\34\17\2uv\7\21\2\2vy\5\20\t\2wx\7\22\2"+
		"\2xz\5\20\t\2yw\3\2\2\2yz\3\2\2\2z\u0087\3\2\2\2{|\7\23\2\2|}\5\34\17"+
		"\2}~\7\24\2\2~\177\5\20\t\2\177\u0087\3\2\2\2\u0080\u0081\7\25\2\2\u0081"+
		"\u0082\7#\2\2\u0082\u0083\7\7\2\2\u0083\u0084\5\26\f\2\u0084\u0085\7\n"+
		"\2\2\u0085\u0087\3\2\2\2\u0086o\3\2\2\2\u0086p\3\2\2\2\u0086s\3\2\2\2"+
		"\u0086{\3\2\2\2\u0086\u0080\3\2\2\2\u0087\25\3\2\2\2\u0088\u008d\5\30"+
		"\r\2\u0089\u008a\7\b\2\2\u008a\u008c\5\30\r\2\u008b\u0089\3\2\2\2\u008c"+
		"\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\27\3\2\2"+
		"\2\u008f\u008d\3\2\2\2\u0090\u0091\b\r\1\2\u0091\u009a\7#\2\2\u0092\u009a"+
		"\7$\2\2\u0093\u0094\7\26\2\2\u0094\u009a\5\30\r\4\u0095\u0096\7\7\2\2"+
		"\u0096\u0097\5\30\r\2\u0097\u0098\7\n\2\2\u0098\u009a\3\2\2\2\u0099\u0090"+
		"\3\2\2\2\u0099\u0092\3\2\2\2\u0099\u0093\3\2\2\2\u0099\u0095\3\2\2\2\u009a"+
		"\u00a1\3\2\2\2\u009b\u009c\f\5\2\2\u009c\u009d\5\32\16\2\u009d\u009e\5"+
		"\30\r\6\u009e\u00a0\3\2\2\2\u009f\u009b\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1"+
		"\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\31\3\2\2\2\u00a3\u00a1\3\2\2"+
		"\2\u00a4\u00a5\t\3\2\2\u00a5\33\3\2\2\2\u00a6\u00b3\7\32\2\2\u00a7\u00b3"+
		"\7\33\2\2\u00a8\u00a9\5\30\r\2\u00a9\u00aa\5\36\20\2\u00aa\u00ab\5\30"+
		"\r\2\u00ab\u00b3\3\2\2\2\u00ac\u00ad\7\34\2\2\u00ad\u00b3\5\34\17\2\u00ae"+
		"\u00af\7\7\2\2\u00af\u00b0\5\34\17\2\u00b0\u00b1\7\n\2\2\u00b1\u00b3\3"+
		"\2\2\2\u00b2\u00a6\3\2\2\2\u00b2\u00a7\3\2\2\2\u00b2\u00a8\3\2\2\2\u00b2"+
		"\u00ac\3\2\2\2\u00b2\u00ae\3\2\2\2\u00b3\35\3\2\2\2\u00b4\u00b5\t\4\2"+
		"\2\u00b5\37\3\2\2\2\20\"\'9HO[ely\u0086\u008d\u0099\u00a1\u00b2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}