package codigo;
import java_cup.runtime.Symbol;
%%
%class LexerCup
%type java_cup.runtime.Symbol
%cup
%full
%line
%char
L=[a-zA-Z_]+
D=[0-9]+
I=[$]
IM=[$]+
PM = [.]+
espacio=[ ,\t,\r,\n]+
%{
    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }
    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }
%}
%%
{espacio} {/*Ignore*/}
"**".* {/*Ignore*/}
"*/".*"/*" {/*Ignore*/}
INICIO {return new Symbol(sym.INICIO, yychar, yyline , yytext());}
FIN {return new Symbol(sym.FIN, yychar, yyline , yytext());}
PARAR {return new Symbol(sym.PARAR, yychar, yyline , yytext());}
IZQUIERDA {return new Symbol(sym.IZQUIERDA, yychar, yyline , yytext());}
DERECHA {return new Symbol(sym.DERECHA, yychar, yyline , yytext());}
GIRAR {return new Symbol(sym.GIRAR, yychar, yyline , yytext());}
CICLO {return new Symbol(sym.CICLO, yychar, yyline , yytext());}
BANDERA {return new Symbol(sym.BANDERA, yychar, yyline , yytext());}
VERDADERO {return new Symbol(sym.VERDADERO, yychar, yyline , yytext());}
FALSO {return new Symbol(sym.FALSO, yychar, yyline , yytext());}
CONDICION {return new Symbol(sym.CONDICION, yychar, yyline , yytext());}
AVANZAR {return new Symbol(sym.AVANZAR, yychar, yyline , yytext());}
RETROCEDER {return new Symbol(sym.RETROCEDER, yychar, yyline , yytext());}
DIGITAL {return new Symbol(sym.DIGITAL, yychar, yyline , yytext());}
ANALOGO {return new Symbol(sym.ANALOGO, yychar, yyline , yytext());}
LUZ {return new Symbol(sym.LUZ, yychar, yyline , yytext());}
SENSOR {return new Symbol(sym.SENSOR, yychar, yyline , yytext());}
ENTRADA {return new Symbol(sym.ENTRADA, yychar, yyline , yytext());}
SALIDA {return new Symbol(sym.SALIDA, yychar, yyline , yytext());}
PROXIMIDAD {return new Symbol(sym.PROXIMIDAD, yychar, yyline , yytext());}
ESTADO {return new Symbol(sym.ESTADO, yychar, yyline , yytext());}
DELANTERA {return new Symbol(sym.DELANTERA, yychar, yyline , yytext());}
TRASERA {return new Symbol(sym.TRASERA, yychar, yyline , yytext());}
CABINA {return new Symbol(sym.CABINA, yychar, yyline , yytext());}
RUEDAS {return new Symbol(sym.RUEDAS, yychar, yyline , yytext());}
BAJAR {return new Symbol(sym.BAJAR, yychar, yyline , yytext());}
SUBIR {return new Symbol(sym.SUBIR, yychar, yyline , yytext());}
CERRAR {return new Symbol(sym.CERRAR, yychar, yyline , yytext());}
ABRIR {return new Symbol(sym.ABRIR, yychar, yyline , yytext());}
GANCHO {return new Symbol(sym.GANCHO, yychar, yyline , yytext());}
BOCINA {return new Symbol(sym.BOCINA, yychar, yyline , yytext());}
ENTERO {return new Symbol(sym.ENTERO, yychar, yyline , yytext());}
PRINCIPAL {return new Symbol(sym.PRINCIPAL, yychar, yyline , yytext());}
ROMPER {return new Symbol(sym.ROMPER, yychar, yyline , yytext());}
REPETIR {return new Symbol(sym.REPETIR, yychar, yyline , yytext());}
OPCION {return new Symbol(sym.OPCION, yychar, yyline , yytext());}
EVALUAR {return new Symbol(sym.EVALUAR, yychar, yyline , yytext());}
NORTE {return new Symbol(sym.NORTE, yychar, yyline , yytext());}
SUR {return new Symbol(sym.SUR, yychar, yyline , yytext());}
ESTE {return new Symbol(sym.ESTE, yychar, yyline , yytext());}
OESTE {return new Symbol(sym.OESTE, yychar, yyline , yytext());}
NORESTE {return new Symbol(sym.NORTE, yychar, yyline , yytext());}
NOROESTE {return new Symbol(sym.NOROESTE, yychar, yyline , yytext());}
SURESTE {return new Symbol(sym.SURESTE, yychar, yyline , yytext());}
SUROESTE {return new Symbol(sym.SUROESTE, yychar, yyline , yytext());}
NINGUNO {return new Symbol(sym.NINGUNO, yychar, yyline , yytext());}
"==" {return new Symbol(sym.IGUALQUE, yychar, yyline , yytext());}
"<>" {return new Symbol(sym.DIFERENTEDE, yychar, yyline , yytext());}
">=" {return new Symbol(sym.MAYORIGUAL, yychar, yyline , yytext());}
"<=" {return new Symbol(sym.MENORIGUAL, yychar, yyline , yytext());}
"<" {return new Symbol(sym.MENOR, yychar, yyline , yytext());}
">" {return new Symbol(sym.MAYOR, yychar, yyline , yytext());}
"|" {return new Symbol(sym.OR, yychar, yyline , yytext());}
"&" {return new Symbol(sym.AND, yychar, yyline , yytext());}
"!" {return new Symbol(sym.NOT, yychar, yyline , yytext());}
"[" {return new Symbol(sym.CORCHI, yychar, yyline , yytext());}
"(" {return new Symbol(sym.PARENTESISI, yychar, yyline , yytext());}
"]" {return new Symbol(sym.CORCHD, yychar, yyline , yytext());}
")" {return new Symbol(sym.PARENTESISD, yychar, yyline , yytext());}
":" {return new Symbol(sym.Asignacion, yychar, yyline , yytext());}
"+" {return new Symbol(sym.Suma, yychar, yyline , yytext());}
"-" {return new Symbol(sym.Resta, yychar, yyline , yytext());}
"*" {return new Symbol(sym.Multiplicacion, yychar, yyline , yytext());}
"/" {return new Symbol(sym.Division, yychar, yyline , yytext());}
"#" {return new Symbol(sym.FINLI, yychar, yyline , yytext());}
"," {return new Symbol(sym.COMILLA, yychar, yyline , yytext());}
"1" {return new Symbol(sym.UNO, yychar, yyline , yytext());}
"0" {return new Symbol(sym.CERO, yychar, yyline , yytext());}
{I}{L}({L}|{D})* {return new Symbol(sym.Identificador, yychar, yyline , yytext());}
("-"(({D})+)"."(({D})+))|((({D})+)"."(({D})+)) {return new Symbol(sym.Numero, yychar, yyline , yytext());}
("(-"{D}+")")|({D}+) {return new Symbol(sym.NumeroEnt, yychar, yyline , yytext());}
{IM}{L}({L}|{D})* {return new Symbol(sym.ERROR1, yychar, yyline , yytext());}
({D})*{PM}({D})*+ {return new Symbol(sym.ERROR2, yychar, yyline , yytext());}
({L}|{D})* {return new Symbol(sym.ERRORP, yychar, yyline , yytext());}
 . {return new Symbol(sym.ERROR, yychar, yyline , yytext());}
