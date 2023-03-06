package com.pluralsight.util;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

import java.util.Calendar;

@Component
public class CalendarFactory implements FactoryBean<Calendar> {

    private Calendar instance = Calendar.getInstance();


    @Override
    public Calendar getObject() throws Exception {
        return instance;
    }

    @Override
    public Class<?> getObjectType() {
        return Calendar.class;
    }
    public void addDate(int day){
        instance.add(Calendar.DAY_OF_YEAR,day);
    }

}
