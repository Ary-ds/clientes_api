package com.ary.clientes.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.ary.clientes.api.models.Cliente;
import com.ary.clientes.api.repositoryDao.IClienteRepository;

@Service
public class ClienteService{

//	
//	@Autowired
//	private IClienteService iClienteService;
	
	
	@Autowired
	private IClienteRepository iClienteRepository;
	


	public <S extends Cliente> S save(S entity) { // para crear o guardar

		return iClienteRepository.save(entity);
	}


	public List<Cliente> findAll() { // para ver toda la lista

		return iClienteRepository.findAll();
	}


	public Optional<Cliente> findById(Long id) { // buscar un registro por id

		return iClienteRepository.findById(id);
	}


	public void deleteById(Long id) { // para eliminar

		iClienteRepository.deleteById(id);

	}

	// creamos el metodo manualmente para actualizar o modificar
	public void actualizarModificar(Cliente cliente) {
		iClienteRepository.save(cliente);
	}
	
	
//	@Override
//	public boolean existsById(Long id) {
//		
//		return iClienteRepository.existsById(id);
//	}



//	@Override
//	@Transactional()
//	public Cliente modificar(Long id) {
//		
//		return iClienteService.modificar(id);
//	}

	
	
//	@Override
//	public Cliente modificar(Long id) {
//		
//		return iClienteRepository.modificar(id);
//	}

}
