package org.practice.patterns.decorator;

public class Coffee implements Price {

    @Override
    public Double getCost() {
        return 1.0;
    }

}
