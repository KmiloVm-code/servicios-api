package com.servicios.serviciosapi.percistence.crud;

import com.servicios.serviciosapi.percistence.entity.Servicio;
import org.springframework.data.repository.CrudRepository;

public interface ServicioCrudRepository extends CrudRepository<Servicio, Integer> {
}
