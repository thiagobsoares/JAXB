//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2016.08.27 às 01:51:05 PM BRT 
//


package br.com.thiagosoares.estudo.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de posicao.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="posicao">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ATAQUE"/>
 *     &lt;enumeration value="MEIO_CAMPO"/>
 *     &lt;enumeration value="LATERAL"/>
 *     &lt;enumeration value="ZAGUEIRO"/>
 *     &lt;enumeration value="GOLEIRO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "posicao")
@XmlEnum
public enum Posicao {

    ATAQUE,
    MEIO_CAMPO,
    LATERAL,
    ZAGUEIRO,
    GOLEIRO;

    public String value() {
        return name();
    }

    public static Posicao fromValue(String v) {
        return valueOf(v);
    }

}
