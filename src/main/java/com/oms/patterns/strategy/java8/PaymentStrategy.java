package com.oms.patterns.strategy.java8;

public interface PaymentStrategy {

    double pay(double amount);

    static PaymentStrategy cashPayment(){
        double serviceCharge = 5.00;
        return amount -> amount + serviceCharge;
    }

    static PaymentStrategy creditCardPayment(){
        double serviceCharge = 5.00;
        double creditCardFee = 10.00;
        return amount -> amount + serviceCharge + creditCardFee;
    }
}