package com.tuliosploradori.events.service;

import com.tuliosploradori.events.model.Session;

import java.util.List;

public interface ISessionService {
    public Session addSession(Session session);
    public Session getSessionById(Integer id);
    public List<Session> getAll();
}
