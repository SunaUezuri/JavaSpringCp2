package br.com.fiap.ToyStore.repository;

import br.com.fiap.ToyStore.model.Toy;
import br.com.fiap.ToyStore.model.enums.Public;
import br.com.fiap.ToyStore.model.enums.ToyType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ToyRepository extends JpaRepository<Toy, Long> {

    List<Toy> findByTypeContainingIgnoreCase(ToyType type);
    List<Toy> findByNameContainingIgnoreCase(String name);
    List<Toy> findByClassificationContainingIgnoreCase(Public classification);
}
