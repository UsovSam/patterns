package org.practice.patterns.visitor;

public class Fruit extends Item {
    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }

    @Override
    public double getPrice() {
        return 20;
    }
}
