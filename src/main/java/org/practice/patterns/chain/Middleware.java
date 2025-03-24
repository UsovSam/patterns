package org.practice.patterns.chain;

public abstract class Middleware {

    Middleware next;

    public abstract boolean handle(String request);

    public void setNext(Middleware middleware) {
        this.next = middleware;
    }

    public boolean checkNext(String request) {
        if (next == null) {
            return true;
        }
        return next.handle(request);
    }

    public static Middleware link(Middleware first, Middleware... chain) {
        Middleware head = first;
        for (Middleware nextInChain : chain) {
            head.next = nextInChain;
            head = nextInChain;
        }
        return first;
    }

}
