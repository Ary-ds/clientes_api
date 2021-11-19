package com.ary.clientes.api.service;

import org.springframework.stereotype.Repository;

import com.ary.clientes.api.models.Cliente;


@Repository
public interface IClienteService {
	
	
	public Cliente modificar(Long id);
	

}


//public List<Cliente> findAll();
//
//public void save(Cliente cliente);
//
//public Cliente findById(Long id);
//
//public void delete(Cliente cliente);