package com.algaworks.algafood.domain.repository;

import com.algaworks.algafood.domain.model.FormaPagamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author aaristides
 */
@Repository
public interface FormaPagamentoRepository extends JpaRepository<FormaPagamento, Long> {

}
