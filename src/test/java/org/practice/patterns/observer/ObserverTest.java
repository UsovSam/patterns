package org.practice.patterns.observer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

class ObserverTest {

    @Test
    public void testObserver() {
        NewsAgency newsAgency = new NewsAgency();
        RssChannel rssChannel = new RssChannel(1);
        SlackChannel slackChannel = new SlackChannel(2);

        newsAgency.subscribe(slackChannel);
        assertEquals(1, newsAgency.getSubsribers().size());
        newsAgency.subscribe(rssChannel);
        assertEquals(2, newsAgency.getSubsribers().size());

        newsAgency.notifySubscribers();

        newsAgency.unsubscribe(slackChannel);
        assertEquals(1, newsAgency.getSubsribers().size());
        newsAgency.unsubscribe(rssChannel);
        assertEquals(0, newsAgency.getSubsribers().size());
    }

    @Test
    public void testObserver_1() {
        NewsAgency newsAgency = new NewsAgency();
        RssChannel rssChannel = mock(RssChannel.class);

        newsAgency.subscribe(rssChannel);
        assertEquals(1, newsAgency.getSubsribers().size());
        newsAgency.subscribe(rssChannel);
        assertEquals(1, newsAgency.getSubsribers().size());

        newsAgency.notifySubscribers();

        verify(rssChannel, times(1)).read(any());
    }

}