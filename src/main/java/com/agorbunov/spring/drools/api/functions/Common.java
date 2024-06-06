package com.agorbunov.spring.drools.api.functions;

import com.agorbunov.spring.drools.api.logger.RuleLogger;
import com.agorbunov.spring.drools.api.model.CreditRequest;

import java.util.Date;

public class Common {
    public static double getKds(CreditRequest creditRequest) {
        RuleLogger.info("[Function] getKds - читаем записанную в заявке ставку отсоединения КДС");
        try {
            return Double.parseDouble(creditRequest.getRateKds());
        } catch (Exception e) {
            RuleLogger.info("Ставка отсоединения КДС не передана или передана некорректно");
        }
        return 0;
    }

    public static void isActive(CreditRequest creditRequest, Date date) {

    }
}
