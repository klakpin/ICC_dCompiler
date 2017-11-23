grammar D;

//----------------------------------------------------------
//------------------RULES-----------------------------------
//----------------------------------------------------------

// Ready
compilation_unit : program EOF;

// Ready
program : scope;

// Ready
scope : (statement ';'?)* ;


// Ready
statement : declaration
          | assignment
          | r_if
          | r_while
          | r_for
          | r_return
          | print
          | invocation
          ;

// Ready
invocation : IDENT '(' (expression (',' expression)*)? ')';

// Ready
r_if : 'if' expression 'then' scope ('else' scope)? 'end';

// Ready
r_while : 'while' expression 'loop' scope 'end';

// Ready
r_for : 'for' (IDENT 'in')? expression '..' expression 'loop' scope 'end';

// Ready
print : 'print' expression (',' expression)*;

// Ready
r_return : 'return' expression?;

// Ready
assignment : reference ':=' expression;

// Ready
declaration :  'var' var_definition (',' var_definition)*;

// Ready
var_definition : IDENT (':=' expression)?;

// Ready
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
        | readInt | readReal | readString
        ;

readInt    : '@int';
readReal   : '@real';
readString : '@string';

// ready
function_literal : 'func' ('(' IDENT (',' IDENT)* ')')? body;

// ready
body : scope 'end'
     | '=>' expression;

type_indicator : 'int' | 'real' | 'bool' | 'string'
               | 'empty'
               | '[' ']'
               | '{' '}'
               | 'func'
               ;

// Ready
literal : INTEGER
        | REAL
        | STRING
        | BOOLEAN
        | object
        | tuple
        | 'empty'
        ;

// Ready
object : '{' var_definition (',' var_definition)* '}';

//Ready
tuple : '[' (expression (',' expression)*)? ']';





//----------------------------------------------------------
//------------------TOKENS----------------------------------
//----------------------------------------------------------

INTEGER : [0-9]+;
REAL : [0-9]+'.'[0-9]+;
STRING : ["] (~["\r\n] | '\\\\' | '\\"')* ["];
BOOLEAN : 'true'|'false';
EMPTY : 'empty';
IDENT : [A-Za-z][_a-zA-Z0-9]*;
Comment : ('//' ~[\r\n]* | '/*' .*? '*/') -> skip;
 WS: [\n\t\r ]+ -> skip;