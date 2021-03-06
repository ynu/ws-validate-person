//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.11 at 03:19:35 PM CST 
//


package cn.edu.ynu.web_service_ceair.validate_person;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="ERR_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ERR_MSG" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RTN_PERSON_INFO_LIST">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RTN_PERSON_INFO" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="SORT_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="PERSON_TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "errid",
    "errmsg",
    "rtnpersoninfolist"
})
@XmlRootElement(name = "RTN_PERSON")
public class RTNPERSON {

    @XmlElement(name = "ERR_ID", required = true)
    protected String errid;
    @XmlElement(name = "ERR_MSG", required = true)
    protected String errmsg;
    @XmlElement(name = "RTN_PERSON_INFO_LIST", required = true)
    protected RTNPERSON.RTNPERSONINFOLIST rtnpersoninfolist;

    /**
     * Gets the value of the errid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getERRID() {
        return errid;
    }

    /**
     * Sets the value of the errid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setERRID(String value) {
        this.errid = value;
    }

    /**
     * Gets the value of the errmsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getERRMSG() {
        return errmsg;
    }

    /**
     * Sets the value of the errmsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setERRMSG(String value) {
        this.errmsg = value;
    }

    /**
     * Gets the value of the rtnpersoninfolist property.
     * 
     * @return
     *     possible object is
     *     {@link RTNPERSON.RTNPERSONINFOLIST }
     *     
     */
    public RTNPERSON.RTNPERSONINFOLIST getRTNPERSONINFOLIST() {
        return rtnpersoninfolist;
    }

    /**
     * Sets the value of the rtnpersoninfolist property.
     * 
     * @param value
     *     allowed object is
     *     {@link RTNPERSON.RTNPERSONINFOLIST }
     *     
     */
    public void setRTNPERSONINFOLIST(RTNPERSON.RTNPERSONINFOLIST value) {
        this.rtnpersoninfolist = value;
    }


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
     *         &lt;element name="RTN_PERSON_INFO" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="SORT_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="PERSON_TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "rtnpersoninfo"
    })
    public static class RTNPERSONINFOLIST {

        @XmlElement(name = "RTN_PERSON_INFO")
        protected List<RTNPERSON.RTNPERSONINFOLIST.RTNPERSONINFO> rtnpersoninfo;

        /**
         * Gets the value of the rtnpersoninfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the rtnpersoninfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRTNPERSONINFO().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RTNPERSON.RTNPERSONINFOLIST.RTNPERSONINFO }
         * 
         * 
         */
        public List<RTNPERSON.RTNPERSONINFOLIST.RTNPERSONINFO> getRTNPERSONINFO() {
            if (rtnpersoninfo == null) {
                rtnpersoninfo = new ArrayList<RTNPERSON.RTNPERSONINFOLIST.RTNPERSONINFO>();
            }
            return this.rtnpersoninfo;
        }


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
         *         &lt;element name="SORT_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="PERSON_TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "sortid",
            "persontype"
        })
        public static class RTNPERSONINFO {

            @XmlElement(name = "SORT_ID", required = true)
            protected String sortid;
            @XmlElement(name = "PERSON_TYPE", required = true)
            protected String persontype;

            /**
             * Gets the value of the sortid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSORTID() {
                return sortid;
            }

            /**
             * Sets the value of the sortid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSORTID(String value) {
                this.sortid = value;
            }

            /**
             * Gets the value of the persontype property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPERSONTYPE() {
                return persontype;
            }

            /**
             * Sets the value of the persontype property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPERSONTYPE(String value) {
                this.persontype = value;
            }

        }

    }

}
