package org.practice.patterns.visitor;

public class Book extends Item {


    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }

    @Override
    public double getPrice() {
        return 10;
    }
}
