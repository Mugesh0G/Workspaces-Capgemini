package com.pluralsight.model;

public class Speaker {
    private String firstName;
    private String lastName;
    private int valueNum;

    public void setValueNum(int valueNum) {
        this.valueNum = valueNum;
    }

    public int getValueNum() {
        return valueNum;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
