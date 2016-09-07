package br.com.thiagosoares.estudo.campeonato.provisorio;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.com.thiagosoares.estudo.campeonato.modelo.Estadio;
import br.com.thiagosoares.estudo.campeonato.modelo.Jogador;
import br.com.thiagosoares.estudo.campeonato.modelo.Posicao;
import br.com.thiagosoares.estudo.campeonato.modelo.Time;

public class Repositorio {

	private static List<Time> times = new ArrayList<>();
	
	public static List<Time> getTimes() {
		Jogador jogador1 = new Jogador(1, "Thiago Soares", LocalDate.of(1991, 7, 17), Posicao.ATAQUE, Boolean.FALSE);
		Jogador jogador2 = new Jogador(2, "Wagner Souza", LocalDate.of(1990, 5, 7), Posicao.GOLEIRO, Boolean.FALSE);
		Jogador jogador3 = new Jogador(3, "Luiz Carlos", LocalDate.of(1989, 9, 1), Posicao.MEIO_CAMPO, Boolean.FALSE);
		Jogador jogador4 = new Jogador(4, "Pedro Henrique", LocalDate.of(1989, 10, 13), Posicao.ZAGUEIRO, Boolean.TRUE);
		Jogador jogador5 = new Jogador(5, "Jackson Silva", LocalDate.of(1970, 1, 27), Posicao.MEIO_CAMPO, Boolean.FALSE);
		Jogador jogador6 = new Jogador(6, "Andre Ribeiro", LocalDate.of(1975, 2, 20), Posicao.ATAQUE, Boolean.FALSE);
		Jogador jogador7 = new Jogador(7, "Pedro Carlos", LocalDate.of(1993, 10, 30), Posicao.GOLEIRO, Boolean.FALSE);
		Jogador jogador8 = new Jogador(8, "Fernando Silva", LocalDate.of(1983, 11, 17), Posicao.ZAGUEIRO, Boolean.FALSE);
		Jogador jogador9 = new Jogador(9, "Bruno Fernandes", LocalDate.of(1985, 12, 24), Posicao.ZAGUEIRO, Boolean.FALSE);
		Jogador jogador10 = new Jogador(10, "Thomas da Silva", LocalDate.of(1987, 3, 24), Posicao.LATERAL, Boolean.TRUE);
		Jogador jogador11 = new Jogador(11, "Diego Araujo", LocalDate.of(1988, 4, 3), Posicao.ATAQUE, Boolean.FALSE);
		Jogador jogador12 = new Jogador(12, "Rafael da Silva", LocalDate.of(1986, 5, 3), Posicao.ZAGUEIRO, Boolean.FALSE);
		Jogador jogador13 = new Jogador(13, "Pedro Rodrigues", LocalDate.of(1985, 3, 26), Posicao.LATERAL, Boolean.FALSE);
		Jogador jogador14 = new Jogador(14, "Anderson Silveira", LocalDate.of(1991, 2, 1), Posicao.MEIO_CAMPO, Boolean.FALSE);
		Jogador jogador15 = new Jogador(15, "Thales Conceição", LocalDate.of(1990, 7, 11), Posicao.MEIO_CAMPO, Boolean.FALSE);
		
		List<Jogador> jogadores1 = new ArrayList<>();
		jogadores1.add(jogador1);
		jogadores1.add(jogador2);
		jogadores1.add(jogador3);
		jogadores1.add(jogador4);
		jogadores1.add(jogador5);
		
		List<Jogador> jogadores2 = new ArrayList<>();
		jogadores2.add(jogador6);
		jogadores2.add(jogador7);
		jogadores2.add(jogador8);
		jogadores2.add(jogador9);
		jogadores2.add(jogador10);
		
		
		List<Jogador> jogadores3 = new ArrayList<>();
		jogadores3.add(jogador11);
		jogadores3.add(jogador12);
		jogadores3.add(jogador13);
		jogadores3.add(jogador14);
		jogadores3.add(jogador15);
		

		Time time1 = new Time(1, "Santos", new Estadio("Vila Belmiro", BigInteger.valueOf(14000)), jogadores1, BigDecimal.valueOf(55_000_000));
		Time time2 = new Time(2, "São Paulo", new Estadio("Morumbi", BigInteger.valueOf(60000)), jogadores2, BigDecimal.valueOf(70_000_000));
		Time time3 = new Time(3, "Palmeiras", new Estadio("Allianza", BigInteger.valueOf(34000)), jogadores3, BigDecimal.valueOf(47_000_000));

		times.add(time1);
		times.add(time2);
		times.add(time3);
		
		return times;
	}
	
	
}
