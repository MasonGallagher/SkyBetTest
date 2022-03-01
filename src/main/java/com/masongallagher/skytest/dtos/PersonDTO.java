package com.masongallagher.skytest.dtos;

/*
 * Message Data Transfer Object
 */
public class PersonDTO {
    private Integer id;
    private String forename;
    private String surname;
    private char gender;


    public int getId() { return this.id; }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getForename() {
        return forename;
    }
    public void setForename(String forename) {
        this.forename = forename;
    }

    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }

}
