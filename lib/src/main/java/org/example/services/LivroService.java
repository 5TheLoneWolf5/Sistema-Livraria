package org.example.services;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.example.clients.ILivroClient;
import org.example.models.Livro;
import org.example.models.LivroAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class LivroService {
	
	private static Map<String, Livro> alunos = new HashMap<String, Livro>();
	
	@Autowired
	private ILivroClient livroClient;
	
	public void incluir(Livro livro) {
		alunos.put(livro.getIsbn(), livro);
	}
	
	public void excluir(String isbn) {
		alunos.remove(isbn);
	}
	
	public Collection<Livro> obterLista() {
		return alunos.values();
	}
	
	public Livro obter(String isbn) {
		return alunos.get(isbn);
	}
	
	@GetMapping(value = "search.json?isbn={isbn}")
	public LivroAPI obterLivroIsbn(@PathVariable("isbn") String isbn) {
		return livroClient.obterLivroIsbn(isbn);
	}
	
}
