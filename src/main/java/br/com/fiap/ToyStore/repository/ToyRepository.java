package br.com.fiap.ToyStore.repository;

import br.com.fiap.ToyStore.model.Toy;
import br.com.fiap.ToyStore.model.enums.Public;
import br.com.fiap.ToyStore.model.enums.ToyType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ToyRepository extends JpaRepository<Toy, Long> {

    List<Toy> findByType( ToyType type);
    List<Toy> findByNameContainingIgnoreCase(String name);
    List<Toy> findByClassification(Public classification);
}
