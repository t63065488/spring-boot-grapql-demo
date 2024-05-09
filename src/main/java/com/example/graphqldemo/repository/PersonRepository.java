package com.example.graphqldemo.repository;

import com.example.graphqldemo.data.entity.Person;
import java.util.UUID;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends ReactiveCrudRepository<Person, UUID> {}
