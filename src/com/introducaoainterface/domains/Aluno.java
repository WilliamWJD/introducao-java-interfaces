package com.introducaoainterface.domains;

import java.util.Objects;

import com.introducaoainterface.interfaces.PermitirAcesso;

public class Aluno extends Pessoa implements PermitirAcesso {
	private Integer ra;
	private String turma;

	public Aluno() {
	}

	public Aluno(Integer ra, String turma, String nome, String genero, String idade) {
		super.nome = nome;
		super.genero = genero;
		super.idade = idade;

		this.ra = ra;
		this.turma = turma;
	}

	public Integer getRa() {
		return ra;
	}

	public void setRa(Integer ra) {
		this.ra = ra;
	}

	public String getTurma() {
		return turma;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}

	@Override
	public String toString() {
		return "Aluno [ra=" + ra + ", turma=" + turma + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(ra);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(ra, other.ra);
	}

	@Override
	public boolean autenticar(String usuario, String senha) {
		return usuario.equals("admin") && senha.equals("admin");
	}

}
