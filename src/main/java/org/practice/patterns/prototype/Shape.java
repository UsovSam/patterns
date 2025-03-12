package org.practice.patterns.prototype;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class Shape {

    private int x;
    private int y;

    public Shape() {
    }

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Shape(Shape shape) {
        if (shape != null) {
            this.x = shape.x;
            this.y = shape.y;
        }
    }

    public abstract Shape clone();

}
