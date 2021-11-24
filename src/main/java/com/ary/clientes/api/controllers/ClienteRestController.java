package com.ary.clientes.api.controllers;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ary.clientes.api.models.Cliente;
import com.ary.clientes.api.service.ClienteService;

//la ruta donde tenemos el frontend la damos permiso para conectar con el api-rest
//@CrossOrigin(origins = { "http://localhost:4200/" })
@RestController
@RequestMapping("/api")
public class ClienteRestController {

	@Autowired
	private ClienteService clienteService;

	@GetMapping("/clientes") // para ver todo el listado
	public List<Cliente> listaClientes() {

		return (List<Cliente>) clienteService.findAll();
	}

	@PostMapping("/clientes") // crear registro
	@ResponseStatus(HttpStatus.CREATED)
	public Cliente crear(@Valid @RequestBody Cliente cliente, BindingResult result) {
		return clienteService.save(cliente);
	}

	@GetMapping("/clientes/{id}")
	public Optional<Cliente> buscar(@PathVariable Long id) { // buscar por id
		return clienteService.findById(id);
	}

	@DeleteMapping("/clientes/{id}") // para eliminar un registro
	public void delete(@PathVariable Long id) {
		clienteService.deleteById(id);
	}

	// creamos en endpoint actualizar un estudiante @requestBody
	@PutMapping("/clientes/{id}")
	public void actualizarEstudiante(@RequestBody Cliente cliente) {
		clienteService.actualizarModificar(cliente);
	}
	
//	@PutMapping("/clientes/{id}")
//	@ResponseStatus(HttpStatus.CREATED)
//	public Cliente update(@RequestBody Cliente cliente, @PathVariable Long id) {
//		Cliente currentCliente = this.clienteService.modificar(id);
//		currentCliente.setNombre(cliente.getNombre());
//		currentCliente.setApellido(cliente.getApellido());
//		currentCliente.setEmail(cliente.getEmail());
//		this.clienteService.save(currentCliente);
//		return currentCliente;
//	}
	
	

}
