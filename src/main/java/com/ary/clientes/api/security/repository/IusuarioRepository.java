package com.ary.clientes.api.security.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ary.clientes.api.security.models.Usuario;


@Repository
public interface IusuarioRepository extends JpaRepository<Usuario, Long> {
	
	//encontrar por el nombre de usuario
	Optional<Usuario> findByNombreUsuario(String nombreUsuario);
	
	//si existe el nombre usuario
	boolean existsByNombreUsuario(String nombreUsuario);
	
	//si existe el email
	boolean existsByEmail(String email);

}
