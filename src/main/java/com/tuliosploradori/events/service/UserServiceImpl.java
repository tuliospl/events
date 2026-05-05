package com.tuliosploradori.events.service;

import com.tuliosploradori.events.exception.NotFoundException;
import com.tuliosploradori.events.model.User;
import com.tuliosploradori.events.repository.UserRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    private final UserRepo repo;

    public UserServiceImpl(UserRepo repo) {
        this.repo = repo;
    }

    @Override
    public User addUser(User user) {
        return repo.save(user);
    }

    @Override
    public User getUserById(Integer id) {
        return repo.findById(id).orElseThrow(() -> new NotFoundException("User " + id + " not found"));
    }

    @Override
    public List<User> getAllUsers() {
        return repo.findAll();
    }
}
