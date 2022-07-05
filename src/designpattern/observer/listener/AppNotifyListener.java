package designpattern.observer.listener;

import designpattern.observer.EventType;

public class AppNotifyListener implements IEventListener {

    @Override
    public void update(EventType eventType, String contents) {
        System.out.println("App Notify : " + contents + " " + eventType.toString());
    }
}
