package com.oms.patterns.strategy.java8;

import java.math.BigDecimal;

public interface PaymentStrategy {

    BigDecimal pay(BigDecimal amount);

    static PaymentStrategy goldMemberPayment() {
        BigDecimal serviceFee = new BigDecimal(.50);
        return amount -> amount.multiply(serviceFee);
    }

    static PaymentStrategy platinumMemberPayment() {
        BigDecimal serviceFee = new BigDecimal(.25);
        return amount -> amount.multiply(serviceFee);
    }
}