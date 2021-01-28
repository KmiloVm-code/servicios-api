package com.servicios.serviciosapi.percistence.crud;

import com.servicios.serviciosapi.percistence.entity.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioCrudRepository extends CrudRepository<Usuario, Integer> {
}
