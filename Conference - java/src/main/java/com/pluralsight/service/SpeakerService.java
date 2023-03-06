package com.pluralsight.service;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.HibernateSpeakerRepository;
import com.pluralsight.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service("speakerService")
public class SpeakerService implements SpeakerServiceInterface {
    @Autowired
    private SpeakerRepository repository ;


    public SpeakerService(){
        System.out.println("Speaker service no args constructor");
    }

    public SpeakerService (SpeakerRepository speakerRepository){
        System.out.println("Speaker service repository constructor");
        repository = speakerRepository;
    }
    @PostConstruct
    public void afterConstruct(){
        System.out.println("after builded constructor");
    }

    public List<Speaker>findAll(){

        try {
            return repository.findAll();
        }
        catch (Exception e){
            System.out.println("Repository not found");
        }
        return repository.findAll();
    }

    /*public void setRepository(SpeakerRepository speakerRepository) {
        System.out.println("Speaker service setter constructor");
        this.repository = speakerRepository;
    }*/
}

