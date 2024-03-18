package org.example.services;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.example.models.Pagamento;
import org.springframework.stereotype.Service;

@Service
public class PagamentoService { // "Professor" do TP3.
	
	private static Map<Integer, Pagamento> pagamentos = new HashMap<Integer, Pagamento>();
	
	public void incluir(Pagamento pagamento) {
		pagamentos.put(pagamento.getId(), pagamento);
	}
	
	public void excluir(int id) {
		pagamentos.remove(id);
	}
	
	public Collection<Pagamento> obterLista() {
		return pagamentos.values();
	}
	
	public Pagamento obter(int id) {
		return pagamentos.get(id);
	}
	
}
