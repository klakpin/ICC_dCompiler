grammar D;

//----------------------------------------------------------
//------------------RULES-----------------------------------
//----------------------------------------------------------

compilation_unit : program EOF;

program : scope;

scope : (statement ';'?)* ;


statement : declaration
          | assignment
          | r_if
          | r_while
          | r_for
          | r_return
          | print
          ;

r_if : 'if' expression 'then' scope ('else' scope)? 'end';

r_while : 'while' expression 'loop' scope 'end';

r_for : 'for' (IDENT 'in')? (expression '..' expression)? 'loop' scope 'end';

print : 'print' expression (',' expression)*;

r_return : 'return' expression?;

assignment : reference ':=' expression;

declaration :  'var' var_definition (',' var_definition)*;
var_definition : IDENT (':=' expression)?;

reference : IDENT
          | reference '[' expression ']'
          | reference '(' expression (',' expression)* ')'
          | reference '.' IDENT;

// Ready
expression : relation (('or'|'and'|'xor') relation)*;

// Ready
relation : simple (('<'|'<='|'>'|'>='|'='|'/=') simple)?;

// Ready
simple : summand ( ('+'|'-')summand)*;

// Ready
summand : factor (('*'|'/') factor)*;

factor : reference
       | reference 'is' type_indicator
       | '(' expression ')'
       | ('+'|'-'|'not')? primary
       ;

primary : literal
        | function_literal
        | 'size' expression
        | 'if' expression 'then' expression 'else' expression
        ;

function_literal : 'func' ('(' IDENT (',' IDENT)* ')')? body;

body : scope 'end'
     | '=>' expression;

type_indicator : 'int' | 'real' | 'bool' | 'string'
               | 'empty'
               | '[' ']'
               | '{' '}'
               | 'func'
               ;

literal : INTEGER
        | REAL
        | STRING
        | BOOLEAN
        | object
        | tuple
        | 'empty'
        ;

object : '{' var_definition (',' var_definition)* '}';
tuple : '[' (expression (',' expression)*)? ']';





//----------------------------------------------------------
//------------------TOKENS----------------------------------
//----------------------------------------------------------

INTEGER : [0-9]+;
REAL : [0-9]+'.'[0-9]+;
STRING : '"'[a-zA-Z ]*'"';
BOOLEAN : 'true'|'false';
EMPTY : 'empty';

IDENT : [A-Za-z][_a-zA-Z0-9]*;
 WS: [\n\t\r ]+ -> skip;