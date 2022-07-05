package designpattern.observer;

import designpattern.observer.listener.AppNotifyListener;
import designpattern.observer.listener.EmailNotifyListener;
import designpattern.observer.listener.IEventListener;

public class Main {

    public static void main(String[] args) {
        Instagram instagram = new Instagram();

        IEventListener appListener = new AppNotifyListener();
        IEventListener emailListener = new EmailNotifyListener();

        instagram.eventManager.subscribe(EventType.POST, appListener);
        instagram.eventManager.subscribe(EventType.STORY, appListener);
        instagram.eventManager.subscribe(EventType.STORY, emailListener);

        instagram.post("test1");
        instagram.post("test2");

        instagram.story("test3");
        instagram.story("test4");

        instagram.eventManager.unSubscribe(EventType.STORY, emailListener);

        instagram.story("test5");
        instagram.story("test5");
    }
}
