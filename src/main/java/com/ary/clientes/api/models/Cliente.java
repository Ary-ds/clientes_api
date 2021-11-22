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

@Entity
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
	
	
	
	public Cliente() {
		//super();
		// TODO Auto-generated constructor stub
	}
	
	



	public Cliente(Long id, String nombre, String apellido, String email, Date fecha) {
		//super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.fecha = fecha;
	}
	
	
	





	public Long getId() {
		return id;
	}





	public void setId(Long id) {
		this.id = id;
	}





	public String getNombre() {
		return nombre;
	}





	public void setNombre(String nombre) {
		this.nombre = nombre;
	}





	public String getApellido() {
		return apellido;
	}





	public void setApellido(String apellido) {
		this.apellido = apellido;
	}





	public String getEmail() {
		return email;
	}





	public void setEmail(String email) {
		this.email = email;
	}





	public Date getFecha() {
		return fecha;
	}





	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}








	private static final long serialVersionUID = 1L;

}
