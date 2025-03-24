package org.practice.patterns.state.states;

import org.practice.patterns.state.Order;
import org.practice.patterns.state.OrderState;

public class DeliveredState implements OrderState {
    @Override
    public void next(Order order) {
        System.out.println("Order Delivered");
    }

    @Override
    public void prev(Order order) {
        order.setOrderState(new ShippedOrder());
    }

    @Override
    public void printStatus() {
        System.out.println("Delivered");
    }
}
