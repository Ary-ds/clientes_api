package com.ary.clientes.api.security.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ary.clientes.api.security.models.Usuario;
import com.ary.clientes.api.security.repository.IusuarioRepository;

@Service
@Transactional  //para evitar conflite con la base de datos
public class UsuarioService  {
	
	@Autowired
	private IusuarioRepository iusuarioRepository;
	
	public Optional<Usuario> findByNombreUsuario(String nombreUsuario){
		return iusuarioRepository.findByNombreUsuario(nombreUsuario);
	}
	
	
	public boolean existsByNombreUsuario(String nombreUsuario) {
		return iusuarioRepository.existsByNombreUsuario(nombreUsuario);
	}
	
	
	public boolean existsByEmail(String email) {
		return iusuarioRepository.existsByEmail(email);
	}
	
	
	@SuppressWarnings("unused")
	private void save(Usuario usuario) {
		 iusuarioRepository.save(usuario);
	 
	}
	

}
