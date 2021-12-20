package br.com.marcelpinotti.vaccine.controller;


import br.com.marcelpinotti.vaccine.dto.PriorityGroupDTO;
import br.com.marcelpinotti.vaccine.service.PriorityGroupService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/prioritygroups")
public class PriorityGroupController {


    private final PriorityGroupService priorityGroupService;

    @GetMapping
    public List<PriorityGroupDTO> listPriorityGroups(){
        return priorityGroupService.listAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public PriorityGroupDTO createGroup(@RequestBody @Valid PriorityGroupDTO priorityGroupDTO) {
        return priorityGroupService.createGroup(priorityGroupDTO);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteGroup(@PathVariable Long id){
        priorityGroupService.deleteGroup(id);
    }

    @PutMapping("/{id}")
    public PriorityGroupDTO updateGroup(@PathVariable Long id, @RequestBody @Valid PriorityGroupDTO priorityGroupDTO){
        return priorityGroupService.updateGroup(id, priorityGroupDTO);
    }
}
