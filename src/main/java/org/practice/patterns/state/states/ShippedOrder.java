package org.practice.patterns.state.states;

import org.practice.patterns.state.Order;
import org.practice.patterns.state.OrderState;

public class ShippedOrder implements OrderState {
    @Override
    public void next(Order order) {
        order.setOrderState(new DeliveredState());
    }

    @Override
    public void prev(Order order) {
        order.setOrderState(new NewOrder());
    }

    @Override
    public void printStatus() {
        System.out.println("Shipped");
    }
}
