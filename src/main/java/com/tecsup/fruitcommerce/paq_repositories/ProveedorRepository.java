package com.tecsup.fruitcommerce.paq_repositories;

import com.tecsup.fruitcommerce.paq_models.Proveedor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProveedorRepository extends JpaRepository<Proveedor, Long> {
    Optional<Proveedor> findById(Long idProveedor);
    Optional<Proveedor> findByUser_UserId(Long usuarioId);
    List<Proveedor> findAll();
    void deleteById(Long id);
}