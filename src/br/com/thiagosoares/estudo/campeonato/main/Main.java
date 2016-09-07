package br.com.thiagosoares.estudo.campeonato.main;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.util.JAXBSource;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.xml.sax.SAXException;

import br.com.thiagosoares.estudo.campeonato.modelo.Time;
import br.com.thiagosoares.estudo.campeonato.provisorio.Repositorio;
import br.com.thiagosoares.estudo.campeonato.validation.ValidationTimeXML;

public class Main {

	public static void main(String[] args) throws JAXBException, SAXException, IOException {
		JAXBContext context = JAXBContext.newInstance("br.com.thiagosoares.estudo.campeonato.util");
		String[] times = { "Palmeiras.xml", "Santos.xml", "São Paulo.xml", "Corinthians.xml" };

		ObjectToXML(context);
		XMLToObject(context, times);
	}

	private static void XMLToObject(JAXBContext context, String[] times)
			throws JAXBException, SAXException, IOException {
		Unmarshaller unmarshaller = context.createUnmarshaller();

		for (String nome : times) {

			validarXmlToObject(nome);
			Time time = (Time) unmarshaller.unmarshal(new File(nome));
			System.out.println(time);
		}
	}

	private static void validarXmlToObject(String nome) throws SAXException, IOException {
		SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
		Schema schema = schemaFactory.newSchema(new File("Time2.0.xsd"));
		Validator validator = schema.newValidator();
		validator.setErrorHandler(new ValidationTimeXML());
		validator.validate(new StreamSource(new File(nome)));
	}

	private static void ObjectToXML(JAXBContext context) throws JAXBException, SAXException, IOException {
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

		List<Time> times = Repositorio.getTimes();

		for (Time time : times) {
			validarObjectToXML(context, time);

			marshaller.marshal(time, new File(time.getNome() + ".xml"));
		}
	}

	private static void validarObjectToXML(JAXBContext context, Time time)
			throws JAXBException, SAXException, IOException {
		JAXBSource source = new JAXBSource(context, time);
		SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
		Schema schema = schemaFactory.newSchema(new File("Time2.0.xsd"));
		Validator validator = schema.newValidator();
		validator.setErrorHandler(new ValidationTimeXML());
		validator.validate(source);
	}

}
