package com.algaworks.algafood.domain.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import jakarta.persistence.*;
import java.math.BigDecimal;

/**
 * @author aaristides
 */
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Produto {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String descricao;

    @Column(nullable = false)
    private BigDecimal preco;

    @Column(nullable = false)
    private Boolean ativo;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Restaurante restaurante;

}
