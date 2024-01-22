package com.generation.film_old.model.components;

import java.util.Scanner;

import org.springframework.stereotype.Component;

@Component //all avvio lui fa new Console() e salva l'oggetto in memoria, nell'Application Context
public class Console 
{
    public Console(){}
    private Scanner s = new Scanner(System.in);

    public String readString()
    {
        return s.nextLine();
    }

    public int readInt()
    {
        return Integer.parseInt(s.nextLine());
    }

    public void print(Object o)
    {
        System.out.println(o.toString());
    }
}
