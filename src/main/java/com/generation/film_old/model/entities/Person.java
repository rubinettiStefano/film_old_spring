package com.generation.film_old.model.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

@Entity

//@Table(name="person")//se la tabella ha lo stesso nome della classe
//posso omettere @Table
public class Person 
{
    //@Column(name = "id")//opzionale se la colonna ha lo stesso nome della proprietà

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name,surname;

    @OneToMany(mappedBy = "owner", fetch = FetchType.EAGER)//quando leggi me leggi anche miei figli
    //è padre e la relazione figlio la trovi alla proprietà "owner" di Car
    private List<Car> cars;

    
}
