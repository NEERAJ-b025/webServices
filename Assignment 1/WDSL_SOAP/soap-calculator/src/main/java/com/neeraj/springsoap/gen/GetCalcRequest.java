//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.07 at 10:18:56 PM CEST 
//


package com.neeraj.springsoap.gen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="value1" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="value2" type="{http://www.w3.org/2001/XMLSchema}float"/>
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
    "value1",
    "value2"
})
@XmlRootElement(name = "getCalcRequest")
public class GetCalcRequest {

    protected float value1;
    protected float value2;

    /**
     * Gets the value of the value1 property.
     * 
     */
    public float getValue1() {
        return value1;
    }

    /**
     * Sets the value of the value1 property.
     * 
     */
    public void setValue1(float value) {
        this.value1 = value;
    }

    /**
     * Gets the value of the value2 property.
     * 
     */
    public float getValue2() {
        return value2;
    }

    /**
     * Sets the value of the value2 property.
     * 
     */
    public void setValue2(float value) {
        this.value2 = value;
    }

}
