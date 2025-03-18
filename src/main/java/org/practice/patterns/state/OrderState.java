package org.practice.patterns.state;

public interface OrderState {

    void next(Order order);

    void prev(Order order);

    void printStatus();

}
