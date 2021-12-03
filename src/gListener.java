// Generated from g.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gParser}.
 */
public interface gListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(gParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(gParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(gParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(gParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#lDeclIdent}.
	 * @param ctx the parse tree
	 */
	void enterLDeclIdent(gParser.LDeclIdentContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#lDeclIdent}.
	 * @param ctx the parse tree
	 */
	void exitLDeclIdent(gParser.LDeclIdentContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#lDeclVariables}.
	 * @param ctx the parse tree
	 */
	void enterLDeclVariables(gParser.LDeclVariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#lDeclVariables}.
	 * @param ctx the parse tree
	 */
	void exitLDeclVariables(gParser.LDeclVariablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#declVariables}.
	 * @param ctx the parse tree
	 */
	void enterDeclVariables(gParser.DeclVariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#declVariables}.
	 * @param ctx the parse tree
	 */
	void exitDeclVariables(gParser.DeclVariablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#lIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterLIdentifier(gParser.LIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#lIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitLIdentifier(gParser.LIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(gParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(gParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(gParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(gParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(gParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(gParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(gParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(gParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#lAexpression}.
	 * @param ctx the parse tree
	 */
	void enterLAexpression(gParser.LAexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#lAexpression}.
	 * @param ctx the parse tree
	 */
	void exitLAexpression(gParser.LAexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#aexpression}.
	 * @param ctx the parse tree
	 */
	void enterAexpression(gParser.AexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#aexpression}.
	 * @param ctx the parse tree
	 */
	void exitAexpression(gParser.AexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#opa}.
	 * @param ctx the parse tree
	 */
	void enterOpa(gParser.OpaContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#opa}.
	 * @param ctx the parse tree
	 */
	void exitOpa(gParser.OpaContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#bexpression}.
	 * @param ctx the parse tree
	 */
	void enterBexpression(gParser.BexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#bexpression}.
	 * @param ctx the parse tree
	 */
	void exitBexpression(gParser.BexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#opr}.
	 * @param ctx the parse tree
	 */
	void enterOpr(gParser.OprContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#opr}.
	 * @param ctx the parse tree
	 */
	void exitOpr(gParser.OprContext ctx);
}