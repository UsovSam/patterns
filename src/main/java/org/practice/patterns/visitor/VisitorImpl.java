package org.practice.patterns.visitor;

public class VisitorImpl implements Visitor {
    @Override
    public double visit(Item item) {
        return item.getPrice();
    }
}
