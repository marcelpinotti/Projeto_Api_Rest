package br.com.marcelpinotti.cadastro_de_clientes_api.controller;


import br.com.marcelpinotti.cadastro_de_clientes_api.dto.request.PessoaDTO;
import br.com.marcelpinotti.cadastro_de_clientes_api.dto.response.MensagemResponseDto;
import br.com.marcelpinotti.cadastro_de_clientes_api.entity.Pessoa;
import br.com.marcelpinotti.cadastro_de_clientes_api.exception.PessoaNotFoundException;
import br.com.marcelpinotti.cadastro_de_clientes_api.service.PessoaService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/pessoa")
@AllArgsConstructor(onConstructor = @__(@Autowired))
@NoArgsConstructor
public class PessoaController {


    private PessoaService pessoaService;


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MensagemResponseDto criandoPessoa (@RequestBody @Valid PessoaDTO pessoaDTO) {
        return pessoaService.criandoPessoa(pessoaDTO);
    }

    @GetMapping
    public List<PessoaDTO> listAll(){
        return pessoaService.listAll();
    }

    @GetMapping("/{id}")
    public PessoaDTO findById(@PathVariable Long id) throws PessoaNotFoundException {
        return pessoaService.findById(id);
    }

    @PutMapping("/{id}")
    public MensagemResponseDto updateById(@PathVariable Long id, @RequestBody  @Valid PessoaDTO pessoaDTO) throws PessoaNotFoundException{
        return pessoaService.updateById(id, pessoaDTO);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable Long id) throws PessoaNotFoundException{
        pessoaService.deletar(id);
    }

}
