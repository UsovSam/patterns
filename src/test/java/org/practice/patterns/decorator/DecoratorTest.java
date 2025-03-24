package org.practice.patterns.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DecoratorTest {

    @Test
    public void test() {
        Price coffee = new MilkDecorator(new SugarDecorator(new Coffee()));
        assertEquals(3.0, coffee.getCost());
    }

    @Test
    public void test_1() {
        Price coffee = new SugarDecorator(new MilkDecorator(new Coffee()));
        assertEquals(2.5, coffee.getCost());
    }

    @Test
    public void test_2() {
        Price coffee = new MilkDecorator(new Coffee());
        assertEquals(1.5, coffee.getCost());
    }

}