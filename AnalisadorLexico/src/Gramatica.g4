/* Etapa 3 - Analise Semantica:
Lucas Hilário da Costa*/

lexer grammar Gramatica;

@header {
    import org.antlr.symtab.*;
}

programa returns [Scope scope] :   declaracao_lista;
declaracao_lista :   declaracao (declaracao)*;
declaracao :   var_declaracao|   fun_declaracao ;
var_declaracao : tipo_especificador ident ';' | tipo_especificador ident ('[' num_int ']')+ ';';
tipo_especificador:   'int'  |   'float' |   'char'  |   'void'|  'struct' ident '{' atributos_declaracao '}';
atributos_declaracao :  var_declaracao+;
fun_declaracao returns [Scope scope] :tipo_especificador ident '(' params ')' composto_decl;
params :   param_lista |   'void';
param_lista :   param (',' param)*;
param :   tipo_especificador ident |   tipo_especificador ident '[' ']';
composto_decl :   '{' local_declaracoes comando_lista '}';
local_declaracoes :   var_declaracao*;
comando_lista  :   comando* ;
comando :  expressao_decl |   composto_decl |   selecao_decl  |   iteracao_decl |   retorno_decl;
expressao_decl :   expressao ';' |   ';';
selecao_decl :  'if' '(' expressao ')' comando ('else' comando)?;
iteracao_decl   :   'while' '(' expressao ')' comando;
retorno_decl :  'return' ';' | 'return' expressao ';';
expressao: var '=' expressao |   expressao_simples;
var:   ident |   ident ('[' expressao ']')+ ;
expressao_simples :   expressao_soma op_relacional expressao_soma |   expressao_soma ;
op_relacional:   '<='|   '<'|   '>' |   '>='|   '=='|   '!=' ;
expressao_soma :   termo (soma termo)*;
soma:   '+'|   '-';
termo:   fator (mult fator)*;
mult :   '*' |   '/' ;
fator :   '(' expressao ')' |   var |   ativacao  |   num   |   num_int;
ativacao :   ident '(' args ')';
args :   args_lista? ;
args_lista :   expressao (',' expressao)*  ;
num:   (soma)?(digito)+('.'(digito)+)?('E'(soma)?(digito)+)?;
num_int :   digito+ ;
digito :  DIGIT ;
ident :   LETRA_MINUSCULA (LETRA_MINUSCULA | LETRA_MAIUSCULA | DIGIT )*;
DIGIT : [0-9]; // digitos de 0 a 9
LETRA_MINUSCULA : [a-z]; // letras minusculas
LETRA_MAIUSCULA : [A-Z]; // letras maiusculas
CHAR       : 'char';
ELSE       : 'else';
FLOAT      : 'float';
IF         : 'if';
INT        : 'int';
RETURN     : 'return';
STRUCT     : 'struct';
VOID       : 'void';
WHILE      : 'while';

// Separadores
ABRE_PARENTESE  : '(';
FECHA_PARENTESE : ')';
ABRE_CHAVE      : '{';
FECHA_CHAVE     : '}';
ABRE_COLCHETE   : '[';
FECHA_COLCHETE  : ']';
PONTO_VIRGULA   : ';';
VIRGULA         : ',';
ASPAS           : '\'';

// Operadores
ATRIBUICAO      : '=';
MAIOR           : '>';
MENOR           : '<';
MAIS            : '+';
MENOS           : '-';
MULTIPLICACAO   : '*';
DIVISAO         : '/';
MAIORIGUAL      : '>=';
MENORIGUAL      : '<=';
IGUALDADE       : '==';
DIFERENTE       : '!=';

// Espacos e Comentarios
COMENTARIO :  '/*' .*? '*/' -> skip; // ingnora comentários /* comentario */
IGNORAR : [ \r\t\n]+ -> skip; // ignora espacoes, tabulacoes e quebra de linhas