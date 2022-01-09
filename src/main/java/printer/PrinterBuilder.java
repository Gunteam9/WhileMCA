package printer;

import ast.IVisitor;
import ast.aexpr.*;
import ast.bexpr.*;
import ast.global.*;
import ast.statement.*;

import java.util.List;

public class PrinterBuilder {

    public static List<String> toListString(Program program) {
        PrinterVisitor visitor = new PrinterVisitor();
        return program.accept(visitor);
    }

    public static void print(Program program) {
        for(String line : toListString(program))
            System.out.println(line);
    }

    private static class PrinterVisitor implements IVisitor<List<String>> {

        private static String spaceArout(String s) {
            return " " + s + " ";
        }

        private static String parenthesis(String s) {
            return "(" + s + ")";
        }

        @Override
        public List<String> visit(CompaExpr compaExpr) {
            //"COMPAEXPR(" + compaExpr.getLeftExpression() + " " + compaExpr.getExpressions(
            return null;
        }

        @Override
        public List<String> visit(ConstExpr constExpr) {
            return null;
        }

        @Override
        public List<String> visit(IdentExpr identExpr) {
            return null;
        }

        @Override
        public List<String> visit(ListAExpr listAExpr) {
            return null;
        }

        @Override
        public List<String> visit(ParentExpr parentExpr) {
            return null;
        }

        @Override
        public List<String> visit(CompExpr compExpr) {
            return null;
        }

        @Override
        public List<String> visit(FalseExpr falseExpr) {
            return null;
        }

        @Override
        public List<String> visit(NegatExpr negatExpr) {
            return null;
        }

        @Override
        public List<String> visit(NotExpr notExpr) {
            return null;
        }

        @Override
        public List<String> visit(OperatorNum operatorNum) {
            return null;
        }

        @Override
        public List<String> visit(ParenthesisExpr parenthesisExpr) {
            return null;
        }

        @Override
        public List<String> visit(TrueExpr trueExpr) {
            return null;
        }

        @Override
        public List<String> visit(Declaration declaration) {
            return null;
        }

        @Override
        public List<String> visit(DeclVariables declVariables) {
            return null;
        }

        @Override
        public List<String> visit(Expression expression) {
            return null;
        }

        @Override
        public List<String> visit(ListDeclIdent listDeclIdent) {
            return null;
        }

        @Override
        public List<String> visit(ListDeclVariables declVariables) {
            return null;
        }

        @Override
        public List<String> visit(ListIdentifier listIdentifier) {
            return null;
        }

        @Override
        public List<String> visit(OperatorCompa operatorCompa) {
            return null;
        }

        @Override
        public List<String> visit(Program program) {
            return null;
        }

        @Override
        public List<String> visit(TypeBoolean typeBoolean) {
            return null;
        }

        @Override
        public List<String> visit(TypeInteger typeInteger) {
            return null;
        }

        @Override
        public List<String> visit(AssignStat assignStat) {
            return null;
        }

        @Override
        public List<String> visit(BlockParentStat blockParentStat) {
            return null;
        }

        @Override
        public List<String> visit(BlockStat blockStat) {
            return null;
        }

        @Override
        public List<String> visit(CallStat callStat) {
            return null;
        }

        @Override
        public List<String> visit(IfStat ifStat) {
            return null;
        }

        @Override
        public List<String> visit(SkipStat skipStat) {
            return null;
        }

        @Override
        public List<String> visit(WhileStat whileStat) {
            return null;
        }
    }
}
