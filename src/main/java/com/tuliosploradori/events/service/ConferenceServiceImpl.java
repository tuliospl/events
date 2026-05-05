package com.tuliosploradori.events.service;

import com.tuliosploradori.events.exception.NotFoundException;
import com.tuliosploradori.events.model.Conference;
import com.tuliosploradori.events.repository.ConferenceRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConferenceServiceImpl implements IConferenceService {

    private final ConferenceRepo repo;

    public ConferenceServiceImpl(ConferenceRepo repo) {
        this.repo = repo;
    }

    @Override
    public Conference addConference(Conference conference) {
        return repo.save(conference);
    }

    @Override
    public Conference getConferenceById(Integer id) {
        return repo.findById(id).orElseThrow(() -> new NotFoundException("Conference " + id + " not found"));
    }

    @Override
    public List<Conference> getAll() {
        return repo.findAll();
    }
}
