package com.example.graphqldemo.service;

import com.example.graphqldemo.data.dto.PersonDto;
import com.example.graphqldemo.data.entity.Person;
import com.example.graphqldemo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class PersonService {

  @Autowired PersonRepository personRepository;

  public Mono<Person> savePerson(PersonDto newPerson) {
    return personRepository.save(Person.builder().name(newPerson.getName()).build());
  }
}
