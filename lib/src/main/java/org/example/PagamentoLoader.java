package org.example;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import org.example.models.Cliente;
import org.example.models.Livro;
import org.example.models.Pagamento;
import org.example.services.PagamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class PagamentoLoader implements ApplicationRunner {
	
	@Autowired
	private PagamentoService pagamentoService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Livro livro = new Livro();
		GregorianCalendar calendar1 = new GregorianCalendar(1932, 3, 6);
		
		livro.setTitulo("Admirável mundo novo");
		livro.setAutores(new String[] {"Aldous Huxley"});
		livro.setDescricao("Admirável Mundo Novo é um romance escrito por Aldous Huxley e publicado em 1932. A história se passa em Londres no ano 2540, o romance antecipa desenvolvimentos em tecnologia reprodutiva, hipnopedia, manipulação psicológica e condicionamento clássico, que se combinam para mudar profundamente a sociedade.");
		livro.setPaginas(252);
		livro.setDataPublicacao(calendar1);
		livro.setEditora("Globo Livros");
		livro.setIsbn("9788525056443");
		livro.setEstoque(43);
		livro.setPreco(29.99);
		
		Livro livro2 = new Livro("A Divina Comédia", new String[] {"Dante Alighieri"}, "Dante, perdido numa selva escura, erra nela toda a noite. Saindo ao amanhecer, começa a subir por uma colina, quando lhe atravessam a passagem uma pantera, um leão e uma loba, que o repelem para a selva. Aparece-lhe então a imagem de Virgílio, que o reanima e se oferece a tirá-lo de lá, fazendo-o passar pelo Inferno e pelo Purgatório. Beatriz, depois, o guiará ao Paraíso. Dante o segue.", 320, new GregorianCalendar(1308, 1, 1), "Principis", "6550970326", 20, 39.99);
		
		List<Livro> livrosComprados = new ArrayList<>();
		livrosComprados.add(livro);
		livrosComprados.add(livro2);
		
		pagamentoService.incluir(new Pagamento(1, new Cliente("Adan Smith", "234.633.423-21", "adam@gmail.com", false), "Cartão de Crédito", livrosComprados, new GregorianCalendar(2023, 1, 21), 20));
		pagamentoService.incluir(new Pagamento(2, new Cliente("Sophie Stones", "324.123.765-43", "sophie@gmail.com", true), "Cartão de Débito", livrosComprados, new GregorianCalendar(2024, 2, 27), 20));
		pagamentoService.incluir(new Pagamento(3, new Cliente("Dan Mark", "431.571.312-03", "danmark@outlook.com", true), "Dinheiro Vivo", livrosComprados, new GregorianCalendar(2019, 5, 37), 0));
		
		System.out.println("Objeto pagamento: " + pagamentoService.obter(2));
		
		pagamentoService.excluir(0);
		
	}
	
}
