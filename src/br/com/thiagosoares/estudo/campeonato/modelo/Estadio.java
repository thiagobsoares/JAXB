package br.com.thiagosoares.estudo.campeonato.modelo;

import java.math.BigInteger;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class Estadio {
	private String nome;
	private BigInteger capacidade;

	public Estadio() {

	}

	public Estadio(String nome, BigInteger capacidade) {
		this.nome = nome;
		this.capacidade = capacidade;
	}

	public String getNome() {
		return nome;
	}

	public BigInteger getCapacidade() {
		return capacidade;
	}

	@Override
	public String toString() {
		return "Estadio [nome=" + nome + ", capacidade=" + capacidade + "]";
	}
}
