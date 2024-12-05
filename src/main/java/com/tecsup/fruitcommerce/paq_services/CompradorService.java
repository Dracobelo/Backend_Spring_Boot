package com.tecsup.fruitcommerce.paq_services;

import com.tecsup.fruitcommerce.paq_models.Comprador;

import java.util.List;
import java.util.Optional;

public interface CompradorService {
    Optional<Comprador> findById(Long id);
    List<Comprador> findAll();
    void save(Comprador comprador);
    void deleteById(Long id);
    Optional<Comprador> findByUser_UserId(Long usuarioId);
}

