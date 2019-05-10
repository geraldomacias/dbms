package org.h2.command;

import java.util.*;

public class Logger {
    private List<String> statements;

    public Logger() {
        statements = new ArrayList<>();
        System.out.println("Logger created");
    }

    public void addStatement(String sql) {
        statements.add(sql);
    }

    public void analyze() {
        System.out.println("TODO: Analyze the following statements:");
        if (statements.isEmpty()) {
            System.out.println("No statements logged");
        }
        else {
            for (String statement : statements) {
                System.out.println(statement);
            }
        }
    }
}
