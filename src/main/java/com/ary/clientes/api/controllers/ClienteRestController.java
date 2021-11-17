package com.ary.clientes.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ary.clientes.api.models.Cliente;
import com.ary.clientes.api.service.ClienteService;

//la ruta donde tenemos el frontend la damos permiso para conectar con el api-rest
@CrossOrigin(origins = {"http://localhost:4200/"})
@RestController
@RequestMapping("/api")
public class ClienteRestController {
	
	@Autowired
	private ClienteService clienteService;
	
	
	
	@GetMapping("/clientes")       //para ver todo el listado
	public List<Cliente> listaClientes() {
		
		return ( List<Cliente> )clienteService.findAll();
	}
	
	
//	@GetMapping("/clientes/{id}")            
//	public Cliente buscar(@PathVariable Long id) {  //buscar por id
//		return clienteService.findById(id);
//	}
	
	@PostMapping("/clientes")   //crear registro
	@ResponseStatus(HttpStatus.CREATED)
	public Cliente crear(@RequestBody Cliente cliente) {
		return clienteService.save(cliente);
	}
	
	
	@DeleteMapping("/clientes/{id}")   //para eliminar un registro
	public void delete(@PathVariable Long id) {
		clienteService.deleteById(id);
	}
	
	
	//put
	
	
	

}
