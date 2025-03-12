package org.practice.patterns.builder;

import java.util.ArrayList;
import java.util.List;

public class PizzaBuilder {

    private String base;
    private String cheese;
    private String sauce;
    private List<String> toppings;

    public PizzaBuilder() {
        this.toppings = new ArrayList<>();
    }

    public PizzaBuilder setBase(String base) {
        this.base = base;
        return this;
    }

    public PizzaBuilder setCheese(String cheese) {
        this.cheese = cheese;
        return this;
    }

    public PizzaBuilder setSauce(String sauce) {
        this.sauce = sauce;
        return this;
    }

    public PizzaBuilder addTopping(String topping) {
        this.toppings.add(topping);
        return this;
    }

    public Pizza buildPizza() {
        return new Pizza(base, cheese, sauce, toppings);
    }

}
