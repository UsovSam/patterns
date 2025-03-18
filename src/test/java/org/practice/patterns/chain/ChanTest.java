package org.practice.patterns.chain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ChanTest {

    @Test
    public void testChain() {

        Middleware middleware = Middleware.link(
                new LoggingHandler(),
                new AuthenticationHandler(),
                new AuthorizationHandler()
        );

        Server server = new Server();
        server.setMiddleware(middleware);

        assertFalse(server.logIn("Test"));
        assertFalse(server.logIn(""));
        assertTrue(server.logIn("Test admin"));
    }

}
