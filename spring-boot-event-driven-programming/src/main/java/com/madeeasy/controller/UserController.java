package com.madeeasy.controller;

import com.madeeasy.model.UserEvent;
import com.madeeasy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    /**
     * You might have heard about the queueing mechanism providers like RabbitMQ, Apache Kafka, ActiveMQ. These are best suited
     * in distributed systems. Imagine the use case where an application has to send an email after a new user is registered.
     * In an ideal world, email and registration services are deployed independently. Registration service will trigger an event
     * with the payload containing the new user’s information. This event is then consumed by the email service and an
     * email has been sent to the user.
     *
     * What if you want to create an event and consume it in the same application. Of course, we can have Kafka, ActiveMQ configured,
     * and consume those events. But there are certain scenarios where you don’t need all these queue mechanism providers.
     * In such situations, you can make use of application events which spring provides.
     *
     * Spring boot provides event publishing and subscriber capability. Suppose an application needs to update
     * project-users mapping information in the database table as soon as the project is created.
     */
    /**
     * Q: Is it possible to have Publisher in one Spring Boot application and Listener in another application?
     * Ans:
     * Publisher and Listener of the EventListener can be handle within only one Spring application.
     * We'll need to use an external message queue to spread them over the network (e.g. Kafka, RabbitMQ).
     */
    @Autowired
    private UserService userService;
    @GetMapping("/notify/event")
    public void publishEvent(@RequestBody UserEvent userEvent) {
            userService.addUser(userEvent);
            userService.onStringParameterEvent("hello");
            userService.onEmptyParameterEvent();
            userService.withOutEventPublisher();
    }
}
