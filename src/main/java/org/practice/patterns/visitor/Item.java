package org.practice.patterns.visitor;

public abstract class Item {
    public abstract double accept(Visitor visitor);

    public abstract double getPrice();
}
