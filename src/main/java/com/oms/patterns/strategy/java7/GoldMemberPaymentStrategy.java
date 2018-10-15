package com.oms.patterns.strategy.java7;

import java.math.BigDecimal;

public class GoldMemberPaymentStrategy implements PaymentStrategy {

    @Override
    public BigDecimal pay(BigDecimal amount) {
        BigDecimal serviceFee = new BigDecimal(.5);
        return amount.multiply(serviceFee);
    }
}
