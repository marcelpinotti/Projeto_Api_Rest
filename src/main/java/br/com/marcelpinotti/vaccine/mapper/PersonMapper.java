package br.com.marcelpinotti.vaccine.mapper;

import br.com.marcelpinotti.vaccine.domain.Person;
import br.com.marcelpinotti.vaccine.dto.PersonDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PersonMapper {

    Person toModel(PersonDTO personDTO);

    PersonDTO toDTO(Person person);
}