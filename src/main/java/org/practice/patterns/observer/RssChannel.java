package org.practice.patterns.observer;

public class RssChannel extends NewsChannel {
    public RssChannel(long id) {
        super(id);
    }

    @Override
    public void read(String message) {
        System.out.println("Message sent to RSS");
    }
}
