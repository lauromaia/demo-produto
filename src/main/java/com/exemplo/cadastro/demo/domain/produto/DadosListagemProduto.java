package com.exemplo.cadastro.demo.domain.produto;

import java.math.BigDecimal;

public record DadosListagemProduto(
        Long id,
        String nome,
        BigDecimal valor
) {
    public DadosListagemProduto(Produto produto){
        this(produto.getId(), produto.getNome(), produto.getValor());
    }
}
