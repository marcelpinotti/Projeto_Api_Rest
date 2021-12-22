package br.com.marcelpinotti.cadastro_de_clientes_api.mapper;


import br.com.marcelpinotti.cadastro_de_clientes_api.dto.request.PessoaDTO;
import br.com.marcelpinotti.cadastro_de_clientes_api.entity.Pessoa;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper (componentModel = "spring")
public interface PessoaMapper {

    //PessoaMapper INSTANCE = Mappers.getMapper(PessoaMapper.class);

    @Mapping(target = "dataDeNascimento", source = "dataDeNascimento", dateFormat = "yyyy-MM-dd")
    Pessoa toModel(PessoaDTO pessoaDTO);

    PessoaDTO toDTO(Pessoa pessoa);

}
