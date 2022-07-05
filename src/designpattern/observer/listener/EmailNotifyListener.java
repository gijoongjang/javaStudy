package designpattern.observer.listener;

import designpattern.observer.EventType;

public class EmailNotifyListener implements IEventListener {

    @Override
    public void update(EventType eventType, String contents) {
        System.out.println("Email Notify : " + contents + " " + eventType.toString());
    }
}
