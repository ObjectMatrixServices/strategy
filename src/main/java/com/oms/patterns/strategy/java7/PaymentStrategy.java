package com.oms.patterns.strategy.java7;

import java.math.BigDecimal;

public interface PaymentStrategy {
    BigDecimal pay(BigDecimal amount);
}
