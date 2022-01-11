package printer;

import ast.IVisitor;
import ast.aexpr.*;
import ast.bexpr.*;
import ast.global.*;
import ast.statement.*;
import org.javatuples.Pair;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrinterBuilder {

    public static void print(Program program) {
        for(String line : toListString(program))
            System.out.println(line);
    }

    private static List<String> toListString(Program program) {
        PrinterVisitor visitor = new PrinterVisitor();
        return program.accept(visitor);
    }


    private static class PrinterVisitor implements IVisitor<List<String>> {

        private enum TypeOfElem {
            identifier,
            constant,
            program,
            declaration,
            lDeclIdent,
            lDeclVariables,
            declVariables,
            lIdentifier,
            type,
            block,
            statements,
            statement,
            lAexpression,
            aexpression,
            opa,
            bexpression,
            opr;


            @Override
            public String toString() {
                switch (this) {
                    case identifier -> {
                        return "idenfifier";
                    }
                    case constant -> {
                        return "constant";
                    }
                    case program -> {
                        return "PROGRAM";
                    }
                    case declaration -> {
                        return "DECLARATION";
                    }
                    case lDeclIdent -> {
                        return "LIST_DECL_IDENT";
                    }
                    case lDeclVariables -> {
                        return "LIST_DECL_VARIABLES";
                    }
                    case declVariables -> {
                        return "DECL_VARIABLES";
                    }
                    case lIdentifier -> {
                        return "LIST_IDENTIFIER";
                    }
                    case type -> {
                        return "TYPE";
                    }
                    case block -> {
                        return "BLOCK";
                    }
                    case statements -> {
                        return "STATEMENTS";
                    }
                    case statement -> {
                        return "STATEMENT";
                    }
                    case lAexpression -> {
                        return "LIST_A_EXPRESSION";
                    }
                    case aexpression -> {
                        return "A_EXPRESSION";
                    }
                    case opa -> {
                        return "OP_A";
                    }
                    case bexpression -> {
                        return "B_EXPRESSION";
                    }
                    case opr -> {
                        return "OP_R";
                    }
                }
                throw new IllegalStateException("Unexpected value: " + this);
            }
        }

        private List<String> makeList(List<? extends Node> nodes) {
            List<String> list = new ArrayList<>();
            for (Node node : nodes) {
                list.addAll(node.accept(this));
            }
            return list;
        }

        private String listToString(List<String> strings) {
            return String.join("", strings);
        }

        @Override
        public List<String> visit(CompaExpr compaExpr) {
            ArrayList<String> res = new ArrayList<>();

            res.add(TypeOfElem.aexpression + "(");
            res.addAll(compaExpr.getLeftExpression().accept(this));
            res.add(" ");
            res.addAll(compaExpr.getOpa().accept(this));
            res.add(" ");
            res.addAll(compaExpr.getRightExpression().accept(this));
            res.add(")");

            return List.of(listToString(res));
        }

        @Override
        public List<String> visit(ConstExpr constExpr) {
            ArrayList<String> res = new ArrayList<>();

            res.add(TypeOfElem.aexpression + "(");
            res.add(TypeOfElem.constant + "(" + constExpr.getConstant() + ")");
            res.add(")");

            return List.of(listToString(res));
        }

        @Override
        public List<String> visit(IdentExpr identExpr) {
            ArrayList<String> res = new ArrayList<>();

            res.add(TypeOfElem.aexpression + "(");
            res.add(TypeOfElem.identifier + "(" + identExpr.getIdentifier() + ")");
            res.add(")");

            return List.of(listToString(res));
        }

        @Override
        public List<String> visit(ListAExpr listAExpr) {
            ArrayList<String> res = new ArrayList<>();

            res.add(TypeOfElem.lAexpression + "(");
            List<Expression> expressions = listAExpr.getExpressions();
            for (int i = 0; i < expressions.size(); i++) {
                res.addAll(listAExpr.getExpressions().get(i).accept(this));
                if (i < expressions.size() - 1)
                    res.add(",");
            }
            res.add(")");

            return List.of(listToString(res));
        }

        @Override
        public List<String> visit(ParentExpr parentExpr) {
            ArrayList<String> res = new ArrayList<>();

            res.add(TypeOfElem.aexpression + "(");
            res.add("(" + parentExpr.getExpression().accept(this) + ")");
            res.add(")");

            return List.of(listToString(res));
        }

        @Override
        public List<String> visit(CompExpr compExpr) {
            ArrayList<String> res = new ArrayList<>();

            res.add(TypeOfElem.bexpression + "(");
            res.addAll(compExpr.getLeftExpression().accept(this));
            res.add(" ");
            res.addAll(compExpr.getOpr().accept(this));
            res.add(" ");
            res.addAll(compExpr.getRightExpression().accept(this));
            res.add(")");

            return List.of(listToString(res));
        }

        @Override
        public List<String> visit(FalseExpr falseExpr) {
            ArrayList<String> res = new ArrayList<>();

            res.add(TypeOfElem.bexpression + "(");
            res.add("FALSE");
            res.add(")");

            return List.of(listToString(res));
        }

        @Override
        public List<String> visit(NegatExpr negatExpr) {
            ArrayList<String> res = new ArrayList<>();

            res.add(TypeOfElem.aexpression + "(");
            res.add("-" + negatExpr.getExpression().accept(this));
            res.add(")");

            return List.of(listToString(res));
        }

        @Override
        public List<String> visit(NotExpr notExpr) {
            ArrayList<String> res = new ArrayList<>();

            res.add(TypeOfElem.bexpression + "(");
            res.add("NOT " + notExpr.getExpression().accept(this));
            res.add(")");

            return List.of(listToString(res));
        }

        @Override
        public List<String> visit(OperatorNum operatorNum) {
            ArrayList<String> res = new ArrayList<>();

            res.add(TypeOfElem.opa + "(");
            res.add(operatorNum.getOperator());
            res.add(")");

            return List.of(listToString(res));
        }

        @Override
        public List<String> visit(ParenthesisExpr parenthesisExpr) {
            ArrayList<String> res = new ArrayList<>();

            res.add(TypeOfElem.bexpression + "(");
            res.add("(" + parenthesisExpr.getExpression().accept(this) + ")");
            res.add(")");

            return List.of(listToString(res));
        }

        @Override
        public List<String> visit(TrueExpr trueExpr) {
            ArrayList<String> res = new ArrayList<>();

            res.add(TypeOfElem.bexpression + "(");
            res.add("TRUE");
            res.add(")");

            return List.of(listToString(res));
        }

        @Override
        public List<String> visit(Declaration declaration) {
            ArrayList<String> res = new ArrayList<>();
            res.add("PROC "
                    + TypeOfElem.identifier
                    + "(" + declaration.getProcIdent() + ")"
                    + " "
                    + "("
                        + listToString(declaration.getListDeclIdent().accept(this))
                        + ", res "
                        + listToString(declaration.getType().accept(this)) + " "
                        + TypeOfElem.identifier + "("  +declaration.getResIdent() + ")"
                    + ")"
            );
            res.add("");
            res.add("BEGIN");
            res.addAll(declaration.getStatements().accept(this));
            res.add("END");
            res.add("");

            return res;
        }

        @Override
        public List<String> visit(DeclVariables declVariables) {
            ArrayList<String> res = new ArrayList<>();

            res.add(TypeOfElem.declVariables + "(");
            res.addAll(declVariables.getType().accept(this));
            res.add(" ");
            res.addAll(declVariables.getListIdentifier().accept(this));
            res.add(")");
            res.add(";");

            return List.of(listToString(res));
        }

        @Override
        public List<String> visit(ListDeclIdent listDeclIdent) {
            ArrayList<String> res = new ArrayList<>();
            res.add(TypeOfElem.lDeclIdent + "(");
            List<Type> types = listDeclIdent.getTypes();
            List<String> identifiers = listDeclIdent.getIdentifiers();

            for (int i = 0; i < types.size(); i++) {
                res.addAll(types.get(i).accept(this));
                res.add(" ");
                res.add(TypeOfElem.identifier + "(" + identifiers.get(i) + ")");
                if (i < types.size() - 1)
                    res.add(", ");
            }

            res.add(")");

            return res;
        }

        @Override
        public List<String> visit(ListDeclVariables declVariables) {
            ArrayList<String> res = new ArrayList<>();

            res.add(TypeOfElem.lDeclVariables + "(");
            res.addAll(declVariables.getDeclVariables().accept(this));
            if (!declVariables.getListDeclVariables().isEmpty()) {
                res.add(" ");
                res.addAll(makeList(declVariables.getListDeclVariables()));
            }
            res.add(")");

            return List.of(listToString(res));
        }

        @Override
        public List<String> visit(ListIdentifier listIdentifier) {
            ArrayList<String> res = new ArrayList<>();

            res.add(TypeOfElem.lIdentifier + "(");
            for (int i = 0; i < listIdentifier.getIdentifier().size(); i++) {
                res.add(listIdentifier.getIdentifier().get(i));
                if (i < listIdentifier.getIdentifier().size() - 1)
                    res.add(", ");
            }
            res.add(")");

            return List.of(listToString(res));
        }

        @Override
        public List<String> visit(OperatorCompa operatorCompa) {
            ArrayList<String> res = new ArrayList<>();

            res.add(TypeOfElem.opr + "(");
            res.add(operatorCompa.getOperator());
            res.add(")");

            return List.of(listToString(res));
        }

        @Override
        public List<String> visit(Program program) {
            ArrayList<String> res = new ArrayList<>();
            if (program.getIdentifier().equals(""))
                res.add("PROGRAM");
            else
                res.add("PROGRAM " + TypeOfElem.identifier +  "(" + program.getIdentifier() + ")");
            res.add("");
            res.addAll(makeList(program.getDeclarations()));
            res.add("");
            res.add("BEGIN");
            res.addAll(program.getListDeclVariables().accept(this));
            res.addAll(program.getStatements().accept(this));
            res.add("END");
            res.add("");
            res.add(program.getOef());
            return res;
        }

        @Override
        public List<String> visit(TypeBoolean typeBoolean) {
            ArrayList<String> res = new ArrayList<>();
            res.add(TypeOfElem.type + "(");
            res.add("bool");
            res.add(")");
            return res;
        }

        @Override
        public List<String> visit(TypeInteger typeInteger) {
            ArrayList<String> res = new ArrayList<>();
            res.add(TypeOfElem.type + "(");
            res.add("int");
            res.add(")");
            return res;
        }

        @Override
        public List<String> visit(AssignStat assignStat) {
            ArrayList<String> res = new ArrayList<>();

            res.add(TypeOfElem.statement + "(");
            res.add(TypeOfElem.identifier + "(" + assignStat.getIdentifier() + ")");
            res.add(" := ");
            res.addAll(assignStat.getExpression().accept(this));
            res.add(")");

            return List.of(listToString(res));
        }

        @Override
        public List<String> visit(BlockParentStat blockParentStat) {
            ArrayList<String> res = new ArrayList<>();

            res.add(TypeOfElem.block + "(");
            res.add(TypeOfElem.statements + "(" + listToString(blockParentStat.getStatements().accept(this)) + ")");
            res.add(")");

            return List.of(listToString(res));
        }

        @Override
        public List<String> visit(BlockStat blockStat) {
            ArrayList<String> res = new ArrayList<>();

            res.add(TypeOfElem.block + "(");
            res.addAll(blockStat.getStatement().accept(this));
            res.add(")");

            return List.of(listToString(res));
        }

        @Override
        public List<String> visit(CallStat callStat) {
            ArrayList<String> res = new ArrayList<>();

            res.add(TypeOfElem.statement + "(");
            res.add("CALL ");
            res.add(TypeOfElem.identifier + "(" + callStat.getIdentifier() + ")");
            res.add("(" + listToString(callStat.getExpression().accept(this)) + ")");
            res.add(")");

            return List.of(listToString(res));
        }

        @Override
        public List<String> visit(IfStat ifStat) {
            ArrayList<String> res = new ArrayList<>();
            res.add(TypeOfElem.statement + "(");

            res.add("IF");
            res.addAll(ifStat.getExpression().accept(this));
            res.add("THEN");
            res.addAll(ifStat.getThenBlock().accept(this));

            if (!ifStat.getElseBLock().accept(this).isEmpty()) {
                res.add("ELSE");
                res.addAll(ifStat.getElseBLock().accept(this));
            }

            res.add(")");

            return res;
        }

        @Override
        public List<String> visit(SkipStat skipStat) {
            ArrayList<String> res = new ArrayList<>();

            res.add(TypeOfElem.statement + "(");
            res.add("SKIP");
            res.add(")");

            return List.of(listToString(res));
        }

        @Override
        public List<String> visit(Statements statements) {
            ArrayList<String> res = new ArrayList<>();
            if (!statements.getStatements().isEmpty()) {
                res.add(listToString(statements.getStatement().accept(this)) + "; ");
                res.add(TypeOfElem.statements.toString());
                ArrayList<Statements> statementsList = new ArrayList<>(statements.getStatements());
                if (!statementsList.isEmpty()){
                    res.add("(");
                    Statements removedStatements = statementsList.remove(0);
                    res.addAll(visit(removedStatements));
                    res.add(")");
                }
            }
            else
                res.addAll(statements.getStatement().accept(this));

            return res;
        }

        @Override
        public List<String> visit(WhileStat whileStat) {
            ArrayList<String> res = new ArrayList<>();

            res.add(TypeOfElem.statement + "(");
            res.add("WHILE ");
            res.addAll(whileStat.getExpression().accept(this));
            res.add(" DO ");
            res.addAll(whileStat.getStatement().accept(this));
            res.add(")");

            return List.of(listToString(res));
        }
    }
}
