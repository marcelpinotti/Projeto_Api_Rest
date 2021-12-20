package br.com.marcelpinotti.cadastro_de_clientes_api.entity;


import br.com.marcelpinotti.cadastro_de_clientes_api.enums.TipoDeTelefone;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Telefone {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TipoDeTelefone tipo;

    @Column(nullable = false)
    private String numero;




}
