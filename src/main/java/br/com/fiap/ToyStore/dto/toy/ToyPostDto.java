package br.com.fiap.ToyStore.dto.toy;

import br.com.fiap.ToyStore.model.Store;
import br.com.fiap.ToyStore.model.enums.Public;
import br.com.fiap.ToyStore.model.enums.ToyType;
import jakarta.validation.constraints.*;

import java.util.List;

public record ToyPostDto(
        @NotBlank(message = "O campo não pode estar vazio")
        @Size(min = 3, max = 100, message = "O campo deve ter entre 3 e 100 caracteres")
        String name,
        ToyType type,
        @NotNull(message = "O tipo do brinquedo é obrigatório")
        Public classification,
        @NotNull(message = "O tamanho não pode ser nulo")
        @Positive(message = "O tamanho deve ser positivo")
        double size,
        @NotNull(message = "O preço não pode estar vazio")
        @PositiveOrZero(message = "O valor não pode ser negativo")
        double price,
        List<Store> stores
) {
}
