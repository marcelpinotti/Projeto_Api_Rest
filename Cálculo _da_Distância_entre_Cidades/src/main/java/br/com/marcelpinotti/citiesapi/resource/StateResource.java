package br.com.marcelpinotti.citiesapi.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.marcelpinotti.citiesapi.repository.StateRepository;
import br.com.marcelpinotti.citiesapi.domain.State;


@RestController
@RequestMapping("/states")
public class StateResource {
	
	@Autowired
	private StateRepository repository;

	
	@GetMapping
	public List<State> staties() {
		return repository.findAll();
	}

}
