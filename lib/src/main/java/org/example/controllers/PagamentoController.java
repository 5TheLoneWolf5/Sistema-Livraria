package org.example.controllers;

import java.util.ArrayList;
import java.util.Collection;

import org.example.models.Pagamento;
import org.example.services.PagamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pagamento")
public class PagamentoController {

	@Autowired
	private PagamentoService pagamentoService;
	
	@PostMapping(value = "/incluir")
	public void incluir(@RequestBody Pagamento pagamento) {
		// Permite a criação de um novo pagamento com um cliente específico no body request.
		
		pagamentoService.incluir(pagamento);
	}
	
	@DeleteMapping(value = "/excluir/{id}/{cpf}")
	public void remover(@PathVariable("id") int id, @PathVariable("cpf") String cpf) {
		// Permite a exclusão de um pagamento baseado no seu ID, referindo-se a um cliente específico.
		
		if (pagamentoService.obter(id).getCliente().getCpf().equals(cpf)) {
			pagamentoService.excluir(id);
		} else {
			System.out.println("Usuário específicado (ou ID digitado) não existe.");
			return;
		}
			
	}
	
	@GetMapping(value = "/listar")
	public Collection<Pagamento> obterListaComprasFidelidade() {
		// Retorna uma lista de pagamentos que foram comprados por clientes com cartão fidelidade.
		
		Collection<Pagamento> comprasCartaoFid = new ArrayList<Pagamento>();
		
		for (Pagamento pag : pagamentoService.obterLista()) {
			if (pag.getCliente().getCartaoFidelidade()) {
				comprasCartaoFid.add(pag);
			}
		}
		
		return comprasCartaoFid;
	}
	
}