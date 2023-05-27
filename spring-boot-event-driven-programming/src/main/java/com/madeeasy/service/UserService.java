package com.madeeasy.service;

import com.madeeasy.model.UserEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    // publish event
    public void addUser(UserEvent userEvent){
        this.applicationEventPublisher.publishEvent(userEvent);
    }
    // publish event
    public void onStringParameterEvent(String hello) {
        applicationEventPublisher.publishEvent("string parameter");
    }
    // publish event
    public void onEmptyParameterEvent() {
        applicationEventPublisher.publishEvent(new Object());
    }

    public void withOutEventPublisher() {
        System.out.println("hi");
    }
}
