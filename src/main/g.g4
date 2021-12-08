grammar g;
program: 'program' (Identifier)? declaration* 'begin' lDeclVariables statements 'end' EOF;
declaration: 'proc' Identifier '(' lDeclIdent (',' 'res' type Identifier)? ')' 'begin' statements 'end';
lDeclIdent: type Identifier (',' type Identifier)*;
lDeclVariables: declVariables lDeclVariables*;
declVariables: type lIdentifier';';
lIdentifier: Identifier (',' Identifier)*;
type: 'int'                                                                          #TypeInteger
    | 'boolean'                                                                      #TypeBoolean
    ;
block: statement                                                                     #BlockStat
    | '(' statements ')'                                                             #BlockParentStat
    ;
statements: statement (';' statements)*;
statement: 'skip'                                                                    #SkipStat
        | Identifier ':=' aexpression                                                #AssignStat
        | 'if' bexpression 'then' thenblock=block ('else' block)?                    #IfStat
        | 'while' bexpression 'do' block                                             #WhileStat
        | 'call' Identifier '(' lAexpression ')'                                     #CallStat
        ;
lAexpression: aexpression (',' aexpression)*                                         #ListAExpr;
aexpression: Identifier                                                              #IdentExpr
        | Constant                                                                   #ConstExpr
        | leftexpr=aexpression opa rigthexpr=aexpression                             #CompaExpr
        | '-'aexpression                                                             #NegatExpr
        | '(' aexpression ')'                                                        #ParentExpr
        ;
opa: op=('+' | '-' | '*' | '/')                                                      #OperatorNum;
bexpression: 'true'                                                                  #TrueExpr
        | 'false'                                                                    #FalseExpr
        | leftexpr=aexpression opr rightexpr=aexpression                             #CompExpr
        | 'not' bexpression                                                          #NotExpr
        | '(' bexpression ')'                                                        #ParenthesisExpr
        ;
opr: op=('<' | '<=' | '>' | '>=' | '=' | '<>')                                       #OperatorCompa;

Identifier: [a-zA-Z][a-zA-Z0-9_]*;
Constant: [0-9][0-9]*;
WS: [ \t\r\n]+ -> skip;

