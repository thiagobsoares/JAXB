//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2016.08.27 às 01:51:05 PM BRT 
//


package br.com.thiagosoares.estudo.generated;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de time complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="time">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="registroGeral" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estadio" type="{}estadio" minOccurs="0"/>
 *         &lt;element name="jogadores" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="jogador" type="{}jogador" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="valorMonetario" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "time", propOrder = {

})
public class Time {

    protected Integer registroGeral;
    protected String nome;
    protected Estadio estadio;
    protected Time.Jogadores jogadores;
    protected BigDecimal valorMonetario;

    /**
     * Obtém o valor da propriedade registroGeral.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRegistroGeral() {
        return registroGeral;
    }

    /**
     * Define o valor da propriedade registroGeral.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRegistroGeral(Integer value) {
        this.registroGeral = value;
    }

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
     * Obtém o valor da propriedade estadio.
     * 
     * @return
     *     possible object is
     *     {@link Estadio }
     *     
     */
    public Estadio getEstadio() {
        return estadio;
    }

    /**
     * Define o valor da propriedade estadio.
     * 
     * @param value
     *     allowed object is
     *     {@link Estadio }
     *     
     */
    public void setEstadio(Estadio value) {
        this.estadio = value;
    }

    /**
     * Obtém o valor da propriedade jogadores.
     * 
     * @return
     *     possible object is
     *     {@link Time.Jogadores }
     *     
     */
    public Time.Jogadores getJogadores() {
        return jogadores;
    }

    /**
     * Define o valor da propriedade jogadores.
     * 
     * @param value
     *     allowed object is
     *     {@link Time.Jogadores }
     *     
     */
    public void setJogadores(Time.Jogadores value) {
        this.jogadores = value;
    }

    /**
     * Obtém o valor da propriedade valorMonetario.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorMonetario() {
        return valorMonetario;
    }

    /**
     * Define o valor da propriedade valorMonetario.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorMonetario(BigDecimal value) {
        this.valorMonetario = value;
    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="jogador" type="{}jogador" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "jogador"
    })
    public static class Jogadores {

        protected List<Jogador> jogador;

        /**
         * Gets the value of the jogador property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the jogador property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getJogador().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Jogador }
         * 
         * 
         */
        public List<Jogador> getJogador() {
            if (jogador == null) {
                jogador = new ArrayList<Jogador>();
            }
            return this.jogador;
        }

    }

}
