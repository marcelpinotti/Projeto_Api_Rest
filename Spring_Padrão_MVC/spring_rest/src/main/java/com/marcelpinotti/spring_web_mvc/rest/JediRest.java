package com.marcelpinotti.spring_web_mvc.rest;


import com.marcelpinotti.spring_web_mvc.exception.JediNotFoundException;
import com.marcelpinotti.spring_web_mvc.model.Jedi;
import com.marcelpinotti.spring_web_mvc.repository.JediRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import java.net.http.HttpResponse;
import java.util.List;
import java.util.Optional;

@RestController
public class JediRest {

    @Autowired
    private JediRepository jediRepository;

    @GetMapping("/api/jedi")
    public List<Jedi> getAllJedi(){
        return jediRepository.findAll();
    }

    @GetMapping("/api/jedi/{id}")
    public ResponseEntity<Jedi> getJedi(@PathVariable("id") Long id, HttpRequest response){
        final Optional<Jedi> jedi = jediRepository.findById(id);
        if(jedi.isEmpty()) {
            return ResponseEntity.ok(jedi.get());
        }else{
            return ResponseEntity.notFound().build();
        }
    }

}

