// Generated from /home/etud/o2171270/M2/Analyse_Statique/test/WhileMCA/src/g.g4 by ANTLR 4.9.2
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
	 * Visit a parse tree produced by {@link gParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(gParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(gParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(gParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(gParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#lAexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLAexpression(gParser.LAexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#aexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAexpression(gParser.AexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#opa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpa(gParser.OpaContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#bexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBexpression(gParser.BexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#opr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpr(gParser.OprContext ctx);
}