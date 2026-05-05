package com.tuliosploradori.events.service;

import com.tuliosploradori.events.model.User;

import java.util.List;

public interface IUserService {
    public User addUser(User user);
    public User getUserById(Integer id);
    public List<User> getAllUsers();
}
