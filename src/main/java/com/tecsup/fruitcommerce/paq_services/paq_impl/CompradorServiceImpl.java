package com.tecsup.fruitcommerce.paq_services.paq_impl;

import com.tecsup.fruitcommerce.paq_models.Comprador;
import com.tecsup.fruitcommerce.paq_repositories.CompradorRepository;
import com.tecsup.fruitcommerce.paq_services.CompradorService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompradorServiceImpl implements CompradorService {

    private final CompradorRepository compradorRepository;
    public CompradorServiceImpl(CompradorRepository compradorRepository) {
        this.compradorRepository = compradorRepository;
    }
    @Override
    public Optional<Comprador> findById(Long id) {
        return compradorRepository.findById(id);
    }

    @Override
    public List<Comprador> findAll() {
        return compradorRepository.findAll();
    }

    @Override
    public void save(Comprador comprador) {
        compradorRepository.save(comprador);
    }

    @Override
    public void deleteById(Long id) {
        compradorRepository.deleteById(id);
    }
    @Override
    public Optional<Comprador> findByUser_UserId(Long usuarioId) {
        return compradorRepository.findByUser_UserId(usuarioId);
    }
}
