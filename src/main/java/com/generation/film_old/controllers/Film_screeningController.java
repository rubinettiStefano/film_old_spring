package com.generation.film_old.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.generation.film_old.model.entities.Film_screening;
import com.generation.film_old.model.repositories.Film_screeningRepository;





@Controller //dice a Spring che lui riceve HttpRequest e chiama Views per mandare la response
public class Film_screeningController 
{

    
    // Repository <Film_screening> repo = new Film_screeningRepository();
    // @Override
    // protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    // {
    //     req.setAttribute("screenings", repo.findAll());

    //     req.getRequestDispatcher("/showScreenings.ftl").forward(req, resp);
    // }

    @Autowired //lui (vedremo come) fornisce un'istanza di questa Interfaccia e la mette
    //dentro la variabile repo
    Film_screeningRepository repo;//= Film_screeningRepositoryFactory.make();
    //Specifichiamo la mappatura medoto per metodo
    //voglio un semplice metodo per mostrare l'homepage
    //non restituisce davvero una String ma una View
    @GetMapping("/homepage")//questo metodo si attiverà quando verrà fatta una REQUEST
    //con method GET all'endpoint /homepage
    public String seeAllScreenings(Model model)//model contiene gli attributi da passare alla view
    {
        model.addAttribute("screenings", repo.findAll());

        //chiamiamo la view
        return "showScreenings";//qui sto chiamando la view showScreenings.ftlh in templates
    }


    //  @Override
    // protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    // {
    //     req.getRequestDispatcher("/insertForm.ftl").forward(req, resp);
    // }

    @GetMapping("/form")
    public String getMethodName() 
    {
        return "insertForm";
    }
    

    // @Override
    // protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
    // {
    //     String title= req.getParameter("title");
    //     String cinema_room = req.getParameter("cinema_room");
    //     double price = Double.parseDouble(req.getParameter("price"));
    //     LocalDateTime screening_time= LocalDateTime.parse(req.getParameter("screening_time"));

    //     Film_screening fs = new Film_screening(screening_time, title, cinema_room, price);
    //     repo.save(fs);

    //     req.getRequestDispatcher("/insertForm.ftl").forward(req, resp);
    // }

    @PostMapping("/form")
    //con @ModelAttribute in automatico converte i parametri
    //in un oggetto di tipo Film_screening che mette dentro il parametro formConvertita
    public String postMethodName(@ModelAttribute Film_screening formConvertita) 
    {
        repo.save(formConvertita);
        return "insertForm";
    }
    
}
