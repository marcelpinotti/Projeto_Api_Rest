package br.com.marcelpinotti.vaccine.controller;

import br.com.marcelpinotti.vaccine.dto.PersonDTO;
import br.com.marcelpinotti.vaccine.service.PersonService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/persons")
public class PersonController {


    private final PersonService personService;

    @GetMapping
    public List<PersonDTO> listPersons(){
        return personService.listAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public PersonDTO createdPerson(@RequestBody @Valid PersonDTO personDTO){
        return personService.createdPerson(personDTO);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletePerson(@PathVariable Long id){
        personService.deletePerson(id);
    }

    @PutMapping("/{id}")
    public PersonDTO upadtatePerson(@PathVariable Long id, @RequestBody @Valid PersonDTO personDTO){
        return personService.updatePerson(id, personDTO);
    }
}
