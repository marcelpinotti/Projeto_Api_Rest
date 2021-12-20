package br.com.marcelpinotti.vaccine.service;


import br.com.marcelpinotti.vaccine.domain.PriorityGroup;
import br.com.marcelpinotti.vaccine.dto.PriorityGroupDTO;
import br.com.marcelpinotti.vaccine.mapper.PriorityGroupMapper;
import br.com.marcelpinotti.vaccine.repository.PriorityGroupRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class PriorityGroupService {

    private final PriorityGroupRepository priorityGroupRepository;

    private final PriorityGroupMapper priorityGroupMapper;

    public List<PriorityGroupDTO> listAll() {
        return priorityGroupRepository.findAll()
                .stream()
                .map(priorityGroupMapper::toDTO)
                .collect(Collectors.toList());
    }

    public PriorityGroupDTO createGroup(PriorityGroupDTO priorityGroupDTO) {
        PriorityGroup priorityGroup = priorityGroupMapper.toModel(priorityGroupDTO);
        PriorityGroup savedGroup = priorityGroupRepository.save(priorityGroup);
        return priorityGroupMapper.toDTO(savedGroup);
    }

    public PriorityGroupDTO updateGroup(Long id , PriorityGroupDTO priorityGroupDTO){

        priorityGroupRepository.findById(id);

        PriorityGroup priorityGroup = priorityGroupMapper.toModel(priorityGroupDTO);
        PriorityGroup updateGroup = priorityGroupRepository.save(priorityGroup);

        return priorityGroupMapper.toDTO(updateGroup);
    }

    public void deleteGroup(Long id) {
        priorityGroupRepository.deleteById(id);
    }
}