package com.ary.clientes.api.repositoryDao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ary.clientes.api.models.Cliente;

@Repository
public interface IClienteRepository extends JpaRepository<Cliente, Long> {
	
	

}
