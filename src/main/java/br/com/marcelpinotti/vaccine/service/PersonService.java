package br.com.marcelpinotti.vaccine.service;


import br.com.marcelpinotti.vaccine.domain.Person;
import br.com.marcelpinotti.vaccine.dto.PersonDTO;
import br.com.marcelpinotti.vaccine.mapper.PersonMapper;
import br.com.marcelpinotti.vaccine.repository.PersonRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class PersonService {

    private final PersonRepository personRepository;

    private final PersonMapper personMapper;

    public List<PersonDTO> listAll() {
        return personRepository.findAll()
                .stream()
                .map(personMapper::toDTO)
                .collect(Collectors.toList());
    }

    public PersonDTO createdPerson(PersonDTO personDTO) {
        Person person = personMapper.toModel(personDTO);
        Person savedPerson = personRepository.save(person);
        return personMapper.toDTO(savedPerson);
    }

    public void deletePerson(Long id){
        personRepository.deleteById(id);
    }

    public PersonDTO updatePerson(Long id, PersonDTO personDTO){
        personRepository.findById(id);
        Person person = personMapper.toModel(personDTO);
        Person updatePerson = personRepository.save(person);
        return personMapper.toDTO(updatePerson);
    }
}
