package com.generation.film_old.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.generation.film_old.model.entities.Person;
import com.generation.film_old.model.repositories.PersonRepository;


@Controller
public class PersonController 
{
    @Autowired
    PersonRepository repo;

    @GetMapping("/personpage")
    public String getPerson(Model model) 
    {
        Person p = repo.findById(1).get();
        model.addAttribute("person", p);
        model.addAttribute("cars", p.getCars());

        return "showPerson";
    }
    
}
