package com.servicios.serviciosapi.percistence.crud;

import com.servicios.serviciosapi.percistence.entity.Cargo;
import org.springframework.data.repository.CrudRepository;

public interface CargoCrudRepository extends CrudRepository<Cargo, Integer> {
}
