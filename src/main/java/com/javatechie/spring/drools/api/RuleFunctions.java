package com.javatechie.spring.drools.api;

import org.drools.core.spi.KnowledgeHelper;

public class RuleFunctions {
    /**
     * Log a debug row from a rule, using the rule’s package and name as the Log4J
     * category.
     */

    protected static StringBuilder INFO = new StringBuilder();

    public static void info(final KnowledgeHelper drools, String message) {

        String roolInfo = drools.getRule().getPackageName() + "." + drools.getRule().getName();
        INFO.append(String.format("%s %s\n", roolInfo, message));
    }
}
