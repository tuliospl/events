package com.tuliosploradori.events.service;

import com.tuliosploradori.events.exception.NotFoundException;
import com.tuliosploradori.events.model.Session;
import com.tuliosploradori.events.repository.SessionRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SessionServiceImpl implements ISessionService {

    private final SessionRepo repo;

    public SessionServiceImpl(SessionRepo repo) {
        this.repo = repo;
    }

    @Override
    public Session addSession(Session session) {
        return repo.save(session);
    }

    public Session getSessionById(Integer id) {
        return repo.findById(id).orElseThrow(() -> new NotFoundException("Session "+ id + " not found"));
    }

    @Override
    public List<Session> getAll() {
        return repo.findAll();
    }
}
