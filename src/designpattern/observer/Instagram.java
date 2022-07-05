package designpattern.observer;

import designpattern.observer.publisher.EventManager;

public class Instagram {

    public EventManager eventManager;

    public Instagram() {
        this.eventManager = new EventManager();
    }

    public void post(String contents) {
        eventManager.notify(EventType.POST, contents);
    }

    public void story(String contents) {
        eventManager.notify(EventType.STORY, contents);
    }
}
