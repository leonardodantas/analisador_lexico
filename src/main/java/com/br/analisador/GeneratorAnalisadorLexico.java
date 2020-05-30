package com.br.analisador;

import java.io.File;
import java.nio.file.Paths;

public class GeneratorAnalisadorLexico {

    public static void main(String[] args) {

        String rootPath = Paths.get("").toAbsolutePath(). toString();
        String subPath = "/src/main/java/com/br/analisador/";

        String file = rootPath + subPath + "language.lex";

        File sourceCode = new File(file);

        jflex.Main.generate(sourceCode);

    }
}
