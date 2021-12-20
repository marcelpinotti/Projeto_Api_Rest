package br.com.marcelpinotti.cadastro_de_clientes_api.utils;


import br.com.marcelpinotti.cadastro_de_clientes_api.dto.request.PessoaDTO;
import br.com.marcelpinotti.cadastro_de_clientes_api.entity.Pessoa;

import java.time.LocalDate;
import java.util.Collections;

public class PessoaUtils {

    private static final String FIRST_NAME = "Rodrigo";
    private static final String LAST_NAME = "Peleias";
    private static final String CPF_NUMBER = "369.333.878-79";
    private static final long PERSON_ID = 1L;
    public static final LocalDate BIRTH_DATE = LocalDate.of(2010, 10, 1);

    public static PessoaDTO createFakeDTO() {
        return PessoaDTO.builder()
                .nome(FIRST_NAME)
                .sobrenome(LAST_NAME)
                .cpf(CPF_NUMBER)
                .dataDeNascimento("2010-04-04")
                .telefones(Collections.singletonList(TelefoneUtils.createFakeDTO()))
                .build();
    }

    public static Pessoa createFakeEntity() {
        return Pessoa.builder()
                .id(PERSON_ID)
                .nome(FIRST_NAME)
                .sobrenome(LAST_NAME)
                .cpf(CPF_NUMBER)
                .dataDeNascimento(BIRTH_DATE)
                .telefones(Collections.singletonList(TelefoneUtils.createFakeEntity()))
                .build();
    }
}
