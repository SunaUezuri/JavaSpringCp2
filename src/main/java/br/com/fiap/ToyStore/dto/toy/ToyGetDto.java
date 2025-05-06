package br.com.fiap.ToyStore.dto.toy;

import br.com.fiap.ToyStore.model.Toy;
import br.com.fiap.ToyStore.model.enums.Public;
import br.com.fiap.ToyStore.model.enums.ToyType;

public record ToyGetDto(
        Long id,
        String name,
        ToyType type,
        Public classification,
        double size,
        double price
) {
    public ToyGetDto(Toy toy) {
        this(toy.getId(), toy.getName(), toy.getType(), toy.getClassification(), toy.getSize(), toy.getPrice());
    }
}
