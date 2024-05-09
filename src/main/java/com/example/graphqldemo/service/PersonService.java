package com.example.graphqldemo.service;

import com.example.graphqldemo.data.entity.Person;
import com.example.graphqldemo.repository.PersonRepository;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PersonService {

  @Autowired PersonRepository personRepository;

  public Mono<Person> savePerson(String name) {
    return personRepository.save(Person.builder().name(name).build());
  }

  public Flux<Person> findAllPersons() {
    return personRepository.findAll();
  }

  public Mono<Person> findPersonById(UUID id) {
    return personRepository.findById(id);
  }
}
