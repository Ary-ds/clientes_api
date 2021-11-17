package com.ary.clientes.api.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ary.clientes.api.models.Cliente;
import com.ary.clientes.api.repositoryDao.IClienteRepository;


@Service
public class ClienteService implements IClienteRepository {
	
	 @Autowired
     private IClienteRepository iClienteRepository;
	 

	@Override
	public <S extends Cliente> S save(S entity) {  // para crear o guardar 
		// TODO Auto-generated method stub
		return iClienteRepository.save(entity);
	}

	@Override
	public <S extends Cliente> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Cliente> findById(Long id) { // para buscar por id 
		// TODO Auto-generated method stub
		return iClienteRepository.findById(id);
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Cliente> findAll() {  // para ver toda la lista 
		// TODO Auto-generated method stub
		return iClienteRepository.findAll();
	}

	@Override
	public Iterable<Cliente> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Long id) {   // para eliminar 
		// TODO Auto-generated method stub
		iClienteRepository.deleteById(id);
		
	}

	@Override
	public void delete(Cliente entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Cliente> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	

}
