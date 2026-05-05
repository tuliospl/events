package com.tuliosploradori.events.repository;

import com.tuliosploradori.events.model.Session;
import org.springframework.data.repository.ListCrudRepository;

public interface SessionRepo extends ListCrudRepository<Session, Integer> {

}
