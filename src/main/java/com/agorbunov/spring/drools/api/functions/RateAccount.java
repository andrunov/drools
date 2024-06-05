package com.agorbunov.spring.drools.api.functions;

import com.agorbunov.spring.drools.api.logger.RuleLogger;
import org.drools.core.spi.KnowledgeHelper;

public class RateAccount {

    public static Double RATE;

    public static void baseRate(final KnowledgeHelper drools, Double rate) {
        RATE = rate;
        String roolInfo = drools.getRule().getPackageName() + "." + drools.getRule().getName();
        String message = String.format("установлена базовая ставка %s", RATE);
        RuleLogger.INFO.append(String.format("[Rule] %s %s\n", roolInfo, message));
    }

    public static void addRate(final KnowledgeHelper drools, Double add) {
        RATE = RATE + add;
        String roolInfo = drools.getRule().getPackageName() + "." + drools.getRule().getName();
        String message = String.format("установлена надбавка: %s, итоговая ставка: %s", add,RATE);
        RuleLogger.INFO.append(String.format("[Rule] %s %s\n", roolInfo, message));
    }
}
