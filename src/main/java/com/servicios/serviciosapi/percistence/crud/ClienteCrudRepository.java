package com.servicios.serviciosapi.percistence.crud;

import com.servicios.serviciosapi.percistence.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteCrudRepository extends CrudRepository<Cliente, Integer> {
}
