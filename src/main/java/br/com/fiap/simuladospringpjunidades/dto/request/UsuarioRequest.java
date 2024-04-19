package br.com.fiap.simuladospringpjunidades.dto.request;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record UsuarioRequest(

        @NotNull(message = "Coloque os dados pessoais")
        PessoaRequest pessoa,
        @NotNull(message = "Username é obrigatório")
        @Size(min = 3, max = 100)

        String username,
        @NotNull(message = "Senha é obrigatória")
        @Size(min = 6, max = 100)
        String password
) {
}