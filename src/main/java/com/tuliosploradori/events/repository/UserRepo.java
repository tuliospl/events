package com.tuliosploradori.events.repository;

import com.tuliosploradori.events.model.User;
import org.springframework.data.repository.ListCrudRepository;

public interface UserRepo extends ListCrudRepository<User, Integer> {

}
