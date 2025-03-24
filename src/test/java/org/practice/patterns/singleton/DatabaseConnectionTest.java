package org.practice.patterns.singleton;

import org.junit.jupiter.api.Test;

import java.util.concurrent.CompletableFuture;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;


public class DatabaseConnectionTest {

    @Test
    public void testSingleton() {
        DatabaseConnection test = DatabaseConnection.getConnection();
        assertNotNull(test, "Singleton should not be null");
    }

    @Test
    public void testSingleton_2call() {
        DatabaseConnection test1 = DatabaseConnection.getConnection();
        DatabaseConnection test2 = DatabaseConnection.getConnection();

        assertNotNull(test1, "Singleton should not be null");
        assertNotNull(test2, "Singleton should not be null");
        assertSame(test1, test2, "2 singletons should be the same");
    }

    @Test
    public void testSingleton_multithreading() throws InterruptedException {
        Thread t1 = new Thread(DatabaseConnection::getConnection);
        Thread t2 = new Thread(DatabaseConnection::getConnection);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        DatabaseConnection main = DatabaseConnection.getConnection();

        assertNotNull(main, "Singleton should not be null");
        assertSame(main, DatabaseConnection.getConnection(), "2 singletons should be the same");
    }

    @Test
    public void testSingleton_multithreading_2() {
        CompletableFuture<DatabaseConnection> t1 = CompletableFuture.supplyAsync(DatabaseConnection::getConnection);
        CompletableFuture<DatabaseConnection> t2 = CompletableFuture.supplyAsync(DatabaseConnection::getConnection);

        assertSame(t1.join(), t2.join(), "2 singletons should be the same");


    }

}