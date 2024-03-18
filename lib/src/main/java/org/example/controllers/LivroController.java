package org.example.controllers;

import java.util.Collection;

import org.example.clients.ILivroClient;
import org.example.models.Livro;
import org.example.models.LivroAPI;
import org.example.services.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/livro")
public class LivroController {

	@Autowired
	private LivroService livroService;
	
	@Autowired
	private ILivroClient livroClient;
	
	@PostMapping(value = "/incluir")
	public void incluir(@RequestBody Livro livro) {
		livroService.incluir(livro);
	}
	
	@DeleteMapping(value = "/excluir/{isbn}")
	public void remover(@PathVariable("isbn") String isbn) {
		livroService.excluir(isbn);
	}
	
	@GetMapping(value = "/listar/{isbn}")
	public Livro obter(@PathVariable("isbn") String isbn) {
		return livroService.obter(isbn);
	}
	
	@GetMapping(value = "/listar")
	public Collection<Livro> obterLista() {
		return livroService.obterLista();
	}
	
	@GetMapping(value = "/api/listar/{isbn}")
	public LivroAPI obterLivroIsbn(@PathVariable("isbn") String isbn) {
		return livroClient.obterLivroIsbn(isbn);
	}
	
}