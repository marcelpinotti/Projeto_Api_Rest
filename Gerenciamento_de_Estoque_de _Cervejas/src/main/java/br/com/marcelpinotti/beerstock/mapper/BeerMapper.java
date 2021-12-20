package br.com.marcelpinotti.beerstock.mapper;

import br.com.marcelpinotti.beerstock.dto.BeerDTO;
import br.com.marcelpinotti.beerstock.entity.Beer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper (componentModel = "spring")
public interface BeerMapper {

    Beer toModel(BeerDTO beerDTO);

    BeerDTO toDTO(Beer beer);
}