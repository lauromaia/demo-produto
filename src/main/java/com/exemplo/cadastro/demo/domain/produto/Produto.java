package com.exemplo.cadastro.demo.domain.produto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "produtos")
@Entity(name = "produto")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;
    private BigDecimal valor;
    private Boolean disponibilidade;

    public Produto(DadosCadastroProduto dados) {
        this.nome =dados.nome();
        this.descricao = dados.descricao();
        this.disponibilidade = dados.disponibilidade();
        this.valor = dados.valor();
    }
}
