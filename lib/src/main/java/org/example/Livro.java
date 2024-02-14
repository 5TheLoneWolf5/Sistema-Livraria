package org.example;

//import java.util.Date;
//import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Livro {
	private String titulo;
	private String[] autores;
	private String descricao;
	private int paginas;
	private GregorianCalendar dataPublicacao = new GregorianCalendar(); // It needs to be initialized, else, it will complain when it gets printed or gets used (since it is not assigned anything). Also: Calendar is static. For today's info.
	private String editora;
	private String isbn;
	
	public Livro() { 
		
		this.titulo = "Título";
		this.autores = new String[] {"Autor 1", "Autor 2", "Autor 3"};
		this.descricao = "Descrição";
		this.paginas = 0;
		this.dataPublicacao = new GregorianCalendar();
		this.editora = "Editora";
		this.isbn = "1234567890123";
		
	}
	
	public Livro(String titulo, String[] autores, String descricao, GregorianCalendar dataPublicacao) { 
			
		this();
		this.titulo = titulo;
		this.autores = autores;
		this.descricao = descricao;
		this.dataPublicacao = dataPublicacao;
			
	}
	
	public Livro(String titulo, String[] autores, String descricao, int paginas, GregorianCalendar dataPublicacao, String editora, String isbn) {
		this(titulo, autores, descricao, dataPublicacao);
		this.titulo = titulo;
		this.autores = autores;
		this.descricao = descricao;
		this.paginas = paginas;
		this.dataPublicacao = dataPublicacao;
		this.editora = editora;
		this.isbn = isbn;
	}

	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		if (!titulo.isEmpty()) {
			this.titulo = titulo;
		}
	}
	
	public String[] getAutores() {
		return autores;
	}

	public void setAutores(String[] autores) {
		
		this.autores = new String[autores.length]; // Size of array. Not index.
		
		for (int i = 0; i < autores.length; i++) {
			this.autores[i] = autores[i];
		}
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		
		if (descricao.trim().length() > 0) {
			this.descricao = descricao;
		}
		
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		if (paginas > 0) {
			this.paginas = paginas;
		}
	}

	public GregorianCalendar getDataPublicacao() {
		return dataPublicacao;
	}

	public void setDataPublicacao(GregorianCalendar dataPublicacao) {
		this.dataPublicacao = new GregorianCalendar(dataPublicacao.get(Calendar.YEAR), dataPublicacao.get(Calendar.MONTH), dataPublicacao.get(Calendar.DATE));
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		if (descricao.trim().length() > 0) {
			this.editora = editora;
		}
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		if (isbn.length() == 10|| isbn.length() == 13) {
			this.isbn = isbn;
		}
	}
	
	public String descobrirPeriodo() {
		
		int year = this.dataPublicacao.get(Calendar.YEAR);
		
		if (year >= 1660 && year <= 1790) {
			return "Período Neoclássico.";
		} else if (year > 1790 && year <= 1930) {
			return "Período Romantico.";
		} else if (year >= 1832 && year <= 1901) {
			return "Período Vitoriano.";
		} else if (year >= 1914 && year <= 1945) {
			return "Período Moderno.";
		} else if (year > 1945) {
			return "Período Pós-Moderno.";
		} else {
			return "Período não registrado no sistema.";
		}
	}
	
	@Override
	public String toString() {
		// Arrays.toString(this.autores)
		return String.format(this.titulo + "\n" + String.join(", ", this.autores) + "\n" + this.descricao + "\n" + this.paginas + "\n" + this.dataPublicacao.get(Calendar.DATE) + "/" + this.dataPublicacao.get(Calendar.MONTH) + "/" + this.dataPublicacao.get(Calendar.YEAR) + "\n" + this.editora + "\n" + this.isbn);
	}

}
