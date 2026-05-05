package com.tuliosploradori.events.controller;

import com.tuliosploradori.events.model.Session;
import com.tuliosploradori.events.model.Subscription;
import com.tuliosploradori.events.model.User;
import com.tuliosploradori.events.service.ISubscriptionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SubscriptionController {

    private final ISubscriptionService service;

    public SubscriptionController(ISubscriptionService service) {
        this.service = service;
    }

    @PostMapping("/subscriptions")
    public ResponseEntity<Subscription> addSubscription(@RequestBody Subscription subscription) {
        return ResponseEntity.status(201).body(service.addSubscription(subscription));
    }

    @GetMapping("subscriptions/user/{userId}")
    public ResponseEntity<List<Subscription>> getAllByUser(@PathVariable Integer userId) {
        User user = new User();
        user.setUserId(userId);
        return ResponseEntity.ok(service.getAllByUser(user));
    }

    @GetMapping("subscriptions/session/{sessionId}")
    public ResponseEntity<List<Subscription>> getAllBySession(@PathVariable Integer sessionId) {
        Session session = new Session();
        session.setSessionId(sessionId);
        return ResponseEntity.ok(service.getAllBySession(session));
    }
}
