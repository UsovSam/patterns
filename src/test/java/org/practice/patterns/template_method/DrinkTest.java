package org.practice.patterns.template_method;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class DrinkTest {


    @Test
    void testTea() {
        Drink drinkMock = new Tea();

        drinkMock.makeDrink();
    }

    @Test
    void testSteepDoesNotThrowException() {
        Drink drinkMock = new Coffee();

        assertDoesNotThrow(() -> drinkMock.makeDrink());
    }
}