package com.pluralsight.service;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.HibernateSpeakerRepository;
import com.pluralsight.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.util.List;

public class SpeakerService implements SpeakerServiceInterface {
    @Autowired
    private SpeakerRepository speakerRepository ;

    public SpeakerService(){
        System.out.println("no args Constructor");
    }

    public SpeakerService(SpeakerRepository speakerRepository) {
        System.out.println("Repository based constructor");
        this.speakerRepository = speakerRepository;
    }
    @PostConstruct
    public void afterConstruct(){
        System.out.println("after builded constructor");
    }

    @Override
    public List<Speaker>findAll(){
        return speakerRepository.findAll();
    }

    public void setSpeakerRepository(SpeakerRepository speakerRepository) {
        System.out.println("Setter based constructor");
        this.speakerRepository = speakerRepository;
    }
}
