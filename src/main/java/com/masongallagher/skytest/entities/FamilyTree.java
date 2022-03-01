package com.masongallagher.skytest.entities;

import javax.persistence.*;

@Entity
@Table(name = "family_tree")
public class FamilyTree {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Integer id;
    private String family_name;

    public FamilyTree(Person father, Person mother) {
        this.family_name = father.getSurname();

    }

    @Column(
            name = "id"
    )
    public Integer getId() { return this.id; }
    public void setId(Integer id) {
        this.id = id;
    }



    @Column(
            name = "family_name"
    )
    public String getFamily_name() {
        return family_name;
    }
        public void setFamily_name(String family_name) {
        this.family_name = family_name;
    }
}