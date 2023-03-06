package com.pluralsight.repository;

import com.pluralsight.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerRepository implements SpeakerRepository {

    @Override
    public List<Speaker>findAll(){
        List<Speaker>speakers = new ArrayList<Speaker>();
        Speaker speaker = new Speaker();
        speaker.setFirstName("mugesh");
        speaker.setLastName("G");

        speakers.add(speaker);
        return speakers;
    }
}
