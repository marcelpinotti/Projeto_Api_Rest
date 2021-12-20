package com.marcelpinotti.spring_web_mvc.repository;

import com.marcelpinotti.spring_web_mvc.model.Jedi;
import org.springframework.stereotype.Repository;


import java.util.ArrayList;
import java.util.List;

@Repository
public class JediRepository {

    private List<Jedi> jedi;

    public JediRepository(){
        jedi = new ArrayList<>();
        jedi.add(new Jedi("Luke", "Skywlker"));
        jedi.add(new Jedi("Obi-Wan", "Kenobi"));
        jedi.add(new Jedi("Qui-Gon", "Jinn"));
    }

    public List<Jedi> getAllJedi(){
        return this.jedi;
    }

    public void add(final Jedi jedi) {
        this.jedi.add(jedi);
    }
}