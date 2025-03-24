package org.practice.patterns.singleton;

public class DatabaseConnection {

    private volatile static DatabaseConnection instance = null;


    public static DatabaseConnection getConnection() {

        if (instance != null) {
            return instance;
        }

        synchronized (DatabaseConnection.class) {
            instance = new DatabaseConnection();
            return instance;
        }
    }

}
