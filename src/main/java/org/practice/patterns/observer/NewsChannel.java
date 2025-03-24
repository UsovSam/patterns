package org.practice.patterns.observer;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@AllArgsConstructor
@ToString
@EqualsAndHashCode
public abstract class NewsChannel {
    long id;

    public void read(String message) {
        System.out.println(message);
    }

}
