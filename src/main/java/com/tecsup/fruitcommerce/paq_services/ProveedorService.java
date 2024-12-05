package com.tecsup.fruitcommerce.paq_services;

import com.tecsup.fruitcommerce.paq_models.Proveedor;

import java.util.List;
import java.util.Optional;

public interface ProveedorService {
    Optional<Proveedor> findById(Long id);
    List<Proveedor> findAll();
    void save(Proveedor proveedor);
    void deleteById(Long id);
    Optional<Proveedor> findByUser_UserId(Long usuarioId);
}
