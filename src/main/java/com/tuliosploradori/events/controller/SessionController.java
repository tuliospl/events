package com.tuliosploradori.events.controller;

import com.tuliosploradori.events.model.Session;
import com.tuliosploradori.events.model.User;
import com.tuliosploradori.events.service.ISessionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SessionController {

    private final ISessionService service;

    public SessionController(ISessionService service) {
        this.service = service;
    }

    @PostMapping("/sessions")
    public ResponseEntity<Session> addSession(@RequestBody Session session) {
        return ResponseEntity.status(201).body(service.addSession(session));
    }

    @GetMapping("/sessions/{sessionId}")
    public ResponseEntity<Session> getSessionById(@PathVariable Integer sessionId) {
        return ResponseEntity.ok().body(service.getSessionById(sessionId));
    }

    @GetMapping("/sessions")
    public ResponseEntity<List<Session>> getAllSessions() {
        return ResponseEntity.ok(service.getAll());
    }
}
