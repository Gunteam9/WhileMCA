package ast;

import ast.aexpr.*;
import ast.bexpr.*;
import ast.global.*;
import ast.statement.*;

public interface IVisitor<T> {
    T visit(CompaExpr compaExpr);
    T visit(ConstExpr constExpr);
    T visit(IdentExpr identExpr);
    T visit(ListAExpr listAExpr);
    T visit(ParentExpr parentExpr);

    T visit(CompExpr compExpr);
    T visit(FalseExpr falseExpr);
    T visit(NegatExpr negatExpr);
    T visit(NotExpr notExpr);
    T visit(OperatorNum operatorNum);
    T visit(ParenthesisExpr parenthesisExpr);
    T visit(TrueExpr trueExpr);

    T visit(Declaration declaration);
    T visit(DeclVariables declVariables);
    T visit(Expression expression);
    T visit(ListDeclIdent listDeclIdent);
    T visit(ListDeclVariables declVariables);
    T visit(ListIdentifier listIdentifier);
    T visit(OperatorCompa operatorCompa);
    T visit(Program program);
    T visit(TypeBoolean typeBoolean);
    T visit(TypeInteger typeInteger);

    T visit(AssignStat assignStat);
    T visit(BlockParentStat blockParentStat);
    T visit(BlockStat blockStat);
    T visit(CallStat callStat);
    T visit(IfStat ifStat);
    T visit(SkipStat skipStat);
    //T visit(Statement statement);
    T visit(WhileStat whileStat);

}
