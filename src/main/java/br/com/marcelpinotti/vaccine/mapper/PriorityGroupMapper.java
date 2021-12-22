package br.com.marcelpinotti.vaccine.mapper;

import br.com.marcelpinotti.vaccine.domain.PriorityGroup;
import br.com.marcelpinotti.vaccine.dto.PriorityGroupDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PriorityGroupMapper {

    PriorityGroup toModel(PriorityGroupDTO priorityGroupDTO);

    PriorityGroupDTO toDTO(PriorityGroup priorityGroup);
}
