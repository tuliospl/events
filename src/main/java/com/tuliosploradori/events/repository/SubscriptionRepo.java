package com.tuliosploradori.events.repository;

import com.tuliosploradori.events.model.Session;
import com.tuliosploradori.events.model.Subscription;
import com.tuliosploradori.events.model.SubscriptionID;
import com.tuliosploradori.events.model.User;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface SubscriptionRepo extends ListCrudRepository<Subscription, SubscriptionID> {
    public List<Subscription> findByIdUser(User user);
    public List<Subscription> findByIdSession(Session session);
}
