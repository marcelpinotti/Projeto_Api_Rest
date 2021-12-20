package br.com.marcelpinotti.cadastro_de_clientes_api.mapper;

import br.com.marcelpinotti.cadastro_de_clientes_api.dto.request.PessoaDTO;
import br.com.marcelpinotti.cadastro_de_clientes_api.dto.request.PessoaDTO.PessoaDTOBuilder;
import br.com.marcelpinotti.cadastro_de_clientes_api.dto.request.TelefoneDTO;
import br.com.marcelpinotti.cadastro_de_clientes_api.dto.request.TelefoneDTO.TelefoneDTOBuilder;
import br.com.marcelpinotti.cadastro_de_clientes_api.entity.Pessoa;
import br.com.marcelpinotti.cadastro_de_clientes_api.entity.Pessoa.PessoaBuilder;
import br.com.marcelpinotti.cadastro_de_clientes_api.entity.Telefone;
import br.com.marcelpinotti.cadastro_de_clientes_api.entity.Telefone.TelefoneBuilder;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-06-21T23:28:44-0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.10 (Oracle Corporation)"
)
@Component
public class PessoaMapperImpl implements PessoaMapper {

    @Override
    public Pessoa toModel(PessoaDTO pessoaDTO) {
        if ( pessoaDTO == null ) {
            return null;
        }

        PessoaBuilder pessoa = Pessoa.builder();

        if ( pessoaDTO.getDataDeNascimento() != null ) {
            pessoa.dataDeNascimento( LocalDate.parse( pessoaDTO.getDataDeNascimento(), DateTimeFormatter.ofPattern( "yyyy-MM-dd" ) ) );
        }
        pessoa.id( pessoaDTO.getId() );
        pessoa.nome( pessoaDTO.getNome() );
        pessoa.sobrenome( pessoaDTO.getSobrenome() );
        pessoa.cpf( pessoaDTO.getCpf() );
        pessoa.telefones( telefoneDTOListToTelefoneList( pessoaDTO.getTelefones() ) );

        return pessoa.build();
    }

    @Override
    public PessoaDTO toDTO(Pessoa pessoa) {
        if ( pessoa == null ) {
            return null;
        }

        PessoaDTOBuilder pessoaDTO = PessoaDTO.builder();

        pessoaDTO.id( pessoa.getId() );
        pessoaDTO.nome( pessoa.getNome() );
        pessoaDTO.sobrenome( pessoa.getSobrenome() );
        pessoaDTO.cpf( pessoa.getCpf() );
        if ( pessoa.getDataDeNascimento() != null ) {
            pessoaDTO.dataDeNascimento( DateTimeFormatter.ISO_LOCAL_DATE.format( pessoa.getDataDeNascimento() ) );
        }
        pessoaDTO.telefones( telefoneListToTelefoneDTOList( pessoa.getTelefones() ) );

        return pessoaDTO.build();
    }

    protected Telefone telefoneDTOToTelefone(TelefoneDTO telefoneDTO) {
        if ( telefoneDTO == null ) {
            return null;
        }

        TelefoneBuilder telefone = Telefone.builder();

        telefone.id( telefoneDTO.getId() );
        telefone.tipo( telefoneDTO.getTipo() );
        telefone.numero( telefoneDTO.getNumero() );

        return telefone.build();
    }

    protected List<Telefone> telefoneDTOListToTelefoneList(List<TelefoneDTO> list) {
        if ( list == null ) {
            return null;
        }

        List<Telefone> list1 = new ArrayList<Telefone>( list.size() );
        for ( TelefoneDTO telefoneDTO : list ) {
            list1.add( telefoneDTOToTelefone( telefoneDTO ) );
        }

        return list1;
    }

    protected TelefoneDTO telefoneToTelefoneDTO(Telefone telefone) {
        if ( telefone == null ) {
            return null;
        }

        TelefoneDTOBuilder telefoneDTO = TelefoneDTO.builder();

        telefoneDTO.id( telefone.getId() );
        telefoneDTO.tipo( telefone.getTipo() );
        telefoneDTO.numero( telefone.getNumero() );

        return telefoneDTO.build();
    }

    protected List<TelefoneDTO> telefoneListToTelefoneDTOList(List<Telefone> list) {
        if ( list == null ) {
            return null;
        }

        List<TelefoneDTO> list1 = new ArrayList<TelefoneDTO>( list.size() );
        for ( Telefone telefone : list ) {
            list1.add( telefoneToTelefoneDTO( telefone ) );
        }

        return list1;
    }
}
