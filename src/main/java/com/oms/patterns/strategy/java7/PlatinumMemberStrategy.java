package com.oms.patterns.strategy.java7;

import java.math.BigDecimal;

public class PlatinumMemberStrategy implements PaymentStrategy {

    @Override
    public BigDecimal pay(BigDecimal amount) {
        BigDecimal serviceFee = new BigDecimal(.25);
        return amount.multiply(serviceFee);
    }
}