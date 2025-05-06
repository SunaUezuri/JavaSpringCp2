package br.com.fiap.ToyStore.dto.store;

import br.com.fiap.ToyStore.model.Store;
import br.com.fiap.ToyStore.model.Toy;

import java.util.List;

public record StoreGetDto(
        Long id,
        String name,
        String address,
        List<Toy> toys
) {
    public StoreGetDto(Store store) {
        this(store.getId(), store.getName(), store.getAddress(), store.getToys());
    }
}
