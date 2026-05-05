package com.tuliosploradori.events.service;

import com.tuliosploradori.events.model.Session;
import com.tuliosploradori.events.model.Subscription;
import com.tuliosploradori.events.model.User;
import com.tuliosploradori.events.repository.SubscriptionRepo;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
public class SubscriptionServiceImpl implements ISubscriptionService {

    private final SubscriptionRepo repo;

    public SubscriptionServiceImpl(SubscriptionRepo repo) {
        this.repo = repo;
    }

    @Override
    public Subscription addSubscription(Subscription subscription) {
        subscription.setCreatedAt(LocalDateTime.now());
        subscription.setUniqueId(UUID.randomUUID().toString());
        return repo.save(subscription);
    }

    @Override
    public List<Subscription> getAllByUser(User user) {
        return repo.findByIdUser(user);
    }

    @Override
    public List<Subscription> getAllBySession(Session session) {
        return repo.findByIdSession(session);
    }
}
