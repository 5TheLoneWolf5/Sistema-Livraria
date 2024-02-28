package org.example;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class Pagamento {

    private int id;
    private String cliente; // private String email; private String cpf; - Client would have its own class in final version.
    private double valor; // In final version, "valor" should be in the Book class, and Payment class automatically gets values from the products' array and adds all up. Maybe "desconto" as well.
    private String formaPagamento;
    private List<Livro> produtos;
    private GregorianCalendar dataPedido;
    private double desconto; // Desconto em porcentagem.

    public Pagamento() {

    }

    public Pagamento(int id, String cliente, double valor, String formaPagamento, List<Livro> produtos, GregorianCalendar dataPedido) {
        this.id = id;
        this.cliente = cliente;
        this.valor = valor;
        this.formaPagamento = formaPagamento;
        this.produtos = produtos;
        this.dataPedido = dataPedido;
    }

    public Pagamento(int id, String cliente, double valor, String formaPagamento, List<Livro> produtos, GregorianCalendar dataPedido, double desconto) {
        this.id = id;
        this.cliente = cliente;
        this.valor = valor;
        this.formaPagamento = formaPagamento;
        this.produtos = produtos;
        this.dataPedido = dataPedido;
        this.desconto = desconto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public List<Livro> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Livro> produtos) {
        this.produtos = produtos;
    }

    public GregorianCalendar getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(GregorianCalendar dataPedido) {
        this.dataPedido = dataPedido;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double aplicarDesconto() {
        return this.valor = this.valor * (this.desconto / 100);
    }

    public void pagar() {
        System.out.println("Gateway de pagamento concluído.\nValor total: " + this.valor + "\nValor pago (desconto aplicado): " + Double.toString(aplicarDesconto()) + "\n\nRealizado com a seguinte forma de pagamento: " + this.formaPagamento + ".");
    }

    @Override
    public String toString() {
        return String.format(this.id + "\n\n" + this.cliente + "\n\n" + this.valor + "\n\n" + this.formaPagamento + "\n\nLivro/s:\n" + String.join("\n\n", this.produtos.toString()) + "\n\n" + this.dataPedido.get(Calendar.DATE) + this.dataPedido.get(Calendar.MONTH) + this.dataPedido.get(Calendar.YEAR) + "\n\n" + this.desconto);
    }

}