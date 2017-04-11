package com.morozovcookie.roadbuddy.domain.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.morozovcookie.roadbuddy.domain.entity.Person;

@RepositoryRestResource
public interface PersonRepository extends CrudRepository<Person, Long> {
}
