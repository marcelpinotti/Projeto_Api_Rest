package br.com.marcelpinotti.cadastro_de_clientes_api.enums;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TipoDeTelefone {

    @JsonProperty("Residencial")
    RESIDENCIAL ("Residencial"),
    @JsonProperty("Celular")
    CELULAR ("Celular"),
    @JsonProperty("Comercial")
    COMERCIAL ( "Comercial");

    private final String descricao;

}