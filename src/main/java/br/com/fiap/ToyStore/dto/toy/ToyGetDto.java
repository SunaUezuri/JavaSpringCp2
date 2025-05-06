package br.com.fiap.ToyStore.dto.toy;

import br.com.fiap.ToyStore.model.Store;
import br.com.fiap.ToyStore.model.Toy;
import br.com.fiap.ToyStore.model.enums.Public;
import br.com.fiap.ToyStore.model.enums.ToyType;

import java.util.List;

public record ToyGetDto(
        Long id,
        String name,
        ToyType type,
        Public classification,
        double size,
        double price,
        List<Store> stores
) {
    public ToyGetDto(Toy toy) {
        this(toy.getId(), toy.getName(), toy.getType(), toy.getClassification(), toy.getSize(), toy.getPrice(), toy.getStores());
    }
}
