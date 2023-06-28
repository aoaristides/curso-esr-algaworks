package com.algaworks.algafood.domain.service;

import com.algaworks.algafood.domain.model.Cidade;

/**
 * @author aaristides
 */
public interface CadastroCidadeService {

    Cidade salvar(Cidade cidade);

    void excluir(Long cidadeId);

}
