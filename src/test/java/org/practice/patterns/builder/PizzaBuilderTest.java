package org.practice.patterns.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class PizzaBuilderTest {

    @Test
    public void testBuildPizza() {
        PizzaBuilder pizzaBuilder = new PizzaBuilder();
        Pizza pizza = pizzaBuilder.setBase("Base")
                .setCheese("Cheddar")
                .setSauce("Tomato")
                .addTopping("Mushroom")
                .addTopping("Pepperoni")
                .buildPizza();

        assertNotNull(pizza);
        assertEquals("Base", pizza.getBase());
        assertEquals("Cheddar", pizza.getCheese());
        assertEquals("Tomato", pizza.getSauce());
        assertEquals(2, pizza.getToppings().size());
    }

}