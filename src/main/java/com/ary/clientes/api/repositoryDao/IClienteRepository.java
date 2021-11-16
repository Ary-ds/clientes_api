package com.ary.clientes.api.repositoryDao;

import org.springframework.data.repository.CrudRepository;

import com.ary.clientes.api.models.Cliente;

public interface IClienteRepository extends CrudRepository<Cliente, Long> {

}
