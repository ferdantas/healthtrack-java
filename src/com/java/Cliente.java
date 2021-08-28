package com.java;

import java.util.*;

public class Cliente {
	
	 int codCliente;
	private String nome;
	 Date dataNasc;
	 double altura;
	private String email;
	private String senha;
	 int idade;
	 char genero;

	public Cliente(String nome, int idade, char genero) {
		this.setNome(nome);
		this.setIdade(idade);
		this.setGenero(genero);
		// this.nome = nome
	}
	
	public void incluirCliente(String nome, int idade, char genero, int codCliente, String email, Date dataNasc, double altura, String senha) {
		
	}
	
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
