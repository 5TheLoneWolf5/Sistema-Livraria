/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package org.example;

import org.junit.jupiter.api.Test;
import java.util.GregorianCalendar;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
	
	final String fraseErro = "Valor inválido.";
	
    @Test void periodoConstrutorPadrao() {
        Livro livroTeste = new Livro();
        assertEquals("Período Pós-Moderno.", livroTeste.descobrirPeriodo(), fraseErro);
    }
    @Test void periodoConstrutorTres() {
    	Livro livroTeste = new Livro("Utopia", new String[] {"Thomas More"}, "Libellus vere aureus, nec minus salutaris quam festivus, de optimo rei publicae statu deque nova insula Utopia, mais conhecido simplesmente como Utopia, é um livro de 1516 escrito por Thomas Morus. Escrito em latim, foi sua principal obra literária.", new GregorianCalendar(1516, 6, 18));
        assertEquals("Período não registrado no sistema.", livroTeste.descobrirPeriodo(), fraseErro);
    }
    @Test void periodoConstrutorCompleto() {
    	Livro livroTeste = new Livro("O Diário de Anne Frank", new String[] {"Anne Frank"}, "O Diário de Anne Frank é um livro escrito por Anne Frank entre 12 de junho de 1942 e 1.º de agosto de 1944 durante a Segunda Guerra Mundial. É conhecido por narrar momentos vivenciados pelo grupo de judeus confinados em um esconderijo durante a ocupação nazista dos Países Baixos.", 352, new GregorianCalendar(1947, 7, 25), "Record", "8501044458");
        assertEquals("Período Pós-Moderno.", livroTeste.descobrirPeriodo(), fraseErro);
    }
    
}
