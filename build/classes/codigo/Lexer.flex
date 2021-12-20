package codigo;
import static codigo.Tokens.*;
%%
%class Lexer
%type Tokens
L=[a-zA-Z_]+
D=[0-9]+
I=[$]
IM=[$]+
PM = [.]+
espacio=[ ,\t,\r,\n]+
%{
    public String lexeme;
%}
%%
INICIO {lexeme=yytext(); return INICIO;}
FIN {lexeme=yytext(); return FIN;}
PARAR {lexeme=yytext(); return PARAR;}
IZQUIERDA {lexeme=yytext(); return IZQUIERDA;}
DERECHA {lexeme=yytext(); return DERECHA;}
GIRAR {lexeme=yytext(); return GIRAR;}
CICLO {lexeme=yytext(); return CICLO;}
BANDERA {lexeme=yytext(); return BANDERA;}
VERDADERO {lexeme=yytext(); return VERDAD;}
FALSO {lexeme=yytext(); return FALSO;}
CONDICION {lexeme=yytext(); return CONDICION;}
AVANZAR {lexeme=yytext(); return AVANZAR;}
RETROCEDER {lexeme=yytext(); return RETROCEDER;}
DIGITAL {lexeme=yytext(); return DIGITAL;}
ANALOGO {lexeme=yytext(); return ANALOGO;}
LUZ {lexeme=yytext(); return LUZ;}
SENSOR {lexeme=yytext(); return SENSOR;}
ENTRADA {lexeme=yytext(); return ENTRADA;}
SALIDA {lexeme=yytext(); return SALIDA;}
PROXIMIDAD {lexeme=yytext(); return PROXIMIDAD;}
ESTADO {lexeme=yytext(); return ESTADO;}
DELANTERA {lexeme=yytext(); return DELANTERA;}
TRASERA {lexeme=yytext(); return TRASERA;}
CABINA {lexeme=yytext(); return CABINA;}
RUEDAS {lexeme=yytext(); return RUEDAS;}
BAJAR {lexeme=yytext(); return BAJAR;}
SUBIR {lexeme=yytext(); return SUBIR;}
CERRAR {lexeme=yytext(); return CERRAR;}
ABRIR {lexeme=yytext(); return ABRIR;}
GANCHO {lexeme=yytext(); return GANCHO;}
BOCINA {lexeme=yytext(); return BOCINA;}
ENTERO {lexeme=yytext(); return ENTERO;}
PRINCIPAL {lexeme=yytext(); return PRINCIPAL;}
ROMPER {lexeme=yytext(); return ROMPER;}
REPETIR {lexeme=yytext(); return REPETIR;}
OPCION {lexeme=yytext(); return OPCION;}
EVALUAR {lexeme=yytext(); return EVALUAR;}
NORTE {lexeme=yytext(); return NORTE;}
SUR {lexeme=yytext(); return SUR;}
ESTE {lexeme=yytext(); return ESTE;}
OESTE {lexeme=yytext(); return OESTE;}
NORESTE {lexeme=yytext(); return NORESTE;}
NOROESTE {lexeme=yytext(); return NOROESTE;}
SURESTE {lexeme=yytext(); return SURESTE;}
SUROESTE {lexeme=yytext(); return SUROESTE;}
NINGUNO {lexeme=yytext(); return NINGUNO;}
"==" {lexeme=yytext(); return IGUALQUE;}
"<>" {lexeme=yytext(); return DIFERENTEDE;}
">=" {lexeme=yytext(); return MAYORIGUAL;}
"<=" {lexeme=yytext(); return MENORIGUAL;}
"<" {lexeme=yytext(); return MENOR;}
">" {lexeme=yytext(); return MAYOR;}
"|" {lexeme=yytext(); return OR;}
"&" {lexeme=yytext(); return AND;}
"!" {lexeme=yytext(); return NOT;}
"[" {lexeme=yytext(); return CORCHI;}
"(" {lexeme=yytext(); return PARENTESISI;}
"]" {lexeme=yytext(); return CORCHD;}
")" {lexeme=yytext(); return PARENTESISD;}
"#" {lexeme=yytext(); return FINLI;}
"," {lexeme=yytext(); return COMILLA;}
"1" {lexeme=yytext(); return UNO;}
"0" {lexeme=yytext(); return CERO;}
{espacio} {/*Ignore*/}
"**".* {/*Ignore*/}
"*/".*"/*" {/*Ignore*/}
":" {return Asignacion;}
"+" {return Suma;}
"-" {return Resta;}
"*" {return Multiplicacion;}
"/" {return Division;}
{I}{L}({L}|{D})* {lexeme=yytext(); return Identificador;}
("(-"{D}+")")|{D}+|({D})*"."({D})*+ {lexeme=yytext(); return Numero;}
("(-"{D}+")")|{D}+|({D})*+ {lexeme=yytext(); return NumeroEnt;}
{IM}{L}({L}|{D})* {lexeme=yytext(); return ERROR1;}
({D})*{PM}({D})*+ {lexeme=yytext(); return ERROR2;}
({L}|{D})* {lexeme=yytext(); return ERRORP;}
 . {return ERROR;}
