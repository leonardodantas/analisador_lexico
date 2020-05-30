
%%

%{

private void imprimir(String descricao, String lexema) {
    System.out.println(lexema + " - " + descricao);
}

%}


%class LexicalAnalyzer
%type void


BRANCO = [\n| |\t|\r]
PONTOEVIRGULA = [;]{0,1}
INICIOESCOPO = [{]{2}
INICIOESCOPOCHAVE = [{]{1}
FIMESCOPO = [}]{0,2}
VARIAVELDECLARADA = ([a-z]+[A-Z]+)|[a-z]+
DIVISAO = [\\]{0,1}
STRING = \"([a-zA-z0-9]+[\n| |\t|\r]*)*\"
INTEIRO = \d+
REAL = -?\d*\.?\d+
BOOLEANO = true|false


%%
{INICIOESCOPO}               { imprimir("Simbolo Inicio de Escopo", yytext());}
{FIMESCOPO}                  { imprimir("Simbolo Fim de Escopo", yytext());}
{INICIOESCOPOCHAVE}          { imprimir("Simbolo Abertura de chave", yytext());}
{PONTOEVIRGULA}              { imprimir("Simbolo Fim de Comando (Ponto e Virgula)", yytext());}
"("                          { imprimir("Simbolo Abre Parênteses", yytext());}
")"                          { imprimir("Simbolo Fecha Parênteses", yytext());}
"<="                         { imprimir("Simbolo Menor que", yytext());}
"<:="                        { imprimir("Simbolo Menor Igual que", yytext());}
"=>"                         { imprimir("Simbolo Maior que", yytext());}
">:="                        { imprimir("Simbolo Maior Igual que", yytext());}
"::"                         { imprimir("Simbolo Igual", yytext());}
":^:"                        { imprimir("Simbolo Difente", yytext());}
"$:"                         { imprimir("Simbolo E", yytext());}
"|:"                         { imprimir("Simbolo OU", yytext());}
"="                          { imprimir("Simbolo Soma", yytext());}
"-"                          { imprimir("Simbolo Subtração", yytext());}
"**"                         { imprimir("Simbolo Multiplicação", yytext());}
{DIVISAO}                    { imprimir("Simbolo Divisão", yytext());}
"gamb"                       { imprimir("Palavra reservada para entrada de dados", yytext());}
"solv"                       { imprimir("Palavra reservada para saida de dados", yytext());}
"temcafe"                    { imprimir("Palavra reservada para condicional IF", yytext());}
"naotemcafe"                 { imprimir("Palavra reservada para condicionaol ELSE", yytext());}
"namimaquinafunc"            { imprimir("Palavra reservada para loop WHILE", yytext());}
"featureit"                  { imprimir("Palavra reservada para tipos inteiros", yytext());}
"featureal"                  { imprimir("Palavra reservada para tipos reais", yytext());}
"featurechar"                { imprimir("Palavra reservada para tipos Strings", yytext());}
"featurevefa"                { imprimir("Palavra reservada para tipos logicos", yytext());}
{STRING}                     { imprimir("String", yytext());}
{VARIAVELDECLARADA}          { imprimir("Varialve", yytext());}
{BRANCO}                     { imprimir("Espaço em branco", yytext()); }
{INTEIRO}                    { imprimir("Valor Inteiro", yytext()); }
{REAL}                       { imprimir("Valor Real", yytext()); }
{BOOLEANO}                   { imprimir("Valor Booleano", yytext()); }


. { throw new RuntimeException("Caractere inválido " + yytext()); }