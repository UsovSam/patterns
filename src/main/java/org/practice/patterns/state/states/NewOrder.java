package org.practice.patterns.state.states;

import org.practice.patterns.state.Order;
import org.practice.patterns.state.OrderState;

public class NewOrder implements OrderState {
    @Override
    public void next(Order order) {
        order.setOrderState(new ShippedOrder());
    }

    @Override
    public void prev(Order order) {
        System.out.println("No previous state");
    }

    @Override
    public void printStatus() {
        System.out.println("New Order");
    }
}
