package br.com.marcelpinotti.citiesapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.marcelpinotti.citiesapi.domain.State;

public interface StateRepository extends JpaRepository<State, Long> {

}
