package com.example.graphqldemo.controller;

import com.example.graphqldemo.data.entity.Person;
import com.example.graphqldemo.service.PersonService;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Controller
public class PersonController {

  @Autowired PersonService personService;

  @MutationMapping
  public Mono<Person> createPerson(@Argument String name) {
    return personService.savePerson(name);
  }

  @QueryMapping
  public Flux<Person> getAllPersons() {
    return personService.findAllPersons();
  }

  @QueryMapping
  public Mono<Person> getPersonById(@Argument UUID id) {
    return personService.findPersonById(id);
  }
}
