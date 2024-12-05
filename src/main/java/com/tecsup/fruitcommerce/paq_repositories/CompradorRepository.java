package com.tecsup.fruitcommerce.paq_repositories;

import com.tecsup.fruitcommerce.paq_models.Comprador;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CompradorRepository extends JpaRepository<Comprador, Long> {
    Optional<Comprador> findById(Long id);
    Optional<Comprador> findByUser_UserId(Long usuarioId);
    List<Comprador> findAll();
    void deleteById(Long id);
}