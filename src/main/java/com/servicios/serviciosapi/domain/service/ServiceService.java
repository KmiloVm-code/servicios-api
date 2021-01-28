package com.servicios.serviciosapi.domain.service;

import com.servicios.serviciosapi.domain.TechnicalService;
import com.servicios.serviciosapi.domain.repository.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceService {

    @Autowired
    private ServiceRepository serviceRepository;

    public List<TechnicalService> getAll() {
        return serviceRepository.getAll();
    }

    public Optional<TechnicalService> getProduct(int productId) {
        return serviceRepository.getService(productId);
    }

    public TechnicalService save(TechnicalService technicalService) {
        return serviceRepository.save(technicalService);
    }

    public TechnicalService update(TechnicalService technicalService) {
        return technicalService;
    }

    public boolean delete(int productId) {
        return getProduct(productId).map(product -> {
            serviceRepository.delete(productId);
            return true;
        }).orElse(false);
    }
}
