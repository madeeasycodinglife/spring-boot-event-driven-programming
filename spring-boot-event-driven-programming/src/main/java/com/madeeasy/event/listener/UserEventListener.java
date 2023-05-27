package com.madeeasy.event.listener;

import com.madeeasy.model.UserEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
// event listener
public class UserEventListener  {
    /**
     * it will listen to UserEvent
     *
     * to make asynchronous use the annotation @Async on the Event listener.i.e.
     * You don’t want to block the user for auditing logic, it can happen in a parallel thread.
     */
    @Async
    @EventListener
    public void onUserEventParameterEvent(UserEvent userEvent) {
        System.out.println("User added successfully ");
    }

    /**
     * it will listen to String
     */
    @Async
    @EventListener
    public void onStringParameterEvent(String message) {
        System.out.println("simple String event message : "+message);
    }

    /**
     * default all times it will execute
     * @param object
     */
    @Async
    @EventListener
    public void onEmptyParameterEvent(Object object) {
        System.out.println("simple default object parameter event");
    }
    @EventListener
    public  void onWithOutEventPublisher(Integer value){
        System.out.println("hello");
    }
}
