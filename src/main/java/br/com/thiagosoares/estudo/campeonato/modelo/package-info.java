@XmlJavaTypeAdapters({ @XmlJavaTypeAdapter(type = LocalDate.class, value = LocalDateToStringJAXB.class) })

@javax.xml.bind.annotation.XmlSchema(namespace="http://www.thiagosoares.com.br/time", xmlns = {
		@javax.xml.bind.annotation.XmlNs(prefix = "tns", namespaceURI = "http://www.thiagosoares.com.br/time") })

package br.com.thiagosoares.estudo.campeonato.modelo;

import java.time.LocalDate;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapters;

import br.com.thiagosoares.estudo.campeonato.converter.LocalDateToStringJAXB;
