package org.practice.patterns.chain;

public class AuthorizationHandler extends Middleware {
    @Override
    public boolean handle(String request) {
        if (request != null && request.contains("admin"))
            return checkNext(request);
        return false;
    }
}
