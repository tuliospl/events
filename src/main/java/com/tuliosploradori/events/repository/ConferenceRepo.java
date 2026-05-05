package com.tuliosploradori.events.repository;

import com.tuliosploradori.events.model.Conference;
import org.springframework.data.repository.ListCrudRepository;

public interface ConferenceRepo extends ListCrudRepository<Conference, Integer> {

}
