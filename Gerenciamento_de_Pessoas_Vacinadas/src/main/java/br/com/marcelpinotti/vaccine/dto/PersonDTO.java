package br.com.marcelpinotti.vaccine.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;
import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonDTO {

    private Long id;

    @NotEmpty
    @Size(min = 4, max = 100)
    private String name;

    @NotNull
    private int years;

    @NotEmpty
    @Size(min = 4, max = 100)
    private String birthDate;

    @NotEmpty
    @CPF
    @Size(min = 11, max = 11)
    private String cpf;

    @NotEmpty
    private String email;

    @NotEmpty
    private String phone;

    private Boolean isVaccine = false;

    @Valid
    private PriorityGroupDTO group;
}
