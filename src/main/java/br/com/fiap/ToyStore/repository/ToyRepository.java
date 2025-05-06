package br.com.fiap.ToyStore.repository;

import br.com.fiap.ToyStore.model.Toy;
import br.com.fiap.ToyStore.model.enums.Public;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ToyRepository extends JpaRepository<Toy, Long> {

    @Query("SELECT t FROM Toy t WHERE LOWER(t.type) LIKE LOWER(CONCAT('%', :value, '%'))")
    List<Toy> searchType(@Param("value") String value);
    List<Toy> findByNameContainingIgnoreCase(String name);
    @Query("SELECT t FROM Toy t WHERE LOWER(t.classification) LIKE LOWER(CONCAT('%', :value, '%'))")
    List<Toy> searchPublic(@Param("value") String value);
}
