package com.masongallagher.skytest.entities;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Child extends Person{

    private Integer father_id;
    private Integer mother_id;

    private Child Child(){
        return new Child();
    }

    @Column(
            name = "father_id", nullable = true
    )
    public Integer getFather_id() {
        return father_id;
    }
    public void setFather_id(Integer father_id) {
        this.father_id = father_id;
    }

    @Column(
            name = "mother_id", nullable = true
    )
    public Integer getMother_id() {
        return mother_id;
    }
    public void setMother_id(Integer mother_id) {
        this.mother_id = mother_id;
    }
}