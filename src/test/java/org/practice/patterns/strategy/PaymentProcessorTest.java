package org.practice.patterns.strategy;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class PaymentProcessorTest {

    @Test
    public void testProcessPayment() {
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        Payment creditCardPayment = new CreditCardPayment();
        Payment paypalPayment = new PaypalPayment();

        // just to show that we can have a condition
        if (PaymentEnum.PAYPAL.name().equals("PAYPAL1")) {
            paymentProcessor.processPayment(paypalPayment);
        } else {
            paymentProcessor.processPayment(creditCardPayment);
        }

    }

    @Test
    public void testProcessPayment_1() {
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        Payment creditCardPayment = mock(CreditCardPayment.class);
        Payment paypalPayment = mock(PaypalPayment.class);

        // just to show that we can have a condition
        if (PaymentEnum.PAYPAL.name().equals("PAYPAL")) {
            paymentProcessor.processPayment(paypalPayment);
        } else {
            paymentProcessor.processPayment(creditCardPayment);
        }

        verify(paypalPayment, times(1)).pay(1000);
        verify(creditCardPayment, never()).pay(anyDouble());

    }

}