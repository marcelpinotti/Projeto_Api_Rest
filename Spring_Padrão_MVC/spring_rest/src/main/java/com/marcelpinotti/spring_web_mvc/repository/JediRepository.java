package com.marcelpinotti.spring_web_mvc.repository;

import com.marcelpinotti.spring_web_mvc.model.Jedi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JediRepository extends JpaRepository<Jedi, Long> {

}