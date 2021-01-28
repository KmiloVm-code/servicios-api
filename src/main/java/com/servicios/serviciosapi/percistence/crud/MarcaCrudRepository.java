package com.servicios.serviciosapi.percistence.crud;

import com.servicios.serviciosapi.percistence.entity.Marca;
import org.springframework.data.repository.CrudRepository;

public interface MarcaCrudRepository extends CrudRepository<Marca, Integer> {
}
