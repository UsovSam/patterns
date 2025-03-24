package org.practice.patterns.strategy;

public class CryptoPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " using crypto");
    }

    @Override
    public PaymentEnum getType() {
        return PaymentEnum.CRYPTO;
    }
}
