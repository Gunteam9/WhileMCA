grammar g;
program: 'program ' (Identifier)? declaration* 'begin' lDeclVariables statements 'end';
declaration: 'proc ' Identifier (lDeclIdent ('res ' type Identifier)?) 'begin' statements 'end';
lDeclIdent: type Identifier (type Identifier)*;
lDeclVariables: declVariables lDeclVariables*;
declVariables: type lIdentifier';';
lIdentifier: Identifier (Identifier)*;
type: 'int ' | 'boolean ';
block: statement
    | (statements);
statements: statement (';' statements)*;
statement: 'skip '
        | Identifier ':=' aexpression
        | 'if ' bexpression 'then ' block ('else ' block)?
        | 'while ' bexpression 'do ' block
        | 'call ' Identifier (lAexpression);
lAexpression: aexpression (aexpression)*;
aexpression: Identifier | Constant
        | aexpression opa aexpression
        | '-'aexpression
        | '(' aexpression ')';
opa: '+' | '-' | '*' | '/';
bexpression: 'true' | 'false'
        | aexpression opr aexpression
        | 'not' bexpression
        | '(' bexpression ')';
opr: '<' | '<=' | '>' | '>=' | '=' | '<>';

Identifier: [a-zA-Z][a-zA-Z0-9_]*;
Constant: [0-9]*;