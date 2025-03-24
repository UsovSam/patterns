package org.practice.patterns.prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;

class ShapeTest {

    @Test
    public void testClone_square() {
        Shape shape = new Square(10, 10, 11);

        Shape clone = shape.clone();

        assertNotSame(shape, clone);
        assertEquals(shape.getX(), clone.getX());
        assertEquals(shape.getY(), clone.getY());
    }

    @Test
    public void testClone_circle() {
        Shape shape = new Circle(10, 10, 11);

        Shape clone = shape.clone();

        assertNotSame(shape, clone);
        assertEquals(shape.getX(), clone.getX());
        assertEquals(shape.getY(), clone.getY());
    }

    @Test
    public void testClone_circle_1() {
        Circle shape = new Circle(10, 10, 11);

        Circle clone = (Circle) shape.clone();

        assertNotSame(shape, clone);
        assertEquals(shape.getX(), clone.getX());
        assertEquals(shape.getY(), clone.getY());
        assertEquals(shape.getRadius(), clone.getRadius());
    }

}