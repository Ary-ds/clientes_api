package com.ary.clientes.api.repositoryDao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ary.clientes.api.models.Cliente;

@Repository
public interface IClienteRepository extends CrudRepository<Cliente, Long> {

}
