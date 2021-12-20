package br.com.marcelpinotti.vaccine.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PriorityGroupDTO {

    private Long id;

    @NotEmpty
    @Size(min = 4, max = 100)
    private String name;
}
