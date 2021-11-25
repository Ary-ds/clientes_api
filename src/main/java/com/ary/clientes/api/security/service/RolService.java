package com.ary.clientes.api.security.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.ary.clientes.api.security.enums.RolNombre;
import com.ary.clientes.api.security.models.Rol;
import com.ary.clientes.api.security.repository.IrolRepository;

@Service
@Transactional
public class RolService {
	
	private IrolRepository irolRepository;
	
  public Optional<Rol> findByRolNombre(RolNombre rolNombre){
	  return irolRepository.findByRolNombre(rolNombre);
  };

}
