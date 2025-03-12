package org.practice.patterns.prototype;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Square extends Shape {
    private int width;

    public Square() {
    }

    public Square(int x, int y, int width) {
        super(x, y);
        this.width = width;
    }

    public Square(Square square) {
        super(square);
        if (square != null) {
            this.width = square.width;
        }
    }

    @Override
    public Shape clone() {
        return new Square(this);
    }
}
