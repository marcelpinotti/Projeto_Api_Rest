package br.com.marcelpinotti.cadastro_de_clientes_api.repository;

import br.com.marcelpinotti.cadastro_de_clientes_api.entity.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
