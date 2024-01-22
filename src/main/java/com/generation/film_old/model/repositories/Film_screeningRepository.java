package com.generation.film_old.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.film_old.model.entities.Film_screening;

                                                //INTERFACCIA STANDARD
                                                //<Tipo_Entità,Tipo_Id>
public interface Film_screeningRepository extends JpaRepository<Film_screening,Integer>
{
    //abbiamo finito
    //abbiamo già una repository con tutti i metodi di CRUD
}

//Crea questa classe in automatico
//@Component
//public class ImplementazioneRepo implements Film_screeningRepository
//{
//      tutti i metodi concreti
//      List<Film_screening> findAll()
/*      {
            SELECT * FROM tableName
            _rsToFilm_screening -> setTitle(rs.getString("nomeColumn"))
        }
 * 
 * 
 * 
 * 
 * 
 */
//}