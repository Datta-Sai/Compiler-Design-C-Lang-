// Generated from rulesparser.g4 by ANTLR 4.10.1

	import ASTPack.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class rulesparserParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INCLUDE=1, DEFINE=2, IOSTREAM=3, STRING=4, VECTOR=5, ALGORITHM=6, FSTREAM=7, 
		CSTLIB=8, CTIME=9, CMATH=10, STDEXCEPT=11, IOMANIP=12, TUPLE=13, UNORDEREDMAP=14, 
		THREAD=15, REGEX=16, CHRONO=17, LIST=18, QUEUE=19, STACK=20, SET=21, MAP=22, 
		BITSET=23, ARRAY=24, FUNCTIONAL=25, MEMORY=26, ITERATOR=27, RANDOM=28, 
		CCTYPE=29, CSTDDEF=30, CSTDINT=31, CASSERT=32, ASM=33, AUTO=34, BOOL=35, 
		BREAK=36, CASE=37, CATCH=38, CHAR=39, CONST=40, COUT=41, CIN=42, CONSTEXPR=43, 
		CONTINUE=44, DECLTYPE=45, DEFAULT=46, DELETE=47, DO=48, DOUBLE=49, ELSE=50, 
		ENUM=51, EXPORT=52, EXTERN=53, FALSE=54, FLOAT=55, FOR=56, GOTO=57, IF=58, 
		INLINE=59, INT=60, LONG=61, NAMESPACE=62, NOEXCEPT=63, NULLPTR=64, REGISTER=65, 
		RETURN=66, SHORT=67, SIGNED=68, SIZEOF=69, STATIC=70, STATICASSERT=71, 
		STRUCT=72, SWITCH=73, TEMPLATE=74, THREADLOCAL=75, THROW=76, TRUE=77, 
		TRY=78, TYPEDEF=79, UNION=80, UNSIGNED=81, VOID=82, VOLATILE=83, WCHAR=84, 
		WHILE=85, CLASS=86, DYNAMICCAST=87, EXPLICIT=88, FRIEND=89, MUTABLE=90, 
		NEW=91, OPERATOR=92, PRIVATE=93, PROTECTED=94, PUBLIC=95, REINTERPRETCASE=96, 
		STATICCAST=97, THIS=98, TYPEID=99, TYPENAME=100, VIRTUAL=101, COLON=102, 
		SEMICOLON=103, COMMA=104, TERNARY=105, LBRACKET=106, RBRACKET=107, LCBRACKET=108, 
		RCBRACKET=109, LSQBRACKET=110, RSQBRACKET=111, DOT=112, ADD=113, SUB=114, 
		MUL=115, DIV=116, LNOT=117, BCOMP=118, MOD=119, LT=120, GT=121, BAND=122, 
		BOR=123, BXOR=124, ASSIGNMENT=125, ARROW=126, INCREMENT=127, DECREMENT=128, 
		LSHIFT=129, RSHIFT=130, LE=131, GE=132, LAND=133, LOR=134, EQ=135, NE=136, 
		ADDASSIGN=137, SUBASSIGN=138, MULASSIGN=139, DIVASSIGN=140, MODASSIGN=141, 
		BANDASSIGN=142, BORASSIGN=143, BXORASSIGN=144, LSHIFTASSIGN=145, RSHIFTASSIGN=146, 
		ID=147, ID1=148, INTEGER=149, FLOATING=150, HEX_LITERAL=151, OCTAL_LITERAL=152, 
		BINARY_LITERAL=153, SCOMMENT=154, MCOMMENT=155, CHAR_LITERAL=156, STRINGL=157, 
		WS=158;
	public static final int
		RULE_program = 0, RULE_declarationList = 1, RULE_declaration = 2, RULE_functionDeclaration = 3, 
		RULE_parameterList = 4, RULE_parameterTail = 5, RULE_parameter = 6, RULE_compoundStatement = 7, 
		RULE_statementList = 8, RULE_statement = 9, RULE_expressionStatement = 10, 
		RULE_expression = 11, RULE_assignmentExpression = 12, RULE_conditionalExpression = 13, 
		RULE_logicalOrExpression = 14, RULE_logicalAndExpression = 15, RULE_inclusiveOrExpression = 16, 
		RULE_exclusiveOrExpression = 17, RULE_andExpression = 18, RULE_equalityExpression = 19, 
		RULE_relationalExpression = 20, RULE_shiftExpression = 21, RULE_additiveExpression = 22, 
		RULE_multiplicativeExpression = 23, RULE_unaryExpression = 24, RULE_postfixExpression = 25, 
		RULE_primaryExpression = 26, RULE_functionCall = 27, RULE_argumentList = 28, 
		RULE_argumentTail = 29, RULE_selectionStatement = 30, RULE_iterationStatement = 31, 
		RULE_jumpStatement = 32, RULE_classDeclaration = 33, RULE_classMembers = 34, 
		RULE_classMember = 35, RULE_accessSpecifier = 36, RULE_memberDeclaration = 37, 
		RULE_functionDeclaration1 = 38, RULE_typeSpecifier = 39;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "declarationList", "declaration", "functionDeclaration", "parameterList", 
			"parameterTail", "parameter", "compoundStatement", "statementList", "statement", 
			"expressionStatement", "expression", "assignmentExpression", "conditionalExpression", 
			"logicalOrExpression", "logicalAndExpression", "inclusiveOrExpression", 
			"exclusiveOrExpression", "andExpression", "equalityExpression", "relationalExpression", 
			"shiftExpression", "additiveExpression", "multiplicativeExpression", 
			"unaryExpression", "postfixExpression", "primaryExpression", "functionCall", 
			"argumentList", "argumentTail", "selectionStatement", "iterationStatement", 
			"jumpStatement", "classDeclaration", "classMembers", "classMember", "accessSpecifier", 
			"memberDeclaration", "functionDeclaration1", "typeSpecifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'#include'", "'#define'", "'<iostream>'", "'<string>'", "'<vector>'", 
			"'<algorithm>'", "'<fstream>'", "'<cstdlib>'", "'<ctime>'", "'<cmath>'", 
			"'<stdexcept>'", "'<iomanip>'", "'<tuple>'", "'<unordered_map>'", "'<thread>'", 
			"'<regex>'", "'<chrono>'", "'<list>'", "'<queue>'", "'<stack>'", "'<set>'", 
			"'<map>'", "'<bitset>'", "'<array>'", "'<functional>'", "'<memory>'", 
			"'<iterator>'", "'<random>'", "'<cctype>'", "'<cstddef>'", "'<cstdint>'", 
			"'<cassert>'", "'asm'", "'auto'", "'bool'", "'break'", "'case'", "'catch'", 
			"'char'", "'const'", "'cout'", "'cin'", "'constexpr'", "'continue'", 
			"'decltype'", "'default'", "'delete'", "'do'", "'double'", "'else'", 
			"'enum'", "'export'", "'extern'", "'false'", "'float'", "'for'", "'goto'", 
			"'if'", "'inline'", "'int'", "'long'", "'namespace'", "'noexcept'", "'nullptr'", 
			"'register'", "'return'", "'short'", "'signed'", "'sizeof'", "'static'", 
			"'static_assert'", "'struct'", "'switch'", "'template'", "'thread_local'", 
			"'throw'", "'true'", "'try'", "'typedef'", "'union'", "'unsigned'", "'void'", 
			"'volatile'", "'wchar_t'", "'while'", "'class'", "'dynamic_cast'", "'explicit'", 
			"'friend'", "'mutable'", "'new'", "'operator'", "'private'", "'protected'", 
			"'public'", "'reinterpret_cast'", "'static_cast'", "'this'", "'typeid'", 
			"'typename'", "'virtual'", "':'", "';'", "','", "'?'", "'{'", "'}'", 
			"'('", "')'", "'['", "']'", "'.'", "'+'", "'-'", "'*'", "'/'", "'!'", 
			"'~'", "'%'", "'<'", "'>'", "'&'", "'|'", "'^'", "'='", "'->'", "'++'", 
			"'--'", "'<<'", "'>>'", "'<='", "'>='", "'&&'", "'||'", "'=='", "'!='", 
			"'+='", "'-='", "'*='", "'/='", "'%='", "'&='", "'|='", "'^='", "'<<='", 
			"'>>='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INCLUDE", "DEFINE", "IOSTREAM", "STRING", "VECTOR", "ALGORITHM", 
			"FSTREAM", "CSTLIB", "CTIME", "CMATH", "STDEXCEPT", "IOMANIP", "TUPLE", 
			"UNORDEREDMAP", "THREAD", "REGEX", "CHRONO", "LIST", "QUEUE", "STACK", 
			"SET", "MAP", "BITSET", "ARRAY", "FUNCTIONAL", "MEMORY", "ITERATOR", 
			"RANDOM", "CCTYPE", "CSTDDEF", "CSTDINT", "CASSERT", "ASM", "AUTO", "BOOL", 
			"BREAK", "CASE", "CATCH", "CHAR", "CONST", "COUT", "CIN", "CONSTEXPR", 
			"CONTINUE", "DECLTYPE", "DEFAULT", "DELETE", "DO", "DOUBLE", "ELSE", 
			"ENUM", "EXPORT", "EXTERN", "FALSE", "FLOAT", "FOR", "GOTO", "IF", "INLINE", 
			"INT", "LONG", "NAMESPACE", "NOEXCEPT", "NULLPTR", "REGISTER", "RETURN", 
			"SHORT", "SIGNED", "SIZEOF", "STATIC", "STATICASSERT", "STRUCT", "SWITCH", 
			"TEMPLATE", "THREADLOCAL", "THROW", "TRUE", "TRY", "TYPEDEF", "UNION", 
			"UNSIGNED", "VOID", "VOLATILE", "WCHAR", "WHILE", "CLASS", "DYNAMICCAST", 
			"EXPLICIT", "FRIEND", "MUTABLE", "NEW", "OPERATOR", "PRIVATE", "PROTECTED", 
			"PUBLIC", "REINTERPRETCASE", "STATICCAST", "THIS", "TYPEID", "TYPENAME", 
			"VIRTUAL", "COLON", "SEMICOLON", "COMMA", "TERNARY", "LBRACKET", "RBRACKET", 
			"LCBRACKET", "RCBRACKET", "LSQBRACKET", "RSQBRACKET", "DOT", "ADD", "SUB", 
			"MUL", "DIV", "LNOT", "BCOMP", "MOD", "LT", "GT", "BAND", "BOR", "BXOR", 
			"ASSIGNMENT", "ARROW", "INCREMENT", "DECREMENT", "LSHIFT", "RSHIFT", 
			"LE", "GE", "LAND", "LOR", "EQ", "NE", "ADDASSIGN", "SUBASSIGN", "MULASSIGN", 
			"DIVASSIGN", "MODASSIGN", "BANDASSIGN", "BORASSIGN", "BXORASSIGN", "LSHIFTASSIGN", 
			"RSHIFTASSIGN", "ID", "ID1", "INTEGER", "FLOATING", "HEX_LITERAL", "OCTAL_LITERAL", 
			"BINARY_LITERAL", "SCOMMENT", "MCOMMENT", "CHAR_LITERAL", "STRINGL", 
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
	public String getGrammarFileName() { return "rulesparser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	Hashtable<String, String> hashTable = new Hashtable<String, String>();

	public void printHT()
	{
		System.out.println("\nHashTable: ");
		Enumeration names;
		String key;
		names = hashTable.keys();
		while(names.hasMoreElements()) {
			key = (String) names.nextElement();
			System.out.println("Key: " +key+ " & Value: " + hashTable.get(key));
		}
	}

	public rulesparserParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public ASTNode node;
		public DeclarationListContext t1;
		public DeclarationListContext declarationList() {
			return getRuleContext(DeclarationListContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesparserListener ) ((rulesparserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesparserListener ) ((rulesparserListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			((ProgramContext)_localctx).t1 = declarationList();
			((ProgramContext)_localctx).node = ((ProgramContext)_localctx).t1.node;_localctx.node.print(); printHT();
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

	public static class DeclarationListContext extends ParserRuleContext {
		public ASTNode node;
		public DeclarationContext t1;
		public DeclarationListContext t2;
		public DeclarationContext t3;
		public ClassDeclarationContext t5;
		public DeclarationListContext t6;
		public ClassDeclarationContext t4;
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public DeclarationListContext declarationList() {
			return getRuleContext(DeclarationListContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public DeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesparserListener ) ((rulesparserListener)listener).enterDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesparserListener ) ((rulesparserListener)listener).exitDeclarationList(this);
		}
	}

	public final DeclarationListContext declarationList() throws RecognitionException {
		DeclarationListContext _localctx = new DeclarationListContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declarationList);
		try {
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				((DeclarationListContext)_localctx).t1 = declaration();
				setState(84);
				((DeclarationListContext)_localctx).t2 = declarationList();
				((DeclarationListContext)_localctx).node = new Declaration(((DeclarationListContext)_localctx).t1.node, ((DeclarationListContext)_localctx).t2.node);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				((DeclarationListContext)_localctx).t3 = declaration();
				((DeclarationListContext)_localctx).node = new Declaration1(((DeclarationListContext)_localctx).t3.node);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(90);
				((DeclarationListContext)_localctx).t5 = classDeclaration();
				setState(91);
				((DeclarationListContext)_localctx).t6 = declarationList();
				((DeclarationListContext)_localctx).node = new Declaration(((DeclarationListContext)_localctx).t5.node, ((DeclarationListContext)_localctx).t6.node);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(94);
				((DeclarationListContext)_localctx).t4 = classDeclaration();
				((DeclarationListContext)_localctx).node =  new Declaration1(((DeclarationListContext)_localctx).t4.node);
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

	public static class DeclarationContext extends ParserRuleContext {
		public ASTNode node;
		public TypeSpecifierContext t1;
		public Token ID;
		public TypeSpecifierContext t2;
		public Token ID1;
		public FunctionDeclarationContext t3;
		public TerminalNode ID() { return getToken(rulesparserParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(rulesparserParser.SEMICOLON, 0); }
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public TerminalNode ID1() { return getToken(rulesparserParser.ID1, 0); }
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesparserListener ) ((rulesparserListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesparserListener ) ((rulesparserListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		try {
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				((DeclarationContext)_localctx).t1 = typeSpecifier();
				setState(100);
				((DeclarationContext)_localctx).ID = match(ID);
				setState(101);
				match(SEMICOLON);
				((DeclarationContext)_localctx).node = new SingleDeclaration(((DeclarationContext)_localctx).t1.val, (((DeclarationContext)_localctx).ID!=null?((DeclarationContext)_localctx).ID.getText():null));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				((DeclarationContext)_localctx).t2 = typeSpecifier();
				setState(105);
				((DeclarationContext)_localctx).ID1 = match(ID1);
				setState(106);
				match(SEMICOLON);
				((DeclarationContext)_localctx).node = new ArrayDeclaration(((DeclarationContext)_localctx).t2.val, (((DeclarationContext)_localctx).ID1!=null?((DeclarationContext)_localctx).ID1.getText():null));
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(109);
				((DeclarationContext)_localctx).t3 = functionDeclaration();
				((DeclarationContext)_localctx).node =  new FunctionDeclaration(((DeclarationContext)_localctx).t3.node);
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

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public ASTNode node;
		public String funtype;
		public TypeSpecifierContext t4;
		public Token ID;
		public CompoundStatementContext t5;
		public TypeSpecifierContext t1;
		public ParameterListContext t2;
		public CompoundStatementContext t3;
		public TerminalNode ID() { return getToken(rulesparserParser.ID, 0); }
		public TerminalNode LCBRACKET() { return getToken(rulesparserParser.LCBRACKET, 0); }
		public TerminalNode RCBRACKET() { return getToken(rulesparserParser.RCBRACKET, 0); }
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesparserListener ) ((rulesparserListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesparserListener ) ((rulesparserListener)listener).exitFunctionDeclaration(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_functionDeclaration);
		try {
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				((FunctionDeclarationContext)_localctx).t4 = typeSpecifier();
				setState(115);
				((FunctionDeclarationContext)_localctx).ID = match(ID);
				setState(116);
				match(LCBRACKET);
				setState(117);
				match(RCBRACKET);
				setState(118);
				((FunctionDeclarationContext)_localctx).t5 = compoundStatement();
				((FunctionDeclarationContext)_localctx).node = new FuncDecnoParam(((FunctionDeclarationContext)_localctx).t4.val, (((FunctionDeclarationContext)_localctx).ID!=null?((FunctionDeclarationContext)_localctx).ID.getText():null), ((FunctionDeclarationContext)_localctx).t5.node);{((FunctionDeclarationContext)_localctx).funtype =  "Function";};if(((FunctionDeclarationContext)_localctx).t4.val == 1) {hashTable.put("Integer", _localctx.funtype);}else if(((FunctionDeclarationContext)_localctx).t4.val ==2) {hashTable.put("Float", _localctx.funtype);}else if(((FunctionDeclarationContext)_localctx).t4.val ==3) {hashTable.put("Double", _localctx.funtype);}else if(((FunctionDeclarationContext)_localctx).t4.val ==4) {hashTable.put("char", _localctx.funtype);}else if(((FunctionDeclarationContext)_localctx).t4.val ==5) {hashTable.put("Bool", _localctx.funtype);} else if(((FunctionDeclarationContext)_localctx).t4.val ==6) {hashTable.put("String", _localctx.funtype);} else if(((FunctionDeclarationContext)_localctx).t4.val ==7) {hashTable.put("Void", _localctx.funtype);};
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				((FunctionDeclarationContext)_localctx).t1 = typeSpecifier();
				setState(122);
				((FunctionDeclarationContext)_localctx).ID = match(ID);
				setState(123);
				match(LCBRACKET);
				setState(124);
				((FunctionDeclarationContext)_localctx).t2 = parameterList();
				setState(125);
				match(RCBRACKET);
				setState(126);
				((FunctionDeclarationContext)_localctx).t3 = compoundStatement();
				((FunctionDeclarationContext)_localctx).node = new FunctionDecExp(((FunctionDeclarationContext)_localctx).t1.val, (((FunctionDeclarationContext)_localctx).ID!=null?((FunctionDeclarationContext)_localctx).ID.getText():null), ((FunctionDeclarationContext)_localctx).t2.node, ((FunctionDeclarationContext)_localctx).t3.node);
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

	public static class ParameterListContext extends ParserRuleContext {
		public ASTNode node;
		public ParameterContext t1;
		public ParameterTailContext t2;
		public ParameterContext t3;
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public ParameterTailContext parameterTail() {
			return getRuleContext(ParameterTailContext.class,0);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesparserListener ) ((rulesparserListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesparserListener ) ((rulesparserListener)listener).exitParameterList(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_parameterList);
		try {
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				((ParameterListContext)_localctx).t1 = parameter();
				setState(132);
				((ParameterListContext)_localctx).t2 = parameterTail();
				((ParameterListContext)_localctx).node = new Parameterlist(((ParameterListContext)_localctx).t1.node, ((ParameterListContext)_localctx).t2.node);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				((ParameterListContext)_localctx).t3 = parameter();
				((ParameterListContext)_localctx).node = new SingleParameter(((ParameterListContext)_localctx).t3.node);
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

	public static class ParameterTailContext extends ParserRuleContext {
		public ASTNode node;
		public ParameterContext t1;
		public ParameterTailContext t2;
		public ParameterContext t3;
		public TerminalNode COMMA() { return getToken(rulesparserParser.COMMA, 0); }
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public ParameterTailContext parameterTail() {
			return getRuleContext(ParameterTailContext.class,0);
		}
		public ParameterTailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterTail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesparserListener ) ((rulesparserListener)listener).enterParameterTail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesparserListener ) ((rulesparserListener)listener).exitParameterTail(this);
		}
	}

	public final ParameterTailContext parameterTail() throws RecognitionException {
		ParameterTailContext _localctx = new ParameterTailContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parameterTail);
		try {
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				match(COMMA);
				setState(141);
				((ParameterTailContext)_localctx).t1 = parameter();
				setState(142);
				((ParameterTailContext)_localctx).t2 = parameterTail();
				((ParameterTailContext)_localctx).node = new ParameterTail(((ParameterTailContext)_localctx).t1.node, ((ParameterTailContext)_localctx).t2.node);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				match(COMMA);
				setState(146);
				((ParameterTailContext)_localctx).t3 = parameter();
				((ParameterTailContext)_localctx).node = new SingleParametertail(((ParameterTailContext)_localctx).t3.node);
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

	public static class ParameterContext extends ParserRuleContext {
		public ASTNode node;
		public TypeSpecifierContext t1;
		public Token ID;
		public TypeSpecifierContext t2;
		public StatementContext t3;
		public TypeSpecifierContext t4;
		public TerminalNode ID() { return getToken(rulesparserParser.ID, 0); }
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public TerminalNode LSQBRACKET() { return getToken(rulesparserParser.LSQBRACKET, 0); }
		public TerminalNode RSQBRACKET() { return getToken(rulesparserParser.RSQBRACKET, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesparserListener ) ((rulesparserListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesparserListener ) ((rulesparserListener)listener).exitParameter(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parameter);
		try {
			setState(167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				((ParameterContext)_localctx).t1 = typeSpecifier();
				setState(152);
				((ParameterContext)_localctx).ID = match(ID);
				((ParameterContext)_localctx).node = new Parameterexp(((ParameterContext)_localctx).t1.val, (((ParameterContext)_localctx).ID!=null?((ParameterContext)_localctx).ID.getText():null));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				((ParameterContext)_localctx).t2 = typeSpecifier();
				setState(156);
				((ParameterContext)_localctx).ID = match(ID);
				setState(157);
				match(LSQBRACKET);
				setState(158);
				match(RSQBRACKET);
				((ParameterContext)_localctx).node = new ArrayParameterExp(((ParameterContext)_localctx).t2.val, (((ParameterContext)_localctx).ID!=null?((ParameterContext)_localctx).ID.getText():null));
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(161);
				((ParameterContext)_localctx).t3 = statement();
				((ParameterContext)_localctx).node = new ExpStatement(((ParameterContext)_localctx).t3.node);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(164);
				((ParameterContext)_localctx).t4 = typeSpecifier();
				((ParameterContext)_localctx).node = new TypeSpecifier(((ParameterContext)_localctx).t4.val);
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

	public static class CompoundStatementContext extends ParserRuleContext {
		public ASTNode node;
		public StatementListContext t1;
		public TerminalNode LBRACKET() { return getToken(rulesparserParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(rulesparserParser.RBRACKET, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(rulesparserParser.SEMICOLON, 0); }
		public CompoundStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesparserListener ) ((rulesparserListener)listener).enterCompoundStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesparserListener ) ((rulesparserListener)listener).exitCompoundStatement(this);
		}
	}

	public final CompoundStatementContext compoundStatement() throws RecognitionException {
		CompoundStatementContext _localctx = new CompoundStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_compoundStatement);
		try {
			setState(179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				match(LBRACKET);
				setState(170);
				((CompoundStatementContext)_localctx).t1 = statementList();
				setState(171);
				match(RBRACKET);
				((CompoundStatementContext)_localctx).node = new CompoundStmt(((CompoundStatementContext)_localctx).t1.node);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				match(LBRACKET);
				setState(175);
				match(RBRACKET);
				((CompoundStatementContext)_localctx).node = new CodeSection();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(177);
				match(SEMICOLON);
				((CompoundStatementContext)_localctx).node = new Semicolon();
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

	public static class StatementListContext extends ParserRuleContext {
		public ASTNode node;
		public StatementContext t1;
		public StatementListContext t2;
		public StatementContext t3;
		public DeclarationContext t4;
		public StatementListContext t5;
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public StatementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesparserListener ) ((rulesparserListener)listener).enterStatementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesparserListener ) ((rulesparserListener)listener).exitStatementList(this);
		}
	}

	public final StatementListContext statementList() throws RecognitionException {
		StatementListContext _localctx = new StatementListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statementList);
		try {
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				((StatementListContext)_localctx).t1 = statement();
				setState(182);
				((StatementListContext)_localctx).t2 = statementList();
				((StatementListContext)_localctx).node = new Statementlist(((StatementListContext)_localctx).t1.node, ((StatementListContext)_localctx).t2.node);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				((StatementListContext)_localctx).t3 = statement();
				((StatementListContext)_localctx).node = new ExpStatement(((StatementListContext)_localctx).t3.node);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(188);
				((StatementListContext)_localctx).t4 = declaration();
				setState(189);
				((StatementListContext)_localctx).t5 = statementList();
				((StatementListContext)_localctx).node = new DecwithStmt(((StatementListContext)_localctx).t4.node, ((StatementListContext)_localctx).t5.node);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				((StatementListContext)_localctx).node = new NullStmt();
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

	public static class StatementContext extends ParserRuleContext {
		public ASTNode node;
		public ExpressionStatementContext t1;
		public CompoundStatementContext t2;
		public SelectionStatementContext t3;
		public IterationStatementContext t4;
		public JumpStatementContext t5;
		public Token STRINGL;
		public Token ID;
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public SelectionStatementContext selectionStatement() {
			return getRuleContext(SelectionStatementContext.class,0);
		}
		public IterationStatementContext iterationStatement() {
			return getRuleContext(IterationStatementContext.class,0);
		}
		public JumpStatementContext jumpStatement() {
			return getRuleContext(JumpStatementContext.class,0);
		}
		public TerminalNode COUT() { return getToken(rulesparserParser.COUT, 0); }
		public TerminalNode LSHIFT() { return getToken(rulesparserParser.LSHIFT, 0); }
		public TerminalNode STRINGL() { return getToken(rulesparserParser.STRINGL, 0); }
		public TerminalNode SEMICOLON() { return getToken(rulesparserParser.SEMICOLON, 0); }
		public TerminalNode CIN() { return getToken(rulesparserParser.CIN, 0); }
		public TerminalNode RSHIFT() { return getToken(rulesparserParser.RSHIFT, 0); }
		public TerminalNode ID() { return getToken(rulesparserParser.ID, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesparserListener ) ((rulesparserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesparserListener ) ((rulesparserListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_statement);
		try {
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				((StatementContext)_localctx).t1 = expressionStatement();
				((StatementContext)_localctx).node = new ExpStatement(((StatementContext)_localctx).t1.node);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				((StatementContext)_localctx).t2 = compoundStatement();
				((StatementContext)_localctx).node = new CompoundStmt1(((StatementContext)_localctx).t2.node);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(201);
				((StatementContext)_localctx).t3 = selectionStatement();
				((StatementContext)_localctx).node = new SelectionStmt(((StatementContext)_localctx).t3.node);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(204);
				((StatementContext)_localctx).t4 = iterationStatement();
				((StatementContext)_localctx).node = new IterationStmt(((StatementContext)_localctx).t4.node);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(207);
				((StatementContext)_localctx).t5 = jumpStatement();
				((StatementContext)_localctx).node = new JumpStmt(((StatementContext)_localctx).t5.node);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(210);
				match(COUT);
				setState(211);
				match(LSHIFT);
				setState(212);
				((StatementContext)_localctx).STRINGL = match(STRINGL);
				setState(213);
				match(SEMICOLON);
				((StatementContext)_localctx).node = new OutputStmt((((StatementContext)_localctx).STRINGL!=null?((StatementContext)_localctx).STRINGL.getText():null));
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(215);
				match(CIN);
				setState(216);
				match(RSHIFT);
				setState(217);
				((StatementContext)_localctx).ID = match(ID);
				setState(218);
				match(SEMICOLON);
				((StatementContext)_localctx).node = new InputStmt((((StatementContext)_localctx).ID!=null?((StatementContext)_localctx).ID.getText():null));
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

	public static class ExpressionStatementContext extends ParserRuleContext {
		public ASTNode node;
		public ExpressionContext t1;
		public ExpressionContext t2;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(rulesparserParser.SEMICOLON, 0); }
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesparserListener ) ((rulesparserListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesparserListener ) ((rulesparserListener)listener).exitExpressionStatement(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expressionStatement);
		try {
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				((ExpressionStatementContext)_localctx).t1 = expression(0);
				((ExpressionStatementContext)_localctx).node = new ExpStatement(((ExpressionStatementContext)_localctx).t1.node);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(225);
				((ExpressionStatementContext)_localctx).t2 = expression(0);
				setState(226);
				match(SEMICOLON);
				((ExpressionStatementContext)_localctx).node = new ExpStatement1(((ExpressionStatementContext)_localctx).t2.node);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(229);
				match(SEMICOLON);
				((ExpressionStatementContext)_localctx).node = new Semicolon();
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

	public static class ExpressionContext extends ParserRuleContext {
		public ASTNode node;
		public ExpressionContext t2;
		public AssignmentExpressionContext t1;
		public AssignmentExpressionContext t3;
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(rulesparserParser.COMMA, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesparserListener ) ((rulesparserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesparserListener ) ((rulesparserListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(234);
			((ExpressionContext)_localctx).t1 = assignmentExpression();
			((ExpressionContext)_localctx).node = new AssignExp(((ExpressionContext)_localctx).t1.node);
			}
			_ctx.stop = _input.LT(-1);
			setState(244);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					_localctx.t2 = _prevctx;
					_localctx.t2 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(237);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(238);
					match(COMMA);
					setState(239);
					((ExpressionContext)_localctx).t3 = assignmentExpression();
					((ExpressionContext)_localctx).node = new ExpAndAssignExp(((ExpressionContext)_localctx).t2.node, ((ExpressionContext)_localctx).t3.node);
					}
					} 
				}
				setState(246);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class AssignmentExpressionContext extends ParserRuleContext {
		public ASTNode node;
		public String funtype;
		public ConditionalExpressionContext t1;
		public UnaryExpressionContext t2;
		public AssignmentExpressionContext t3;
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public TerminalNode ASSIGNMENT() { return getToken(rulesparserParser.ASSIGNMENT, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesparserListener ) ((rulesparserListener)listener).enterAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesparserListener ) ((rulesparserListener)listener).exitAssignmentExpression(this);
		}
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assignmentExpression);
		try {
			setState(255);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				((AssignmentExpressionContext)_localctx).t1 = conditionalExpression();
				((AssignmentExpressionContext)_localctx).node = new ConditionalExp(((AssignmentExpressionContext)_localctx).t1.node);((AssignmentExpressionContext)_localctx).funtype =  ((AssignmentExpressionContext)_localctx).t1.funtype;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
				((AssignmentExpressionContext)_localctx).t2 = unaryExpression();
				setState(251);
				match(ASSIGNMENT);
				setState(252);
				((AssignmentExpressionContext)_localctx).t3 = assignmentExpression();
				((AssignmentExpressionContext)_localctx).node = new UnaryAndAssignExp(((AssignmentExpressionContext)_localctx).t2.node, ((AssignmentExpressionContext)_localctx).t3.node); if(((AssignmentExpressionContext)_localctx).t3.funtype != null) {hashTable.put(((AssignmentExpressionContext)_localctx).t2.funtype, ((AssignmentExpressionContext)_localctx).t3.funtype);};
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

	public static class ConditionalExpressionContext extends ParserRuleContext {
		public ASTNode node;
		public String funtype;
		public LogicalOrExpressionContext t1;
		public LogicalOrExpressionContext t2;
		public ExpressionContext t3;
		public ConditionalExpressionContext t4;
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public List<TerminalNode> TERNARY() { return getTokens(rulesparserParser.TERNARY); }
		public TerminalNode TERNARY(int i) {
			return getToken(rulesparserParser.TERNARY, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesparserListener ) ((rulesparserListener)listener).enterConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesparserListener ) ((rulesparserListener)listener).exitConditionalExpression(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_conditionalExpression);
		try {
			setState(267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(257);
				((ConditionalExpressionContext)_localctx).t1 = logicalOrExpression(0);
				((ConditionalExpressionContext)_localctx).node = new LogicalOrExp(((ConditionalExpressionContext)_localctx).t1.node);((ConditionalExpressionContext)_localctx).funtype =  ((ConditionalExpressionContext)_localctx).t1.funtype;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(260);
				((ConditionalExpressionContext)_localctx).t2 = logicalOrExpression(0);
				setState(261);
				match(TERNARY);
				setState(262);
				((ConditionalExpressionContext)_localctx).t3 = expression(0);
				setState(263);
				match(TERNARY);
				setState(264);
				((ConditionalExpressionContext)_localctx).t4 = conditionalExpression();
				((ConditionalExpressionContext)_localctx).node = new TernaryExp(((ConditionalExpressionContext)_localctx).t2.node, ((ConditionalExpressionContext)_localctx).t3.node, ((ConditionalExpressionContext)_localctx).t4.node);
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

	public static class LogicalOrExpressionContext extends ParserRuleContext {
		public ASTNode node;
		public String funtype;
		public LogicalOrExpressionContext t2;
		public LogicalAndExpressionContext t1;
		public LogicalAndExpressionContext t3;
		public LogicalAndExpressionContext logicalAndExpression() {
			return getRuleContext(LogicalAndExpressionContext.class,0);
		}
		public TerminalNode LOR() { return getToken(rulesparserParser.LOR, 0); }
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public LogicalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesparserListener ) ((rulesparserListener)listener).enterLogicalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesparserListener ) ((rulesparserListener)listener).exitLogicalOrExpression(this);
		}
	}

	public final LogicalOrExpressionContext logicalOrExpression() throws RecognitionException {
		return logicalOrExpression(0);
	}

	private LogicalOrExpressionContext logicalOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalOrExpressionContext _localctx = new LogicalOrExpressionContext(_ctx, _parentState);
		LogicalOrExpressionContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_logicalOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(270);
			((LogicalOrExpressionContext)_localctx).t1 = logicalAndExpression(0);
			((LogicalOrExpressionContext)_localctx).node = new LogicalAndExp(((LogicalOrExpressionContext)_localctx).t1.node);((LogicalOrExpressionContext)_localctx).funtype =  ((LogicalOrExpressionContext)_localctx).t1.funtype;
			}
			_ctx.stop = _input.LT(-1);
			setState(280);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicalOrExpressionContext(_parentctx, _parentState);
					_localctx.t2 = _prevctx;
					_localctx.t2 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_logicalOrExpression);
					setState(273);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(274);
					match(LOR);
					setState(275);
					((LogicalOrExpressionContext)_localctx).t3 = logicalAndExpression(0);
					((LogicalOrExpressionContext)_localctx).node = new LogicalOr_AndExp(((LogicalOrExpressionContext)_localctx).t2.node, ((LogicalOrExpressionContext)_localctx).t3.node);
					}
					} 
				}
				setState(282);
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

	public static class LogicalAndExpressionContext extends ParserRuleContext {
		public ASTNode node;
		public String funtype;
		public LogicalAndExpressionContext t2;
		public InclusiveOrExpressionContext t1;
		public InclusiveOrExpressionContext t3;
		public InclusiveOrExpressionContext inclusiveOrExpression() {
			return getRuleContext(InclusiveOrExpressionContext.class,0);
		}
		public TerminalNode LAND() { return getToken(rulesparserParser.LAND, 0); }
		public LogicalAndExpressionContext logicalAndExpression() {
			return getRuleContext(LogicalAndExpressionContext.class,0);
		}
		public LogicalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalAndExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesparserListener ) ((rulesparserListener)listener).enterLogicalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesparserListener ) ((rulesparserListener)listener).exitLogicalAndExpression(this);
		}
	}

	public final LogicalAndExpressionContext logicalAndExpression() throws RecognitionException {
		return logicalAndExpression(0);
	}

	private LogicalAndExpressionContext logicalAndExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalAndExpressionContext _localctx = new LogicalAndExpressionContext(_ctx, _parentState);
		LogicalAndExpressionContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_logicalAndExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(284);
			((LogicalAndExpressionContext)_localctx).t1 = inclusiveOrExpression(0);
			((LogicalAndExpressionContext)_localctx).node = new InclusiveOrExp(((LogicalAndExpressionContext)_localctx).t1.node);((LogicalAndExpressionContext)_localctx).funtype =  ((LogicalAndExpressionContext)_localctx).t1.funtype;
			}
			_ctx.stop = _input.LT(-1);
			setState(294);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicalAndExpressionContext(_parentctx, _parentState);
					_localctx.t2 = _prevctx;
					_localctx.t2 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_logicalAndExpression);
					setState(287);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(288);
					match(LAND);
					setState(289);
					((LogicalAndExpressionContext)_localctx).t3 = inclusiveOrExpression(0);
					((LogicalAndExpressionContext)_localctx).node = new LogicalAnd_inclusiveOrExp(((LogicalAndExpressionContext)_localctx).t2.node, ((LogicalAndExpressionContext)_localctx).t3.node);
					}
					} 
				}
				setState(296);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public static class InclusiveOrExpressionContext extends ParserRuleContext {
		public ASTNode node;
		public String funtype;
		public InclusiveOrExpressionContext t2;
		public ExclusiveOrExpressionContext t1;
		public ExclusiveOrExpressionContext t3;
		public ExclusiveOrExpressionContext exclusiveOrExpression() {
			return getRuleContext(ExclusiveOrExpressionContext.class,0);
		}
		public TerminalNode BOR() { return getToken(rulesparserParser.BOR, 0); }
		public InclusiveOrExpressionContext inclusiveOrExpression() {
			return getRuleContext(InclusiveOrExpressionContext.class,0);
		}
		public InclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesparserListener ) ((rulesparserListener)listener).enterInclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesparserListener ) ((rulesparserListener)listener).exitInclusiveOrExpression(this);
		}
	}

	public final InclusiveOrExpressionContext inclusiveOrExpression() throws RecognitionException {
		return inclusiveOrExpression(0);
	}

	private InclusiveOrExpressionContext inclusiveOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InclusiveOrExpressionContext _localctx = new InclusiveOrExpressionContext(_ctx, _parentState);
		InclusiveOrExpressionContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_inclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(298);
			((InclusiveOrExpressionContext)_localctx).t1 = exclusiveOrExpression(0);
			((InclusiveOrExpressionContext)_localctx).node = new ExclusiveOrExp(((InclusiveOrExpressionContext)_localctx).t1.node);((InclusiveOrExpressionContext)_localctx).funtype =  ((InclusiveOrExpressionContext)_localctx).t1.funtype;
			}
			_ctx.stop = _input.LT(-1);
			setState(308);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InclusiveOrExpressionContext(_parentctx, _parentState);
					_localctx.t2 = _prevctx;
					_localctx.t2 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_inclusiveOrExpression);
					setState(301);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(302);
					match(BOR);
					setState(303);
					((InclusiveOrExpressionContext)_localctx).t3 = exclusiveOrExpression(0);
					((InclusiveOrExpressionContext)_localctx).node = new InclusiveOr_ExclusiveOrExp(((InclusiveOrExpressionContext)_localctx).t2.node, ((InclusiveOrExpressionContext)_localctx).t3.node);String lType;String rType;if(((InclusiveOrExpressionContext)_localctx).t2.funtype==null){lType="null";}else{lType=hashTable.get(((InclusiveOrExpressionContext)_localctx).t2.funtype);}if(((InclusiveOrExpressionContext)_localctx).t3.funtype==null){rType="null";}else{rType=hashTable.get(((InclusiveOrExpressionContext)_localctx).t3.funtype);}printHT();if(lType == null){System.out.println("left Variable "  + " not declared");}if(rType == null){System.out.println("right Variable " + " not declared");}if(lType == rType){((InclusiveOrExpressionContext)_localctx).funtype =  lType;System.out.println("Type matched");}else{System.out.println("Type mismatch between " + lType + " and " + rType);};
					}
					} 
				}
				setState(310);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public static class ExclusiveOrExpressionContext extends ParserRuleContext {
		public ASTNode node;
		public String funtype;
		public ExclusiveOrExpressionContext t2;
		public AndExpressionContext t1;
		public AndExpressionContext t3;
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public TerminalNode BXOR() { return getToken(rulesparserParser.BXOR, 0); }
		public ExclusiveOrExpressionContext exclusiveOrExpression() {
			return getRuleContext(ExclusiveOrExpressionContext.class,0);
		}
		public ExclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesparserListener ) ((rulesparserListener)listener).enterExclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesparserListener ) ((rulesparserListener)listener).exitExclusiveOrExpression(this);
		}
	}

	public final ExclusiveOrExpressionContext exclusiveOrExpression() throws RecognitionException {
		return exclusiveOrExpression(0);
	}

	private ExclusiveOrExpressionContext exclusiveOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExclusiveOrExpressionContext _localctx = new ExclusiveOrExpressionContext(_ctx, _parentState);
		ExclusiveOrExpressionContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_exclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(312);
			((ExclusiveOrExpressionContext)_localctx).t1 = andExpression(0);
			((ExclusiveOrExpressionContext)_localctx).node = new AndExp(((ExclusiveOrExpressionContext)_localctx).t1.node);((ExclusiveOrExpressionContext)_localctx).funtype =  ((ExclusiveOrExpressionContext)_localctx).t1.funtype;
			}
			_ctx.stop = _input.LT(-1);
			setState(322);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExclusiveOrExpressionContext(_parentctx, _parentState);
					_localctx.t2 = _prevctx;
					_localctx.t2 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_exclusiveOrExpression);
					setState(315);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(316);
					match(BXOR);
					setState(317);
					((ExclusiveOrExpressionContext)_localctx).t3 = andExpression(0);
					((ExclusiveOrExpressionContext)_localctx).node = new ExclusiveOr_AndExp(((ExclusiveOrExpressionContext)_localctx).t2.node, ((ExclusiveOrExpressionContext)_localctx).t3.node);String lType;String rType;if(((ExclusiveOrExpressionContext)_localctx).t2.funtype==null){lType="null";}else{lType=hashTable.get(((ExclusiveOrExpressionContext)_localctx).t2.funtype);}if(((ExclusiveOrExpressionContext)_localctx).t3.funtype==null){rType="null";}else{rType=hashTable.get(((ExclusiveOrExpressionContext)_localctx).t3.funtype);}printHT();if(lType == null){System.out.println("left Variable "  + " not declared");}if(rType == null){System.out.println("right Variable " + " not declared");}if(lType == rType){((ExclusiveOrExpressionContext)_localctx).funtype =  lType;System.out.println("Type matched");}else{System.out.println("Type mismatch between " + lType + " and " + rType);};
					}
					} 
				}
				setState(324);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	public static class AndExpressionContext extends ParserRuleContext {
		public ASTNode node;
		public String funtype;
		public AndExpressionContext t2;
		public EqualityExpressionContext t1;
		public EqualityExpressionContext t3;
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public TerminalNode BAND() { return getToken(rulesparserParser.BAND, 0); }
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesparserListener ) ((rulesparserListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesparserListener ) ((rulesparserListener)listener).exitAndExpression(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		return andExpression(0);
	}

	private AndExpressionContext andExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, _parentState);
		AndExpressionContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_andExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(326);
			((AndExpressionContext)_localctx).t1 = equalityExpression(0);
			((AndExpressionContext)_localctx).node = new EqualityExp(((AndExpressionContext)_localctx).t1.node);((AndExpressionContext)_localctx).funtype =  ((AndExpressionContext)_localctx).t1.funtype;
			}
			_ctx.stop = _input.LT(-1);
			setState(336);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndExpressionContext(_parentctx, _parentState);
					_localctx.t2 = _prevctx;
					_localctx.t2 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_andExpression);
					setState(329);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(330);
					match(BAND);
					setState(331);
					((AndExpressionContext)_localctx).t3 = equalityExpression(0);
					((AndExpressionContext)_localctx).node = new And_EqualityExp(((AndExpressionContext)_localctx).t2.node, ((AndExpressionContext)_localctx).t3.node);String lType;String rType;if(((AndExpressionContext)_localctx).t2.funtype==null){lType="null";}else{lType=hashTable.get(((AndExpressionContext)_localctx).t2.funtype);}if(((AndExpressionContext)_localctx).t3.funtype==null){rType="null";}else{rType=hashTable.get(((AndExpressionContext)_localctx).t3.funtype);}printHT();if(lType == null){System.out.println("left Variable "  + " not declared");}if(rType == null){System.out.println("right Variable " + " not declared");}if(lType == rType){((AndExpressionContext)_localctx).funtype =  lType;System.out.println("Type matched");}else{System.out.println("Type mismatch between " + lType + " and " + rType);};
					}
					} 
				}
				setState(338);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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

	public static class EqualityExpressionContext extends ParserRuleContext {
		public ASTNode node;
		public String funtype;
		public EqualityExpressionContext t2;
		public EqualityExpressionContext t4;
		public RelationalExpressionContext t1;
		public RelationalExpressionContext t3;
		public RelationalExpressionContext t5;
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public TerminalNode EQ() { return getToken(rulesparserParser.EQ, 0); }
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public TerminalNode NE() { return getToken(rulesparserParser.NE, 0); }
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesparserListener ) ((rulesparserListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesparserListener ) ((rulesparserListener)listener).exitEqualityExpression(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		return equalityExpression(0);
	}

	private EqualityExpressionContext equalityExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, _parentState);
		EqualityExpressionContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_equalityExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(340);
			((EqualityExpressionContext)_localctx).t1 = relationalExpression(0);
			((EqualityExpressionContext)_localctx).node = new RelationalExp(((EqualityExpressionContext)_localctx).t1.node);((EqualityExpressionContext)_localctx).funtype =  ((EqualityExpressionContext)_localctx).t1.funtype;
			}
			_ctx.stop = _input.LT(-1);
			setState(355);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(353);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState);
						_localctx.t2 = _prevctx;
						_localctx.t2 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(343);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(344);
						match(EQ);
						setState(345);
						((EqualityExpressionContext)_localctx).t3 = relationalExpression(0);
						((EqualityExpressionContext)_localctx).node = new Equality_relationalExp(((EqualityExpressionContext)_localctx).t2.node, ((EqualityExpressionContext)_localctx).t3.node); String lType;String rType;if(((EqualityExpressionContext)_localctx).t2.funtype==null){lType="null";}else{lType=hashTable.get(((EqualityExpressionContext)_localctx).t2.funtype);}if(((EqualityExpressionContext)_localctx).t3.funtype==null){rType="null";}else{rType=hashTable.get(((EqualityExpressionContext)_localctx).t3.funtype);}printHT();if(lType == null){System.out.println("left Variable "  + " not declared");}if(rType == null){System.out.println("right Variable " + " not declared");}if(lType == rType){((EqualityExpressionContext)_localctx).funtype =  lType;System.out.println("Type matched");}else{System.out.println("Type mismatch between " + lType + " and " + rType);};
						}
						break;
					case 2:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState);
						_localctx.t4 = _prevctx;
						_localctx.t4 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(348);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(349);
						match(NE);
						setState(350);
						((EqualityExpressionContext)_localctx).t5 = relationalExpression(0);
						((EqualityExpressionContext)_localctx).node = new Equality_relationalExp1(((EqualityExpressionContext)_localctx).t4.node, ((EqualityExpressionContext)_localctx).t5.node); String lType;String rType;if(((EqualityExpressionContext)_localctx).t4.funtype==null){lType="null";}else{lType=hashTable.get(((EqualityExpressionContext)_localctx).t4.funtype);}if(((EqualityExpressionContext)_localctx).t5.funtype==null){rType="null";}else{rType=hashTable.get(((EqualityExpressionContext)_localctx).t5.funtype);}printHT();if(lType == null){System.out.println("left Variable "  + " not declared");}if(rType == null){System.out.println("right Variable " + " not declared");}if(lType == rType){((EqualityExpressionContext)_localctx).funtype =  lType;System.out.println("Type matched");}else{System.out.println("Type mismatch between " + lType + " and " + rType);};
						}
						break;
					}
					} 
				}
				setState(357);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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

	public static class RelationalExpressionContext extends ParserRuleContext {
		public ASTNode node;
		public String funtype;
		public RelationalExpressionContext t2;
		public RelationalExpressionContext t4;
		public RelationalExpressionContext t6;
		public RelationalExpressionContext t8;
		public ShiftExpressionContext t1;
		public ShiftExpressionContext t3;
		public ShiftExpressionContext t5;
		public ShiftExpressionContext t7;
		public ShiftExpressionContext t9;
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public TerminalNode LT() { return getToken(rulesparserParser.LT, 0); }
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public TerminalNode LE() { return getToken(rulesparserParser.LE, 0); }
		public TerminalNode GT() { return getToken(rulesparserParser.GT, 0); }
		public TerminalNode GE() { return getToken(rulesparserParser.GE, 0); }
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesparserListener ) ((rulesparserListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesparserListener ) ((rulesparserListener)listener).exitRelationalExpression(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		return relationalExpression(0);
	}

	private RelationalExpressionContext relationalExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, _parentState);
		RelationalExpressionContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_relationalExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(359);
			((RelationalExpressionContext)_localctx).t1 = shiftExpression(0);
			((RelationalExpressionContext)_localctx).node = new ShiftExp(((RelationalExpressionContext)_localctx).t1.node);((RelationalExpressionContext)_localctx).funtype =  ((RelationalExpressionContext)_localctx).t1.funtype;
			}
			_ctx.stop = _input.LT(-1);
			setState(384);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(382);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						_localctx.t2 = _prevctx;
						_localctx.t2 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(362);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(363);
						match(LT);
						setState(364);
						((RelationalExpressionContext)_localctx).t3 = shiftExpression(0);
						((RelationalExpressionContext)_localctx).node = new Relational_shiftExp(((RelationalExpressionContext)_localctx).t2.node, ((RelationalExpressionContext)_localctx).t3.node);String lType;String rType;if(((RelationalExpressionContext)_localctx).t2.funtype==null){lType="null";}else{lType=hashTable.get(((RelationalExpressionContext)_localctx).t2.funtype);}if(((RelationalExpressionContext)_localctx).t3.funtype==null){rType="null";}else{rType=hashTable.get(((RelationalExpressionContext)_localctx).t3.funtype);}printHT();if(lType == null){System.out.println("left Variable "  + " not declared");}if(rType == null){System.out.println("right Variable " + " not declared");}if(lType == rType){((RelationalExpressionContext)_localctx).funtype =  lType;System.out.println("Type matched");}else{System.out.println("Type mismatch between " + lType + " and " + rType);};
						}
						break;
					case 2:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						_localctx.t4 = _prevctx;
						_localctx.t4 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(367);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(368);
						match(LE);
						setState(369);
						((RelationalExpressionContext)_localctx).t5 = shiftExpression(0);
						((RelationalExpressionContext)_localctx).node = new Relational_shiftExp1(((RelationalExpressionContext)_localctx).t4.node, ((RelationalExpressionContext)_localctx).t5.node);String lType;String rType;if(((RelationalExpressionContext)_localctx).t4.funtype==null){lType="null";}else{lType=hashTable.get(((RelationalExpressionContext)_localctx).t4.funtype);}if(((RelationalExpressionContext)_localctx).t5.funtype==null){rType="null";}else{rType=hashTable.get(((RelationalExpressionContext)_localctx).t5.funtype);}printHT();if(lType == null){System.out.println("left Variable "  + " not declared");}if(rType == null){System.out.println("right Variable " + " not declared");}if(lType == rType){((RelationalExpressionContext)_localctx).funtype =  lType;System.out.println("Type matched");}else{System.out.println("Type mismatch between " + lType + " and " + rType);};
						}
						break;
					case 3:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						_localctx.t6 = _prevctx;
						_localctx.t6 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(372);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(373);
						match(GT);
						setState(374);
						((RelationalExpressionContext)_localctx).t7 = shiftExpression(0);
						((RelationalExpressionContext)_localctx).node = new Relational_shiftExp2(((RelationalExpressionContext)_localctx).t6.node, ((RelationalExpressionContext)_localctx).t7.node);String lType;String rType;if(((RelationalExpressionContext)_localctx).t6.funtype==null){lType="null";}else{lType=hashTable.get(((RelationalExpressionContext)_localctx).t6.funtype);}if(((RelationalExpressionContext)_localctx).t7.funtype==null){rType="null";}else{rType=hashTable.get(((RelationalExpressionContext)_localctx).t7.funtype);}printHT();if(lType == null){System.out.println("left Variable "  + " not declared");}if(rType == null){System.out.println("right Variable " + " not declared");}if(lType == rType){((RelationalExpressionContext)_localctx).funtype =  lType;System.out.println("Type matched");}else{System.out.println("Type mismatch between " + lType + " and " + rType);};
						}
						break;
					case 4:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						_localctx.t8 = _prevctx;
						_localctx.t8 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(377);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(378);
						match(GE);
						setState(379);
						((RelationalExpressionContext)_localctx).t9 = shiftExpression(0);
						((RelationalExpressionContext)_localctx).node = new Relational_shiftExp3(((RelationalExpressionContext)_localctx).t8.node, ((RelationalExpressionContext)_localctx).t9.node);String lType;String rType;if(((RelationalExpressionContext)_localctx).t8.funtype==null){lType="null";}else{lType=hashTable.get(((RelationalExpressionContext)_localctx).t8.funtype);}if(((RelationalExpressionContext)_localctx).t9.funtype==null){rType="null";}else{rType=hashTable.get(((RelationalExpressionContext)_localctx).t9.funtype);}printHT();if(lType == null){System.out.println("left Variable "  + " not declared");}if(rType == null){System.out.println("right Variable " + " not declared");}if(lType == rType){((RelationalExpressionContext)_localctx).funtype =  lType;System.out.println("Type matched");}else{System.out.println("Type mismatch between " + lType + " and " + rType);};
						}
						break;
					}
					} 
				}
				setState(386);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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

	public static class ShiftExpressionContext extends ParserRuleContext {
		public ASTNode node;
		public String funtype;
		public ShiftExpressionContext t2;
		public ShiftExpressionContext t4;
		public AdditiveExpressionContext t1;
		public AdditiveExpressionContext t3;
		public AdditiveExpressionContext t5;
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public TerminalNode LSHIFT() { return getToken(rulesparserParser.LSHIFT, 0); }
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public TerminalNode RSHIFT() { return getToken(rulesparserParser.RSHIFT, 0); }
		public ShiftExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesparserListener ) ((rulesparserListener)listener).enterShiftExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesparserListener ) ((rulesparserListener)listener).exitShiftExpression(this);
		}
	}

	public final ShiftExpressionContext shiftExpression() throws RecognitionException {
		return shiftExpression(0);
	}

	private ShiftExpressionContext shiftExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ShiftExpressionContext _localctx = new ShiftExpressionContext(_ctx, _parentState);
		ShiftExpressionContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_shiftExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(388);
			((ShiftExpressionContext)_localctx).t1 = additiveExpression(0);
			((ShiftExpressionContext)_localctx).node = new AdditiveExp(((ShiftExpressionContext)_localctx).t1.node);((ShiftExpressionContext)_localctx).funtype =  ((ShiftExpressionContext)_localctx).t1.funtype;
			}
			_ctx.stop = _input.LT(-1);
			setState(403);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(401);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						_localctx.t2 = _prevctx;
						_localctx.t2 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(391);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(392);
						match(LSHIFT);
						setState(393);
						((ShiftExpressionContext)_localctx).t3 = additiveExpression(0);
						((ShiftExpressionContext)_localctx).node = new Shift_additiveExp(((ShiftExpressionContext)_localctx).t2.node, ((ShiftExpressionContext)_localctx).t3.node);String lType;String rType;if(((ShiftExpressionContext)_localctx).t2.funtype==null){lType="null";}else{lType=hashTable.get(((ShiftExpressionContext)_localctx).t2.funtype);}if(((ShiftExpressionContext)_localctx).t3.funtype==null){rType="null";}else{rType=hashTable.get(((ShiftExpressionContext)_localctx).t3.funtype);}printHT();if(lType == null){System.out.println("left Variable "  + " not declared");}if(rType == null){System.out.println("right Variable " + " not declared");}if(lType == rType){((ShiftExpressionContext)_localctx).funtype =  lType;System.out.println("Type matched");}else{System.out.println("Type mismatch between " + lType + " and " + rType);};
						}
						break;
					case 2:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						_localctx.t4 = _prevctx;
						_localctx.t4 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(396);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(397);
						match(RSHIFT);
						setState(398);
						((ShiftExpressionContext)_localctx).t5 = additiveExpression(0);
						((ShiftExpressionContext)_localctx).node = new Shift_additive1Exp(((ShiftExpressionContext)_localctx).t4.node, ((ShiftExpressionContext)_localctx).t5.node);String lType;String rType;if(((ShiftExpressionContext)_localctx).t4.funtype==null){lType="null";}else{lType=hashTable.get(((ShiftExpressionContext)_localctx).t4.funtype);}if(((ShiftExpressionContext)_localctx).t5.funtype==null){rType="null";}else{rType=hashTable.get(((ShiftExpressionContext)_localctx).t5.funtype);}printHT();if(lType == null){System.out.println("left Variable "  + " not declared");}if(rType == null){System.out.println("right Variable " + " not declared");}if(lType == rType){((ShiftExpressionContext)_localctx).funtype =  lType;System.out.println("Type matched");}else{System.out.println("Type mismatch between " + lType + " and " + rType);};
						}
						break;
					}
					} 
				}
				setState(405);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public ASTNode node;
		public String funtype;
		public AdditiveExpressionContext t2;
		public AdditiveExpressionContext t4;
		public MultiplicativeExpressionContext t1;
		public MultiplicativeExpressionContext t3;
		public MultiplicativeExpressionContext t5;
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public TerminalNode ADD() { return getToken(rulesparserParser.ADD, 0); }
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public TerminalNode SUB() { return getToken(rulesparserParser.SUB, 0); }
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesparserListener ) ((rulesparserListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesparserListener ) ((rulesparserListener)listener).exitAdditiveExpression(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		return additiveExpression(0);
	}

	private AdditiveExpressionContext additiveExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, _parentState);
		AdditiveExpressionContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_additiveExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(407);
			((AdditiveExpressionContext)_localctx).t1 = multiplicativeExpression(0);
			((AdditiveExpressionContext)_localctx).node = new MultExp(((AdditiveExpressionContext)_localctx).t1.node);((AdditiveExpressionContext)_localctx).funtype =  ((AdditiveExpressionContext)_localctx).t1.funtype;
			}
			_ctx.stop = _input.LT(-1);
			setState(422);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(420);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						_localctx.t2 = _prevctx;
						_localctx.t2 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(410);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(411);
						match(ADD);
						setState(412);
						((AdditiveExpressionContext)_localctx).t3 = multiplicativeExpression(0);
						((AdditiveExpressionContext)_localctx).node = new Add_MultExp(((AdditiveExpressionContext)_localctx).t2.node, ((AdditiveExpressionContext)_localctx).t3.node);String lType;String rType;if(((AdditiveExpressionContext)_localctx).t2.funtype==null){lType="null";}else{lType=hashTable.get(((AdditiveExpressionContext)_localctx).t2.funtype);}if(((AdditiveExpressionContext)_localctx).t3.funtype==null){rType="null";}else{rType=hashTable.get(((AdditiveExpressionContext)_localctx).t3.funtype);}printHT();if(lType == null){System.out.println("left Variable "  + " not declared");}if(rType == null){System.out.println("right Variable " + " not declared");}if(lType == rType || (lType=="Float" && rType=="Integer")||(rType=="Float" && lType=="Integer")){((AdditiveExpressionContext)_localctx).funtype =  lType;System.out.println("Type matched");}else{System.out.println("Type mismatch between " + lType + " and " + rType);};
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						_localctx.t4 = _prevctx;
						_localctx.t4 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(415);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(416);
						match(SUB);
						setState(417);
						((AdditiveExpressionContext)_localctx).t5 = multiplicativeExpression(0);
						((AdditiveExpressionContext)_localctx).node = new Add_MultExp1(((AdditiveExpressionContext)_localctx).t4.node, ((AdditiveExpressionContext)_localctx).t5.node);String lType;String rType;if(((AdditiveExpressionContext)_localctx).t4.funtype==null){lType="null";}else{lType=hashTable.get(((AdditiveExpressionContext)_localctx).t4.funtype);}if(((AdditiveExpressionContext)_localctx).t5.funtype==null){rType="null";}else{rType=hashTable.get(((AdditiveExpressionContext)_localctx).t5.funtype);}printHT();if(lType == null){System.out.println("left Variable "  + " not declared");}if(rType == null){System.out.println("right Variable " + " not declared");}if(lType == rType || (lType=="Float" && rType=="Integer")||(rType=="Float" && lType=="Integer")){((AdditiveExpressionContext)_localctx).funtype =  lType;System.out.println("Type matched");}else{System.out.println("Type mismatch between " + lType + " and " + rType);};
						}
						break;
					}
					} 
				}
				setState(424);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public ASTNode node;
		public String funtype;
		public MultiplicativeExpressionContext t2;
		public MultiplicativeExpressionContext t4;
		public MultiplicativeExpressionContext t6;
		public UnaryExpressionContext t1;
		public UnaryExpressionContext t3;
		public UnaryExpressionContext t5;
		public UnaryExpressionContext t7;
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode MUL() { return getToken(rulesparserParser.MUL, 0); }
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public TerminalNode DIV() { return getToken(rulesparserParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(rulesparserParser.MOD, 0); }
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesparserListener ) ((rulesparserListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesparserListener ) ((rulesparserListener)listener).exitMultiplicativeExpression(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		return multiplicativeExpression(0);
	}

	private MultiplicativeExpressionContext multiplicativeExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, _parentState);
		MultiplicativeExpressionContext _prevctx = _localctx;
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_multiplicativeExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(426);
			((MultiplicativeExpressionContext)_localctx).t1 = unaryExpression();
			((MultiplicativeExpressionContext)_localctx).node = new UnaryExp(((MultiplicativeExpressionContext)_localctx).t1.node);((MultiplicativeExpressionContext)_localctx).funtype =  ((MultiplicativeExpressionContext)_localctx).t1.funtype;
			}
			_ctx.stop = _input.LT(-1);
			setState(446);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(444);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						_localctx.t2 = _prevctx;
						_localctx.t2 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(429);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(430);
						match(MUL);
						setState(431);
						((MultiplicativeExpressionContext)_localctx).t3 = unaryExpression();
						((MultiplicativeExpressionContext)_localctx).node = new Mult_UnaryExp(((MultiplicativeExpressionContext)_localctx).t2.node, ((MultiplicativeExpressionContext)_localctx).t3.node);String lType;String rType;if(((MultiplicativeExpressionContext)_localctx).t2.funtype==null){lType="null";}else{lType=hashTable.get(((MultiplicativeExpressionContext)_localctx).t2.funtype);}if(((MultiplicativeExpressionContext)_localctx).t3.funtype==null){rType="null";}else{rType=hashTable.get(((MultiplicativeExpressionContext)_localctx).t3.funtype);}printHT();if(lType == null){System.out.println("left Variable "  + " not declared");}if(rType == null){System.out.println("right Variable " + " not declared");}if(lType == rType || (lType=="Float" && rType=="Integer")||(rType=="Float" && lType=="Integer")){((MultiplicativeExpressionContext)_localctx).funtype =  lType;System.out.println("Type matched");}else{System.out.println("Type mismatch between " + lType + " and " + rType);};
						}
						break;
					case 2:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						_localctx.t4 = _prevctx;
						_localctx.t4 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(434);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(435);
						match(DIV);
						setState(436);
						((MultiplicativeExpressionContext)_localctx).t5 = unaryExpression();
						((MultiplicativeExpressionContext)_localctx).node = new Mult_UnaryExp1(((MultiplicativeExpressionContext)_localctx).t4.node, ((MultiplicativeExpressionContext)_localctx).t5.node);String lType;String rType;if(((MultiplicativeExpressionContext)_localctx).t4.funtype==null){lType="null";}else{lType=hashTable.get(((MultiplicativeExpressionContext)_localctx).t4.funtype);}if(((MultiplicativeExpressionContext)_localctx).t5.funtype==null){rType="null";}else{rType=hashTable.get(((MultiplicativeExpressionContext)_localctx).t5.funtype);}printHT();if(lType == null){System.out.println("left Variable "  + " not declared");}if(rType == null){System.out.println("right Variable " + " not declared");}if(lType == rType || (lType=="Float" && rType=="Integer")||(rType=="Float" && lType=="Integer")){((MultiplicativeExpressionContext)_localctx).funtype =  lType;System.out.println("Type matched");}else{if(rType == null){System.out.println("Error dividing by 0");}else {System.out.println("Type mismatch between " + lType + " and " + rType);}};
						}
						break;
					case 3:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						_localctx.t6 = _prevctx;
						_localctx.t6 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(439);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(440);
						match(MOD);
						setState(441);
						((MultiplicativeExpressionContext)_localctx).t7 = unaryExpression();
						((MultiplicativeExpressionContext)_localctx).node = new Mult_UnaryExp2(((MultiplicativeExpressionContext)_localctx).t6.node, ((MultiplicativeExpressionContext)_localctx).t7.node);String lType;String rType;if(((MultiplicativeExpressionContext)_localctx).t6.funtype==null){lType="null";}else{lType=hashTable.get(((MultiplicativeExpressionContext)_localctx).t6.funtype);}if(((MultiplicativeExpressionContext)_localctx).t7.funtype==null){rType="null";}else{rType=hashTable.get(((MultiplicativeExpressionContext)_localctx).t7.funtype);}printHT();if(lType == null){System.out.println("left Variable "  + " not declared");}if(rType == null){System.out.println("right Variable " + " not declared");}if(lType == rType || (lType=="Float" && rType=="Integer")||(rType=="Float" && lType=="Integer")){((MultiplicativeExpressionContext)_localctx).funtype =  lType;System.out.println("Type matched");}else{System.out.println("Type mismatch between " + lType + " and " + rType);};
						}
						break;
					}
					} 
				}
				setState(448);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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

	public static class UnaryExpressionContext extends ParserRuleContext {
		public ASTNode node;
		public String funtype;
		public PostfixExpressionContext t1;
		public UnaryExpressionContext t2;
		public UnaryExpressionContext t3;
		public UnaryExpressionContext t4;
		public UnaryExpressionContext t5;
		public UnaryExpressionContext t6;
		public UnaryExpressionContext t7;
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode ADD() { return getToken(rulesparserParser.ADD, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode SUB() { return getToken(rulesparserParser.SUB, 0); }
		public TerminalNode LNOT() { return getToken(rulesparserParser.LNOT, 0); }
		public TerminalNode BCOMP() { return getToken(rulesparserParser.BCOMP, 0); }
		public TerminalNode INCREMENT() { return getToken(rulesparserParser.INCREMENT, 0); }
		public TerminalNode DECREMENT() { return getToken(rulesparserParser.DECREMENT, 0); }
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesparserListener ) ((rulesparserListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesparserListener ) ((rulesparserListener)listener).exitUnaryExpression(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_unaryExpression);
		try {
			setState(476);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FALSE:
			case TRUE:
			case LCBRACKET:
			case ID:
			case ID1:
			case INTEGER:
			case FLOATING:
			case CHAR_LITERAL:
			case STRINGL:
				enterOuterAlt(_localctx, 1);
				{
				setState(449);
				((UnaryExpressionContext)_localctx).t1 = postfixExpression(0);
				((UnaryExpressionContext)_localctx).node = new PostfixExp(((UnaryExpressionContext)_localctx).t1.node);((UnaryExpressionContext)_localctx).funtype =  ((UnaryExpressionContext)_localctx).t1.funtype;
				}
				break;
			case ADD:
				enterOuterAlt(_localctx, 2);
				{
				setState(452);
				match(ADD);
				setState(453);
				((UnaryExpressionContext)_localctx).t2 = unaryExpression();
				((UnaryExpressionContext)_localctx).node = new PostfixExp1(((UnaryExpressionContext)_localctx).t2.node);
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 3);
				{
				setState(456);
				match(SUB);
				setState(457);
				((UnaryExpressionContext)_localctx).t3 = unaryExpression();
				((UnaryExpressionContext)_localctx).node = new PostfixExp2(((UnaryExpressionContext)_localctx).t3.node);
				}
				break;
			case LNOT:
				enterOuterAlt(_localctx, 4);
				{
				setState(460);
				match(LNOT);
				setState(461);
				((UnaryExpressionContext)_localctx).t4 = unaryExpression();
				((UnaryExpressionContext)_localctx).node = new PostfixExp3(((UnaryExpressionContext)_localctx).t4.node);
				}
				break;
			case BCOMP:
				enterOuterAlt(_localctx, 5);
				{
				setState(464);
				match(BCOMP);
				setState(465);
				((UnaryExpressionContext)_localctx).t5 = unaryExpression();
				((UnaryExpressionContext)_localctx).node = new PostfixExp4(((UnaryExpressionContext)_localctx).t5.node);
				}
				break;
			case INCREMENT:
				enterOuterAlt(_localctx, 6);
				{
				setState(468);
				match(INCREMENT);
				setState(469);
				((UnaryExpressionContext)_localctx).t6 = unaryExpression();
				((UnaryExpressionContext)_localctx).node = new PostfixExp5(((UnaryExpressionContext)_localctx).t6.node);
				}
				break;
			case DECREMENT:
				enterOuterAlt(_localctx, 7);
				{
				setState(472);
				match(DECREMENT);
				setState(473);
				((UnaryExpressionContext)_localctx).t7 = unaryExpression();
				((UnaryExpressionContext)_localctx).node = new PostfixExp6(((UnaryExpressionContext)_localctx).t7.node);
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

	public static class PostfixExpressionContext extends ParserRuleContext {
		public ASTNode node;
		public String funtype;
		public PostfixExpressionContext t2;
		public PostfixExpressionContext t3;
		public PostfixExpressionContext t4;
		public PostfixExpressionContext t5;
		public PostfixExpressionContext t6;
		public PrimaryExpressionContext t1;
		public FunctionCallContext t7;
		public ExpressionContext t8;
		public Token ID;
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode LSQBRACKET() { return getToken(rulesparserParser.LSQBRACKET, 0); }
		public TerminalNode RSQBRACKET() { return getToken(rulesparserParser.RSQBRACKET, 0); }
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(rulesparserParser.DOT, 0); }
		public TerminalNode ID() { return getToken(rulesparserParser.ID, 0); }
		public TerminalNode ARROW() { return getToken(rulesparserParser.ARROW, 0); }
		public TerminalNode INCREMENT() { return getToken(rulesparserParser.INCREMENT, 0); }
		public TerminalNode DECREMENT() { return getToken(rulesparserParser.DECREMENT, 0); }
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesparserListener ) ((rulesparserListener)listener).enterPostfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesparserListener ) ((rulesparserListener)listener).exitPostfixExpression(this);
		}
	}

	public final PostfixExpressionContext postfixExpression() throws RecognitionException {
		return postfixExpression(0);
	}

	private PostfixExpressionContext postfixExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx, _parentState);
		PostfixExpressionContext _prevctx = _localctx;
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_postfixExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(479);
				((PostfixExpressionContext)_localctx).t1 = primaryExpression();
				((PostfixExpressionContext)_localctx).node = new PrimaryExp(((PostfixExpressionContext)_localctx).t1.node);((PostfixExpressionContext)_localctx).funtype =  ((PostfixExpressionContext)_localctx).t1.funtype;
				}
				break;
			case 2:
				{
				setState(482);
				((PostfixExpressionContext)_localctx).t7 = functionCall();
				((PostfixExpressionContext)_localctx).node = new FunctionCall(((PostfixExpressionContext)_localctx).t7.node);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(509);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(507);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						_localctx.t2 = _prevctx;
						_localctx.t2 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(487);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(488);
						match(LSQBRACKET);
						setState(489);
						((PostfixExpressionContext)_localctx).t8 = expression(0);
						setState(490);
						match(RSQBRACKET);
						((PostfixExpressionContext)_localctx).node = new PrimaryExp1(((PostfixExpressionContext)_localctx).t2.node, ((PostfixExpressionContext)_localctx).t8.node);
						}
						break;
					case 2:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						_localctx.t3 = _prevctx;
						_localctx.t3 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(493);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(494);
						match(DOT);
						setState(495);
						((PostfixExpressionContext)_localctx).ID = match(ID);
						((PostfixExpressionContext)_localctx).node = new PrimaryExp2(((PostfixExpressionContext)_localctx).t3.node, (((PostfixExpressionContext)_localctx).ID!=null?((PostfixExpressionContext)_localctx).ID.getText():null));
						}
						break;
					case 3:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						_localctx.t4 = _prevctx;
						_localctx.t4 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(497);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(498);
						match(ARROW);
						setState(499);
						((PostfixExpressionContext)_localctx).ID = match(ID);
						((PostfixExpressionContext)_localctx).node = new PrimaryExp3(((PostfixExpressionContext)_localctx).t4.node, (((PostfixExpressionContext)_localctx).ID!=null?((PostfixExpressionContext)_localctx).ID.getText():null));
						}
						break;
					case 4:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						_localctx.t5 = _prevctx;
						_localctx.t5 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(501);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(502);
						match(INCREMENT);
						((PostfixExpressionContext)_localctx).node = new PrimaryExp4(((PostfixExpressionContext)_localctx).t5.node);
						}
						break;
					case 5:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						_localctx.t6 = _prevctx;
						_localctx.t6 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(504);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(505);
						match(DECREMENT);
						((PostfixExpressionContext)_localctx).node = new PrimaryExp5(((PostfixExpressionContext)_localctx).t6.node);
						}
						break;
					}
					} 
				}
				setState(511);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public ASTNode node;
		public String funtype;
		public Token ID;
		public Token ID1;
		public Token INTEGER;
		public Token FLOATING;
		public Token STRINGL;
		public Token CHAR_LITERAL;
		public Token TRUE;
		public Token FALSE;
		public ExpressionContext t1;
		public TerminalNode ID() { return getToken(rulesparserParser.ID, 0); }
		public TerminalNode ID1() { return getToken(rulesparserParser.ID1, 0); }
		public TerminalNode INTEGER() { return getToken(rulesparserParser.INTEGER, 0); }
		public TerminalNode FLOATING() { return getToken(rulesparserParser.FLOATING, 0); }
		public TerminalNode STRINGL() { return getToken(rulesparserParser.STRINGL, 0); }
		public TerminalNode CHAR_LITERAL() { return getToken(rulesparserParser.CHAR_LITERAL, 0); }
		public TerminalNode TRUE() { return getToken(rulesparserParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(rulesparserParser.FALSE, 0); }
		public TerminalNode LCBRACKET() { return getToken(rulesparserParser.LCBRACKET, 0); }
		public TerminalNode RCBRACKET() { return getToken(rulesparserParser.RCBRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesparserListener ) ((rulesparserListener)listener).enterPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesparserListener ) ((rulesparserListener)listener).exitPrimaryExpression(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_primaryExpression);
		try {
			setState(533);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(512);
				((PrimaryExpressionContext)_localctx).ID = match(ID);
				((PrimaryExpressionContext)_localctx).node = new Variable((((PrimaryExpressionContext)_localctx).ID!=null?((PrimaryExpressionContext)_localctx).ID.getText():null)); ((PrimaryExpressionContext)_localctx).funtype =  (((PrimaryExpressionContext)_localctx).ID!=null?((PrimaryExpressionContext)_localctx).ID.getText():null);
				}
				break;
			case ID1:
				enterOuterAlt(_localctx, 2);
				{
				setState(514);
				((PrimaryExpressionContext)_localctx).ID1 = match(ID1);
				((PrimaryExpressionContext)_localctx).node = new Variable((((PrimaryExpressionContext)_localctx).ID1!=null?((PrimaryExpressionContext)_localctx).ID1.getText():null)); ((PrimaryExpressionContext)_localctx).funtype =  "Array";
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 3);
				{
				setState(516);
				((PrimaryExpressionContext)_localctx).INTEGER = match(INTEGER);
				((PrimaryExpressionContext)_localctx).node =  new Values(Integer.parseInt((((PrimaryExpressionContext)_localctx).INTEGER!=null?((PrimaryExpressionContext)_localctx).INTEGER.getText():null))); ((PrimaryExpressionContext)_localctx).funtype =  "Integer";
				}
				break;
			case FLOATING:
				enterOuterAlt(_localctx, 4);
				{
				setState(518);
				((PrimaryExpressionContext)_localctx).FLOATING = match(FLOATING);
				((PrimaryExpressionContext)_localctx).node =  new Floating(Float.parseFloat((((PrimaryExpressionContext)_localctx).FLOATING!=null?((PrimaryExpressionContext)_localctx).FLOATING.getText():null))); ((PrimaryExpressionContext)_localctx).funtype =  "Float";
				}
				break;
			case STRINGL:
				enterOuterAlt(_localctx, 5);
				{
				setState(520);
				((PrimaryExpressionContext)_localctx).STRINGL = match(STRINGL);
				((PrimaryExpressionContext)_localctx).node = new Strings((((PrimaryExpressionContext)_localctx).STRINGL!=null?((PrimaryExpressionContext)_localctx).STRINGL.getText():null)); ((PrimaryExpressionContext)_localctx).funtype =  "String";
				}
				break;
			case CHAR_LITERAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(522);
				((PrimaryExpressionContext)_localctx).CHAR_LITERAL = match(CHAR_LITERAL);
				((PrimaryExpressionContext)_localctx).node = new Strings((((PrimaryExpressionContext)_localctx).CHAR_LITERAL!=null?((PrimaryExpressionContext)_localctx).CHAR_LITERAL.getText():null)); ((PrimaryExpressionContext)_localctx).funtype =  "Char";
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 7);
				{
				setState(524);
				((PrimaryExpressionContext)_localctx).TRUE = match(TRUE);
				((PrimaryExpressionContext)_localctx).node = new Strings((((PrimaryExpressionContext)_localctx).TRUE!=null?((PrimaryExpressionContext)_localctx).TRUE.getText():null)); ((PrimaryExpressionContext)_localctx).funtype =  "Bool";
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 8);
				{
				setState(526);
				((PrimaryExpressionContext)_localctx).FALSE = match(FALSE);
				((PrimaryExpressionContext)_localctx).node = new Strings((((PrimaryExpressionContext)_localctx).FALSE!=null?((PrimaryExpressionContext)_localctx).FALSE.getText():null)); ((PrimaryExpressionContext)_localctx).funtype =  "Bool";
				}
				break;
			case LCBRACKET:
				enterOuterAlt(_localctx, 9);
				{
				setState(528);
				match(LCBRACKET);
				setState(529);
				((PrimaryExpressionContext)_localctx).t1 = expression(0);
				setState(530);
				match(RCBRACKET);
				((PrimaryExpressionContext)_localctx).node = new ParamExp(((PrimaryExpressionContext)_localctx).t1.node);
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

	public static class FunctionCallContext extends ParserRuleContext {
		public ASTNode node;
		public Token ID;
		public ArgumentListContext t1;
		public TerminalNode ID() { return getToken(rulesparserParser.ID, 0); }
		public TerminalNode LCBRACKET() { return getToken(rulesparserParser.LCBRACKET, 0); }
		public TerminalNode RCBRACKET() { return getToken(rulesparserParser.RCBRACKET, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesparserListener ) ((rulesparserListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesparserListener ) ((rulesparserListener)listener).exitFunctionCall(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_functionCall);
		try {
			setState(545);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(535);
				((FunctionCallContext)_localctx).ID = match(ID);
				setState(536);
				match(LCBRACKET);
				setState(537);
				((FunctionCallContext)_localctx).t1 = argumentList();
				setState(538);
				match(RCBRACKET);
				((FunctionCallContext)_localctx).node = new FunctionCall1((((FunctionCallContext)_localctx).ID!=null?((FunctionCallContext)_localctx).ID.getText():null),((FunctionCallContext)_localctx).t1.node);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(541);
				((FunctionCallContext)_localctx).ID = match(ID);
				setState(542);
				match(LCBRACKET);
				setState(543);
				match(RCBRACKET);
				((FunctionCallContext)_localctx).node = new FunctionCall2((((FunctionCallContext)_localctx).ID!=null?((FunctionCallContext)_localctx).ID.getText():null));
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

	public static class ArgumentListContext extends ParserRuleContext {
		public ASTNode node;
		public AssignmentExpressionContext t1;
		public ArgumentTailContext t2;
		public AssignmentExpressionContext t3;
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ArgumentTailContext argumentTail() {
			return getRuleContext(ArgumentTailContext.class,0);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesparserListener ) ((rulesparserListener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesparserListener ) ((rulesparserListener)listener).exitArgumentList(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_argumentList);
		try {
			setState(554);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(547);
				((ArgumentListContext)_localctx).t1 = assignmentExpression();
				setState(548);
				((ArgumentListContext)_localctx).t2 = argumentTail();
				((ArgumentListContext)_localctx).node = new ArgumentList(((ArgumentListContext)_localctx).t1.node, ((ArgumentListContext)_localctx).t2.node);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(551);
				((ArgumentListContext)_localctx).t3 = assignmentExpression();
				((ArgumentListContext)_localctx).node = new AssignExp(((ArgumentListContext)_localctx).t3.node);
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

	public static class ArgumentTailContext extends ParserRuleContext {
		public ASTNode node;
		public AssignmentExpressionContext t1;
		public ArgumentTailContext t2;
		public AssignmentExpressionContext t3;
		public TerminalNode COMMA() { return getToken(rulesparserParser.COMMA, 0); }
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ArgumentTailContext argumentTail() {
			return getRuleContext(ArgumentTailContext.class,0);
		}
		public ArgumentTailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentTail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesparserListener ) ((rulesparserListener)listener).enterArgumentTail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesparserListener ) ((rulesparserListener)listener).exitArgumentTail(this);
		}
	}

	public final ArgumentTailContext argumentTail() throws RecognitionException {
		ArgumentTailContext _localctx = new ArgumentTailContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_argumentTail);
		try {
			setState(565);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(556);
				match(COMMA);
				setState(557);
				((ArgumentTailContext)_localctx).t1 = assignmentExpression();
				setState(558);
				((ArgumentTailContext)_localctx).t2 = argumentTail();
				((ArgumentTailContext)_localctx).node = new ArgumentTail(((ArgumentTailContext)_localctx).t1.node, ((ArgumentTailContext)_localctx).t2.node);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(561);
				match(COMMA);
				setState(562);
				((ArgumentTailContext)_localctx).t3 = assignmentExpression();
				((ArgumentTailContext)_localctx).node = new ArgumentExp(((ArgumentTailContext)_localctx).t3.node);
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

	public static class SelectionStatementContext extends ParserRuleContext {
		public ASTNode node;
		public ExpressionContext t1;
		public StatementContext t2;
		public ExpressionContext t3;
		public StatementContext t4;
		public StatementContext t5;
		public TerminalNode IF() { return getToken(rulesparserParser.IF, 0); }
		public TerminalNode LCBRACKET() { return getToken(rulesparserParser.LCBRACKET, 0); }
		public TerminalNode RCBRACKET() { return getToken(rulesparserParser.RCBRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(rulesparserParser.ELSE, 0); }
		public SelectionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesparserListener ) ((rulesparserListener)listener).enterSelectionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesparserListener ) ((rulesparserListener)listener).exitSelectionStatement(this);
		}
	}

	public final SelectionStatementContext selectionStatement() throws RecognitionException {
		SelectionStatementContext _localctx = new SelectionStatementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_selectionStatement);
		try {
			setState(583);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(567);
				match(IF);
				setState(568);
				match(LCBRACKET);
				setState(569);
				((SelectionStatementContext)_localctx).t1 = expression(0);
				setState(570);
				match(RCBRACKET);
				setState(571);
				((SelectionStatementContext)_localctx).t2 = statement();
				((SelectionStatementContext)_localctx).node = new Ifstmt(((SelectionStatementContext)_localctx).t1.node, ((SelectionStatementContext)_localctx).t2.node);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(574);
				match(IF);
				setState(575);
				match(LCBRACKET);
				setState(576);
				((SelectionStatementContext)_localctx).t3 = expression(0);
				setState(577);
				match(RCBRACKET);
				setState(578);
				((SelectionStatementContext)_localctx).t4 = statement();
				setState(579);
				match(ELSE);
				setState(580);
				((SelectionStatementContext)_localctx).t5 = statement();
				((SelectionStatementContext)_localctx).node = new Ifstmt1(((SelectionStatementContext)_localctx).t3.node, ((SelectionStatementContext)_localctx).t4.node, ((SelectionStatementContext)_localctx).t5.node);
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

	public static class IterationStatementContext extends ParserRuleContext {
		public ASTNode node;
		public ExpressionContext t1;
		public StatementContext t2;
		public ExpressionStatementContext t3;
		public ExpressionStatementContext t4;
		public ExpressionContext t5;
		public StatementContext t6;
		public TerminalNode WHILE() { return getToken(rulesparserParser.WHILE, 0); }
		public TerminalNode LCBRACKET() { return getToken(rulesparserParser.LCBRACKET, 0); }
		public TerminalNode RCBRACKET() { return getToken(rulesparserParser.RCBRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode FOR() { return getToken(rulesparserParser.FOR, 0); }
		public List<ExpressionStatementContext> expressionStatement() {
			return getRuleContexts(ExpressionStatementContext.class);
		}
		public ExpressionStatementContext expressionStatement(int i) {
			return getRuleContext(ExpressionStatementContext.class,i);
		}
		public IterationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesparserListener ) ((rulesparserListener)listener).enterIterationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesparserListener ) ((rulesparserListener)listener).exitIterationStatement(this);
		}
	}

	public final IterationStatementContext iterationStatement() throws RecognitionException {
		IterationStatementContext _localctx = new IterationStatementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_iterationStatement);
		try {
			setState(601);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(585);
				match(WHILE);
				setState(586);
				match(LCBRACKET);
				setState(587);
				((IterationStatementContext)_localctx).t1 = expression(0);
				setState(588);
				match(RCBRACKET);
				setState(589);
				((IterationStatementContext)_localctx).t2 = statement();
				((IterationStatementContext)_localctx).node = new Whilestmt(((IterationStatementContext)_localctx).t1.node, ((IterationStatementContext)_localctx).t2.node);
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(592);
				match(FOR);
				setState(593);
				match(LCBRACKET);
				setState(594);
				((IterationStatementContext)_localctx).t3 = expressionStatement();
				setState(595);
				((IterationStatementContext)_localctx).t4 = expressionStatement();
				setState(596);
				((IterationStatementContext)_localctx).t5 = expression(0);
				setState(597);
				match(RCBRACKET);
				setState(598);
				((IterationStatementContext)_localctx).t6 = statement();
				((IterationStatementContext)_localctx).node = new Forstmt(((IterationStatementContext)_localctx).t3.node, ((IterationStatementContext)_localctx).t4.node, ((IterationStatementContext)_localctx).t5.node, ((IterationStatementContext)_localctx).t6.node);
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

	public static class JumpStatementContext extends ParserRuleContext {
		public ASTNode node;
		public FunctionCallContext t1;
		public FunctionCallContext t2;
		public ExpressionContext t3;
		public ExpressionContext t4;
		public TerminalNode RETURN() { return getToken(rulesparserParser.RETURN, 0); }
		public TerminalNode SEMICOLON() { return getToken(rulesparserParser.SEMICOLON, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode BREAK() { return getToken(rulesparserParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(rulesparserParser.CONTINUE, 0); }
		public JumpStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jumpStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesparserListener ) ((rulesparserListener)listener).enterJumpStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesparserListener ) ((rulesparserListener)listener).exitJumpStatement(this);
		}
	}

	public final JumpStatementContext jumpStatement() throws RecognitionException {
		JumpStatementContext _localctx = new JumpStatementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_jumpStatement);
		try {
			setState(628);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(603);
				match(RETURN);
				setState(604);
				match(SEMICOLON);
				((JumpStatementContext)_localctx).node = new Jumpstmt1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(606);
				match(RETURN);
				setState(607);
				((JumpStatementContext)_localctx).t1 = functionCall();
				setState(608);
				match(SEMICOLON);
				((JumpStatementContext)_localctx).node = new Jumpstmt2(((JumpStatementContext)_localctx).t1.node);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(611);
				match(RETURN);
				setState(612);
				((JumpStatementContext)_localctx).t2 = functionCall();
				setState(613);
				((JumpStatementContext)_localctx).t3 = expression(0);
				setState(614);
				match(SEMICOLON);
				((JumpStatementContext)_localctx).node = new Jumpstmt3(((JumpStatementContext)_localctx).t2.node,((JumpStatementContext)_localctx).t3.node);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(617);
				match(RETURN);
				setState(618);
				((JumpStatementContext)_localctx).t4 = expression(0);
				setState(619);
				match(SEMICOLON);
				((JumpStatementContext)_localctx).node = new Jumpstmt4(((JumpStatementContext)_localctx).t4.node);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(622);
				match(BREAK);
				setState(623);
				match(SEMICOLON);
				((JumpStatementContext)_localctx).node = new Jumpstmt5();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(625);
				match(CONTINUE);
				setState(626);
				match(SEMICOLON);
				((JumpStatementContext)_localctx).node = new Jumpstmt6();
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

	public static class ClassDeclarationContext extends ParserRuleContext {
		public ASTNode node;
		public Token ID;
		public ClassMembersContext t1;
		public TerminalNode CLASS() { return getToken(rulesparserParser.CLASS, 0); }
		public TerminalNode ID() { return getToken(rulesparserParser.ID, 0); }
		public TerminalNode LBRACKET() { return getToken(rulesparserParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(rulesparserParser.RBRACKET, 0); }
		public ClassMembersContext classMembers() {
			return getRuleContext(ClassMembersContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesparserListener ) ((rulesparserListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesparserListener ) ((rulesparserListener)listener).exitClassDeclaration(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_classDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(630);
			match(CLASS);
			setState(631);
			((ClassDeclarationContext)_localctx).ID = match(ID);
			setState(632);
			match(LBRACKET);
			setState(633);
			((ClassDeclarationContext)_localctx).t1 = classMembers();
			setState(634);
			match(RBRACKET);
			((ClassDeclarationContext)_localctx).node = new ClassDec((((ClassDeclarationContext)_localctx).ID!=null?((ClassDeclarationContext)_localctx).ID.getText():null),((ClassDeclarationContext)_localctx).t1.node);
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

	public static class ClassMembersContext extends ParserRuleContext {
		public ASTNode node;
		public ClassMemberContext t1;
		public ClassMembersContext t2;
		public ClassMemberContext t3;
		public ClassMemberContext classMember() {
			return getRuleContext(ClassMemberContext.class,0);
		}
		public ClassMembersContext classMembers() {
			return getRuleContext(ClassMembersContext.class,0);
		}
		public ClassMembersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMembers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesparserListener ) ((rulesparserListener)listener).enterClassMembers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesparserListener ) ((rulesparserListener)listener).exitClassMembers(this);
		}
	}

	public final ClassMembersContext classMembers() throws RecognitionException {
		ClassMembersContext _localctx = new ClassMembersContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_classMembers);
		try {
			setState(644);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(637);
				((ClassMembersContext)_localctx).t1 = classMember();
				setState(638);
				((ClassMembersContext)_localctx).t2 = classMembers();
				((ClassMembersContext)_localctx).node = new ClassMemb(((ClassMembersContext)_localctx).t1.node,((ClassMembersContext)_localctx).t2.node);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(641);
				((ClassMembersContext)_localctx).t3 = classMember();
				((ClassMembersContext)_localctx).node = new ClassMemb1(((ClassMembersContext)_localctx).t3.node);
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

	public static class ClassMemberContext extends ParserRuleContext {
		public ASTNode node;
		public AccessSpecifierContext t1;
		public MemberDeclarationContext t2;
		public AccessSpecifierContext accessSpecifier() {
			return getRuleContext(AccessSpecifierContext.class,0);
		}
		public MemberDeclarationContext memberDeclaration() {
			return getRuleContext(MemberDeclarationContext.class,0);
		}
		public ClassMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesparserListener ) ((rulesparserListener)listener).enterClassMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesparserListener ) ((rulesparserListener)listener).exitClassMember(this);
		}
	}

	public final ClassMemberContext classMember() throws RecognitionException {
		ClassMemberContext _localctx = new ClassMemberContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_classMember);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(646);
			((ClassMemberContext)_localctx).t1 = accessSpecifier();
			setState(647);
			((ClassMemberContext)_localctx).t2 = memberDeclaration();
			((ClassMemberContext)_localctx).node = new ClassMemb3(((ClassMemberContext)_localctx).t1.val,((ClassMemberContext)_localctx).t2.node);
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

	public static class AccessSpecifierContext extends ParserRuleContext {
		public Integer val;
		public TerminalNode PRIVATE() { return getToken(rulesparserParser.PRIVATE, 0); }
		public TerminalNode COLON() { return getToken(rulesparserParser.COLON, 0); }
		public TerminalNode PROTECTED() { return getToken(rulesparserParser.PROTECTED, 0); }
		public TerminalNode PUBLIC() { return getToken(rulesparserParser.PUBLIC, 0); }
		public AccessSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesparserListener ) ((rulesparserListener)listener).enterAccessSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesparserListener ) ((rulesparserListener)listener).exitAccessSpecifier(this);
		}
	}

	public final AccessSpecifierContext accessSpecifier() throws RecognitionException {
		AccessSpecifierContext _localctx = new AccessSpecifierContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_accessSpecifier);
		try {
			setState(659);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIVATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(650);
				match(PRIVATE);
				setState(651);
				match(COLON);
				((AccessSpecifierContext)_localctx).val = 1;
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 2);
				{
				setState(653);
				match(PROTECTED);
				setState(654);
				match(COLON);
				((AccessSpecifierContext)_localctx).val = 2;
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 3);
				{
				setState(656);
				match(PUBLIC);
				setState(657);
				match(COLON);
				((AccessSpecifierContext)_localctx).val = 3;
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

	public static class MemberDeclarationContext extends ParserRuleContext {
		public ASTNode node;
		public TypeSpecifierContext t1;
		public Token ID;
		public TypeSpecifierContext t2;
		public Token INTEGER;
		public FunctionDeclaration1Context t3;
		public TerminalNode ID() { return getToken(rulesparserParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(rulesparserParser.SEMICOLON, 0); }
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public TerminalNode LSQBRACKET() { return getToken(rulesparserParser.LSQBRACKET, 0); }
		public TerminalNode INTEGER() { return getToken(rulesparserParser.INTEGER, 0); }
		public TerminalNode RSQBRACKET() { return getToken(rulesparserParser.RSQBRACKET, 0); }
		public FunctionDeclaration1Context functionDeclaration1() {
			return getRuleContext(FunctionDeclaration1Context.class,0);
		}
		public MemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesparserListener ) ((rulesparserListener)listener).enterMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesparserListener ) ((rulesparserListener)listener).exitMemberDeclaration(this);
		}
	}

	public final MemberDeclarationContext memberDeclaration() throws RecognitionException {
		MemberDeclarationContext _localctx = new MemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_memberDeclaration);
		try {
			setState(677);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(661);
				((MemberDeclarationContext)_localctx).t1 = typeSpecifier();
				setState(662);
				((MemberDeclarationContext)_localctx).ID = match(ID);
				setState(663);
				match(SEMICOLON);
				((MemberDeclarationContext)_localctx).node = new MembDec(((MemberDeclarationContext)_localctx).t1.val,(((MemberDeclarationContext)_localctx).ID!=null?((MemberDeclarationContext)_localctx).ID.getText():null));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(666);
				((MemberDeclarationContext)_localctx).t2 = typeSpecifier();
				setState(667);
				((MemberDeclarationContext)_localctx).ID = match(ID);
				setState(668);
				match(LSQBRACKET);
				setState(669);
				((MemberDeclarationContext)_localctx).INTEGER = match(INTEGER);
				setState(670);
				match(RSQBRACKET);
				setState(671);
				match(SEMICOLON);
				((MemberDeclarationContext)_localctx).node = new MembDec1(((MemberDeclarationContext)_localctx).t2.val,(((MemberDeclarationContext)_localctx).ID!=null?((MemberDeclarationContext)_localctx).ID.getText():null),Integer.parseInt((((MemberDeclarationContext)_localctx).INTEGER!=null?((MemberDeclarationContext)_localctx).INTEGER.getText():null)) );
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(674);
				((MemberDeclarationContext)_localctx).t3 = functionDeclaration1();
				((MemberDeclarationContext)_localctx).node = new FuncDec1(((MemberDeclarationContext)_localctx).t3.node);
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

	public static class FunctionDeclaration1Context extends ParserRuleContext {
		public ASTNode node;
		public TypeSpecifierContext t1;
		public Token ID;
		public ParameterListContext t2;
		public TypeSpecifierContext t3;
		public TerminalNode ID() { return getToken(rulesparserParser.ID, 0); }
		public TerminalNode LBRACKET() { return getToken(rulesparserParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(rulesparserParser.RBRACKET, 0); }
		public TerminalNode SEMICOLON() { return getToken(rulesparserParser.SEMICOLON, 0); }
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public FunctionDeclaration1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesparserListener ) ((rulesparserListener)listener).enterFunctionDeclaration1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesparserListener ) ((rulesparserListener)listener).exitFunctionDeclaration1(this);
		}
	}

	public final FunctionDeclaration1Context functionDeclaration1() throws RecognitionException {
		FunctionDeclaration1Context _localctx = new FunctionDeclaration1Context(_ctx, getState());
		enterRule(_localctx, 76, RULE_functionDeclaration1);
		try {
			setState(694);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(679);
				((FunctionDeclaration1Context)_localctx).t1 = typeSpecifier();
				setState(680);
				((FunctionDeclaration1Context)_localctx).ID = match(ID);
				setState(681);
				match(LBRACKET);
				setState(682);
				((FunctionDeclaration1Context)_localctx).t2 = parameterList();
				setState(683);
				match(RBRACKET);
				setState(684);
				match(SEMICOLON);
				((FunctionDeclaration1Context)_localctx).node = new FuncDec(((FunctionDeclaration1Context)_localctx).t1.val,(((FunctionDeclaration1Context)_localctx).ID!=null?((FunctionDeclaration1Context)_localctx).ID.getText():null), ((FunctionDeclaration1Context)_localctx).t2.node);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(687);
				((FunctionDeclaration1Context)_localctx).t3 = typeSpecifier();
				setState(688);
				((FunctionDeclaration1Context)_localctx).ID = match(ID);
				setState(689);
				match(LBRACKET);
				setState(690);
				match(RBRACKET);
				setState(691);
				match(SEMICOLON);
				((FunctionDeclaration1Context)_localctx).node = new FuncDec2(((FunctionDeclaration1Context)_localctx).t3.val,(((FunctionDeclaration1Context)_localctx).ID!=null?((FunctionDeclaration1Context)_localctx).ID.getText():null));
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

	public static class TypeSpecifierContext extends ParserRuleContext {
		public Integer val;
		public String funtype;
		public TerminalNode INT() { return getToken(rulesparserParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(rulesparserParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(rulesparserParser.DOUBLE, 0); }
		public TerminalNode CHAR() { return getToken(rulesparserParser.CHAR, 0); }
		public TerminalNode BOOL() { return getToken(rulesparserParser.BOOL, 0); }
		public TerminalNode ID() { return getToken(rulesparserParser.ID, 0); }
		public TerminalNode VOID() { return getToken(rulesparserParser.VOID, 0); }
		public TypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesparserListener ) ((rulesparserListener)listener).enterTypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesparserListener ) ((rulesparserListener)listener).exitTypeSpecifier(this);
		}
	}

	public final TypeSpecifierContext typeSpecifier() throws RecognitionException {
		TypeSpecifierContext _localctx = new TypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_typeSpecifier);
		try {
			setState(711);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(696);
				match(INT);
				((TypeSpecifierContext)_localctx).val = 1; ((TypeSpecifierContext)_localctx).funtype =  "Integer";
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(698);
				match(FLOAT);
				((TypeSpecifierContext)_localctx).val = 2; ((TypeSpecifierContext)_localctx).funtype =  "Float";
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(700);
				match(DOUBLE);
				((TypeSpecifierContext)_localctx).val = 3; ((TypeSpecifierContext)_localctx).funtype =  "Double";
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(702);
				match(CHAR);
				((TypeSpecifierContext)_localctx).val = 4;((TypeSpecifierContext)_localctx).funtype =  "Char";
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(704);
				match(BOOL);
				((TypeSpecifierContext)_localctx).val = 5;((TypeSpecifierContext)_localctx).funtype =  "Bool";
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(706);
				match(ID);
				((TypeSpecifierContext)_localctx).val = 6;((TypeSpecifierContext)_localctx).funtype =  "Variable";
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(708);
				match(VOID);
				((TypeSpecifierContext)_localctx).val = 7;((TypeSpecifierContext)_localctx).funtype =  "Void";
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 11:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 14:
			return logicalOrExpression_sempred((LogicalOrExpressionContext)_localctx, predIndex);
		case 15:
			return logicalAndExpression_sempred((LogicalAndExpressionContext)_localctx, predIndex);
		case 16:
			return inclusiveOrExpression_sempred((InclusiveOrExpressionContext)_localctx, predIndex);
		case 17:
			return exclusiveOrExpression_sempred((ExclusiveOrExpressionContext)_localctx, predIndex);
		case 18:
			return andExpression_sempred((AndExpressionContext)_localctx, predIndex);
		case 19:
			return equalityExpression_sempred((EqualityExpressionContext)_localctx, predIndex);
		case 20:
			return relationalExpression_sempred((RelationalExpressionContext)_localctx, predIndex);
		case 21:
			return shiftExpression_sempred((ShiftExpressionContext)_localctx, predIndex);
		case 22:
			return additiveExpression_sempred((AdditiveExpressionContext)_localctx, predIndex);
		case 23:
			return multiplicativeExpression_sempred((MultiplicativeExpressionContext)_localctx, predIndex);
		case 25:
			return postfixExpression_sempred((PostfixExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logicalOrExpression_sempred(LogicalOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logicalAndExpression_sempred(LogicalAndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean inclusiveOrExpression_sempred(InclusiveOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean exclusiveOrExpression_sempred(ExclusiveOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean andExpression_sempred(AndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean equalityExpression_sempred(EqualityExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 2);
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relationalExpression_sempred(RelationalExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 4);
		case 9:
			return precpred(_ctx, 3);
		case 10:
			return precpred(_ctx, 2);
		case 11:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean shiftExpression_sempred(ShiftExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return precpred(_ctx, 2);
		case 13:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean additiveExpression_sempred(AdditiveExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 14:
			return precpred(_ctx, 2);
		case 15:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean multiplicativeExpression_sempred(MultiplicativeExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 16:
			return precpred(_ctx, 3);
		case 17:
			return precpred(_ctx, 2);
		case 18:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean postfixExpression_sempred(PostfixExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 19:
			return precpred(_ctx, 6);
		case 20:
			return precpred(_ctx, 5);
		case 21:
			return precpred(_ctx, 4);
		case 22:
			return precpred(_ctx, 3);
		case 23:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u009e\u02ca\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"b\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002q\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003\u0082\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u008b\b\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0096\b\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00a8\b\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00b4\b\u0007\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0003\b\u00c2\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0003\t\u00dd\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00e8\b\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0005\u000b\u00f3\b\u000b\n\u000b\f\u000b\u00f6\t\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003"+
		"\f\u0100\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0003\r\u010c\b\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0005\u000e\u0117\b\u000e\n\u000e\f\u000e\u011a\t\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0005\u000f\u0125\b\u000f\n\u000f\f\u000f\u0128\t\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u0133\b\u0010\n\u0010"+
		"\f\u0010\u0136\t\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011"+
		"\u0141\b\u0011\n\u0011\f\u0011\u0144\t\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0005\u0012\u014f\b\u0012\n\u0012\f\u0012\u0152\t\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0005\u0013\u0162\b\u0013\n\u0013\f\u0013\u0165\t\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005"+
		"\u0014\u017f\b\u0014\n\u0014\f\u0014\u0182\t\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0005\u0015\u0192\b\u0015\n\u0015\f\u0015\u0195\t\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0005\u0016\u01a5\b\u0016\n\u0016\f\u0016\u01a8\t\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0005\u0017\u01bd\b\u0017\n\u0017\f\u0017\u01c0\t\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0003\u0018\u01dd\b\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u01e6"+
		"\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u01fc\b\u0019\n\u0019\f\u0019"+
		"\u01ff\t\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0216\b\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0222\b\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0003\u001c\u022b\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0003\u001d\u0236\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0003\u001e\u0248\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0003\u001f\u025a\b\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u0275"+
		"\b \u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u0285\b\"\u0001#\u0001#\u0001"+
		"#\u0001#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0003$\u0294\b$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0003%\u02a6"+
		"\b%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0003&\u02b7\b&\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0003\'\u02c8\b\'\u0001\'\u0000\f\u0016\u001c"+
		"\u001e \"$&(*,.2(\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLN\u0000\u0000\u02f9"+
		"\u0000P\u0001\u0000\u0000\u0000\u0002a\u0001\u0000\u0000\u0000\u0004p"+
		"\u0001\u0000\u0000\u0000\u0006\u0081\u0001\u0000\u0000\u0000\b\u008a\u0001"+
		"\u0000\u0000\u0000\n\u0095\u0001\u0000\u0000\u0000\f\u00a7\u0001\u0000"+
		"\u0000\u0000\u000e\u00b3\u0001\u0000\u0000\u0000\u0010\u00c1\u0001\u0000"+
		"\u0000\u0000\u0012\u00dc\u0001\u0000\u0000\u0000\u0014\u00e7\u0001\u0000"+
		"\u0000\u0000\u0016\u00e9\u0001\u0000\u0000\u0000\u0018\u00ff\u0001\u0000"+
		"\u0000\u0000\u001a\u010b\u0001\u0000\u0000\u0000\u001c\u010d\u0001\u0000"+
		"\u0000\u0000\u001e\u011b\u0001\u0000\u0000\u0000 \u0129\u0001\u0000\u0000"+
		"\u0000\"\u0137\u0001\u0000\u0000\u0000$\u0145\u0001\u0000\u0000\u0000"+
		"&\u0153\u0001\u0000\u0000\u0000(\u0166\u0001\u0000\u0000\u0000*\u0183"+
		"\u0001\u0000\u0000\u0000,\u0196\u0001\u0000\u0000\u0000.\u01a9\u0001\u0000"+
		"\u0000\u00000\u01dc\u0001\u0000\u0000\u00002\u01e5\u0001\u0000\u0000\u0000"+
		"4\u0215\u0001\u0000\u0000\u00006\u0221\u0001\u0000\u0000\u00008\u022a"+
		"\u0001\u0000\u0000\u0000:\u0235\u0001\u0000\u0000\u0000<\u0247\u0001\u0000"+
		"\u0000\u0000>\u0259\u0001\u0000\u0000\u0000@\u0274\u0001\u0000\u0000\u0000"+
		"B\u0276\u0001\u0000\u0000\u0000D\u0284\u0001\u0000\u0000\u0000F\u0286"+
		"\u0001\u0000\u0000\u0000H\u0293\u0001\u0000\u0000\u0000J\u02a5\u0001\u0000"+
		"\u0000\u0000L\u02b6\u0001\u0000\u0000\u0000N\u02c7\u0001\u0000\u0000\u0000"+
		"PQ\u0003\u0002\u0001\u0000QR\u0006\u0000\uffff\uffff\u0000R\u0001\u0001"+
		"\u0000\u0000\u0000ST\u0003\u0004\u0002\u0000TU\u0003\u0002\u0001\u0000"+
		"UV\u0006\u0001\uffff\uffff\u0000Vb\u0001\u0000\u0000\u0000WX\u0003\u0004"+
		"\u0002\u0000XY\u0006\u0001\uffff\uffff\u0000Yb\u0001\u0000\u0000\u0000"+
		"Z[\u0003B!\u0000[\\\u0003\u0002\u0001\u0000\\]\u0006\u0001\uffff\uffff"+
		"\u0000]b\u0001\u0000\u0000\u0000^_\u0003B!\u0000_`\u0006\u0001\uffff\uffff"+
		"\u0000`b\u0001\u0000\u0000\u0000aS\u0001\u0000\u0000\u0000aW\u0001\u0000"+
		"\u0000\u0000aZ\u0001\u0000\u0000\u0000a^\u0001\u0000\u0000\u0000b\u0003"+
		"\u0001\u0000\u0000\u0000cd\u0003N\'\u0000de\u0005\u0093\u0000\u0000ef"+
		"\u0005g\u0000\u0000fg\u0006\u0002\uffff\uffff\u0000gq\u0001\u0000\u0000"+
		"\u0000hi\u0003N\'\u0000ij\u0005\u0094\u0000\u0000jk\u0005g\u0000\u0000"+
		"kl\u0006\u0002\uffff\uffff\u0000lq\u0001\u0000\u0000\u0000mn\u0003\u0006"+
		"\u0003\u0000no\u0006\u0002\uffff\uffff\u0000oq\u0001\u0000\u0000\u0000"+
		"pc\u0001\u0000\u0000\u0000ph\u0001\u0000\u0000\u0000pm\u0001\u0000\u0000"+
		"\u0000q\u0005\u0001\u0000\u0000\u0000rs\u0003N\'\u0000st\u0005\u0093\u0000"+
		"\u0000tu\u0005l\u0000\u0000uv\u0005m\u0000\u0000vw\u0003\u000e\u0007\u0000"+
		"wx\u0006\u0003\uffff\uffff\u0000x\u0082\u0001\u0000\u0000\u0000yz\u0003"+
		"N\'\u0000z{\u0005\u0093\u0000\u0000{|\u0005l\u0000\u0000|}\u0003\b\u0004"+
		"\u0000}~\u0005m\u0000\u0000~\u007f\u0003\u000e\u0007\u0000\u007f\u0080"+
		"\u0006\u0003\uffff\uffff\u0000\u0080\u0082\u0001\u0000\u0000\u0000\u0081"+
		"r\u0001\u0000\u0000\u0000\u0081y\u0001\u0000\u0000\u0000\u0082\u0007\u0001"+
		"\u0000\u0000\u0000\u0083\u0084\u0003\f\u0006\u0000\u0084\u0085\u0003\n"+
		"\u0005\u0000\u0085\u0086\u0006\u0004\uffff\uffff\u0000\u0086\u008b\u0001"+
		"\u0000\u0000\u0000\u0087\u0088\u0003\f\u0006\u0000\u0088\u0089\u0006\u0004"+
		"\uffff\uffff\u0000\u0089\u008b\u0001\u0000\u0000\u0000\u008a\u0083\u0001"+
		"\u0000\u0000\u0000\u008a\u0087\u0001\u0000\u0000\u0000\u008b\t\u0001\u0000"+
		"\u0000\u0000\u008c\u008d\u0005h\u0000\u0000\u008d\u008e\u0003\f\u0006"+
		"\u0000\u008e\u008f\u0003\n\u0005\u0000\u008f\u0090\u0006\u0005\uffff\uffff"+
		"\u0000\u0090\u0096\u0001\u0000\u0000\u0000\u0091\u0092\u0005h\u0000\u0000"+
		"\u0092\u0093\u0003\f\u0006\u0000\u0093\u0094\u0006\u0005\uffff\uffff\u0000"+
		"\u0094\u0096\u0001\u0000\u0000\u0000\u0095\u008c\u0001\u0000\u0000\u0000"+
		"\u0095\u0091\u0001\u0000\u0000\u0000\u0096\u000b\u0001\u0000\u0000\u0000"+
		"\u0097\u0098\u0003N\'\u0000\u0098\u0099\u0005\u0093\u0000\u0000\u0099"+
		"\u009a\u0006\u0006\uffff\uffff\u0000\u009a\u00a8\u0001\u0000\u0000\u0000"+
		"\u009b\u009c\u0003N\'\u0000\u009c\u009d\u0005\u0093\u0000\u0000\u009d"+
		"\u009e\u0005n\u0000\u0000\u009e\u009f\u0005o\u0000\u0000\u009f\u00a0\u0006"+
		"\u0006\uffff\uffff\u0000\u00a0\u00a8\u0001\u0000\u0000\u0000\u00a1\u00a2"+
		"\u0003\u0012\t\u0000\u00a2\u00a3\u0006\u0006\uffff\uffff\u0000\u00a3\u00a8"+
		"\u0001\u0000\u0000\u0000\u00a4\u00a5\u0003N\'\u0000\u00a5\u00a6\u0006"+
		"\u0006\uffff\uffff\u0000\u00a6\u00a8\u0001\u0000\u0000\u0000\u00a7\u0097"+
		"\u0001\u0000\u0000\u0000\u00a7\u009b\u0001\u0000\u0000\u0000\u00a7\u00a1"+
		"\u0001\u0000\u0000\u0000\u00a7\u00a4\u0001\u0000\u0000\u0000\u00a8\r\u0001"+
		"\u0000\u0000\u0000\u00a9\u00aa\u0005j\u0000\u0000\u00aa\u00ab\u0003\u0010"+
		"\b\u0000\u00ab\u00ac\u0005k\u0000\u0000\u00ac\u00ad\u0006\u0007\uffff"+
		"\uffff\u0000\u00ad\u00b4\u0001\u0000\u0000\u0000\u00ae\u00af\u0005j\u0000"+
		"\u0000\u00af\u00b0\u0005k\u0000\u0000\u00b0\u00b4\u0006\u0007\uffff\uffff"+
		"\u0000\u00b1\u00b2\u0005g\u0000\u0000\u00b2\u00b4\u0006\u0007\uffff\uffff"+
		"\u0000\u00b3\u00a9\u0001\u0000\u0000\u0000\u00b3\u00ae\u0001\u0000\u0000"+
		"\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b4\u000f\u0001\u0000\u0000"+
		"\u0000\u00b5\u00b6\u0003\u0012\t\u0000\u00b6\u00b7\u0003\u0010\b\u0000"+
		"\u00b7\u00b8\u0006\b\uffff\uffff\u0000\u00b8\u00c2\u0001\u0000\u0000\u0000"+
		"\u00b9\u00ba\u0003\u0012\t\u0000\u00ba\u00bb\u0006\b\uffff\uffff\u0000"+
		"\u00bb\u00c2\u0001\u0000\u0000\u0000\u00bc\u00bd\u0003\u0004\u0002\u0000"+
		"\u00bd\u00be\u0003\u0010\b\u0000\u00be\u00bf\u0006\b\uffff\uffff\u0000"+
		"\u00bf\u00c2\u0001\u0000\u0000\u0000\u00c0\u00c2\u0006\b\uffff\uffff\u0000"+
		"\u00c1\u00b5\u0001\u0000\u0000\u0000\u00c1\u00b9\u0001\u0000\u0000\u0000"+
		"\u00c1\u00bc\u0001\u0000\u0000\u0000\u00c1\u00c0\u0001\u0000\u0000\u0000"+
		"\u00c2\u0011\u0001\u0000\u0000\u0000\u00c3\u00c4\u0003\u0014\n\u0000\u00c4"+
		"\u00c5\u0006\t\uffff\uffff\u0000\u00c5\u00dd\u0001\u0000\u0000\u0000\u00c6"+
		"\u00c7\u0003\u000e\u0007\u0000\u00c7\u00c8\u0006\t\uffff\uffff\u0000\u00c8"+
		"\u00dd\u0001\u0000\u0000\u0000\u00c9\u00ca\u0003<\u001e\u0000\u00ca\u00cb"+
		"\u0006\t\uffff\uffff\u0000\u00cb\u00dd\u0001\u0000\u0000\u0000\u00cc\u00cd"+
		"\u0003>\u001f\u0000\u00cd\u00ce\u0006\t\uffff\uffff\u0000\u00ce\u00dd"+
		"\u0001\u0000\u0000\u0000\u00cf\u00d0\u0003@ \u0000\u00d0\u00d1\u0006\t"+
		"\uffff\uffff\u0000\u00d1\u00dd\u0001\u0000\u0000\u0000\u00d2\u00d3\u0005"+
		")\u0000\u0000\u00d3\u00d4\u0005\u0081\u0000\u0000\u00d4\u00d5\u0005\u009d"+
		"\u0000\u0000\u00d5\u00d6\u0005g\u0000\u0000\u00d6\u00dd\u0006\t\uffff"+
		"\uffff\u0000\u00d7\u00d8\u0005*\u0000\u0000\u00d8\u00d9\u0005\u0082\u0000"+
		"\u0000\u00d9\u00da\u0005\u0093\u0000\u0000\u00da\u00db\u0005g\u0000\u0000"+
		"\u00db\u00dd\u0006\t\uffff\uffff\u0000\u00dc\u00c3\u0001\u0000\u0000\u0000"+
		"\u00dc\u00c6\u0001\u0000\u0000\u0000\u00dc\u00c9\u0001\u0000\u0000\u0000"+
		"\u00dc\u00cc\u0001\u0000\u0000\u0000\u00dc\u00cf\u0001\u0000\u0000\u0000"+
		"\u00dc\u00d2\u0001\u0000\u0000\u0000\u00dc\u00d7\u0001\u0000\u0000\u0000"+
		"\u00dd\u0013\u0001\u0000\u0000\u0000\u00de\u00df\u0003\u0016\u000b\u0000"+
		"\u00df\u00e0\u0006\n\uffff\uffff\u0000\u00e0\u00e8\u0001\u0000\u0000\u0000"+
		"\u00e1\u00e2\u0003\u0016\u000b\u0000\u00e2\u00e3\u0005g\u0000\u0000\u00e3"+
		"\u00e4\u0006\n\uffff\uffff\u0000\u00e4\u00e8\u0001\u0000\u0000\u0000\u00e5"+
		"\u00e6\u0005g\u0000\u0000\u00e6\u00e8\u0006\n\uffff\uffff\u0000\u00e7"+
		"\u00de\u0001\u0000\u0000\u0000\u00e7\u00e1\u0001\u0000\u0000\u0000\u00e7"+
		"\u00e5\u0001\u0000\u0000\u0000\u00e8\u0015\u0001\u0000\u0000\u0000\u00e9"+
		"\u00ea\u0006\u000b\uffff\uffff\u0000\u00ea\u00eb\u0003\u0018\f\u0000\u00eb"+
		"\u00ec\u0006\u000b\uffff\uffff\u0000\u00ec\u00f4\u0001\u0000\u0000\u0000"+
		"\u00ed\u00ee\n\u0001\u0000\u0000\u00ee\u00ef\u0005h\u0000\u0000\u00ef"+
		"\u00f0\u0003\u0018\f\u0000\u00f0\u00f1\u0006\u000b\uffff\uffff\u0000\u00f1"+
		"\u00f3\u0001\u0000\u0000\u0000\u00f2\u00ed\u0001\u0000\u0000\u0000\u00f3"+
		"\u00f6\u0001\u0000\u0000\u0000\u00f4\u00f2\u0001\u0000\u0000\u0000\u00f4"+
		"\u00f5\u0001\u0000\u0000\u0000\u00f5\u0017\u0001\u0000\u0000\u0000\u00f6"+
		"\u00f4\u0001\u0000\u0000\u0000\u00f7\u00f8\u0003\u001a\r\u0000\u00f8\u00f9"+
		"\u0006\f\uffff\uffff\u0000\u00f9\u0100\u0001\u0000\u0000\u0000\u00fa\u00fb"+
		"\u00030\u0018\u0000\u00fb\u00fc\u0005}\u0000\u0000\u00fc\u00fd\u0003\u0018"+
		"\f\u0000\u00fd\u00fe\u0006\f\uffff\uffff\u0000\u00fe\u0100\u0001\u0000"+
		"\u0000\u0000\u00ff\u00f7\u0001\u0000\u0000\u0000\u00ff\u00fa\u0001\u0000"+
		"\u0000\u0000\u0100\u0019\u0001\u0000\u0000\u0000\u0101\u0102\u0003\u001c"+
		"\u000e\u0000\u0102\u0103\u0006\r\uffff\uffff\u0000\u0103\u010c\u0001\u0000"+
		"\u0000\u0000\u0104\u0105\u0003\u001c\u000e\u0000\u0105\u0106\u0005i\u0000"+
		"\u0000\u0106\u0107\u0003\u0016\u000b\u0000\u0107\u0108\u0005i\u0000\u0000"+
		"\u0108\u0109\u0003\u001a\r\u0000\u0109\u010a\u0006\r\uffff\uffff\u0000"+
		"\u010a\u010c\u0001\u0000\u0000\u0000\u010b\u0101\u0001\u0000\u0000\u0000"+
		"\u010b\u0104\u0001\u0000\u0000\u0000\u010c\u001b\u0001\u0000\u0000\u0000"+
		"\u010d\u010e\u0006\u000e\uffff\uffff\u0000\u010e\u010f\u0003\u001e\u000f"+
		"\u0000\u010f\u0110\u0006\u000e\uffff\uffff\u0000\u0110\u0118\u0001\u0000"+
		"\u0000\u0000\u0111\u0112\n\u0001\u0000\u0000\u0112\u0113\u0005\u0086\u0000"+
		"\u0000\u0113\u0114\u0003\u001e\u000f\u0000\u0114\u0115\u0006\u000e\uffff"+
		"\uffff\u0000\u0115\u0117\u0001\u0000\u0000\u0000\u0116\u0111\u0001\u0000"+
		"\u0000\u0000\u0117\u011a\u0001\u0000\u0000\u0000\u0118\u0116\u0001\u0000"+
		"\u0000\u0000\u0118\u0119\u0001\u0000\u0000\u0000\u0119\u001d\u0001\u0000"+
		"\u0000\u0000\u011a\u0118\u0001\u0000\u0000\u0000\u011b\u011c\u0006\u000f"+
		"\uffff\uffff\u0000\u011c\u011d\u0003 \u0010\u0000\u011d\u011e\u0006\u000f"+
		"\uffff\uffff\u0000\u011e\u0126\u0001\u0000\u0000\u0000\u011f\u0120\n\u0001"+
		"\u0000\u0000\u0120\u0121\u0005\u0085\u0000\u0000\u0121\u0122\u0003 \u0010"+
		"\u0000\u0122\u0123\u0006\u000f\uffff\uffff\u0000\u0123\u0125\u0001\u0000"+
		"\u0000\u0000\u0124\u011f\u0001\u0000\u0000\u0000\u0125\u0128\u0001\u0000"+
		"\u0000\u0000\u0126\u0124\u0001\u0000\u0000\u0000\u0126\u0127\u0001\u0000"+
		"\u0000\u0000\u0127\u001f\u0001\u0000\u0000\u0000\u0128\u0126\u0001\u0000"+
		"\u0000\u0000\u0129\u012a\u0006\u0010\uffff\uffff\u0000\u012a\u012b\u0003"+
		"\"\u0011\u0000\u012b\u012c\u0006\u0010\uffff\uffff\u0000\u012c\u0134\u0001"+
		"\u0000\u0000\u0000\u012d\u012e\n\u0001\u0000\u0000\u012e\u012f\u0005{"+
		"\u0000\u0000\u012f\u0130\u0003\"\u0011\u0000\u0130\u0131\u0006\u0010\uffff"+
		"\uffff\u0000\u0131\u0133\u0001\u0000\u0000\u0000\u0132\u012d\u0001\u0000"+
		"\u0000\u0000\u0133\u0136\u0001\u0000\u0000\u0000\u0134\u0132\u0001\u0000"+
		"\u0000\u0000\u0134\u0135\u0001\u0000\u0000\u0000\u0135!\u0001\u0000\u0000"+
		"\u0000\u0136\u0134\u0001\u0000\u0000\u0000\u0137\u0138\u0006\u0011\uffff"+
		"\uffff\u0000\u0138\u0139\u0003$\u0012\u0000\u0139\u013a\u0006\u0011\uffff"+
		"\uffff\u0000\u013a\u0142\u0001\u0000\u0000\u0000\u013b\u013c\n\u0001\u0000"+
		"\u0000\u013c\u013d\u0005|\u0000\u0000\u013d\u013e\u0003$\u0012\u0000\u013e"+
		"\u013f\u0006\u0011\uffff\uffff\u0000\u013f\u0141\u0001\u0000\u0000\u0000"+
		"\u0140\u013b\u0001\u0000\u0000\u0000\u0141\u0144\u0001\u0000\u0000\u0000"+
		"\u0142\u0140\u0001\u0000\u0000\u0000\u0142\u0143\u0001\u0000\u0000\u0000"+
		"\u0143#\u0001\u0000\u0000\u0000\u0144\u0142\u0001\u0000\u0000\u0000\u0145"+
		"\u0146\u0006\u0012\uffff\uffff\u0000\u0146\u0147\u0003&\u0013\u0000\u0147"+
		"\u0148\u0006\u0012\uffff\uffff\u0000\u0148\u0150\u0001\u0000\u0000\u0000"+
		"\u0149\u014a\n\u0001\u0000\u0000\u014a\u014b\u0005z\u0000\u0000\u014b"+
		"\u014c\u0003&\u0013\u0000\u014c\u014d\u0006\u0012\uffff\uffff\u0000\u014d"+
		"\u014f\u0001\u0000\u0000\u0000\u014e\u0149\u0001\u0000\u0000\u0000\u014f"+
		"\u0152\u0001\u0000\u0000\u0000\u0150\u014e\u0001\u0000\u0000\u0000\u0150"+
		"\u0151\u0001\u0000\u0000\u0000\u0151%\u0001\u0000\u0000\u0000\u0152\u0150"+
		"\u0001\u0000\u0000\u0000\u0153\u0154\u0006\u0013\uffff\uffff\u0000\u0154"+
		"\u0155\u0003(\u0014\u0000\u0155\u0156\u0006\u0013\uffff\uffff\u0000\u0156"+
		"\u0163\u0001\u0000\u0000\u0000\u0157\u0158\n\u0002\u0000\u0000\u0158\u0159"+
		"\u0005\u0087\u0000\u0000\u0159\u015a\u0003(\u0014\u0000\u015a\u015b\u0006"+
		"\u0013\uffff\uffff\u0000\u015b\u0162\u0001\u0000\u0000\u0000\u015c\u015d"+
		"\n\u0001\u0000\u0000\u015d\u015e\u0005\u0088\u0000\u0000\u015e\u015f\u0003"+
		"(\u0014\u0000\u015f\u0160\u0006\u0013\uffff\uffff\u0000\u0160\u0162\u0001"+
		"\u0000\u0000\u0000\u0161\u0157\u0001\u0000\u0000\u0000\u0161\u015c\u0001"+
		"\u0000\u0000\u0000\u0162\u0165\u0001\u0000\u0000\u0000\u0163\u0161\u0001"+
		"\u0000\u0000\u0000\u0163\u0164\u0001\u0000\u0000\u0000\u0164\'\u0001\u0000"+
		"\u0000\u0000\u0165\u0163\u0001\u0000\u0000\u0000\u0166\u0167\u0006\u0014"+
		"\uffff\uffff\u0000\u0167\u0168\u0003*\u0015\u0000\u0168\u0169\u0006\u0014"+
		"\uffff\uffff\u0000\u0169\u0180\u0001\u0000\u0000\u0000\u016a\u016b\n\u0004"+
		"\u0000\u0000\u016b\u016c\u0005x\u0000\u0000\u016c\u016d\u0003*\u0015\u0000"+
		"\u016d\u016e\u0006\u0014\uffff\uffff\u0000\u016e\u017f\u0001\u0000\u0000"+
		"\u0000\u016f\u0170\n\u0003\u0000\u0000\u0170\u0171\u0005\u0083\u0000\u0000"+
		"\u0171\u0172\u0003*\u0015\u0000\u0172\u0173\u0006\u0014\uffff\uffff\u0000"+
		"\u0173\u017f\u0001\u0000\u0000\u0000\u0174\u0175\n\u0002\u0000\u0000\u0175"+
		"\u0176\u0005y\u0000\u0000\u0176\u0177\u0003*\u0015\u0000\u0177\u0178\u0006"+
		"\u0014\uffff\uffff\u0000\u0178\u017f\u0001\u0000\u0000\u0000\u0179\u017a"+
		"\n\u0001\u0000\u0000\u017a\u017b\u0005\u0084\u0000\u0000\u017b\u017c\u0003"+
		"*\u0015\u0000\u017c\u017d\u0006\u0014\uffff\uffff\u0000\u017d\u017f\u0001"+
		"\u0000\u0000\u0000\u017e\u016a\u0001\u0000\u0000\u0000\u017e\u016f\u0001"+
		"\u0000\u0000\u0000\u017e\u0174\u0001\u0000\u0000\u0000\u017e\u0179\u0001"+
		"\u0000\u0000\u0000\u017f\u0182\u0001\u0000\u0000\u0000\u0180\u017e\u0001"+
		"\u0000\u0000\u0000\u0180\u0181\u0001\u0000\u0000\u0000\u0181)\u0001\u0000"+
		"\u0000\u0000\u0182\u0180\u0001\u0000\u0000\u0000\u0183\u0184\u0006\u0015"+
		"\uffff\uffff\u0000\u0184\u0185\u0003,\u0016\u0000\u0185\u0186\u0006\u0015"+
		"\uffff\uffff\u0000\u0186\u0193\u0001\u0000\u0000\u0000\u0187\u0188\n\u0002"+
		"\u0000\u0000\u0188\u0189\u0005\u0081\u0000\u0000\u0189\u018a\u0003,\u0016"+
		"\u0000\u018a\u018b\u0006\u0015\uffff\uffff\u0000\u018b\u0192\u0001\u0000"+
		"\u0000\u0000\u018c\u018d\n\u0001\u0000\u0000\u018d\u018e\u0005\u0082\u0000"+
		"\u0000\u018e\u018f\u0003,\u0016\u0000\u018f\u0190\u0006\u0015\uffff\uffff"+
		"\u0000\u0190\u0192\u0001\u0000\u0000\u0000\u0191\u0187\u0001\u0000\u0000"+
		"\u0000\u0191\u018c\u0001\u0000\u0000\u0000\u0192\u0195\u0001\u0000\u0000"+
		"\u0000\u0193\u0191\u0001\u0000\u0000\u0000\u0193\u0194\u0001\u0000\u0000"+
		"\u0000\u0194+\u0001\u0000\u0000\u0000\u0195\u0193\u0001\u0000\u0000\u0000"+
		"\u0196\u0197\u0006\u0016\uffff\uffff\u0000\u0197\u0198\u0003.\u0017\u0000"+
		"\u0198\u0199\u0006\u0016\uffff\uffff\u0000\u0199\u01a6\u0001\u0000\u0000"+
		"\u0000\u019a\u019b\n\u0002\u0000\u0000\u019b\u019c\u0005q\u0000\u0000"+
		"\u019c\u019d\u0003.\u0017\u0000\u019d\u019e\u0006\u0016\uffff\uffff\u0000"+
		"\u019e\u01a5\u0001\u0000\u0000\u0000\u019f\u01a0\n\u0001\u0000\u0000\u01a0"+
		"\u01a1\u0005r\u0000\u0000\u01a1\u01a2\u0003.\u0017\u0000\u01a2\u01a3\u0006"+
		"\u0016\uffff\uffff\u0000\u01a3\u01a5\u0001\u0000\u0000\u0000\u01a4\u019a"+
		"\u0001\u0000\u0000\u0000\u01a4\u019f\u0001\u0000\u0000\u0000\u01a5\u01a8"+
		"\u0001\u0000\u0000\u0000\u01a6\u01a4\u0001\u0000\u0000\u0000\u01a6\u01a7"+
		"\u0001\u0000\u0000\u0000\u01a7-\u0001\u0000\u0000\u0000\u01a8\u01a6\u0001"+
		"\u0000\u0000\u0000\u01a9\u01aa\u0006\u0017\uffff\uffff\u0000\u01aa\u01ab"+
		"\u00030\u0018\u0000\u01ab\u01ac\u0006\u0017\uffff\uffff\u0000\u01ac\u01be"+
		"\u0001\u0000\u0000\u0000\u01ad\u01ae\n\u0003\u0000\u0000\u01ae\u01af\u0005"+
		"s\u0000\u0000\u01af\u01b0\u00030\u0018\u0000\u01b0\u01b1\u0006\u0017\uffff"+
		"\uffff\u0000\u01b1\u01bd\u0001\u0000\u0000\u0000\u01b2\u01b3\n\u0002\u0000"+
		"\u0000\u01b3\u01b4\u0005t\u0000\u0000\u01b4\u01b5\u00030\u0018\u0000\u01b5"+
		"\u01b6\u0006\u0017\uffff\uffff\u0000\u01b6\u01bd\u0001\u0000\u0000\u0000"+
		"\u01b7\u01b8\n\u0001\u0000\u0000\u01b8\u01b9\u0005w\u0000\u0000\u01b9"+
		"\u01ba\u00030\u0018\u0000\u01ba\u01bb\u0006\u0017\uffff\uffff\u0000\u01bb"+
		"\u01bd\u0001\u0000\u0000\u0000\u01bc\u01ad\u0001\u0000\u0000\u0000\u01bc"+
		"\u01b2\u0001\u0000\u0000\u0000\u01bc\u01b7\u0001\u0000\u0000\u0000\u01bd"+
		"\u01c0\u0001\u0000\u0000\u0000\u01be\u01bc\u0001\u0000\u0000\u0000\u01be"+
		"\u01bf\u0001\u0000\u0000\u0000\u01bf/\u0001\u0000\u0000\u0000\u01c0\u01be"+
		"\u0001\u0000\u0000\u0000\u01c1\u01c2\u00032\u0019\u0000\u01c2\u01c3\u0006"+
		"\u0018\uffff\uffff\u0000\u01c3\u01dd\u0001\u0000\u0000\u0000\u01c4\u01c5"+
		"\u0005q\u0000\u0000\u01c5\u01c6\u00030\u0018\u0000\u01c6\u01c7\u0006\u0018"+
		"\uffff\uffff\u0000\u01c7\u01dd\u0001\u0000\u0000\u0000\u01c8\u01c9\u0005"+
		"r\u0000\u0000\u01c9\u01ca\u00030\u0018\u0000\u01ca\u01cb\u0006\u0018\uffff"+
		"\uffff\u0000\u01cb\u01dd\u0001\u0000\u0000\u0000\u01cc\u01cd\u0005u\u0000"+
		"\u0000\u01cd\u01ce\u00030\u0018\u0000\u01ce\u01cf\u0006\u0018\uffff\uffff"+
		"\u0000\u01cf\u01dd\u0001\u0000\u0000\u0000\u01d0\u01d1\u0005v\u0000\u0000"+
		"\u01d1\u01d2\u00030\u0018\u0000\u01d2\u01d3\u0006\u0018\uffff\uffff\u0000"+
		"\u01d3\u01dd\u0001\u0000\u0000\u0000\u01d4\u01d5\u0005\u007f\u0000\u0000"+
		"\u01d5\u01d6\u00030\u0018\u0000\u01d6\u01d7\u0006\u0018\uffff\uffff\u0000"+
		"\u01d7\u01dd\u0001\u0000\u0000\u0000\u01d8\u01d9\u0005\u0080\u0000\u0000"+
		"\u01d9\u01da\u00030\u0018\u0000\u01da\u01db\u0006\u0018\uffff\uffff\u0000"+
		"\u01db\u01dd\u0001\u0000\u0000\u0000\u01dc\u01c1\u0001\u0000\u0000\u0000"+
		"\u01dc\u01c4\u0001\u0000\u0000\u0000\u01dc\u01c8\u0001\u0000\u0000\u0000"+
		"\u01dc\u01cc\u0001\u0000\u0000\u0000\u01dc\u01d0\u0001\u0000\u0000\u0000"+
		"\u01dc\u01d4\u0001\u0000\u0000\u0000\u01dc\u01d8\u0001\u0000\u0000\u0000"+
		"\u01dd1\u0001\u0000\u0000\u0000\u01de\u01df\u0006\u0019\uffff\uffff\u0000"+
		"\u01df\u01e0\u00034\u001a\u0000\u01e0\u01e1\u0006\u0019\uffff\uffff\u0000"+
		"\u01e1\u01e6\u0001\u0000\u0000\u0000\u01e2\u01e3\u00036\u001b\u0000\u01e3"+
		"\u01e4\u0006\u0019\uffff\uffff\u0000\u01e4\u01e6\u0001\u0000\u0000\u0000"+
		"\u01e5\u01de\u0001\u0000\u0000\u0000\u01e5\u01e2\u0001\u0000\u0000\u0000"+
		"\u01e6\u01fd\u0001\u0000\u0000\u0000\u01e7\u01e8\n\u0006\u0000\u0000\u01e8"+
		"\u01e9\u0005n\u0000\u0000\u01e9\u01ea\u0003\u0016\u000b\u0000\u01ea\u01eb"+
		"\u0005o\u0000\u0000\u01eb\u01ec\u0006\u0019\uffff\uffff\u0000\u01ec\u01fc"+
		"\u0001\u0000\u0000\u0000\u01ed\u01ee\n\u0005\u0000\u0000\u01ee\u01ef\u0005"+
		"p\u0000\u0000\u01ef\u01f0\u0005\u0093\u0000\u0000\u01f0\u01fc\u0006\u0019"+
		"\uffff\uffff\u0000\u01f1\u01f2\n\u0004\u0000\u0000\u01f2\u01f3\u0005~"+
		"\u0000\u0000\u01f3\u01f4\u0005\u0093\u0000\u0000\u01f4\u01fc\u0006\u0019"+
		"\uffff\uffff\u0000\u01f5\u01f6\n\u0003\u0000\u0000\u01f6\u01f7\u0005\u007f"+
		"\u0000\u0000\u01f7\u01fc\u0006\u0019\uffff\uffff\u0000\u01f8\u01f9\n\u0002"+
		"\u0000\u0000\u01f9\u01fa\u0005\u0080\u0000\u0000\u01fa\u01fc\u0006\u0019"+
		"\uffff\uffff\u0000\u01fb\u01e7\u0001\u0000\u0000\u0000\u01fb\u01ed\u0001"+
		"\u0000\u0000\u0000\u01fb\u01f1\u0001\u0000\u0000\u0000\u01fb\u01f5\u0001"+
		"\u0000\u0000\u0000\u01fb\u01f8\u0001\u0000\u0000\u0000\u01fc\u01ff\u0001"+
		"\u0000\u0000\u0000\u01fd\u01fb\u0001\u0000\u0000\u0000\u01fd\u01fe\u0001"+
		"\u0000\u0000\u0000\u01fe3\u0001\u0000\u0000\u0000\u01ff\u01fd\u0001\u0000"+
		"\u0000\u0000\u0200\u0201\u0005\u0093\u0000\u0000\u0201\u0216\u0006\u001a"+
		"\uffff\uffff\u0000\u0202\u0203\u0005\u0094\u0000\u0000\u0203\u0216\u0006"+
		"\u001a\uffff\uffff\u0000\u0204\u0205\u0005\u0095\u0000\u0000\u0205\u0216"+
		"\u0006\u001a\uffff\uffff\u0000\u0206\u0207\u0005\u0096\u0000\u0000\u0207"+
		"\u0216\u0006\u001a\uffff\uffff\u0000\u0208\u0209\u0005\u009d\u0000\u0000"+
		"\u0209\u0216\u0006\u001a\uffff\uffff\u0000\u020a\u020b\u0005\u009c\u0000"+
		"\u0000\u020b\u0216\u0006\u001a\uffff\uffff\u0000\u020c\u020d\u0005M\u0000"+
		"\u0000\u020d\u0216\u0006\u001a\uffff\uffff\u0000\u020e\u020f\u00056\u0000"+
		"\u0000\u020f\u0216\u0006\u001a\uffff\uffff\u0000\u0210\u0211\u0005l\u0000"+
		"\u0000\u0211\u0212\u0003\u0016\u000b\u0000\u0212\u0213\u0005m\u0000\u0000"+
		"\u0213\u0214\u0006\u001a\uffff\uffff\u0000\u0214\u0216\u0001\u0000\u0000"+
		"\u0000\u0215\u0200\u0001\u0000\u0000\u0000\u0215\u0202\u0001\u0000\u0000"+
		"\u0000\u0215\u0204\u0001\u0000\u0000\u0000\u0215\u0206\u0001\u0000\u0000"+
		"\u0000\u0215\u0208\u0001\u0000\u0000\u0000\u0215\u020a\u0001\u0000\u0000"+
		"\u0000\u0215\u020c\u0001\u0000\u0000\u0000\u0215\u020e\u0001\u0000\u0000"+
		"\u0000\u0215\u0210\u0001\u0000\u0000\u0000\u02165\u0001\u0000\u0000\u0000"+
		"\u0217\u0218\u0005\u0093\u0000\u0000\u0218\u0219\u0005l\u0000\u0000\u0219"+
		"\u021a\u00038\u001c\u0000\u021a\u021b\u0005m\u0000\u0000\u021b\u021c\u0006"+
		"\u001b\uffff\uffff\u0000\u021c\u0222\u0001\u0000\u0000\u0000\u021d\u021e"+
		"\u0005\u0093\u0000\u0000\u021e\u021f\u0005l\u0000\u0000\u021f\u0220\u0005"+
		"m\u0000\u0000\u0220\u0222\u0006\u001b\uffff\uffff\u0000\u0221\u0217\u0001"+
		"\u0000\u0000\u0000\u0221\u021d\u0001\u0000\u0000\u0000\u02227\u0001\u0000"+
		"\u0000\u0000\u0223\u0224\u0003\u0018\f\u0000\u0224\u0225\u0003:\u001d"+
		"\u0000\u0225\u0226\u0006\u001c\uffff\uffff\u0000\u0226\u022b\u0001\u0000"+
		"\u0000\u0000\u0227\u0228\u0003\u0018\f\u0000\u0228\u0229\u0006\u001c\uffff"+
		"\uffff\u0000\u0229\u022b\u0001\u0000\u0000\u0000\u022a\u0223\u0001\u0000"+
		"\u0000\u0000\u022a\u0227\u0001\u0000\u0000\u0000\u022b9\u0001\u0000\u0000"+
		"\u0000\u022c\u022d\u0005h\u0000\u0000\u022d\u022e\u0003\u0018\f\u0000"+
		"\u022e\u022f\u0003:\u001d\u0000\u022f\u0230\u0006\u001d\uffff\uffff\u0000"+
		"\u0230\u0236\u0001\u0000\u0000\u0000\u0231\u0232\u0005h\u0000\u0000\u0232"+
		"\u0233\u0003\u0018\f\u0000\u0233\u0234\u0006\u001d\uffff\uffff\u0000\u0234"+
		"\u0236\u0001\u0000\u0000\u0000\u0235\u022c\u0001\u0000\u0000\u0000\u0235"+
		"\u0231\u0001\u0000\u0000\u0000\u0236;\u0001\u0000\u0000\u0000\u0237\u0238"+
		"\u0005:\u0000\u0000\u0238\u0239\u0005l\u0000\u0000\u0239\u023a\u0003\u0016"+
		"\u000b\u0000\u023a\u023b\u0005m\u0000\u0000\u023b\u023c\u0003\u0012\t"+
		"\u0000\u023c\u023d\u0006\u001e\uffff\uffff\u0000\u023d\u0248\u0001\u0000"+
		"\u0000\u0000\u023e\u023f\u0005:\u0000\u0000\u023f\u0240\u0005l\u0000\u0000"+
		"\u0240\u0241\u0003\u0016\u000b\u0000\u0241\u0242\u0005m\u0000\u0000\u0242"+
		"\u0243\u0003\u0012\t\u0000\u0243\u0244\u00052\u0000\u0000\u0244\u0245"+
		"\u0003\u0012\t\u0000\u0245\u0246\u0006\u001e\uffff\uffff\u0000\u0246\u0248"+
		"\u0001\u0000\u0000\u0000\u0247\u0237\u0001\u0000\u0000\u0000\u0247\u023e"+
		"\u0001\u0000\u0000\u0000\u0248=\u0001\u0000\u0000\u0000\u0249\u024a\u0005"+
		"U\u0000\u0000\u024a\u024b\u0005l\u0000\u0000\u024b\u024c\u0003\u0016\u000b"+
		"\u0000\u024c\u024d\u0005m\u0000\u0000\u024d\u024e\u0003\u0012\t\u0000"+
		"\u024e\u024f\u0006\u001f\uffff\uffff\u0000\u024f\u025a\u0001\u0000\u0000"+
		"\u0000\u0250\u0251\u00058\u0000\u0000\u0251\u0252\u0005l\u0000\u0000\u0252"+
		"\u0253\u0003\u0014\n\u0000\u0253\u0254\u0003\u0014\n\u0000\u0254\u0255"+
		"\u0003\u0016\u000b\u0000\u0255\u0256\u0005m\u0000\u0000\u0256\u0257\u0003"+
		"\u0012\t\u0000\u0257\u0258\u0006\u001f\uffff\uffff\u0000\u0258\u025a\u0001"+
		"\u0000\u0000\u0000\u0259\u0249\u0001\u0000\u0000\u0000\u0259\u0250\u0001"+
		"\u0000\u0000\u0000\u025a?\u0001\u0000\u0000\u0000\u025b\u025c\u0005B\u0000"+
		"\u0000\u025c\u025d\u0005g\u0000\u0000\u025d\u0275\u0006 \uffff\uffff\u0000"+
		"\u025e\u025f\u0005B\u0000\u0000\u025f\u0260\u00036\u001b\u0000\u0260\u0261"+
		"\u0005g\u0000\u0000\u0261\u0262\u0006 \uffff\uffff\u0000\u0262\u0275\u0001"+
		"\u0000\u0000\u0000\u0263\u0264\u0005B\u0000\u0000\u0264\u0265\u00036\u001b"+
		"\u0000\u0265\u0266\u0003\u0016\u000b\u0000\u0266\u0267\u0005g\u0000\u0000"+
		"\u0267\u0268\u0006 \uffff\uffff\u0000\u0268\u0275\u0001\u0000\u0000\u0000"+
		"\u0269\u026a\u0005B\u0000\u0000\u026a\u026b\u0003\u0016\u000b\u0000\u026b"+
		"\u026c\u0005g\u0000\u0000\u026c\u026d\u0006 \uffff\uffff\u0000\u026d\u0275"+
		"\u0001\u0000\u0000\u0000\u026e\u026f\u0005$\u0000\u0000\u026f\u0270\u0005"+
		"g\u0000\u0000\u0270\u0275\u0006 \uffff\uffff\u0000\u0271\u0272\u0005,"+
		"\u0000\u0000\u0272\u0273\u0005g\u0000\u0000\u0273\u0275\u0006 \uffff\uffff"+
		"\u0000\u0274\u025b\u0001\u0000\u0000\u0000\u0274\u025e\u0001\u0000\u0000"+
		"\u0000\u0274\u0263\u0001\u0000\u0000\u0000\u0274\u0269\u0001\u0000\u0000"+
		"\u0000\u0274\u026e\u0001\u0000\u0000\u0000\u0274\u0271\u0001\u0000\u0000"+
		"\u0000\u0275A\u0001\u0000\u0000\u0000\u0276\u0277\u0005V\u0000\u0000\u0277"+
		"\u0278\u0005\u0093\u0000\u0000\u0278\u0279\u0005j\u0000\u0000\u0279\u027a"+
		"\u0003D\"\u0000\u027a\u027b\u0005k\u0000\u0000\u027b\u027c\u0006!\uffff"+
		"\uffff\u0000\u027cC\u0001\u0000\u0000\u0000\u027d\u027e\u0003F#\u0000"+
		"\u027e\u027f\u0003D\"\u0000\u027f\u0280\u0006\"\uffff\uffff\u0000\u0280"+
		"\u0285\u0001\u0000\u0000\u0000\u0281\u0282\u0003F#\u0000\u0282\u0283\u0006"+
		"\"\uffff\uffff\u0000\u0283\u0285\u0001\u0000\u0000\u0000\u0284\u027d\u0001"+
		"\u0000\u0000\u0000\u0284\u0281\u0001\u0000\u0000\u0000\u0285E\u0001\u0000"+
		"\u0000\u0000\u0286\u0287\u0003H$\u0000\u0287\u0288\u0003J%\u0000\u0288"+
		"\u0289\u0006#\uffff\uffff\u0000\u0289G\u0001\u0000\u0000\u0000\u028a\u028b"+
		"\u0005]\u0000\u0000\u028b\u028c\u0005f\u0000\u0000\u028c\u0294\u0006$"+
		"\uffff\uffff\u0000\u028d\u028e\u0005^\u0000\u0000\u028e\u028f\u0005f\u0000"+
		"\u0000\u028f\u0294\u0006$\uffff\uffff\u0000\u0290\u0291\u0005_\u0000\u0000"+
		"\u0291\u0292\u0005f\u0000\u0000\u0292\u0294\u0006$\uffff\uffff\u0000\u0293"+
		"\u028a\u0001\u0000\u0000\u0000\u0293\u028d\u0001\u0000\u0000\u0000\u0293"+
		"\u0290\u0001\u0000\u0000\u0000\u0294I\u0001\u0000\u0000\u0000\u0295\u0296"+
		"\u0003N\'\u0000\u0296\u0297\u0005\u0093\u0000\u0000\u0297\u0298\u0005"+
		"g\u0000\u0000\u0298\u0299\u0006%\uffff\uffff\u0000\u0299\u02a6\u0001\u0000"+
		"\u0000\u0000\u029a\u029b\u0003N\'\u0000\u029b\u029c\u0005\u0093\u0000"+
		"\u0000\u029c\u029d\u0005n\u0000\u0000\u029d\u029e\u0005\u0095\u0000\u0000"+
		"\u029e\u029f\u0005o\u0000\u0000\u029f\u02a0\u0005g\u0000\u0000\u02a0\u02a1"+
		"\u0006%\uffff\uffff\u0000\u02a1\u02a6\u0001\u0000\u0000\u0000\u02a2\u02a3"+
		"\u0003L&\u0000\u02a3\u02a4\u0006%\uffff\uffff\u0000\u02a4\u02a6\u0001"+
		"\u0000\u0000\u0000\u02a5\u0295\u0001\u0000\u0000\u0000\u02a5\u029a\u0001"+
		"\u0000\u0000\u0000\u02a5\u02a2\u0001\u0000\u0000\u0000\u02a6K\u0001\u0000"+
		"\u0000\u0000\u02a7\u02a8\u0003N\'\u0000\u02a8\u02a9\u0005\u0093\u0000"+
		"\u0000\u02a9\u02aa\u0005j\u0000\u0000\u02aa\u02ab\u0003\b\u0004\u0000"+
		"\u02ab\u02ac\u0005k\u0000\u0000\u02ac\u02ad\u0005g\u0000\u0000\u02ad\u02ae"+
		"\u0006&\uffff\uffff\u0000\u02ae\u02b7\u0001\u0000\u0000\u0000\u02af\u02b0"+
		"\u0003N\'\u0000\u02b0\u02b1\u0005\u0093\u0000\u0000\u02b1\u02b2\u0005"+
		"j\u0000\u0000\u02b2\u02b3\u0005k\u0000\u0000\u02b3\u02b4\u0005g\u0000"+
		"\u0000\u02b4\u02b5\u0006&\uffff\uffff\u0000\u02b5\u02b7\u0001\u0000\u0000"+
		"\u0000\u02b6\u02a7\u0001\u0000\u0000\u0000\u02b6\u02af\u0001\u0000\u0000"+
		"\u0000\u02b7M\u0001\u0000\u0000\u0000\u02b8\u02b9\u0005<\u0000\u0000\u02b9"+
		"\u02c8\u0006\'\uffff\uffff\u0000\u02ba\u02bb\u00057\u0000\u0000\u02bb"+
		"\u02c8\u0006\'\uffff\uffff\u0000\u02bc\u02bd\u00051\u0000\u0000\u02bd"+
		"\u02c8\u0006\'\uffff\uffff\u0000\u02be\u02bf\u0005\'\u0000\u0000\u02bf"+
		"\u02c8\u0006\'\uffff\uffff\u0000\u02c0\u02c1\u0005#\u0000\u0000\u02c1"+
		"\u02c8\u0006\'\uffff\uffff\u0000\u02c2\u02c3\u0005\u0093\u0000\u0000\u02c3"+
		"\u02c8\u0006\'\uffff\uffff\u0000\u02c4\u02c5\u0005R\u0000\u0000\u02c5"+
		"\u02c8\u0006\'\uffff\uffff\u0000\u02c6\u02c8\u0001\u0000\u0000\u0000\u02c7"+
		"\u02b8\u0001\u0000\u0000\u0000\u02c7\u02ba\u0001\u0000\u0000\u0000\u02c7"+
		"\u02bc\u0001\u0000\u0000\u0000\u02c7\u02be\u0001\u0000\u0000\u0000\u02c7"+
		"\u02c0\u0001\u0000\u0000\u0000\u02c7\u02c2\u0001\u0000\u0000\u0000\u02c7"+
		"\u02c4\u0001\u0000\u0000\u0000\u02c7\u02c6\u0001\u0000\u0000\u0000\u02c8"+
		"O\u0001\u0000\u0000\u0000,ap\u0081\u008a\u0095\u00a7\u00b3\u00c1\u00dc"+
		"\u00e7\u00f4\u00ff\u010b\u0118\u0126\u0134\u0142\u0150\u0161\u0163\u017e"+
		"\u0180\u0191\u0193\u01a4\u01a6\u01bc\u01be\u01dc\u01e5\u01fb\u01fd\u0215"+
		"\u0221\u022a\u0235\u0247\u0259\u0274\u0284\u0293\u02a5\u02b6\u02c7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}