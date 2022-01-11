package launcher;

import antlr.gLexer;
import antlr.gParser;
import ast.ASTBuilder;
import ast.global.Program;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import printer.PrinterBuilder;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Launcher {

    private static Program buildAst(ParseTree parseTree) {
        ASTBuilder builder = new ASTBuilder();
        return (Program) parseTree.accept(builder);
    }

    private static ParseTree parse(InputStream inputStream) {
        CharStream input = null;
        try {
            input = CharStreams.fromStream(inputStream);
        } catch (IOException e) {
            System.err.println("Erreur lors de la récupération du flux en CharStream");
        }
        // Creation of the lexer for pico programs
        gLexer lexer = new gLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        // Creation of the parser for pico programs
        gParser parser = new gParser(tokens);
        // Parse the input: the result is a parse tree
        ParseTree tree = parser.program();
        if (parser.getNumberOfSyntaxErrors() != 0)
            System.err.println("Erreur de synthaxe");
        return tree;
    }

    public static void main(String[] args) {
        final String fileName = "program2.txt";
        InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream(fileName);
        ParseTree parseTree = parse(inputStream);
        Program program = buildAst(parseTree);
        PrinterBuilder.print(program);
    }
}
