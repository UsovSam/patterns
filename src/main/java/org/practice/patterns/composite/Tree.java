package org.practice.patterns.composite;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class Tree implements Item {
    private List<Item> items;

    @Override
    public int getSize() {
        return items.stream().mapToInt(Item::getSize).sum();
    }

    @Override
    public boolean isDirectory() {
        return true;
    }
}
