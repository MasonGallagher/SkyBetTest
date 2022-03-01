package com.masongallagher.skytest.entities;

import javax.persistence.*;

@Entity
@Table(name = "family_tree_person")
public class FamilyTreePerson {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Integer id;

    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="family_tree_id")
    private FamilyTree familyTree;
    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="person_id")
    private Person person;

    public FamilyTreePerson(FamilyTree familyTree, Person person) {
        this.familyTree = familyTree;
        this.person = person;
    }

    @Column(
            name = "id"
    )
    public Integer getId() { return this.id; }
    public void setId(Integer id) {
        this.id = id;
    }

    public FamilyTree getFamilyTree() {
        return familyTree;
    }

    public void setFamilyTree(FamilyTree familyTree) {
        this.familyTree = familyTree;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}