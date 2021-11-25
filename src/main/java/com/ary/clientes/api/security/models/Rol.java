package com.ary.clientes.api.security.models;

import java.io.Serializable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.ary.clientes.api.security.enums.RolNombre;

import lombok.Data;


@Entity
@Data
public class Rol implements Serializable {
	
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Enumerated(EnumType.STRING)
	RolNombre rolNombre;

	private static final long serialVersionUID = 1L;
	
}
