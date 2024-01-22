package com.generation.film_old.model.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor //crea costruttore vuoto
@AllArgsConstructor //crea costruttore pieno
@Getter//crea tutti i getter
@Setter//crea tutti i setter 
@ToString
@Builder //alternativa al costruttore, lo vedremo nella pratica
//Da qui parliamo di ORM
@Entity //questa annotazione dice che questa classe è un Entità
        //che vogliamo abbia le funzioni di CRUD
@Table(name="film_screening")//Diciamo come si chiama la tabella
//in cui devono essere salvati/letti gli oggetti di questa entità
public class Film_screening 
{
    @Column(name = "id")
    @Id//è chiave primaria nel db
    @GeneratedValue(strategy = GenerationType.IDENTITY )//è auto_increment
    private Integer id;

    @Column(name = "screening_time")//questa proprietà è una COLONNA NELLA TABELLA
    //del DB e si chiama (nel db )screening_time
    private LocalDateTime screening_time;

    @Column(name = "title")
    private String title;

    @Column(name = "cinema_room")
    private String cinema_room;

    @Column(name = "price")
    private double price;

    
}
