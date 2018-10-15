package com.oms.patterns.strategy.java8;


import java.math.BigDecimal;

public class Client {

    public static void main(String[] args) {
        BigDecimal price = new BigDecimal(100);

        PaymentStrategy paymentStratgy = PaymentStrategy.goldMemberPayment();
        System.out.println("Gold Member Price: " + paymentStratgy.pay(price));

        paymentStratgy = PaymentStrategy.platinumMemberPayment();
        System.out.println("Platinum Member Price: " + paymentStratgy.pay(price));
    }
}