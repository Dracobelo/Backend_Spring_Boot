package com.tecsup.fruitcommerce.paq_services.paq_impl;

import com.tecsup.fruitcommerce.paq_models.Proveedor;
import com.tecsup.fruitcommerce.paq_repositories.ProveedorRepository;
import com.tecsup.fruitcommerce.paq_services.ProveedorService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProveedorServiceImpl implements ProveedorService {

    private final ProveedorRepository proveedorRepository;

    public ProveedorServiceImpl(ProveedorRepository proveedorRepository) {
        this.proveedorRepository = proveedorRepository;
    }

    @Override
    public Optional<Proveedor> findById(Long id) {
        return proveedorRepository.findById(id);
    }

    @Override
    public List<Proveedor> findAll() {
        return proveedorRepository.findAll();
    }

    @Override
    public void save(Proveedor proveedor) {
        proveedorRepository.save(proveedor);
    }

    @Override
    public void deleteById(Long id) {
        proveedorRepository.deleteById(id);
    }

    @Override
    public Optional<Proveedor> findByUser_UserId(Long usuarioId) {
        return proveedorRepository.findByUser_UserId(usuarioId);
    }
}
