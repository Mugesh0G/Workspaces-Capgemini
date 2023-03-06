package com.pluralsight.service;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.HibernateSpeakerRepository;
import com.pluralsight.repository.SpeakerRepository;

import java.util.List;

public class SpeakerService implements SpeakerServiceInterface {
    private SpeakerRepository speakerRepository = new HibernateSpeakerRepository();
    @Override
    public List<Speaker>findAll(){
        return speakerRepository.findAll();
    }
}
