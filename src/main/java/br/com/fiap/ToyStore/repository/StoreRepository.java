package br.com.fiap.ToyStore.repository;

import br.com.fiap.ToyStore.model.Store;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreRepository extends JpaRepository<Store, Long> {
}
