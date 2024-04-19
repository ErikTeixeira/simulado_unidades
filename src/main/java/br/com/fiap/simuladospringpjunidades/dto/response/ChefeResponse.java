package br.com.fiap.simuladospringpjunidades.dto.response;

import lombok.Builder;

import java.time.LocalDateTime;

@Builder
public record ChefeResponse(
        Long id,
        UnidadeResponse unidade,
        LocalDateTime inicio,
        LocalDateTime fim,
        UsuarioResponse usuario,
        Boolean substituto
) {
}