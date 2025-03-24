package org.practice.patterns.strategy;

public interface Payment {
    public void pay(double amount);

    public PaymentEnum getType();
}
