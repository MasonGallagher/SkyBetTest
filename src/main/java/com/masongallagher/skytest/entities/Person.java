package com.masongallagher.skytest.entities;

import javax.persistence.*;

@Entity
@Table(name = "person")
public class Person {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Integer id;
    private String forename;
    private String surname;
    private char gender;

    private Person Person(){
        return new Person();
    }

    @Column(
            name = "id"
    )
    public Integer getId() { return this.id; }
    public void setId(Integer id) {
        this.id = id;
    }

    @Column(
            name = "forename"
    )
    public String getForename() {
        return forename;
    }
    public void setForename(String forename) {
        this.forename = forename;
    }

    @Column(
            name = "surname"
    )
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Column(
            name = "gender"
    )
    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }

}