package br.com.marcelpinotti.citiesapi.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "pais")
public class Country {

    @Id
    private Long id;

    @Column( name  =  " nome " )
    private String name;

    @Column ( name  =  " nome_pt " )
    private  String portugueseName;

    @Column ( name  =  " sigla " )
    private String codigo ;

    private Integer bacen ;

    public Country(){
    };

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPortugueseName() {
        return portugueseName;
    }

    public String getCodigo() {
        return codigo;
    }

    public Integer getBacen() {
        return bacen;
    }
}
