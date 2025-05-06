package br.com.fiap.ToyStore.service;

import br.com.fiap.ToyStore.dto.toy.ToyGetDto;
import br.com.fiap.ToyStore.dto.toy.ToyPostDto;
import br.com.fiap.ToyStore.model.Store;
import br.com.fiap.ToyStore.model.Toy;
import br.com.fiap.ToyStore.repository.StoreRepository;
import br.com.fiap.ToyStore.repository.ToyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ToyService {

    @Autowired
    private ToyRepository repository;

    @Autowired
    private StoreRepository storeRepository;

    public Toy registerToy(ToyPostDto json) {
        return repository.save(new Toy(json));
    }

    public ToyGetDto getById(Long id) {
        Optional<Toy> toy = repository.findById(id);

        if (toy.isPresent()) {
            Toy t = toy.get();
            return new ToyGetDto(t.getId(), t.getName(), t.getType(),
                    t.getClassification(), t.getSize(), t.getPrice(), t.getStores());
        } else {
            return null;
        }
    }
}
