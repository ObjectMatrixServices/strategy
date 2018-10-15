package com.oms.patterns.strategy.java8;


public class Client {

    public static void main(String[] args) {
        double price = 100;

        PaymentStrategy paymentStratgy = PaymentStrategy.cashPayment();
        System.out.println("Cash Price: -" + paymentStratgy.pay(price));

        paymentStratgy = PaymentStrategy.creditCardPayment();
        System.out.println("Credit Card Price: -" + paymentStratgy.pay(price));
    }
}