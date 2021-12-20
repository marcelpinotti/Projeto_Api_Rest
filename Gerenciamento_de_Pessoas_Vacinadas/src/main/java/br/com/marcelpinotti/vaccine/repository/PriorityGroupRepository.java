package br.com.marcelpinotti.vaccine.repository;

import br.com.marcelpinotti.vaccine.domain.PriorityGroup;
import br.com.marcelpinotti.vaccine.dto.PriorityGroupDTO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PriorityGroupRepository extends JpaRepository<PriorityGroup, Long> {
}
