package com.introducaoainterface.domains;

import java.util.Objects;

public abstract class Pessoa {
	protected String nome;
	protected String genero;
	protected String idade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getIdade() {
		return idade;
	}
	public void setIdade(String idade) {
		this.idade = idade;
	}
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", genero=" + genero + ", idade=" + idade + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(genero, idade, nome);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return Objects.equals(genero, other.genero) && Objects.equals(idade, other.idade)
				&& Objects.equals(nome, other.nome);
	}
	
	
}
