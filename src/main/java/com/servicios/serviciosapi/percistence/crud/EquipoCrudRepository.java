package com.servicios.serviciosapi.percistence.crud;

import com.servicios.serviciosapi.percistence.entity.Equipo;
import org.springframework.data.repository.CrudRepository;

public interface EquipoCrudRepository extends CrudRepository<Equipo, Integer> {
}
