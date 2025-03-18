package org.practice.patterns.chain;

public class LoggingHandler extends Middleware {
    @Override
    public boolean handle(String request) {
        if (request != null) {
            System.out.println("Logging request:");
            System.out.println(request);
        }
        return checkNext(request);
    }
}
