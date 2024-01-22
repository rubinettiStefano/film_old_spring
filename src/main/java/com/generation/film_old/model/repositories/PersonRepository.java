package com.generation.film_old.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.film_old.model.entities.Person;

public interface PersonRepository extends JpaRepository<Person,Integer>
{

}
