package br.com.thiagosoares.estudo.campeonato.validation;

import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

public class ValidationTimeXML implements ErrorHandler {

	@Override
	public void error(SAXParseException exception) throws SAXException {
		System.out.println("Error na linha: " + exception.getLineNumber() + "\n" + exception.getMessage());

	}

	@Override
	public void fatalError(SAXParseException exception) throws SAXException {

	}

	@Override
	public void warning(SAXParseException exception) throws SAXException {

	}

}
