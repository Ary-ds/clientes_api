package com.ary.clientes.api.security.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ary.clientes.api.security.enums.RolNombre;
import com.ary.clientes.api.security.models.Rol;

@Repository
public interface IrolRepository extends JpaRepository<Rol, Long> {
	
	Optional<Rol> findByRolNombre(RolNombre rolNombre);

}
  