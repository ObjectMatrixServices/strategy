package com.oms.patterns.strategy.java7;

import java.math.BigDecimal;

public class Client {

    public static void main(String[] args) {
        BigDecimal price = new BigDecimal(100);
        PaymentStrategy paymentStrategy = new GoldMemberPaymentStrategy();
        System.out.println("Gold Member Price: " + paymentStrategy.pay(price));

        paymentStrategy = new PlatinumMemberStrategy();
        System.out.println("Platinum Member Price: " + paymentStrategy.pay(price));
    }
}