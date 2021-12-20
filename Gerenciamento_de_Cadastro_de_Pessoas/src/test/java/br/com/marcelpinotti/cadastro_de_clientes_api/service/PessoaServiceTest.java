package br.com.marcelpinotti.cadastro_de_clientes_api.service;


import br.com.marcelpinotti.cadastro_de_clientes_api.dto.request.PessoaDTO;
import br.com.marcelpinotti.cadastro_de_clientes_api.dto.response.MensagemResponseDto;
import br.com.marcelpinotti.cadastro_de_clientes_api.entity.Pessoa;
import br.com.marcelpinotti.cadastro_de_clientes_api.mapper.PessoaMapper;
import br.com.marcelpinotti.cadastro_de_clientes_api.repository.PessoaRepository;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mapstruct.factory.Mappers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static br.com.marcelpinotti.cadastro_de_clientes_api.utils.PessoaUtils.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
public class PessoaServiceTest {


    @Mock
    private PessoaRepository pessoaRepository;

    @Spy
    private PessoaMapper pessoaMapper = Mappers.getMapper(PessoaMapper.class);

    @InjectMocks
    private PessoaService pessoaService;


    @Test
    void testGivenPersonDTOThenReturnSavedMessage() {
        PessoaDTO pessoaDTO = createFakeDTO();
        Pessoa expectedSavedPerson = createFakeEntity();

        when(pessoaRepository.save(any(Pessoa.class))).thenReturn(expectedSavedPerson);

        MensagemResponseDto expectedSuccessMessage = createExpectedMessageResponse(expectedSavedPerson.getId());
        MensagemResponseDto successMessage;
        successMessage = pessoaService.criandoPessoa(pessoaDTO);

        assertEquals(expectedSuccessMessage, successMessage);
    }

    private MensagemResponseDto createExpectedMessageResponse(Long id) {
        return MensagemResponseDto
                .builder()
                .mensagem("Criada pessoa com o ID: " + id)
                .build();
    }

}
