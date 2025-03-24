package org.practice.patterns.decorator;

public class SugarDecorator implements Price {
    private Price coffee;

    public SugarDecorator(Price coffee) {
        this.coffee = coffee;
    }

    @Override
    public Double getCost() {
        return coffee.getCost() + 1;
    }
}
