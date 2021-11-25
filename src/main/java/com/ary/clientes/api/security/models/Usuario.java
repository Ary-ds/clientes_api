package com.ary.clientes.api.security.models;

import java.io.Serializable;
import java.util.*;


import javax.persistence.*;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Entity
@Data
public class Usuario  implements Serializable {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	private String nombre;
	
	@NotNull
	@Column(unique = true)
	private String nombreUsuario;
    
	@NotNull
	private String email;
    
	@NotNull
	private String password;
	
	@NotNull
	@ManyToMany
	@JoinTable(name = "usuario_rol", joinColumns = @JoinColumn(name = "usuario_id"),
	inverseJoinColumns = @JoinColumn(name = "rol_id"))
	private Set<Rol> roles = new HashSet<>();


	
	private static final long serialVersionUID = 1L;

}
