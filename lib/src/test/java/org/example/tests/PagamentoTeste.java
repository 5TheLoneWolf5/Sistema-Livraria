package org.example.tests;

import org.example.*;
import org.example.models.Cliente;
import org.example.models.Livro;
import org.example.models.Pagamento;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class PagamentoTeste {

    Pagamento pagamento;
    Pagamento pagamentoDois;
    Pagamento pagamentoTres;

    @BeforeEach void criacao() {

        List<Livro> produtosUm = new ArrayList<Livro>();
        produtosUm.add(new Livro());

        List<Livro> produtosDois = new ArrayList<Livro>();
        produtosDois.add(new Livro("A Divina Comédia", new String[] {"Dante Alighieri"}, "Dante, perdido numa selva escura, erra nela toda a noite. Saindo ao amanhecer, começa a subir por uma colina, quando lhe atravessam a passagem uma pantera, um leão e uma loba, que o repelem para a selva. Aparece-lhe então a imagem de Virgílio, que o reanima e se oferece a tirá-lo de lá, fazendo-o passar pelo Inferno e pelo Purgatório. Beatriz, depois, o guiará ao Paraíso. Dante o segue.", 320, new GregorianCalendar(1308, 1, 1), "Principis", "6550970326"));
        produtosDois.add(new Livro("Os Miseráveis", new String[] { "Victor Hugo" }, "Les Misérables é um romance de Victor Hugo publicado em 1862 que deu origem a muitas adaptações, no cinema e muitas outras mídias.", 664, new GregorianCalendar(1862, 5, 3), "Editora Serena", "9786589902102"));

        List<Livro> produtosTres = new ArrayList<Livro>();
        produtosTres.add(new Livro("Sherlock Holmes", new String[] {"Arthur Conan Doyle"}, "Um Estudo em Vermelho é um romance policial escrito por Sir Arthur Conan Doyle, publicado originalmente pela revista Beeton's Christmas Annual em novembro de 1887. A primeira edição, em formato de livro, só seria lançada em julho de 1888, com ilustrações da autoria de Richard Gutschmidt.", new GregorianCalendar(1887, 7, 3)));
        produtosTres.add(new Livro());
        produtosTres.add(new Livro("As Viagens de Gulliver", new String[] {"Jonathan Swift"}, "Jonathan Swift conta as aventuras de Lemuel Gulliver, um cirurgião naval que é vítima das circunstâncias em terras estranhas.", 320, new GregorianCalendar(1726, 10, 28), "Principis", "978-6555521177"));

        pagamento = new Pagamento();

        pagamento.setId(1);
        pagamento.setCliente(new Cliente("Sophie Harrison", "342.234.654-32", "sophie@gmail.com", false));
//        pagamento.setValor(8.99);
        pagamento.setFormaPagamento("Cartã de débito");
        pagamento.setProdutos(produtosUm);
        pagamento.setDataPedido(new GregorianCalendar(2017, 4, 7));
        pagamento.setDesconto(30);

        pagamentoDois = new Pagamento(2, new Cliente("Adam Stones", "645.132.432-09", "adam@gmail.com", true), "Cartão de crédito", produtosDois, new GregorianCalendar(2019, 12, 25));
        pagamentoTres = new Pagamento(3, new Cliente("Chris Greenwood", "125.042.453-43", "chris@gmail.com", false), "Dinheiro vivo", produtosTres, new GregorianCalendar(2020, 6, 4), 5);

    }

    @Test void testarGettersAndSetters() {

        System.out.println(pagamento.toString());

        System.out.println(pagamento.getId());
        System.out.println(pagamentoDois.getCliente());
//        System.out.println(pagamentoDois.getValor());
        System.out.println(pagamentoDois.getFormaPagamento());
        System.out.println(pagamentoTres.getProdutos());
        System.out.println(pagamentoTres.getDataPedido());
        System.out.println(pagamentoTres.getDesconto());

    }

    @Test void testarDesconto() {
//        pagamento.setValor(pagamento.aplicarDesconto());
//        pagamentoDois.setValor(pagamentoDois.aplicarDesconto());
//        pagamentoTres.setValor(pagamentoTres.aplicarDesconto());
    }

    @Test void testarPagamento() {
        pagamento.pagar();
        pagamentoDois.pagar();
        pagamentoTres.pagar();
    }

}
