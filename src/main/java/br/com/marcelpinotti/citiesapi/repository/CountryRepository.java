package br.com.marcelpinotti.citiesapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.marcelpinotti.citiesapi.domain.Country;


public interface CountryRepository extends JpaRepository<Country, Long> {

}
