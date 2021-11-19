package com.ary.clientes.api.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.ary.clientes.api.models.Cliente;
import com.ary.clientes.api.repositoryDao.IClienteRepository;

@Service
public class ClienteService implements IClienteRepository, IClienteService{

	
	@Autowired
	private IClienteService iClienteService;
	
	
	@Autowired
	private IClienteRepository iClienteRepository;
	

	@Override
	public <S extends Cliente> S save(S entity) { // para crear o guardar

		return iClienteRepository.save(entity);
	}

	@Override
	public List<Cliente> findAll() { // para ver toda la lista

		return iClienteRepository.findAll();
	}

	@Override
	public Optional<Cliente> findById(Long id) { // buscar un registro por id

		return iClienteRepository.findById(id);
	}

	@Override
	public void deleteById(Long id) { // para eliminar

		iClienteRepository.deleteById(id);

	}

	// creamos el metodo manualmente para actualizar o modificar
	public void actualizarModificar(Cliente cliente) {
		iClienteRepository.save(cliente);
	}
	
	
	
	
	

	@Override
	public Cliente getOne(Long id) {

		return null;
	}

	@Override
	public List<Cliente> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cliente> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Cliente> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub

	}

	@Override
	public <S extends Cliente> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Cliente> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<Cliente> entities) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAllByIdInBatch(Iterable<Long> ids) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub

	}

	@Override
	public Cliente getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

	@Override
	public <S extends Cliente> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Cliente> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Cliente> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Long id) {
		
		return iClienteRepository.existsById(id);
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
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

	@Override
	public <S extends Cliente> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Cliente> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Cliente> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends Cliente> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	@Transactional()
	public Cliente modificar(Long id) {
		
		return iClienteService.modificar(id);
	}

	
	
//	@Override
//	public Cliente modificar(Long id) {
//		
//		return iClienteRepository.modificar(id);
//	}

}
