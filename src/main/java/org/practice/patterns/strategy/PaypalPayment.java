package org.practice.patterns.strategy;

public class PaypalPayment implements Payment {
    @Override
    public void pay(double amount) {
        //some paypal service call
        System.out.println("Paying " + amount + " using paypal");
    }

    @Override
    public PaymentEnum getType() {
        return PaymentEnum.PAYPAL;
    }
}
