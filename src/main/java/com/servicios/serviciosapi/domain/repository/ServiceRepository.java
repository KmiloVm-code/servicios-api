package com.servicios.serviciosapi.domain.repository;

import com.servicios.serviciosapi.domain.TechnicalService;

import java.util.List;
import java.util.Optional;

public interface ServiceRepository {

    List<TechnicalService> getAll();
    Optional<TechnicalService> getService(int serviceId);
    TechnicalService save(TechnicalService technicalService);
    TechnicalService update(TechnicalService technicalService);
    void delete(int serviceId);
}
