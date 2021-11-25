package com.ary.clientes.api.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.ary.clientes.api.security.models.Usuario;
import com.ary.clientes.api.security.models.UsuarioPrincipal;

@Service
public class UserDetalsServiceImpl implements UserDetailsService {
	
	@Autowired
	private UsuarioService usuarioService;

	@Override
	public UserDetails loadUserByUsername(String nombreUsuario) throws UsernameNotFoundException {
		
		Usuario usuario = usuarioService.findByNombreUsuario(nombreUsuario).get();
		
		return UsuarioPrincipal.build(usuario);
	}

}
