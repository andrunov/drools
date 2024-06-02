package com.agorbunov.spring.drools.api.logger;

import org.drools.core.spi.KnowledgeHelper;

public class RuleLogger {
    /**
     * Log a debug row from a rule, using the rule’s package and name as the Log4J
     * category.
     */

    public static StringBuilder INFO = new StringBuilder();

    public static void info(final KnowledgeHelper drools, String message) {
        String roolInfo = drools.getRule().getPackageName() + "." + drools.getRule().getName();
        INFO.append(String.format("[Rule] %s %s\n", roolInfo, message));
    }

    public static void info(String message) {
        INFO.append(String.format("%s\n", message));
    }
}
