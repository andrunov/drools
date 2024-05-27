package com.javatechie.spring.drools.api;

import org.drools.core.spi.KnowledgeHelper;

public class RuleFunctions {
    /**
     * Log a debug row from a rule, using the rule’s package and name as the Log4J
     * category.
     */
    public static String info(final KnowledgeHelper drools, String message) {

        String category = drools.getRule().getPackageName() + "." + drools.getRule().getName();
        return String.format("%s %s", category, message);
    }
}
