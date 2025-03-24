package org.practice.patterns.visitor;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ShoppingCart extends Item {

    List<Item> list;

    public ShoppingCart() {
        list = new ArrayList<>();
    }

    @Override
    public double accept(Visitor visitor) {
        return list.stream()
                .mapToDouble(item -> item.accept(visitor))
                .sum();
    }

    @Override
    public double getPrice() {
        return 0;
    }

    public void addItem(Item item) {
        list.add(item);
    }

}
