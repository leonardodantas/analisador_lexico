package com.br.analisador;

import java.io.StringReader;
import java.io.IOException;


public class main {

    public static void main(String[] args) throws IOException {

        String expr = new VocProg().programaParaInformaValoresRetornaValores();
        LexicalAnalyzer lexical = new LexicalAnalyzer(new StringReader(expr));

        lexical.yylex();

    }
}
