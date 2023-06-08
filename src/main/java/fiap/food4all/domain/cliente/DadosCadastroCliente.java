package fiap.food4all.domain.cliente;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroCliente(
        @NotNull
        String nome,
        @NotNull
        @Email
        String email) {



}
