package org.practice.patterns.decorator;

public class MilkDecorator implements Price {

    private Price coffee;

    public MilkDecorator(Price coffee) {
        this.coffee = coffee;
    }


    public Double getCost() {
        return coffee.getCost() * 1.5;
    }
}
