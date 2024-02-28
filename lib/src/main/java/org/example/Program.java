package org.example;

//import java.util.Date;
//import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
		
		Livro livro = new Livro();
		GregorianCalendar calendar1 = new GregorianCalendar(1932, 3, 6);
//		calendar1.set(2014, 3, 6);
		
		livro.setTitulo("Admirável mundo novo");
		livro.setAutores(new String[] {"Aldous Huxley"});
		livro.setDescricao("Admirável Mundo Novo é um romance escrito por Aldous Huxley e publicado em 1932. A história se passa em Londres no ano 2540, o romance antecipa desenvolvimentos em tecnologia reprodutiva, hipnopedia, manipulação psicológica e condicionamento clássico, que se combinam para mudar profundamente a sociedade.");
		livro.setPaginas(252);
		livro.setDataPublicacao(calendar1);
		livro.setEditora("Globo Livros");
		livro.setIsbn("9788525056443");
		
		Livro livro2 = new Livro();
		GregorianCalendar calendar2 = new GregorianCalendar(1862, 5, 3);
//		calendar2.set(2022, 5, 3);
		
		livro2.setTitulo("Os Miseráveis");
		livro2.setAutores(new String[] {"Victor Hugo"});
		livro2.setDescricao("Les Misérables é um romance de Victor Hugo publicado em 1862 que deu origem a muitas adaptações, no cinema e muitas outras mídias.");
		livro2.setPaginas(664);
		livro2.setDataPublicacao(calendar2);
		livro2.setEditora("Editora Serena");
		livro2.setIsbn("9786589902102");
		
		Livro livro3 = new Livro("Sherlock Holmes", new String[] {"Arthur Conan Doyle"}, "Um Estudo em Vermelho é um romance policial escrito por Sir Arthur Conan Doyle, publicado originalmente pela revista Beeton's Christmas Annual em novembro de 1887. A primeira edição, em formato de livro, só seria lançada em julho de 1888, com ilustrações da autoria de Richard Gutschmidt.", new GregorianCalendar(1887, 7, 3));
		
		Livro livro4 = new Livro();
		
		Livro livro5 = new Livro("As Viagens de Gulliver", new String[] {"Jonathan Swift"}, "Jonathan Swift conta as aventuras de Lemuel Gulliver, um cirurgião naval que é vítima das circunstâncias em terras estranhas.", 320, new GregorianCalendar(1726, 10, 28), "Principis", "978-6555521177");
		
		Livro livro6 = new Livro("A Divina Comédia", new String[] {"Dante Alighieri"}, "Dante, perdido numa selva escura, erra nela toda a noite. Saindo ao amanhecer, começa a subir por uma colina, quando lhe atravessam a passagem uma pantera, um leão e uma loba, que o repelem para a selva. Aparece-lhe então a imagem de Virgílio, que o reanima e se oferece a tirá-lo de lá, fazendo-o passar pelo Inferno e pelo Purgatório. Beatriz, depois, o guiará ao Paraíso. Dante o segue.", 320, new GregorianCalendar(1308, 1, 1), "Principis", "6550970326");

		List<Livro> livrosComprados = new ArrayList<>();
		livrosComprados.add(livro);
		livrosComprados.add(livro2);

		Pagamento pagamento = new Pagamento(1, "Adam", 50.20, "Cartão de Crédito", livrosComprados, new GregorianCalendar(2024, 2, 27), 20);

		System.out.println(livro);
		System.out.println("Período: " + livro.descobrirPeriodo() + "\n\n----\n");
		System.out.println(livro2);
		System.out.println("Período: " + livro2.descobrirPeriodo() + "\n\n----\n");
		System.out.println(livro3);
		System.out.println("Período: " + livro3.descobrirPeriodo() + "\n\n----\n");
		System.out.println(livro4);
		System.out.println("Período: " + livro4.descobrirPeriodo() + "\n\n----\n");
		System.out.println(livro5);
		System.out.println("Período: " + livro5.descobrirPeriodo() + "\n\n----\n");
		System.out.println(livro6);
		System.out.println("Período: " + livro6.descobrirPeriodo() + "\n\n----\n");

		System.out.println("- Dados do Pagamento:\n");
		System.out.println(pagamento + "\n");
		pagamento.pagar();
		
	}

}
