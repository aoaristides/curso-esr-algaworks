package com.algaworks.algafood.api.exception.handler;

import com.algaworks.algafood.domain.exception.EntidadeNaoEncontradaException;

/**
 * @author aaristides 
 */
public class CidadeNaoEncontradaException extends EntidadeNaoEncontradaException {

    private static final long serialVersionUID = 1L;

    public CidadeNaoEncontradaException(String mensagem) {
        super(mensagem);
    }

    public CidadeNaoEncontradaException(Long cidadeId) {
        this(String.format("Não existe um cadastro de cidade com código %d", cidadeId));
    }
    
}
