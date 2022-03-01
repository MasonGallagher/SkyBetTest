package com.masongallagher.skytest.controllers;

import com.masongallagher.skytest.dtos.FamilyTreeHolderDTO;
import com.masongallagher.skytest.dtos.PersonDTO;
import com.masongallagher.skytest.entities.Person;
import com.masongallagher.skytest.services.FamilyTreeService;
import com.masongallagher.skytest.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/api/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping(value = "/save", method = RequestMethod.PUT)
    public ResponseEntity<Person> savePerson(@RequestBody PersonDTO personDTO) {
        try {
            return ResponseEntity.ok(personService.savePerson(personDTO));
        } catch(Throwable throwable) {
            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST, "Error storing message: ", throwable);
        }
    }

}