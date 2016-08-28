package br.com.thiagosoares.estudo.campeonato.converter;

import java.time.LocalDate;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class LocalDateToStringJAXB extends XmlAdapter<String, LocalDate> {
	@Override
	public String marshal(LocalDate data) throws Exception {
		return data.toString();
	}

	@Override
	public LocalDate unmarshal(String data) throws Exception {
		return LocalDate.parse(data);
	}

}
