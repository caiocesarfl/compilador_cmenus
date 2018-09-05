grammar Cmenos;

programa : declaracao_lista;
declaracao_lista : declaracao (declaracao)*;
declaracao :  var_declaracao | fun_declaracao;
var_declaracao :  tipo_especificador ident ';' | tipo_especificador ident ('[' num_int ']')+ PONTO_VIRGULA;
tipo_especificador : INT| FLOAT | CHAR | VOID | STRUCT ident '{' atributos_declaracao '}';
atributos_declaracao :  var_declaracao+;
fun_declaracao : tipo_especificador ident '(' params ')' composto_decl;
params :  param_lista | 'void';
param_lista  :  param (',' param)*;
param : tipo_especificador ident | tipo_especificador ident '[' ']';
composto_decl : '{' local_declaracoes comando_lista '}';
local_declaracoes :   var_declaracao*;
comando_lista : comando*;
comando : expressao_decl | composto_decl | selecao_decl | iteracao_decl | retorno_decl;
expressao_decl : expressao PONTO_VIRGULA | PONTO_VIRGULA;
selecao_decl :  IF '(' expressao ')' comando (ELSE comando)?;
iteracao_decl : WHILE '(' expressao ')' comando;
retorno_decl  :  RETURN  PONTO_VIRGULA | RETURN expressao PONTO_VIRGULA;
expressao : var ATRIBUICAO expressao | expressao_simples;
var :  ident |   ident ('[' expressao ']')+;
expressao_simples :expressao_soma op_relacional expressao_soma | expressao_soma;
op_relacional  :   MENORIGUAL |   MENOR |  MAIOR| MAIORIGUAL | IGUALDADE| DIFERENCA ;
expressao_soma : termo (soma termo)*;
soma : OP_ADICAO | OP_SUBTRACAO;
termo: fator (mult fator)*;
mult : OP_MULTIPLICACAO |   OP_DIVISAO ;
fator : '(' expressao ')' | var |  ativacao | num | num_int;
ativacao : ident '(' args ')';
args : args_lista?;
args_lista : expressao (VIRGULA expressao)*;
num: (soma)?(DIGITO)+(PONTO (DIGITO)+)?('E'(soma)?(DIGITO)+)?;
num_int : DIGITO+;
ident : LETRA_MINUSCULA (LETRA_MINUSCULA | LETRA_MAIUSCULA | DIGITO)*;


DIGITO : [0-9];
LETRA_MINUSCULA: [a-z];
LETRA_MAIUSCULA: [A-Z];

PONTO_VIRGULA   : ';';
VIRGULA         : ',';
PONTO  : '.';

CHAR    : 'char';
FLOAT   : 'float';
INT     : 'int';
STRUCT  : 'struct';
RETURN  : 'return';
VOID    : 'void';
WHILE   : 'while';
IF      : 'if';
ELSE    : 'else';

ABRE_CHAVES     : '{';
FECHA_CHAVES     : '}';
ABRE_COLCHETES   : '[';
FECHA_COLCHETES  : ']';
ABRE_PARENTESES  : '(';
FECHA_PARENTESES : ')';

ATRIBUICAO      : '=';

OP_ADICAO  : '+';
OP_SUBTRACAO : '-';
OP_MULTIPLICACAO : '*';
OP_DIVISAO : '/';

MAIOR   : '>';
MENOR : '<';
MAIORIGUAL : '>=';
MENORIGUAL  : '<=';
IGUALDADE  : '==';
DIFERENCA  : '!=';

// Espacos e Comentarios
COMENTARIO :  '/*' .*? '*/' -> skip; // ingnora comentários /* comentario */
ESPACO : [ \r\t\n]+ -> skip; // ignora espacoes, tabulacoes e quebra de linhas
