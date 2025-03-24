package org.practice.patterns.strategy;

public class CreditCardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " using credit card");
    }

    @Override
    public PaymentEnum getType() {
        return PaymentEnum.CREDIT_CARD;
    }
}
