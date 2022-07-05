package designpattern.observer.publisher;

import designpattern.observer.EventType;
import designpattern.observer.listener.IEventListener;

import java.util.*;
import java.util.List;

public class EventManager {

    private Map<EventType, List<IEventListener>> listeners;

    public EventManager() {
        this.listeners = new HashMap<>();
        Arrays.stream(EventType.values()).forEach(x -> this.listeners.put(x, new ArrayList<>()));
    }

    public void subscribe(EventType eventType, IEventListener listener) {
        List<IEventListener> list = listeners.get(eventType);
        list.add(listener);
    }

    public void unSubscribe(EventType eventType, IEventListener listener) {
        List<IEventListener> list = listeners.get(eventType);
        list.remove(listener);
    }

    public void notify(EventType eventType, String contents) {
        List<IEventListener> list = listeners.get(eventType);
        list.forEach(x -> x.update(eventType, contents));
    }
}
