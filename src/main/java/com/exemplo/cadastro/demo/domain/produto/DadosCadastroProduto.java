package com.exemplo.cadastro.demo.domain.produto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record DadosCadastroProduto(
        @NotBlank
        String nome,

        @NotBlank
        String descricao,

        @NotNull
        BigDecimal valor,

        @NotNull
        Boolean disponibilidade) {
}
