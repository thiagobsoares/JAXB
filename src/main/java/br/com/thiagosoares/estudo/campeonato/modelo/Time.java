
package br.com.thiagosoares.estudo.campeonato.modelo;

import java.math.BigDecimal;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAccessorOrder()
public class Time {

	@XmlElement(name = "registroGeral")
	private Integer id;
	private String nome;
	private Estadio estadio;
	@XmlElementWrapper(name = "jogadores")
	@XmlElement(name = "jogador")
	private List<Jogador> jogadores;
	private BigDecimal valorMonetario;
	@XmlTransient
	private String escudo;

	public Time() {

	}

	public Time(Integer id, String nome, Estadio estadio, List<Jogador> jogadores, BigDecimal valorMonetario) {
		this.id = id;
		this.nome = nome;
		this.estadio = estadio;
		this.jogadores = jogadores;
		this.valorMonetario = valorMonetario;
	}

	public String getNome() {
		return nome;
	}

	public List<Jogador> getJogadores() {
		return jogadores;
	}

	public Estadio getEstadio() {
		return estadio;
	}

	public BigDecimal getValorMonetario() {
		return valorMonetario;
	}

	public String getEscudo() {
		return escudo;
	}

	@Override
	public String toString() {
		return "Time [id=" + id + ", nome=" + nome + ", estadio=" + estadio + ", jogadores=" + jogadores
				+ ", valorMonetario=" + valorMonetario + "]";
	}
}
