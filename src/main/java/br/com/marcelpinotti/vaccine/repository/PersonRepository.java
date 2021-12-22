package br.com.marcelpinotti.vaccine.repository;

import br.com.marcelpinotti.vaccine.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
