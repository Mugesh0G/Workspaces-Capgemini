package com.pluralsight.repository;

import com.pluralsight.model.Speaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
@Repository("speakerRepository")
public class HibernateSpeakerRepository implements SpeakerRepository {

    @Autowired
    private Calendar calendar;

    @Value("0")
    private int num;


    @Override
    public List<Speaker>findAll(){
        List<Speaker>speakers = new ArrayList<Speaker>();
        Speaker speaker = new Speaker();
        speaker.setFirstName("mugesh");
        speaker.setLastName("G");
        speaker.setValueNum(num);

        System.out.println("Time: "+calendar.getTime());

        speakers.add(speaker);
        return speakers;
    }

}
