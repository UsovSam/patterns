package org.practice.patterns.state;

import org.junit.jupiter.api.Test;
import org.practice.patterns.state.states.DeliveredState;
import org.practice.patterns.state.states.NewOrder;
import org.practice.patterns.state.states.ShippedOrder;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class OrderStateTest {

    @Test
    public void testOrderState() {
        Order order = new Order();

        assertTrue(order.getOrderState() instanceof NewOrder);

        order.nextState();

        assertTrue(order.getOrderState() instanceof ShippedOrder);

        order.nextState();

        assertTrue(order.getOrderState() instanceof DeliveredState);

    }

}
