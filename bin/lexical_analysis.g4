lexer grammar lexical_analysis;

// Keywords
INCLUDE: '#include' ;
DEFINE: '#define' ;
IOSTREAM: '<iostream>' ;
STRING: '<string>' ;
VECTOR: '<vector>' ;
ALGORITHM: '<algorithm>' ;
FSTREAM: '<fstream>' ;
CSTLIB: '<cstdlib>' ;
CTIME: '<ctime>' ;
CMATH: '<cmath>' ;
STDEXCEPT: '<stdexcept>' ;
IOMANIP: '<iomanip>' ;
TUPLE: '<tuple>' ;
UNORDEREDMAP: '<unordered_map>' ;
THREAD: '<thread>' ;
REGEX: '<regex>' ;
CHRONO: '<chrono>' ;
LIST: '<list>' ;
QUEUE: '<queue>' ;
STACK: '<stack>' ;
SET: '<set>' ;
MAP: '<map>' ;
BITSET: '<bitset>' ;
ARRAY: '<array>' ;
FUNCTIONAL: '<functional>' ;
MEMORY: '<memory>' ;
ITERATOR: '<iterator>' ;
RANDOM: '<random>' ;
CCTYPE: '<cctype>' ;
CSTDDEF: '<cstddef>' ;
CSTDINT: '<cstdint>' ;
CASSERT: '<cassert>' ;

// Operators and Symbols
ASM: 'asm' ;
AUTO: 'auto' ;
BOOL: 'bool' ;
BREAK: 'break' ;
CASE: 'case' ;
CATCH: 'catch' ;
CHAR: 'char' ;
CONST: 'const' ;
COUT: 'cout';
CIN: 'cin';
CONSTEXPR: 'constexpr' ;
CONTINUE: 'continue' ;
DECLTYPE: 'decltype' ;
DEFAULT: 'default' ;
DELETE: 'delete' ;
DO: 'do' ;
DOUBLE: 'double' ;
ELSE: 'else' ;
ENUM: 'enum' ;
EXPORT: 'export' ;
EXTERN: 'extern' ;
FALSE: 'false' ;
FLOAT: 'float' ;
FOR: 'for' ;
GOTO: 'goto' ;
IF: 'if' ;
INLINE: 'inline' ;
INT: 'int' ;
LONG: 'long' ;
NAMESPACE: 'namespace' ;
NOEXCEPT: 'noexcept' ;
NULLPTR: 'nullptr' ;
REGISTER: 'register' ;
RETURN: 'return' ;
SHORT: 'short' ;
SIGNED: 'signed' ;
SIZEOF: 'sizeof' ;
STATIC: 'static' ;
STATICASSERT: 'static_assert' ;
STRUCT: 'struct' ;
SWITCH: 'switch' ;
TEMPLATE: 'template' ;
THREADLOCAL: 'thread_local' ;
THROW: 'throw' ;
TRUE: 'true' ;
TRY: 'try' ;
TYPEDEF: 'typedef' ;
UNION: 'union' ;
UNSIGNED: 'unsigned' ;
VOID: 'void' ;
VOLATILE: 'volatile' ;
WCHAR: 'wchar_t' ;
WHILE: 'while' ;
CLASS: 'class' ;
DYNAMICCAST: 'dynamic_cast' ;
EXPLICIT: 'explicit' ;
FRIEND: 'friend' ;
MUTABLE: 'mutable' ;
NEW: 'new' ;
OPERATOR: 'operator' ;
PRIVATE: 'private' ;
PROTECTED: 'protected' ;
PUBLIC: 'public' ;
REINTERPRETCASE: 'reinterpret_cast' ;
STATICCAST: 'static_cast' ;
THIS: 'this' ;
TYPEID: 'typeid' ;
TYPENAME: 'typename' ;
VIRTUAL: 'virtual' ;

// Operators and Symbols (Continued)
COLON: ':' ;
SEMICOLON: ';' ;
COMMA: ',' ;
TERNARY: '?' ;
LBRACKET: '{' ;
RBRACKET: '}' ;
LCBRACKET: '(' ;
RCBRACKET: ')' ;
LSQBRACKET: '[' ;
RSQBRACKET: ']' ;
DOT: '.' ;
ADD: '+' ;
SUB: '-' ;
MUL: '*' ;
DIV: '/' ;
LNOT: '!' ;
BCOMP: '~' ;
MOD: '%' ;
LT: '<' ;
GT: '>' ;
BAND: '&' ;
BOR: '|' ;
BXOR: '^' ;
ASSIGNMENT: '=' ;
ARROW: '->' ;
INCREMENT: '++' ;
DECREMENT: '--' ;
LSHIFT: '<<' ;
RSHIFT: '>>' ;
LE: '<=' ;
GE: '>=' ;
LAND: '&&' ;
LOR: '||' ;
EQ: '==' ;
NE: '!=' ;
ADDASSIGN: '+=' ;
SUBASSIGN: '-=' ;
MULASSIGN: '*=' ;
DIVASSIGN: '/=' ;
MODASSIGN: '%=' ;
BANDASSIGN: '&=' ;
BORASSIGN: '|=' ;
BXORASSIGN: '^=' ;
LSHIFTASSIGN: '<<=' ;
RSHIFTASSIGN: '>>=' ;

// Identifiers
ID: [a-zA-Z][a-zA-Z0-9_]* ;
ID1: [a-zA-Z][a-zA-Z0-9_]*'['[0-9]']' ;
// Integer literals
INTEGER: ('0' | [1-9] [0-9]*) ('u' | 'U' | 'l' | 'L' | 'll' | 'LL')? ;

// Floating-point literals
FLOATING: ([0-9]*[.][0-9]+ | [0-9]+[.] | [0-9]*[.][0-9]+[eE][+-]?[0-9]+ | [0-9]+[eE][+-]?[0-9]+ | [0-9]*[.][0-9]+[fF] | [0-9]+[.][0-9]*[fF] | [0-9]*[.][0-9]+[eE][+-]?[0-9]+[fF] | [0-9]+[eE][+-]?[0-9]+[fF]) ;

// Hexadecimal literals
HEX_LITERAL: '0x'[0-9a-fA-F]+ ;

// Octal literals
OCTAL_LITERAL: '0'[0-7]+ ;

// Binary literals
BINARY_LITERAL: '0b'[01]+ ;

// Comments (Single-line and Multi-line)
SCOMMENT: '//' ~[\r\n]* ;
MCOMMENT: '/*' (~[*]|[*]+~[/])* '*/' ;

// Character literals
CHAR_LITERAL: '\'' ( '\\' . | ~['\\] | '\\n' | '\\t' ) '\'' ;

// String literals
STRINGL: '"' ( '\\' . | ~["\\] )* '"' ;

// Whitespace
WS: [ \n\t\r]+ -> skip ;
