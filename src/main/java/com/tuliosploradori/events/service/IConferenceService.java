package com.tuliosploradori.events.service;

import com.tuliosploradori.events.model.Conference;

import java.util.List;

public interface IConferenceService {
    public Conference addConference(Conference conference);
    public Conference getConferenceById(Integer id);
    public List<Conference> getAll();
}
