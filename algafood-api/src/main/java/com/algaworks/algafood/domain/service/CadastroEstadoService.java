package com.algaworks.algafood.domain.service;

import com.algaworks.algafood.domain.model.Estado;

/**
 * @author aaristides
 */
public interface CadastroEstadoService {

    Estado salvar(Estado estado);

    void excluir(Long estadoId);

}
