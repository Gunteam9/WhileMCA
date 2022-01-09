// Generated from C:/Users/romai/Documents/Programmation/Java/WhileMCA/src/main\g.g4 by ANTLR 4.9.2
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link gParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface gVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link gParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(gParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(gParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#lDeclIdent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLDeclIdent(gParser.LDeclIdentContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#lDeclVariables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLDeclVariables(gParser.LDeclVariablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#declVariables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclVariables(gParser.DeclVariablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#lIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLIdentifier(gParser.LIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeInteger}
	 * labeled alternative in {@link gParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeInteger(gParser.TypeIntegerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeBoolean}
	 * labeled alternative in {@link gParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBoolean(gParser.TypeBooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BlockStat}
	 * labeled alternative in {@link gParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStat(gParser.BlockStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BlockParentStat}
	 * labeled alternative in {@link gParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockParentStat(gParser.BlockParentStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListStatement}
	 * labeled alternative in {@link gParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListStatement(gParser.ListStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SkipStat}
	 * labeled alternative in {@link gParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkipStat(gParser.SkipStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignStat}
	 * labeled alternative in {@link gParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStat(gParser.AssignStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfStat}
	 * labeled alternative in {@link gParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStat(gParser.IfStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileStat}
	 * labeled alternative in {@link gParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStat(gParser.WhileStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CallStat}
	 * labeled alternative in {@link gParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallStat(gParser.CallStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListAExpr}
	 * labeled alternative in {@link gParser#lAexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListAExpr(gParser.ListAExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdentExpr}
	 * labeled alternative in {@link gParser#aexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentExpr(gParser.IdentExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConstExpr}
	 * labeled alternative in {@link gParser#aexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstExpr(gParser.ConstExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NegatExpr}
	 * labeled alternative in {@link gParser#aexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegatExpr(gParser.NegatExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParentExpr}
	 * labeled alternative in {@link gParser#aexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentExpr(gParser.ParentExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CompaExpr}
	 * labeled alternative in {@link gParser#aexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompaExpr(gParser.CompaExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OperatorNum}
	 * labeled alternative in {@link gParser#opa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorNum(gParser.OperatorNumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TrueExpr}
	 * labeled alternative in {@link gParser#bexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueExpr(gParser.TrueExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FalseExpr}
	 * labeled alternative in {@link gParser#bexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseExpr(gParser.FalseExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CompExpr}
	 * labeled alternative in {@link gParser#bexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompExpr(gParser.CompExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotExpr}
	 * labeled alternative in {@link gParser#bexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpr(gParser.NotExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenthesisExpr}
	 * labeled alternative in {@link gParser#bexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesisExpr(gParser.ParenthesisExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OperatorCompa}
	 * labeled alternative in {@link gParser#opr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorCompa(gParser.OperatorCompaContext ctx);
}