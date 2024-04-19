package br.com.fiap.simuladospringpjunidades.dto.request;

import jakarta.validation.constraints.NotNull;

public record AbstractRequest(
        @NotNull(message = "Id é obrigatório!")
        Long id
) {
}