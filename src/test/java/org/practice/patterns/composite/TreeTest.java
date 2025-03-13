package org.practice.patterns.composite;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TreeTest {

    @Test
    public void testGetSize_NoItems() {
        Tree tree = new Tree();
        tree.setItems(Collections.emptyList());
        assertEquals(0, tree.getSize());
    }

    @Test
    public void testGetSize_SingleItem() {
        Tree tree = new Tree();
        tree.setItems(List.of(new File()));
        assertEquals(10, tree.getSize());
    }

    @Test
    public void testGetSize_MultipleItems() {
        Tree tree = new Tree();
        Tree subTree = new Tree();
        subTree.setItems(List.of(new File()));

        tree.setItems(List.of(new File(), subTree, new File()));
        assertEquals(30, tree.getSize());
    }
}