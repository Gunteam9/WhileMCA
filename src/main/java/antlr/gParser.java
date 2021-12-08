// Generated from D:/Documents/Programmation/Java/WhileMCA/src/main\g.g4 by ANTLR 4.9.2
package antlr;
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
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitLDeclIdent(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitLDeclVariables(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitDeclVariables(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitLIdentifier(this);
			else return visitor.visitChildren(this);
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
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TypeIntegerContext extends TypeContext {
		public TypeIntegerContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterTypeInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitTypeInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitTypeInteger(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeBooleanContext extends TypeContext {
		public TypeBooleanContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterTypeBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitTypeBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitTypeBoolean(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_type);
		try {
			setState(94);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				_localctx = new TypeIntegerContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				match(T__9);
				}
				break;
			case T__10:
				_localctx = new TypeBooleanContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				match(T__10);
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

	public static class BlockContext extends ParserRuleContext {
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	 
		public BlockContext() { }
		public void copyFrom(BlockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BlockStatContext extends BlockContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BlockStatContext(BlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterBlockStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitBlockStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitBlockStat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlockParentStatContext extends BlockContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public BlockParentStatContext(BlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterBlockParentStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitBlockParentStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitBlockParentStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_block);
		try {
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
			case T__13:
			case T__16:
			case T__18:
			case Identifier:
				_localctx = new BlockStatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				statement();
				}
				break;
			case T__4:
				_localctx = new BlockParentStatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				match(T__4);
				setState(98);
				statements();
				setState(99);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			statement();
			setState(108);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(104);
					match(T__8);
					setState(105);
					statements();
					}
					} 
				}
				setState(110);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignStatContext extends StatementContext {
		public TerminalNode Identifier() { return getToken(gParser.Identifier, 0); }
		public AexpressionContext aexpression() {
			return getRuleContext(AexpressionContext.class,0);
		}
		public AssignStatContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterAssignStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitAssignStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitAssignStat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfStatContext extends StatementContext {
		public BlockContext thenblock;
		public BexpressionContext bexpression() {
			return getRuleContext(BexpressionContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public IfStatContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterIfStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitIfStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitIfStat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SkipStatContext extends StatementContext {
		public SkipStatContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterSkipStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitSkipStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitSkipStat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileStatContext extends StatementContext {
		public BexpressionContext bexpression() {
			return getRuleContext(BexpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileStatContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterWhileStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitWhileStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitWhileStat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CallStatContext extends StatementContext {
		public TerminalNode Identifier() { return getToken(gParser.Identifier, 0); }
		public LAexpressionContext lAexpression() {
			return getRuleContext(LAexpressionContext.class,0);
		}
		public CallStatContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCallStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCallStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCallStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_statement);
		try {
			setState(134);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				_localctx = new SkipStatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				match(T__11);
				}
				break;
			case Identifier:
				_localctx = new AssignStatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				match(Identifier);
				setState(113);
				match(T__12);
				setState(114);
				aexpression(0);
				}
				break;
			case T__13:
				_localctx = new IfStatContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(115);
				match(T__13);
				setState(116);
				bexpression();
				setState(117);
				match(T__14);
				setState(118);
				((IfStatContext)_localctx).thenblock = block();
				setState(121);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(119);
					match(T__15);
					setState(120);
					block();
					}
					break;
				}
				}
				break;
			case T__16:
				_localctx = new WhileStatContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(123);
				match(T__16);
				setState(124);
				bexpression();
				setState(125);
				match(T__17);
				setState(126);
				block();
				}
				break;
			case T__18:
				_localctx = new CallStatContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(128);
				match(T__18);
				setState(129);
				match(Identifier);
				setState(130);
				match(T__4);
				setState(131);
				lAexpression();
				setState(132);
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
		public LAexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lAexpression; }
	 
		public LAexpressionContext() { }
		public void copyFrom(LAexpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ListAExprContext extends LAexpressionContext {
		public List<AexpressionContext> aexpression() {
			return getRuleContexts(AexpressionContext.class);
		}
		public AexpressionContext aexpression(int i) {
			return getRuleContext(AexpressionContext.class,i);
		}
		public ListAExprContext(LAexpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterListAExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitListAExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitListAExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LAexpressionContext lAexpression() throws RecognitionException {
		LAexpressionContext _localctx = new LAexpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_lAexpression);
		int _la;
		try {
			_localctx = new ListAExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			aexpression(0);
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(137);
				match(T__5);
				setState(138);
				aexpression(0);
				}
				}
				setState(143);
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
		public AexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aexpression; }
	 
		public AexpressionContext() { }
		public void copyFrom(AexpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdentExprContext extends AexpressionContext {
		public TerminalNode Identifier() { return getToken(gParser.Identifier, 0); }
		public IdentExprContext(AexpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterIdentExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitIdentExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitIdentExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstExprContext extends AexpressionContext {
		public TerminalNode Constant() { return getToken(gParser.Constant, 0); }
		public ConstExprContext(AexpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterConstExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitConstExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitConstExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NegatExprContext extends AexpressionContext {
		public AexpressionContext aexpression() {
			return getRuleContext(AexpressionContext.class,0);
		}
		public NegatExprContext(AexpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterNegatExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitNegatExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitNegatExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParentExprContext extends AexpressionContext {
		public AexpressionContext aexpression() {
			return getRuleContext(AexpressionContext.class,0);
		}
		public ParentExprContext(AexpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterParentExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitParentExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitParentExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CompaExprContext extends AexpressionContext {
		public AexpressionContext leftexpr;
		public AexpressionContext rigthexpr;
		public OpaContext opa() {
			return getRuleContext(OpaContext.class,0);
		}
		public List<AexpressionContext> aexpression() {
			return getRuleContexts(AexpressionContext.class);
		}
		public AexpressionContext aexpression(int i) {
			return getRuleContext(AexpressionContext.class,i);
		}
		public CompaExprContext(AexpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCompaExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCompaExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCompaExpr(this);
			else return visitor.visitChildren(this);
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
			setState(153);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				{
				_localctx = new IdentExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(145);
				match(Identifier);
				}
				break;
			case Constant:
				{
				_localctx = new ConstExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(146);
				match(Constant);
				}
				break;
			case T__19:
				{
				_localctx = new NegatExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(147);
				match(T__19);
				setState(148);
				aexpression(2);
				}
				break;
			case T__4:
				{
				_localctx = new ParentExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(149);
				match(T__4);
				setState(150);
				aexpression(0);
				setState(151);
				match(T__7);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(161);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CompaExprContext(new AexpressionContext(_parentctx, _parentState));
					((CompaExprContext)_localctx).leftexpr = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_aexpression);
					setState(155);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(156);
					opa();
					setState(157);
					((CompaExprContext)_localctx).rigthexpr = aexpression(4);
					}
					} 
				}
				setState(163);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
	 
		public OpaContext() { }
		public void copyFrom(OpaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OperatorNumContext extends OpaContext {
		public Token op;
		public OperatorNumContext(OpaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterOperatorNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitOperatorNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitOperatorNum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpaContext opa() throws RecognitionException {
		OpaContext _localctx = new OpaContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_opa);
		int _la;
		try {
			_localctx = new OperatorNumContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			((OperatorNumContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22))) != 0)) ) {
				((OperatorNumContext)_localctx).op = (Token)_errHandler.recoverInline(this);
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
		public BexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bexpression; }
	 
		public BexpressionContext() { }
		public void copyFrom(BexpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TrueExprContext extends BexpressionContext {
		public TrueExprContext(BexpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterTrueExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitTrueExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitTrueExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesisExprContext extends BexpressionContext {
		public BexpressionContext bexpression() {
			return getRuleContext(BexpressionContext.class,0);
		}
		public ParenthesisExprContext(BexpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterParenthesisExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitParenthesisExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitParenthesisExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CompExprContext extends BexpressionContext {
		public AexpressionContext leftexpr;
		public AexpressionContext rightexpr;
		public OprContext opr() {
			return getRuleContext(OprContext.class,0);
		}
		public List<AexpressionContext> aexpression() {
			return getRuleContexts(AexpressionContext.class);
		}
		public AexpressionContext aexpression(int i) {
			return getRuleContext(AexpressionContext.class,i);
		}
		public CompExprContext(BexpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCompExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCompExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCompExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotExprContext extends BexpressionContext {
		public BexpressionContext bexpression() {
			return getRuleContext(BexpressionContext.class,0);
		}
		public NotExprContext(BexpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterNotExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitNotExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitNotExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FalseExprContext extends BexpressionContext {
		public FalseExprContext(BexpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterFalseExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitFalseExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitFalseExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BexpressionContext bexpression() throws RecognitionException {
		BexpressionContext _localctx = new BexpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_bexpression);
		try {
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new TrueExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				match(T__23);
				}
				break;
			case 2:
				_localctx = new FalseExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				match(T__24);
				}
				break;
			case 3:
				_localctx = new CompExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(168);
				((CompExprContext)_localctx).leftexpr = aexpression(0);
				setState(169);
				opr();
				setState(170);
				((CompExprContext)_localctx).rightexpr = aexpression(0);
				}
				break;
			case 4:
				_localctx = new NotExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(172);
				match(T__25);
				setState(173);
				bexpression();
				}
				break;
			case 5:
				_localctx = new ParenthesisExprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(174);
				match(T__4);
				setState(175);
				bexpression();
				setState(176);
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
	 
		public OprContext() { }
		public void copyFrom(OprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OperatorCompaContext extends OprContext {
		public Token op;
		public OperatorCompaContext(OprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterOperatorCompa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitOperatorCompa(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitOperatorCompa(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OprContext opr() throws RecognitionException {
		OprContext _localctx = new OprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_opr);
		int _la;
		try {
			_localctx = new OperatorCompaContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			((OperatorCompaContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31))) != 0)) ) {
				((OperatorCompaContext)_localctx).op = (Token)_errHandler.recoverInline(this);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3%\u00b9\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\5\2#\n\2\3\2"+
		"\7\2&\n\2\f\2\16\2)\13\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\5\3:\n\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\7"+
		"\4G\n\4\f\4\16\4J\13\4\3\5\3\5\7\5N\n\5\f\5\16\5Q\13\5\3\6\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\7\7Z\n\7\f\7\16\7]\13\7\3\b\3\b\5\ba\n\b\3\t\3\t\3\t\3\t"+
		"\3\t\5\th\n\t\3\n\3\n\3\n\7\nm\n\n\f\n\16\np\13\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\5\13|\n\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\5\13\u0089\n\13\3\f\3\f\3\f\7\f\u008e\n\f\f"+
		"\f\16\f\u0091\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u009c\n\r\3"+
		"\r\3\r\3\r\3\r\7\r\u00a2\n\r\f\r\16\r\u00a5\13\r\3\16\3\16\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00b5\n\17\3\20"+
		"\3\20\3\20\2\3\30\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\4\3\2\26"+
		"\31\3\2\35\"\2\u00c0\2 \3\2\2\2\4\60\3\2\2\2\6@\3\2\2\2\bK\3\2\2\2\nR"+
		"\3\2\2\2\fV\3\2\2\2\16`\3\2\2\2\20g\3\2\2\2\22i\3\2\2\2\24\u0088\3\2\2"+
		"\2\26\u008a\3\2\2\2\30\u009b\3\2\2\2\32\u00a6\3\2\2\2\34\u00b4\3\2\2\2"+
		"\36\u00b6\3\2\2\2 \"\7\3\2\2!#\7#\2\2\"!\3\2\2\2\"#\3\2\2\2#\'\3\2\2\2"+
		"$&\5\4\3\2%$\3\2\2\2&)\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(*\3\2\2\2)\'\3\2"+
		"\2\2*+\7\4\2\2+,\5\b\5\2,-\5\22\n\2-.\7\5\2\2./\7\2\2\3/\3\3\2\2\2\60"+
		"\61\7\6\2\2\61\62\7#\2\2\62\63\7\7\2\2\639\5\6\4\2\64\65\7\b\2\2\65\66"+
		"\7\t\2\2\66\67\5\16\b\2\678\7#\2\28:\3\2\2\29\64\3\2\2\29:\3\2\2\2:;\3"+
		"\2\2\2;<\7\n\2\2<=\7\4\2\2=>\5\22\n\2>?\7\5\2\2?\5\3\2\2\2@A\5\16\b\2"+
		"AH\7#\2\2BC\7\b\2\2CD\5\16\b\2DE\7#\2\2EG\3\2\2\2FB\3\2\2\2GJ\3\2\2\2"+
		"HF\3\2\2\2HI\3\2\2\2I\7\3\2\2\2JH\3\2\2\2KO\5\n\6\2LN\5\b\5\2ML\3\2\2"+
		"\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2P\t\3\2\2\2QO\3\2\2\2RS\5\16\b\2ST\5\f"+
		"\7\2TU\7\13\2\2U\13\3\2\2\2V[\7#\2\2WX\7\b\2\2XZ\7#\2\2YW\3\2\2\2Z]\3"+
		"\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\\r\3\2\2\2][\3\2\2\2^a\7\f\2\2_a\7\r\2\2"+
		"`^\3\2\2\2`_\3\2\2\2a\17\3\2\2\2bh\5\24\13\2cd\7\7\2\2de\5\22\n\2ef\7"+
		"\n\2\2fh\3\2\2\2gb\3\2\2\2gc\3\2\2\2h\21\3\2\2\2in\5\24\13\2jk\7\13\2"+
		"\2km\5\22\n\2lj\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2o\23\3\2\2\2pn\3"+
		"\2\2\2q\u0089\7\16\2\2rs\7#\2\2st\7\17\2\2t\u0089\5\30\r\2uv\7\20\2\2"+
		"vw\5\34\17\2wx\7\21\2\2x{\5\20\t\2yz\7\22\2\2z|\5\20\t\2{y\3\2\2\2{|\3"+
		"\2\2\2|\u0089\3\2\2\2}~\7\23\2\2~\177\5\34\17\2\177\u0080\7\24\2\2\u0080"+
		"\u0081\5\20\t\2\u0081\u0089\3\2\2\2\u0082\u0083\7\25\2\2\u0083\u0084\7"+
		"#\2\2\u0084\u0085\7\7\2\2\u0085\u0086\5\26\f\2\u0086\u0087\7\n\2\2\u0087"+
		"\u0089\3\2\2\2\u0088q\3\2\2\2\u0088r\3\2\2\2\u0088u\3\2\2\2\u0088}\3\2"+
		"\2\2\u0088\u0082\3\2\2\2\u0089\25\3\2\2\2\u008a\u008f\5\30\r\2\u008b\u008c"+
		"\7\b\2\2\u008c\u008e\5\30\r\2\u008d\u008b\3\2\2\2\u008e\u0091\3\2\2\2"+
		"\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\27\3\2\2\2\u0091\u008f"+
		"\3\2\2\2\u0092\u0093\b\r\1\2\u0093\u009c\7#\2\2\u0094\u009c\7$\2\2\u0095"+
		"\u0096\7\26\2\2\u0096\u009c\5\30\r\4\u0097\u0098\7\7\2\2\u0098\u0099\5"+
		"\30\r\2\u0099\u009a\7\n\2\2\u009a\u009c\3\2\2\2\u009b\u0092\3\2\2\2\u009b"+
		"\u0094\3\2\2\2\u009b\u0095\3\2\2\2\u009b\u0097\3\2\2\2\u009c\u00a3\3\2"+
		"\2\2\u009d\u009e\f\5\2\2\u009e\u009f\5\32\16\2\u009f\u00a0\5\30\r\6\u00a0"+
		"\u00a2\3\2\2\2\u00a1\u009d\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2"+
		"\2\2\u00a3\u00a4\3\2\2\2\u00a4\31\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00a7"+
		"\t\2\2\2\u00a7\33\3\2\2\2\u00a8\u00b5\7\32\2\2\u00a9\u00b5\7\33\2\2\u00aa"+
		"\u00ab\5\30\r\2\u00ab\u00ac\5\36\20\2\u00ac\u00ad\5\30\r\2\u00ad\u00b5"+
		"\3\2\2\2\u00ae\u00af\7\34\2\2\u00af\u00b5\5\34\17\2\u00b0\u00b1\7\7\2"+
		"\2\u00b1\u00b2\5\34\17\2\u00b2\u00b3\7\n\2\2\u00b3\u00b5\3\2\2\2\u00b4"+
		"\u00a8\3\2\2\2\u00b4\u00a9\3\2\2\2\u00b4\u00aa\3\2\2\2\u00b4\u00ae\3\2"+
		"\2\2\u00b4\u00b0\3\2\2\2\u00b5\35\3\2\2\2\u00b6\u00b7\t\3\2\2\u00b7\37"+
		"\3\2\2\2\21\"\'9HO[`gn{\u0088\u008f\u009b\u00a3\u00b4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}