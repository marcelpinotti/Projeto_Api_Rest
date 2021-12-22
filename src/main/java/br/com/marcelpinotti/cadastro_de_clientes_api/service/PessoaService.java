package br.com.marcelpinotti.cadastro_de_clientes_api.service;

import br.com.marcelpinotti.cadastro_de_clientes_api.dto.request.PessoaDTO;
import br.com.marcelpinotti.cadastro_de_clientes_api.dto.response.MensagemResponseDto;
import br.com.marcelpinotti.cadastro_de_clientes_api.entity.Pessoa;
import br.com.marcelpinotti.cadastro_de_clientes_api.exception.PessoaNotFoundException;
import br.com.marcelpinotti.cadastro_de_clientes_api.mapper.PessoaMapper;
import br.com.marcelpinotti.cadastro_de_clientes_api.repository.PessoaRepository;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
@AllArgsConstructor (onConstructor = @__(@Autowired))
@NoArgsConstructor
public class PessoaService{


	private PessoaRepository pessoaRepository;

    private PessoaMapper pessoaMapper;


    public MensagemResponseDto criandoPessoa (PessoaDTO pessoaDTO){

        Pessoa salvandoPessoa = pessoaRepository.save(pessoaMapper.toModel(pessoaDTO));

        return criandoMensagemResponse(salvandoPessoa.getId(), "Criada pessoa com o ID: ");
    }

    public List<PessoaDTO> listAll() {

        List<Pessoa> allPessoa = pessoaRepository.findAll();
        return allPessoa.stream()
                .map(pessoaMapper::toDTO)
                .collect(Collectors.toList());
    }

    public PessoaDTO findById(Long id) throws PessoaNotFoundException{

        Pessoa pessoa = verificandoIdExistente(id);

        return pessoaMapper.toDTO(pessoa);

        /*Optional<Pessoa> optionalPessoa = pessoaRepository.findById(id);
        if(optionalPessoa.isPresent()) {
            return pessoaMapper.toDTO(optionalPessoa.get());
        }else{
            throw new PessoaNotFoundException(id);
        }*/
    }

    public void deletar(Long id) throws PessoaNotFoundException {

        verificandoIdExistente(id);

        pessoaRepository.deleteById(id);
    }

    public MensagemResponseDto updateById(Long id, PessoaDTO pessoaDTO) throws PessoaNotFoundException {

        verificandoIdExistente(id);

        Pessoa updatePessoa = pessoaRepository.save(pessoaMapper.toModel(pessoaDTO));

        return criandoMensagemResponse(updatePessoa.getId() , "Update da pessoa com o ID: ");
    }


    public Pessoa verificandoIdExistente (Long id) throws PessoaNotFoundException {

        return pessoaRepository.findById(id)
                .orElseThrow(() -> new PessoaNotFoundException(id));
    }

    private MensagemResponseDto criandoMensagemResponse(/*Pessoa salvandoPessoa*/ Long id, String s) {
        return MensagemResponseDto
                .builder()
                .mensagem(s + id /*salvandoPessoa.getId()*/)
                .build();
    }

}
