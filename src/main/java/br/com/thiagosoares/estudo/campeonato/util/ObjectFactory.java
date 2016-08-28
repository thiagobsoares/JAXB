
package br.com.thiagosoares.estudo.campeonato.util;

import javax.xml.bind.annotation.XmlRegistry;

import br.com.thiagosoares.estudo.campeonato.modelo.Estadio;
import br.com.thiagosoares.estudo.campeonato.modelo.Jogador;
import br.com.thiagosoares.estudo.campeonato.modelo.Time;

@XmlRegistry
public class ObjectFactory {

	public static Time createTime() {
		return new Time();
	}

	public static Jogador createJogador() {
		return new Jogador();
	}

	public static Estadio createEstadio() {
		return new Estadio();
	}
}
