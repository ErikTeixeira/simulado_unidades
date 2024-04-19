package br.com.fiap.simuladospringpjunidades.dto.request;


import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record UnidadeRequest(

        AbstractRequest macro,
        @NotNull(message = "Sigla é obrigatória")
        String sigla,

        @NotNull(message = "Descrição é obrigatória")
        @Size(min = 3, max = 100)
        String descricao,

        @NotNull(message = "Nome é obrigatório")
        @Size(min = 3, max = 100)
        String nome
) {
}