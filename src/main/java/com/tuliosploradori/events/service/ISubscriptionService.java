package com.tuliosploradori.events.service;

import com.tuliosploradori.events.model.Session;
import com.tuliosploradori.events.model.Subscription;
import com.tuliosploradori.events.model.User;

import java.util.List;

public interface ISubscriptionService {
    public Subscription addSubscription(Subscription subscription);
    public List<Subscription> getAllByUser(User user);
    public List<Subscription> getAllBySession(Session session);
}
