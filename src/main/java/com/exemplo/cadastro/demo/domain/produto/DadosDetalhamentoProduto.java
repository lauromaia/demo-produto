package com.exemplo.cadastro.demo.domain.produto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record DadosDetalhamentoProduto(
        Long id,
        String nome,
        String descricao,
        BigDecimal valor,
        Boolean disponibilidade) {
    public DadosDetalhamentoProduto(Produto produto){
        this(produto.getId(), produto.getNome(), produto.getDescricao(), produto.getValor(), produto.getDisponibilidade());
    }
}
