package com.masongallagher.skytest.services;

import com.masongallagher.skytest.dtos.PersonDTO;
import com.masongallagher.skytest.entities.Person;
import com.masongallagher.skytest.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;


@Service
@Transactional
public class PersonService {

    @Autowired
    private PersonRepository personRepository;


    @Transactional
    public Person savePerson(PersonDTO personDTO) {
        return personRepository.save(buildPersonFromDto(personDTO));
    }


    private Person buildPersonFromDto(PersonDTO personDTO){
        Person person = new Person();
        person.setForename(personDTO.getForename());
        person.setSurname(personDTO.getSurname());
        person.setGender(personDTO.getGender());
        return person;
    }
}
