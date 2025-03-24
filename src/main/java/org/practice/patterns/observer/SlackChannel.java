package org.practice.patterns.observer;

public class SlackChannel extends NewsChannel {
    public SlackChannel(long id) {
        super(id);
    }

    @Override
    public void read(String message) {
        System.out.println("Message sent to Slack");
    }
}
