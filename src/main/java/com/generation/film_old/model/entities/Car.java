package com.generation.film_old.model.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
public class Car 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String model;
    private int price;

    //annotiamo proprietà RIFERIMENTO AL PADRE con annotazione ManyToOne
    @ManyToOne(fetch = FetchType.EAGER)//quando leggi me leggi anche mio padre
    @JoinColumn(name="owner_id")//questa è la chiave esterna sul db
    private Person owner;
}
