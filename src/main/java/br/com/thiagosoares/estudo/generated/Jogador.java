//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2016.08.27 às 01:51:05 PM BRT 
//


package br.com.thiagosoares.estudo.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de jogador complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="jogador">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataNascimento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="posicao" type="{}posicao" minOccurs="0"/>
 *         &lt;element name="lesionado" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="matricula" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "jogador", propOrder = {
    "nome",
    "dataNascimento",
    "posicao",
    "lesionado"
})
public class Jogador {

    protected String nome;
    protected String dataNascimento;
    @XmlSchemaType(name = "string")
    protected Posicao posicao;
    protected Boolean lesionado;
    @XmlAttribute(name = "matricula")
    protected Integer matricula;

    /**
     * Obtém o valor da propriedade nome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o valor da propriedade nome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNome(String value) {
        this.nome = value;
    }

    /**
     * Obtém o valor da propriedade dataNascimento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataNascimento() {
        return dataNascimento;
    }

    /**
     * Define o valor da propriedade dataNascimento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataNascimento(String value) {
        this.dataNascimento = value;
    }

    /**
     * Obtém o valor da propriedade posicao.
     * 
     * @return
     *     possible object is
     *     {@link Posicao }
     *     
     */
    public Posicao getPosicao() {
        return posicao;
    }

    /**
     * Define o valor da propriedade posicao.
     * 
     * @param value
     *     allowed object is
     *     {@link Posicao }
     *     
     */
    public void setPosicao(Posicao value) {
        this.posicao = value;
    }

    /**
     * Obtém o valor da propriedade lesionado.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLesionado() {
        return lesionado;
    }

    /**
     * Define o valor da propriedade lesionado.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLesionado(Boolean value) {
        this.lesionado = value;
    }

    /**
     * Obtém o valor da propriedade matricula.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMatricula() {
        return matricula;
    }

    /**
     * Define o valor da propriedade matricula.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMatricula(Integer value) {
        this.matricula = value;
    }

}
