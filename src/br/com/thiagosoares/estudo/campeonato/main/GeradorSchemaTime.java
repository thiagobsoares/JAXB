package br.com.thiagosoares.estudo.campeonato.main;

import java.io.File;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.SchemaOutputResolver;
import javax.xml.transform.Result;
import javax.xml.transform.stream.StreamResult;

public class GeradorSchemaTime {
	public static void main(String[] args) throws JAXBException, IOException {
		JAXBContext context = JAXBContext.newInstance("br.com.thiagosoares.estudo.campeonato.util");

		context.generateSchema(new SchemaOutputResolver() {

			@Override
			public Result createOutput(String namespace, String fileName) throws IOException {
				new StreamResult(new File("Time2.0.xsd"));
				return null;
			}
		});

	}
}
