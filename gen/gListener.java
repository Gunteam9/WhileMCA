// Generated from D:/Documents/Programmation/Java/WhileMCA/src\g.g4 by ANTLR 4.9.2
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
	 * Enter a parse tree produced by the {@code SkipStat}
	 * labeled alternative in {@link gParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSkipStat(gParser.SkipStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SkipStat}
	 * labeled alternative in {@link gParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSkipStat(gParser.SkipStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignStat}
	 * labeled alternative in {@link gParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignStat(gParser.AssignStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignStat}
	 * labeled alternative in {@link gParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignStat(gParser.AssignStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfStat}
	 * labeled alternative in {@link gParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfStat(gParser.IfStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfStat}
	 * labeled alternative in {@link gParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfStat(gParser.IfStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileStat}
	 * labeled alternative in {@link gParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStat(gParser.WhileStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileStat}
	 * labeled alternative in {@link gParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStat(gParser.WhileStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CallStat}
	 * labeled alternative in {@link gParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCallStat(gParser.CallStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CallStat}
	 * labeled alternative in {@link gParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCallStat(gParser.CallStatContext ctx);
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
	 * Enter a parse tree produced by the {@code IdentExpr}
	 * labeled alternative in {@link gParser#aexpression}.
	 * @param ctx the parse tree
	 */
	void enterIdentExpr(gParser.IdentExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentExpr}
	 * labeled alternative in {@link gParser#aexpression}.
	 * @param ctx the parse tree
	 */
	void exitIdentExpr(gParser.IdentExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstExpr}
	 * labeled alternative in {@link gParser#aexpression}.
	 * @param ctx the parse tree
	 */
	void enterConstExpr(gParser.ConstExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstExpr}
	 * labeled alternative in {@link gParser#aexpression}.
	 * @param ctx the parse tree
	 */
	void exitConstExpr(gParser.ConstExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NegatExpr}
	 * labeled alternative in {@link gParser#aexpression}.
	 * @param ctx the parse tree
	 */
	void enterNegatExpr(gParser.NegatExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NegatExpr}
	 * labeled alternative in {@link gParser#aexpression}.
	 * @param ctx the parse tree
	 */
	void exitNegatExpr(gParser.NegatExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParentExpr}
	 * labeled alternative in {@link gParser#aexpression}.
	 * @param ctx the parse tree
	 */
	void enterParentExpr(gParser.ParentExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParentExpr}
	 * labeled alternative in {@link gParser#aexpression}.
	 * @param ctx the parse tree
	 */
	void exitParentExpr(gParser.ParentExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CompaExpr}
	 * labeled alternative in {@link gParser#aexpression}.
	 * @param ctx the parse tree
	 */
	void enterCompaExpr(gParser.CompaExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CompaExpr}
	 * labeled alternative in {@link gParser#aexpression}.
	 * @param ctx the parse tree
	 */
	void exitCompaExpr(gParser.CompaExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperatorNum}
	 * labeled alternative in {@link gParser#opa}.
	 * @param ctx the parse tree
	 */
	void enterOperatorNum(gParser.OperatorNumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperatorNum}
	 * labeled alternative in {@link gParser#opa}.
	 * @param ctx the parse tree
	 */
	void exitOperatorNum(gParser.OperatorNumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TrueExpr}
	 * labeled alternative in {@link gParser#bexpression}.
	 * @param ctx the parse tree
	 */
	void enterTrueExpr(gParser.TrueExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TrueExpr}
	 * labeled alternative in {@link gParser#bexpression}.
	 * @param ctx the parse tree
	 */
	void exitTrueExpr(gParser.TrueExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FalseExpr}
	 * labeled alternative in {@link gParser#bexpression}.
	 * @param ctx the parse tree
	 */
	void enterFalseExpr(gParser.FalseExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FalseExpr}
	 * labeled alternative in {@link gParser#bexpression}.
	 * @param ctx the parse tree
	 */
	void exitFalseExpr(gParser.FalseExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CompExpr}
	 * labeled alternative in {@link gParser#bexpression}.
	 * @param ctx the parse tree
	 */
	void enterCompExpr(gParser.CompExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CompExpr}
	 * labeled alternative in {@link gParser#bexpression}.
	 * @param ctx the parse tree
	 */
	void exitCompExpr(gParser.CompExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotExpr}
	 * labeled alternative in {@link gParser#bexpression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(gParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotExpr}
	 * labeled alternative in {@link gParser#bexpression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(gParser.NotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenthesisExpr}
	 * labeled alternative in {@link gParser#bexpression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesisExpr(gParser.ParenthesisExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenthesisExpr}
	 * labeled alternative in {@link gParser#bexpression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesisExpr(gParser.ParenthesisExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperatorCompa}
	 * labeled alternative in {@link gParser#opr}.
	 * @param ctx the parse tree
	 */
	void enterOperatorCompa(gParser.OperatorCompaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperatorCompa}
	 * labeled alternative in {@link gParser#opr}.
	 * @param ctx the parse tree
	 */
	void exitOperatorCompa(gParser.OperatorCompaContext ctx);
}