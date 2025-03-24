package org.practice.patterns.chain;

public class AuthenticationHandler extends Middleware {
    @Override
    public boolean handle(String request) {
        if (request != null && !request.isEmpty())
            return checkNext(request);
        return false;
    }
}
