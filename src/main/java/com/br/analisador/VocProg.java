package com.br.analisador;

public class VocProg {

        public String programaParaInformaValoresRetornaValores() {
            String expr = "" +
                    "{{ " +
                    "featureit valorA;" +
                    "featureit valorB;" +
                    "featureit inicio :: 1;" +
                    "featureit fim;" +
                    "featureal divisao;" +
                    "gamb(\"Insira o valor da primeira variavel\" = valorA);" +
                    "gamb(\"Insira o valor da segunda variavel\" = valorB);" +
                    "fim = valorA = valorB;" +
                    "namimaquinafunc(inicio <:= fim){" +
                    "valorA = valorA = 2;" +
                    "valorB = valorB = 9;" +
                    "}" +
                    "" +
                    "divisao = valorA \\ valorB;" +
                    "" +
                    "temcafe(divisao => 500){" +
                    "solv(\"O Valor\" :: divisao :: " +
                    ");" +
                    "} naotemcafe {" +
                    "solv(\"O Valor\" :: divisao :: \"Nao e maior que 500\");" +
                    "}" +
                    "" +
                    "}}";
            return expr;
        }
}
