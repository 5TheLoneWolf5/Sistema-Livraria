package org.example;

import org.example.models.Cliente;
import org.example.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class ClienteLoader implements ApplicationRunner {
	
	@Autowired
	private ClienteService clienteService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Cliente clienteUm = new Cliente("Adan Smith", "234.633.423-21", "adam@gmail.com", false);
		Cliente clienteDois = new Cliente("Sophie Stones", "324.123.765-43", "sophie@gmail.com", true);
		
		clienteService.incluir(clienteUm);
		clienteService.incluir(clienteDois);
		
		clienteService.excluir("234.633.423-21");
		
//		clienteService.incluir(new Cliente());
		
	}
	
}
