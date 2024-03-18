package org.example.models;

public class Cliente {
	
	 private String nome;
	 private String cpf;
	 private String email;
	 private boolean cartaoFidelidade;
	 
	 public Cliente() {
		 
	 }
	 
	 public Cliente(String nome, String cpf, String email, boolean cartaoFidelidade) {
		this(); // Either this() or super().
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.cartaoFidelidade = cartaoFidelidade;
	 }

	public String getNome() {
		return nome;
	 }
	 
	 public void setNome(String nome) {
		this.nome = nome;
	 }
	 
	 public String getCpf() {
		return cpf;
	 }
	 
	public void setCpf(String cpf) {
		this.cpf = cpf;
	 }
	
	public String getEmail() {
		return email;
	 }
	
	public void setEmail(String email) {
		this.email = email;
	 }
	
	public boolean getCartaoFidelidade() {
		return cartaoFidelidade;
	 }
	
	public void setCartaoFidelidade(boolean cartaoFidelidade) {
		this.cartaoFidelidade = cartaoFidelidade;
	}
	
	@Override
	public String toString() {
		return String.format("%s, %s, %s, %b,", nome, cpf, email, cartaoFidelidade);
	}
	 
}
