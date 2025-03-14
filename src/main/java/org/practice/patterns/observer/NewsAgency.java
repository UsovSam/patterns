package org.practice.patterns.observer;

import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
public class NewsAgency {
    Set<NewsChannel> subsribers;

    public NewsAgency() {
        subsribers = new HashSet<>();
    }


    public void subscribe(NewsChannel newsChannel) {
        subsribers.add(newsChannel);
    }

    public void unsubscribe(NewsChannel newsChannel) {
        subsribers.remove(newsChannel);
    }

    public void notifySubscribers() {
        for (NewsChannel subsriber : subsribers) {
            subsriber.read("New message");
        }
    }

}
