
package br.com.thiagosoares.estudo.campeonato.modelo;

import java.time.LocalDate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

@XmlAccessorType(XmlAccessType.FIELD)
public class Jogador {
	@XmlAttribute(name = "matricula")
	private Integer id;
	private String nome;
	private LocalDate dataNascimento;
	private Posicao posicao;
	private Boolean lesionado;

	public Jogador() {

	}

	public Jogador(Integer id, String nome, LocalDate dataNascimento, Posicao posicao, Boolean lesionado) {
		this.id = id;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.posicao = posicao;
		this.lesionado = lesionado;
	}

	public Integer getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public Posicao getPosicao() {
		return posicao;
	}

	public Boolean getLesionado() {
		return lesionado;
	}

	@Override
	public String toString() {
		return "Jogador [id=" + id + ", nome=" + nome + ", dataNascimento=" + dataNascimento + ", posicao=" + posicao
				+ ", lesionado=" + lesionado + "]";
	}
}
