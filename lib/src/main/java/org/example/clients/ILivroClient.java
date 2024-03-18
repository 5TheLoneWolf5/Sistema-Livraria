package org.example.clients;

import org.example.models.LivroAPI;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "https://openlibrary.org/", name = "livroCliente")
public interface ILivroClient {
	
	@GetMapping(value = "search.json?isbn={isbn}")
	LivroAPI obterLivroIsbn(@PathVariable("isbn") String isbn);
	
}