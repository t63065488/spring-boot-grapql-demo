package com.example.graphqldemo.controller;

import com.example.graphqldemo.data.dto.PersonDto;
import com.example.graphqldemo.data.entity.Person;
import com.example.graphqldemo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class PersonController {

  @Autowired PersonService personService;

  @PostMapping(value = "/person", consumes = MediaType.APPLICATION_JSON_VALUE)
  public Mono<Person> createPerson(@RequestBody PersonDto newPerson) {
    return personService.savePerson(newPerson);
  }
}
