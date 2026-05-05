package com.tuliosploradori.events.controller;

import com.tuliosploradori.events.model.Conference;
import com.tuliosploradori.events.service.IConferenceService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ConferenceController {

    private final IConferenceService service;

    public ConferenceController(IConferenceService service) {
        this.service = service;
    }

    @PostMapping("/conferences")
    public ResponseEntity<Conference> addConference(@RequestBody Conference conference) {
        return ResponseEntity.status(201).body(service.addConference(conference));
    }

    @GetMapping("/conferences/{conferenceId}")
    public ResponseEntity<Conference> getConferenceById(@PathVariable Integer conferenceId) {
        return ResponseEntity.ok().body(service.getConferenceById(conferenceId));
    }

    @GetMapping("/conferences")
    public ResponseEntity<List<Conference>> getAllConferences() {
        return ResponseEntity.ok(service.getAll());
    }
}