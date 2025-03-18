package org.practice.patterns.state;

import lombok.Data;
import org.practice.patterns.state.states.NewOrder;

@Data
public class Order {

    private OrderState orderState;

    public Order() {
        this.orderState = new NewOrder();
    }

    public void previousState() {
        orderState.prev(this);
    }

    public void nextState() {
        orderState.next(this);
    }

    public void printStatus() {
        orderState.printStatus();
    }

}
