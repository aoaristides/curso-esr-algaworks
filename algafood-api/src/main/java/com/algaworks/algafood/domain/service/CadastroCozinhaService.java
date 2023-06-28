package com.algaworks.algafood.domain.service;

import com.algaworks.algafood.domain.model.Cozinha;

/**
 * @author aaristides
 */
public interface CadastroCozinhaService {

    Cozinha salvar(Cozinha cozinha);

    void excluir(Long cozinhaId);

}
