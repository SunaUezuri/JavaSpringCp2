package br.com.fiap.ToyStore.dto.store;

import br.com.fiap.ToyStore.model.Toy;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.List;

public record StorePostDto(
        @NotBlank(message = "O nome não pode ser vazio")
        @Size(min = 4, max = 200, message = "O nome deve conter entre 4 e 200 caracteres")
        String name,
        String address,
        List<Toy> toys
) {
}
