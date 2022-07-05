package designpattern.observer.listener;

import designpattern.observer.EventType;

public interface IEventListener {
    void update(EventType eventType, String contents);
}

