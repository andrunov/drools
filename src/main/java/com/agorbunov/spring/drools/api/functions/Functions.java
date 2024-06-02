package com.agorbunov.spring.drools.api.functions;

import com.agorbunov.spring.drools.api.logger.RuleLogger;
import com.agorbunov.spring.drools.api.model.CreditRequest;

public class Functions {
    public static double getKds(CreditRequest creditRequest) {
        RuleLogger.info("[Function] getKds - читаем записанную в заявке ставку отсоединения КДС");
        try {
            return Double.parseDouble(creditRequest.getRateKds());
        } catch (NumberFormatException e) {
            RuleLogger.info("Ставка отсоединения КДС не передана или передана некорректно");
        }
        return 0;
    }
}
