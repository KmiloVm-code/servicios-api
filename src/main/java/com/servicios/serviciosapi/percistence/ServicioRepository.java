package com.servicios.serviciosapi.percistence;

import com.servicios.serviciosapi.domain.TechnicalService;
import com.servicios.serviciosapi.domain.repository.ServiceRepository;
import com.servicios.serviciosapi.percistence.crud.ServicioCrudRepository;
import com.servicios.serviciosapi.percistence.entity.Servicio;
import com.servicios.serviciosapi.percistence.mapper.ServiceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ServicioRepository implements ServiceRepository {

    @Autowired
    private ServicioCrudRepository servicioCrudRepository;

    @Autowired
    private ServiceMapper mapper;

    @Override
    public List<TechnicalService> getAll() {
        List<Servicio> servicios = (List<Servicio>) servicioCrudRepository.findAll();
        return mapper.toServices(servicios);
    }

    @Override
    public Optional<TechnicalService> getService(int serviceId) {
        return servicioCrudRepository.findById(serviceId).map(servicio -> mapper.toService(servicio));
    }

    @Override
    public TechnicalService save(TechnicalService technicalService) {
        Servicio servicio = mapper.toServicio(technicalService);
        return mapper.toService(servicioCrudRepository.save(servicio));
    }

    @Override
    public TechnicalService update(TechnicalService technicalService) {
        return null;
    }

    @Override
    public void delete(int serviceId) {
        servicioCrudRepository.deleteById(serviceId);
    }
}
