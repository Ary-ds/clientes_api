package com.ary.clientes.api.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Data;

@Entity
@Data
@Table(name = "clientes")
public class Cliente implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty(message = "no puede estar vacio")
	@Size(min = 4 , max = 12, message = "tien que estar entre 4 y 12")
	@Column(nullable = false)  //validando campo
    private String nombre;
	
	@NotEmpty(message = "no puede estar vacio")
	private String apellido;
	
	@NotEmpty(message = "no puede estar vacio")
	@Email(message = "el formato no es correcto")
	@Column(nullable = false, unique = true ) //validando campo
	private String email;
	
	@Temporal(TemporalType.DATE)
	private Date fecha;
	
	@PrePersist
	public void prePresist() {
		fecha = new Date();
	}
	
	


	private static final long serialVersionUID = 1L;

}
