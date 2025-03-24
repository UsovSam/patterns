package org.practice.patterns.visitor;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

class ShoppingCartTest {
    @Test
    void testVisit_1() {

        Visitor visitor = new VisitorImpl();
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addItem(new Book());
        shoppingCart.addItem(new Book());
        shoppingCart.addItem(new Fruit());

        double accept = shoppingCart.accept(visitor);
        assertEquals(40, accept, 0.001);
    }


    @Test
    void testVisit_2() {
        Item book = Mockito.mock(Book.class);
        when(book.accept(any())).thenReturn(22.0);

        Visitor visitor = new VisitorImpl();
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addItem(book);

        double accept = shoppingCart.accept(visitor);
        verify(book).accept(any());
        assertEquals(22, accept, 0.001);
    }

}