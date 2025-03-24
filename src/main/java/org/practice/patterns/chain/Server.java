package org.practice.patterns.chain;

public class Server {
    Middleware middleware;

    public void setMiddleware(Middleware middleware) {
        this.middleware = middleware;
    }

    public boolean logIn(String requset) {
        if (middleware.handle(requset)) {
            System.out.println("Authorization have been successful!");
            return true;
        }
        return false;
    }
}
