//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.3-hudson-jaxb-ri-2.2-70- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.02.02 at 03:31:08 PM MEZ 
//


package reactionruleml;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for slot.type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="slot.type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;group ref="{http://www.ruleml.org/1.0/xsd}slot.content"/>
 *       &lt;attGroup ref="{http://www.ruleml.org/1.0/xsd}slot.attlist"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "slot.type", propOrder = {
    "content"
})
public class SlotType {

    @XmlElementRefs({
        @XmlElementRef(name = "Plex", namespace = "http://www.ruleml.org/1.0/xsd", type = JAXBElement.class),
        @XmlElementRef(name = "Data", namespace = "http://www.ruleml.org/1.0/xsd", type = JAXBElement.class),
        @XmlElementRef(name = "Ind", namespace = "http://www.ruleml.org/1.0/xsd", type = JAXBElement.class),
        @XmlElementRef(name = "Skolem", namespace = "http://www.ruleml.org/1.0/xsd", type = JAXBElement.class),
        @XmlElementRef(name = "Expr", namespace = "http://www.ruleml.org/1.0/xsd", type = JAXBElement.class),
        @XmlElementRef(name = "Var", namespace = "http://www.ruleml.org/1.0/xsd", type = JAXBElement.class),
        @XmlElementRef(name = "Reify", namespace = "http://www.ruleml.org/1.0/xsd", type = JAXBElement.class)
    })
    protected List<JAXBElement<?>> content;
    @XmlAttribute(name = "weight")
    protected BigDecimal weight;
    @XmlAttribute(name = "card")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger card;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "Ind" is used by two different parts of a schema. See: 
     * line 43 of http://ruleml.org/1.0/xsd/modules/term_module.xsd
     * line 42 of http://ruleml.org/1.0/xsd/modules/slot_module.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link PlexType }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link IndType }{@code >}
     * {@link JAXBElement }{@code <}{@link SkolemType }{@code >}
     * {@link JAXBElement }{@code <}{@link ExprType }{@code >}
     * {@link JAXBElement }{@code <}{@link VarType }{@code >}
     * {@link JAXBElement }{@code <}{@link ReifyType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getContent() {
        if (content == null) {
            content = new ArrayList<JAXBElement<?>>();
        }
        return this.content;
    }

    /**
     * Gets the value of the weight property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWeight(BigDecimal value) {
        this.weight = value;
    }

    /**
     * Gets the value of the card property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCard() {
        return card;
    }

    /**
     * Sets the value of the card property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCard(BigInteger value) {
        this.card = value;
    }

}
