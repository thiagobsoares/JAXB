//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2016.08.27 às 01:51:05 PM BRT 
//


package br.com.thiagosoares.estudo.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.thiagosoares.estudo.generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Time_QNAME = new QName("", "time");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.thiagosoares.estudo.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Time }
     * 
     */
    public Time createTime() {
        return new Time();
    }

    /**
     * Create an instance of {@link Estadio }
     * 
     */
    public Estadio createEstadio() {
        return new Estadio();
    }

    /**
     * Create an instance of {@link Jogador }
     * 
     */
    public Jogador createJogador() {
        return new Jogador();
    }

    /**
     * Create an instance of {@link Time.Jogadores }
     * 
     */
    public Time.Jogadores createTimeJogadores() {
        return new Time.Jogadores();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Time }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "time")
    public JAXBElement<Time> createTime(Time value) {
        return new JAXBElement<Time>(_Time_QNAME, Time.class, null, value);
    }

}
