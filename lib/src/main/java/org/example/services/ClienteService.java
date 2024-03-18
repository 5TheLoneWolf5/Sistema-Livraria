package org.example.services;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.example.models.Cliente;
import org.springframework.stereotype.Service;

@Service
public class ClienteService { // "Escola" do TP3. 
	
	private static Map<String, Cliente> clientes = new HashMap<String, Cliente>();
	
	public void incluir(Cliente cliente) {
		clientes.put(cliente.getCpf(), cliente);
	}
	
	public void excluir(String cpf) {
		clientes.remove(cpf);
	}
	
	public Collection<Cliente> obterLista() {
		return clientes.values();
	}
}