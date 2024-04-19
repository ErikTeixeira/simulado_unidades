package br.com.fiap.simuladospringpjunidades.dto.response;

import br.com.fiap.simuladospringpjunidades.entity.Tipo;
import lombok.Builder;

import java.time.LocalDate;

@Builder
public record PessoaResponse(
        Long id,
        String email,
        Tipo tipo,
        LocalDate nascimento,
        String nome,
        String sobrenome
) {
}