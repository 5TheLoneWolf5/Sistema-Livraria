package org.example.controllers;

import java.util.Collection;

import org.example.models.Cliente;
import org.example.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

	@Autowired
	private ClienteService clienteService; // = new ClienteService(); - its is possible, but it is best to follow SOLID guidelines on injection dependency.
	
	@PostMapping(value = "/incluir")
	public void incluir(@RequestBody Cliente cliente) {
		clienteService.incluir(cliente);
	}
	
	@DeleteMapping(value = "/excluir/{cpf}")
	public void remover(@PathVariable("cpf") String cpf) {
		clienteService.excluir(cpf);
	}
	
	@GetMapping(value = "/listar")
	public Collection<Cliente> obterLista() {
		return clienteService.obterLista();
	}
	
}