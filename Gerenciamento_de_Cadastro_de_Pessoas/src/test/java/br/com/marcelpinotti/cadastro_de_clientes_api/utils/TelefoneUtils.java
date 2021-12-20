package br.com.marcelpinotti.cadastro_de_clientes_api.utils;


import br.com.marcelpinotti.cadastro_de_clientes_api.dto.request.TelefoneDTO;
import br.com.marcelpinotti.cadastro_de_clientes_api.dto.request.PessoaDTO;
import br.com.marcelpinotti.cadastro_de_clientes_api.entity.Telefone;
import br.com.marcelpinotti.cadastro_de_clientes_api.enums.TipoDeTelefone;

public class TelefoneUtils {

    private static final String PHONE_NUMBER = "1199999-9999";
    private static final TipoDeTelefone PHONE_TYPE = TipoDeTelefone.CELULAR;
    private static final long PHONE_ID = 1L;

    public static TelefoneDTO createFakeDTO() {
        return TelefoneDTO.builder()
                .numero(PHONE_NUMBER)
                .tipo(PHONE_TYPE)
                .build();
    }

    public static Telefone createFakeEntity() {
        return Telefone.builder()
                .id(PHONE_ID)
                .numero(PHONE_NUMBER)
                .tipo(PHONE_TYPE)
                .build();
    }
}

