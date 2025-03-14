package org.practice.patterns.strategy;

public class PaymentProcessor {

    public void processPayment(Payment payment) {
        System.out.println("Processing payment using " + payment.getType());
        payment.pay(1000);
    }

}
